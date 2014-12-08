package com.example.testecognitivo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class LembrancasActivity extends Activity {
	/**
	 * @author lieberson
	 *  declaração de variaveis
	 */
	private ImageButton imgBtnEnviarLembrancas;
	private ToggleButton tgVasoLem, tgCarroLem, tgTijoloLem;
	private int pontos;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.lembrancas);

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
		imgBtnEnviarLembrancas = (ImageButton) findViewById(R.id.imgBtnEnviarLembrancas);
		
		tgVasoLem = (ToggleButton) findViewById(R.id.tgVasoLem);
		tgVasoLem.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				if (isChecked){
					pontos = pontos +1;Toast.makeText(LembrancasActivity.this, String.valueOf(pontos), Toast.LENGTH_SHORT).show();
					tgVasoLem.setEnabled(false);  
				}
				
			}
		});
		
		tgCarroLem = (ToggleButton) findViewById(R.id.tgCarroLem);
		tgCarroLem.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				if (isChecked){
					pontos = pontos +1;Toast.makeText(LembrancasActivity.this, String.valueOf(pontos), Toast.LENGTH_SHORT).show();
					tgCarroLem.setEnabled(false);
				}
				
			}
		});
		
		tgTijoloLem = (ToggleButton) findViewById(R.id.tgTijoloLem);
		tgTijoloLem.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				if (isChecked){
					pontos = pontos +1;Toast.makeText(LembrancasActivity.this, String.valueOf(pontos), Toast.LENGTH_SHORT).show();
					tgTijoloLem.setEnabled(false);
				}
				
			}
		});	
		
		imgBtnEnviarLembrancas.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				/**
				 * @author lieberson
				 * envia para a tela de liguagem
				 */
				Intent intentDados = getIntent();
				Medico medico = (Medico) intentDados.getSerializableExtra("medico");
				Paciente paciente = (Paciente) intentDados.getSerializableExtra("paciente");
				
				Intent intent = new Intent(LembrancasActivity.this,Linguagem.class);
				
				//Insere o medico e o paciente para enviar á proxima activity
				intent.putExtra("medico", medico); //insere e instancia do medico para envio
				intent.putExtra("paciente", paciente);//insere e instancia do paciente para envio							
				
				
				/*
				 * Envia os valores para a proxima classe
				 * 
				 */
				intent.putExtra("pontos", pontos);
				startActivity(intent);
			}
		}); 

	}

}
