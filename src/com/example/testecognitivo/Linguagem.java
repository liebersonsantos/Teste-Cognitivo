package com.example.testecognitivo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Linguagem extends Activity{
	
	/**
	 * @author lieberson declaração de variaveis
	 */
	private ImageButton imgBtnEnviarLinguagem;
	private ToggleButton tgLinguagem;
	private int pontos;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.linguagem);
		
		/*
		 * Pega a pontuação da Activity anterior
		 */
		Intent intentPontos = getIntent();
		/*
		 * Bundle para pegar os dados da intent
		 */
		Bundle bundlePontos = intentPontos.getExtras();
		/*
		 * passa os pontos da outra activity para a variável "ponto"
		 * para poder adicionar os pontos dessa Activity
		 */
		pontos = bundlePontos.getInt("pontos");

		/**
		 * Linka as variaveis java com xml
		 */
		imgBtnEnviarLinguagem = (ImageButton) findViewById(R.id.imgBtnEnviarLinguagem);
		
		tgLinguagem = (ToggleButton) findViewById(R.id.tgLinguagem);
		tgLinguagem.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				if (isChecked){
					pontos = pontos +2;Toast.makeText(Linguagem.this, String.valueOf(pontos), Toast.LENGTH_SHORT).show();
					tgLinguagem.setEnabled(false);
				}
				
			}
		});
			
		imgBtnEnviarLinguagem.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				/**
				 * @author lieberson envia para a tela de liguagem
				 */
				Intent intentDados = getIntent();
				Medico medico = (Medico) intentDados.getSerializableExtra("medico");
				Paciente paciente = (Paciente) intentDados.getSerializableExtra("paciente");
				
				Intent intent = new Intent(Linguagem.this, Linguagem2.class);
				startActivity(intent);		
				
				//Insere o medico e o paciente para enviar á proxima activity
				intent.putExtra("medico", medico); //insere e instancia do medico para envio
				intent.putExtra("paciente", paciente);//insere e instancia do paciente para envio							
				
				/*
				 * passa os pontos desta para a proxima classe
				 */
				intent.putExtra("pontos", pontos);
				startActivity(intent);
			}
		});
	}

}
