package com.example.testecognitivo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Linguagem2 extends Activity {

	/**
	 * @author lieberson declaração de variaveis
	 */
	private ImageButton imgBtnEnviarLinguagem2;
	private ToggleButton tgLin2;
	private int pontos;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.linguagem2);
		
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
		if (intentPontos != null) {
			pontos = bundlePontos.getInt("pontos");
		}
		
		
		/**
		 * Linka as variaveis java com xml
		 */
		imgBtnEnviarLinguagem2 = (ImageButton) findViewById(R.id.imgBtnEnviarLinguagem2);
		
		tgLin2 = (ToggleButton) findViewById(R.id.tgLin2);
		tgLin2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				if (isChecked){
					pontos = pontos +1;Toast.makeText(Linguagem2.this, String.valueOf(pontos), Toast.LENGTH_SHORT).show();
					tgLin2.setEnabled(false);
				}
				
			}
		});
			
		imgBtnEnviarLinguagem2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				/**
				 * @author lieberson envia para a tela de liguagem
				 */
				Intent intentDados = getIntent();
				Medico medico = (Medico) intentDados.getSerializableExtra("medico");
				Paciente paciente = (Paciente) intentDados.getSerializableExtra("paciente");
				
				
				Intent intent = new Intent(Linguagem2.this, Linguagem3.class);				
				
				//Insere o medico e o paciente para enviar á proxima activity
				intent.putExtra("medico", medico); //insere e instancia do medico para envio
				intent.putExtra("paciente", paciente);//insere e instancia do paciente para envio
						
				/*
				 * acumula os pontos e passa para a proxima classe
				 */
				intent.putExtra("pontos", pontos);
				startActivity(intent);
			}
		});
	}

}
