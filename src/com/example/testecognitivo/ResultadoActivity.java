package com.example.testecognitivo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ResultadoActivity extends Activity {

	// Declaração das variáveis e objetos
	private Button btnCalcule, btnListaPacientes;
	private int pontos;
	private EditText nomeMedico;
	private EditText crmMedico;
	private EditText nomePaciente;
	private EditText idadePaciente;
	private EditText escPaciente;
	private TextView resultadoPaciente;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.resultado);
		// Linka o Java com o Xml
		
		nomeMedico = (EditText) findViewById(R.id.edtNmMedicoResult);
		crmMedico = (EditText) findViewById(R.id.edtCrmMedicoResult);
		nomePaciente = (EditText) findViewById(R.id.edtNmPacienteResult);
		escPaciente = (EditText) findViewById(R.id.edtEscolResult);
		resultadoPaciente = (TextView) findViewById(R.id.txtResultadoPaciente);
		btnCalcule = (Button) findViewById(R.id.btnCalcule);
		btnListaPacientes = (Button)findViewById(R.id.btnListaDePacientes);
		
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
						
						nomeMedico.setText(medico.getNome());
						crmMedico.setText(medico.getCrm());
						nomePaciente.setText(paciente.getNome());
						escPaciente.setText(paciente.getEscolaridade());
						resultadoPaciente.setText(resultado);
						
						
						//Retorna uma mensagem na tela para o Médico

					
						Toast.makeText(ResultadoActivity.this,teste.getResultado(), Toast.LENGTH_SHORT).show();

						Toast.makeText(ResultadoActivity.this,resultado, Toast.LENGTH_LONG).show();

						
				}

			}
		});
		
		btnListaPacientes.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(ResultadoActivity.this,ListaPaciente.class);
				
				//Pega os dados do medico logado na activity anterior
				Intent intentDados = getIntent();
				Medico medico = (Medico) intentDados.getSerializableExtra("medico");
				
				//Insere o medico e o paciente para enviar á proxima activity
				intent.putExtra("medico", medico); //insere e instancia do medico para envio
				startActivity(intent);
				
			}
		});

	}

}
