package com.example.testecognitivo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ResultadoActivity extends Activity {

	// Declaração das variáveis e objetos
	private Button btnCalcule;
	private int pontos;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.resultado);
		// Linka o Java com o Xml
		btnCalcule = (Button) findViewById(R.id.btnCalcule);
		
		/*
		 * 1-pega a pontuacao da activity anterior
		 * 2-Bundle para pegar os dados da intent
		 * 3-passa os pontos da outra activity para a variavel PONTOS para poder add 
		 * os pontos desta activity
		 */
		Intent intentPontos = getIntent();					//1
		Bundle bundlePontos = intentPontos.getExtras();		//2
		
		if (intentPontos != null) {
			pontos = bundlePontos.getInt("pontos");
		}			//3	

		// Pega os dados enviados das activities anteriores


		btnCalcule.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

				// Atribui os dados do Xml par o objeto, para que
				// posso ser armazenado na base de dados
				//Pega os dados do medico logado na activity anterior
				Intent intentDados = getIntent();		

				if (intentDados != null) {
					Bundle bundleDados = intentDados.getExtras();

					//se os dados não estiverem vazios guardamos na base de dados
			
						Medico medico = (Medico) intentDados.getSerializableExtra("medico");
						Paciente paciente = (Paciente) intentDados.getSerializableExtra("paciente");
						String resultado = "";
						
						//aqui vc faz a logica do teste e coloca o resultado em uma variavel
						//esse resultado deve ser calculado
						
						if (pontos >= 27) {
							resultado = "Sem Desvio Cognitivo - pontos: " + pontos;
							}else if (pontos <= 24 && pontos >= 20 ) {
							resultado = "Leve Desvio Cognitivo - pontos: " + pontos;
								}else {
									resultado = "Alto Nivel de Desvio Cognitivo - pontos: " + pontos;
								}
													
						
						//Armazena o resultado Resultado do calculo do teste cognitivo						
						Teste teste = new Teste();						
						teste.setIdPaciente(paciente.getId());
						teste.setIdMedico(medico.getId());
						teste.setResultado(resultado);				
						
						//Declarção de testeDAO para armazenar os dados
						TesteDAO testeDAO = new TesteDAO(ResultadoActivity.this);
						
						//Insere os dados na base de dados
						testeDAO.inserir(teste,paciente,medico);
						
						//Retorna uma mensagem na tela para o Médico
						Toast.makeText(ResultadoActivity.this,resultado, Toast.LENGTH_LONG).show();
						
				}

			}
		});

	}

}
