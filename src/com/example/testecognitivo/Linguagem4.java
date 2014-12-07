package com.example.testecognitivo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Linguagem4 extends Activity{
	
	private ImageButton imgbtnComando;
	private int pontos;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.linguagem4);
		
		/*
		 * 1-pega a pontuacao da activity anterior
		 * 2-Bundle para pegar os dados da intent
		 * 3-passa os pontos da outra activity para a variavel PONTOS para poder
		 * add os pontos desta activity
		 */
		Intent intentPontos = getIntent();				//1
		
		Bundle bundlePontos = intentPontos.getExtras();	//2
		
		pontos = bundlePontos.getInt("pontos");			//3
		
		
	
		imgbtnComando = (ImageButton) findViewById(R.id.imgbtnComando);
		imgbtnComando.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intentDados = getIntent();
				Medico medico = (Medico) intentDados.getSerializableExtra("medico");
				Paciente paciente = (Paciente) intentDados.getSerializableExtra("paciente");
				
				Intent intent = new Intent(Linguagem4.this, TelaComandoActivity.class);
				startActivity(intent);
				
				//Insere o medico e o paciente para enviar á proxima activity
				intent.putExtra("medico", medico); //insere e instancia do medico para envio
				intent.putExtra("paciente", paciente);//insere e instancia do paciente para envio
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
