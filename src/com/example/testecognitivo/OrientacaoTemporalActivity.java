package com.example.testecognitivo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class OrientacaoTemporalActivity extends Activity {

	// Declaração das variaveis
	private ImageButton imgbtnEnviarAtencaotemp,
						imgbtnEdiaSemana,imgbtnVdiaSemana,
						imgbtnEdiaMes,imgbtnVdiaMes,
						imgbtnEmes,imgbtnVmes,
						imgbtnEano,imgbtnVano,
						imgbtnEhora,imgbtnVhora;
	
	private int pontos = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.orientacao_temporal2);
		
		//Linka o java com o xml
		imgbtnEnviarAtencaotemp = (ImageButton) findViewById(R.id.imgbtnEnviarAtencaoCalculo);
		imgbtnEdiaSemana = (ImageButton) findViewById(R.id.imgbtnEdiaSemana);
		imgbtnVdiaSemana = (ImageButton) findViewById(R.id.imgbtnVdiaSemana);
		imgbtnEdiaMes = (ImageButton) findViewById(R.id.imgbtnEdiaMes);
		imgbtnVdiaMes = (ImageButton) findViewById(R.id.imgbtnVdiaMes);
		imgbtnEmes = (ImageButton) findViewById(R.id.imgbtnEmes);
		imgbtnVmes = (ImageButton) findViewById(R.id.imgbtnVmes);
		imgbtnEano = (ImageButton) findViewById(R.id.imgbtnEano);
		imgbtnVano = (ImageButton) findViewById(R.id.imgbtnVano);
		imgbtnEhora = (ImageButton) findViewById(R.id.imgbtnEhora);
		imgbtnVhora = (ImageButton) findViewById(R.id.imgbtnVhora);
		
		
		//Implementação dos clique dos botões 
		//quando um botão de "ERRADO" é clicado o botão de "CORRETO" é desativado
		//quando um botão de "CORETO" é clicado o botão de "ERRADO" é desativado
		
		
  /***********************************************************************************/
 /* 					Implementa botões do dia da semana			   				*/		
/***********************************************************************************/		
		// Dia da semanda ERRADO
		imgbtnEdiaSemana.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Desabilita o botão de CORRETO e ERRADO
				imgbtnVdiaSemana.setVisibility(View.INVISIBLE);
				imgbtnEdiaSemana.setVisibility(View.INVISIBLE);
			}
		});		
		// Dia da semanda CORRETO
		imgbtnVdiaSemana.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Desabilita o botão de ERRADO e CORRETO
				imgbtnEdiaSemana.setVisibility(View.INVISIBLE);
				imgbtnVdiaSemana.setVisibility(View.INVISIBLE);				
				//Acrescenta um ponto a variável "pontos"
				pontos++;				
				//mostra a pontuação
				Toast.makeText(OrientacaoTemporalActivity.this, String.valueOf(pontos),Toast.LENGTH_SHORT).show();				
			}
		});
		
		  /***********************************************************************************/
		 /* 					Implementa botões do dia do mes  			   				*/		
		/***********************************************************************************/			
		// Dia do mes ERRADO
		imgbtnEdiaMes.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Desabilita o botão de CORRETO e ERRADO
				imgbtnVdiaMes.setVisibility(View.INVISIBLE);
				imgbtnEdiaMes.setVisibility(View.INVISIBLE);
			}
		});		
		// Dia do mes CORRETO
		imgbtnVdiaMes.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Desabilita o botão de ERRADO e CORRETO
				imgbtnEdiaMes.setVisibility(View.INVISIBLE);
				imgbtnVdiaMes.setVisibility(View.INVISIBLE);				
				//Acrescenta um ponto a variável "pontos"
				pontos++;				
				//mostra a pontuação
				Toast.makeText(OrientacaoTemporalActivity.this, String.valueOf(pontos),Toast.LENGTH_SHORT).show();				
			}
		});
		

		  /***********************************************************************************/
		 /* 					Implementa botões  do mes  			   						*/		
		/***********************************************************************************/			
		//  mes ERRADO
		imgbtnEmes.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Desabilita o botão de CORRETO e ERRADO
				imgbtnVmes.setVisibility(View.INVISIBLE);
				imgbtnEmes.setVisibility(View.INVISIBLE);
			}
		});		
		//  mes CORRETO
		imgbtnVmes.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Desabilita o botão de ERRADO e CORRETO
				imgbtnEmes.setVisibility(View.INVISIBLE);
				imgbtnVmes.setVisibility(View.INVISIBLE);				
				//Acrescenta um ponto a variável "pontos"
				pontos++;				
				//mostra a pontuação
				Toast.makeText(OrientacaoTemporalActivity.this, String.valueOf(pontos),Toast.LENGTH_SHORT).show();				
			}
		});
		
		
		  /***********************************************************************************/
		 /* 					Implementa botões  do Ano  			   						*/		
		/***********************************************************************************/			
		//   Ano ERRADO
		imgbtnEano.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Desabilita o botão de CORRETO e ERRADO
				imgbtnVano.setVisibility(View.INVISIBLE);
				imgbtnEano.setVisibility(View.INVISIBLE);
			}
		});		
		//  Ano CORRETO
		imgbtnVano.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Desabilita o botão de ERRADO e CORRETO
				imgbtnEano.setVisibility(View.INVISIBLE);
				imgbtnVano.setVisibility(View.INVISIBLE);				
				//Acrescenta um ponto a variável "pontos"
				pontos++;				
				//mostra a pontuação
				Toast.makeText(OrientacaoTemporalActivity.this, String.valueOf(pontos),Toast.LENGTH_SHORT).show();				
			}
		});
		
		  /***********************************************************************************/
		 /* 					Implementa botões  do Ano  			   						*/		
		/***********************************************************************************/			
		//   Hora ERRADO
		imgbtnEhora.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Desabilita o botão de CORRETO e ERRADO
				imgbtnVhora.setVisibility(View.INVISIBLE);
				imgbtnEhora.setVisibility(View.INVISIBLE);
			}
		});		
		//  Hora CORRETO
		imgbtnVhora.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Desabilita o botão de ERRADO e CORRETO
				imgbtnEhora.setVisibility(View.INVISIBLE);
				imgbtnVhora.setVisibility(View.INVISIBLE);				
				//Acrescenta um ponto a variável "pontos"
				pontos++;				
				//mostra a pontuação
				Toast.makeText(OrientacaoTemporalActivity.this, String.valueOf(pontos),Toast.LENGTH_SHORT).show();				
			}
		});
		
		
		
		//implementação da botão que vai para a proxima tela
		imgbtnEnviarAtencaotemp.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Chama a proxima Activity
				Intent intent = new Intent(OrientacaoTemporalActivity.this,	LocalizacaoActivity.class);
				intent.putExtra("pontos", pontos);
				startActivity(intent);
			}
		});

	}

}
