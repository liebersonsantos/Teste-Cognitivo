package com.example.testecognitivo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class LocalizacaoActivity extends Activity{
	
	//Declaração das variáveis
	private Button btnProxiamPgLocalizacao;	
	private ToggleButton tgLocal, tgInstituicao, tgBairro, tgCidade, tgEstado;
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
		pontos = bundlePontos.getInt("pontos");
				
		//Linka o Java com Xml		
		//Aqui precisa pegar todos os botões do xml para implementar o clique
		btnProxiamPgLocalizacao = (Button) findViewById(R.id.btnProxiamPgLocalizacao);
		
		tgLocal = (ToggleButton) findViewById(R.id.tgLocal);
		tgLocal.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				if (isChecked){
					pontos = pontos +1; Toast.makeText(LocalizacaoActivity.this, String.valueOf(pontos), Toast.LENGTH_SHORT).show();
					tgLocal.setEnabled(false);
				}
				
			}
		});
				
		tgInstituicao = (ToggleButton) findViewById(R.id.tgInstituicao);
		tgInstituicao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				if (isChecked){
					pontos = pontos +1; Toast.makeText(LocalizacaoActivity.this, String.valueOf(pontos), Toast.LENGTH_SHORT).show();
					tgInstituicao.setEnabled(false);
				}
				
			}
		});
		
		tgBairro = (ToggleButton) findViewById(R.id.tgBairro);
		tgBairro.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				if (isChecked){
					pontos = pontos +1; Toast.makeText(LocalizacaoActivity.this, String.valueOf(pontos), Toast.LENGTH_SHORT).show();
					tgBairro.setEnabled(false);
				}
				
			}
		});
		
		tgCidade = (ToggleButton) findViewById(R.id.tgCidade);
		tgCidade.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				if (isChecked){
					pontos = pontos +1; Toast.makeText(LocalizacaoActivity.this, String.valueOf(pontos), Toast.LENGTH_SHORT).show();
					tgCidade.setEnabled(false);
				}
				
			}
		});
			
		tgEstado = (ToggleButton) findViewById(R.id.tgEstado);
		tgEstado.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				if (isChecked){
					pontos = pontos +1; Toast.makeText(LocalizacaoActivity.this, String.valueOf(pontos), Toast.LENGTH_SHORT).show();
					tgEstado.setEnabled(false);
				}
				
			}
		});
		
				
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
