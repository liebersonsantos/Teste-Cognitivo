package com.example.testecognitivo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LocalizacaoActivity extends Activity{
	
	//Declaração das variáveis
	private Button btnProxiamPgLocalizacao;	
	private int pontos;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);		
		setContentView(R.layout.localizacao);
		
		//Pega a pontuação da Activity anterior
		Intent intentPontos = getIntent();
		//Bundle para pegar os dados da intent
		Bundle bundlePontos = intentPontos.getExtras();
		
		//passa os pontos da outra activity para a variável "ponto"
		//para poder adicionar os pontos dessa Activity
		pontos = bundlePontos.getInt("postos");
		
		
		//Linka o Java com Xml
		
		//Aqui precisa pegar todos os botões do xml para implementar o clique
		btnProxiamPgLocalizacao = (Button) findViewById(R.id.btnProxiamPgLocalizacao);
		
		//quando clicar no botão de V adicionar pamis um ponto na varial "ponto"
		// ex: pontos++; "igual na tela anterior"
		
		//evento de clique no botão
		btnProxiamPgLocalizacao.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				// Chama a proxima activity				
				Intent intent = new Intent(LocalizacaoActivity.this, RegistroActivity.class);
				//passa para a prixima activity o valor da pontuação
				intent.putExtra("pontos", pontos);
				startActivity(intent);
			}
		});
		
		
		
		
		
		
		
	}
}
