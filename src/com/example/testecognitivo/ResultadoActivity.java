package com.example.testecognitivo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ResultadoActivity extends Activity {

	// Declaração das variáveis e objetos
	Button btnCalcule;
	Teste teste = new Teste();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.resultado);
		// Linka o Java com o Xml
		btnCalcule = (Button) findViewById(R.id.btnCalcule);

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
						String resultado;
						
						//aqui vc faz a logica do teste e coloca o resultado em uma variavel
						//esse resultado deve ser calculado
						resultado = "resultado do teste";
						
						
						
						
						
						
						
						
						
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
						Toast.makeText(ResultadoActivity.this,"Resultado salvo com sucesso..!!", Toast.LENGTH_SHORT).show();

				}

			}
		});

	}

}
