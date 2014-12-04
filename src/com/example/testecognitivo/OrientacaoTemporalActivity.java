package com.example.testecognitivo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class OrientacaoTemporalActivity extends Activity {

	// Declaração das variaveis
	private ImageButton imgbtnEnviarAtencaotemp;
	private ToggleButton tgDiaMes, tgDiaSemana, tgMes, tgAno, tgHora;
						
	
	private int pontos = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.orientacao_temporal2);
		
		//Linka o java com o xml
		imgbtnEnviarAtencaotemp = (ImageButton) findViewById(R.id.imgbtnEnviarAtencaoCalculo);
			
		
		tgDiaSemana = (ToggleButton) findViewById(R.id.tgDiaSemana);
		tgDiaSemana.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				if  (isChecked){
					pontos = pontos +1;  Toast.makeText(OrientacaoTemporalActivity.this,String.valueOf(pontos),Toast.LENGTH_SHORT).show();
					tgDiaSemana.setEnabled(false);
				}
				
			}
		});
				
		tgDiaMes = (ToggleButton) findViewById(R.id.tgDiaMes);
			tgDiaMes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
				
				@Override
				public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
					if  (isChecked){
						pontos = pontos +1;  Toast.makeText(OrientacaoTemporalActivity.this,String.valueOf(pontos),Toast.LENGTH_SHORT).show();
						tgDiaMes.setEnabled(false);
					}
					
				}
			});
		
			tgMes = (ToggleButton) findViewById(R.id.tgMes);
			tgMes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
				
				@Override
				public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
					if  (isChecked){
						pontos = pontos +1;  Toast.makeText(OrientacaoTemporalActivity.this,String.valueOf(pontos),Toast.LENGTH_SHORT).show();
						tgMes.setEnabled(false);
					}
					
				}
			});
		
			tgAno = (ToggleButton) findViewById(R.id.tgAno);
			tgAno.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
				
				@Override
				public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
					if  (isChecked){
						pontos = pontos +1;  Toast.makeText(OrientacaoTemporalActivity.this,String.valueOf(pontos),Toast.LENGTH_SHORT).show();
						tgAno.setEnabled(false);
					}
					
				}
			});
		
			tgHora = (ToggleButton) findViewById(R.id.tgHora);
			tgHora.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
				
				@Override
				public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
					if  (isChecked){
						pontos = pontos +1;  Toast.makeText(OrientacaoTemporalActivity.this,String.valueOf(pontos),Toast.LENGTH_SHORT).show();
						tgHora.setEnabled(false);
					}
					
				}
			});		
		
		//implementação da botão que vai para a proxima tela
		imgbtnEnviarAtencaotemp.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Chama a proxima Activity
				Intent intent = new Intent(OrientacaoTemporalActivity.this,	LocalizacaoActivity.class);
				
				/*
				 * passa os valores para outra variavel
				 */
				intent.putExtra("pontos", pontos);
				startActivity(intent);
			}
		});

	}

}
