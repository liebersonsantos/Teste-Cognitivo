package com.example.testecognitivo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Linguagem7 extends Activity{
	
	private Button btnSeguirLinguagem7;
	private ToggleButton tgLin7;
	private int pontos;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.linguagem7);
		
		/*
		 * 1-pega a pontuacao da activity anterior
		 * 2-Bundle para pegar os dados da intent
		 * 3-passa os pontos da outra activity para a variavel PONTOS para poder add 
		 * os pontos desta activity
		 */
		Intent intentPontos = getIntent();					//1
		Bundle bundlePontos = intentPontos.getExtras();		//2
		pontos = bundlePontos.getInt("pontos");				//3	
		
		btnSeguirLinguagem7 = (Button) findViewById(R.id.btnSeguirLinguagem7);
		
		tgLin7 = (ToggleButton) findViewById(R.id.tgLin7);
		tgLin7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				
				if (isChecked){
					pontos = pontos +1;Toast.makeText(Linguagem7.this, String.valueOf(pontos), Toast.LENGTH_LONG).show();
					tgLin7.setEnabled(false);
				}
				
			}
		});
		
		
		
		
		btnSeguirLinguagem7.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				/**
				 * envia para tela resultado
				 */
				
				//pega o "id" do paciente e o "id" do medico que veio de outra tela
				//aqui tem que modificar, pegar o id com uma intent de outra tela
				long id_paciente = 1;
				long id_medico = 1;
				
				Intent intentDados = getIntent();
				Medico medico = (Medico) intentDados.getSerializableExtra("medico");
				Paciente paciente = (Paciente) intentDados.getSerializableExtra("paciente");
				
				Intent intent = new Intent(Linguagem7.this, ResultadoActivity.class);
				
				//Insere o medico e o paciente para enviar á proxima activity
				intent.putExtra("medico", medico); //insere e instancia do medico para envio
				intent.putExtra("paciente", paciente);//insere e instancia do paciente para envio
				startActivity(intent);			
							
				intent.putExtra("id_paciente", id_paciente);
				intent.putExtra("id_medico", id_medico);
				startActivity(intent);	
				
				/*
				 * passa os pontos acumulados desta, para a proxima activity
				 */
				intent.putExtra("pontos", pontos);
				startActivity(intent);	
				
			}
		});
		
		
		
	}
		
		
	}
	
	


