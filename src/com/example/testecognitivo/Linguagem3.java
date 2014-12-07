package com.example.testecognitivo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Linguagem3 extends Activity {
	
	private ImageButton imgbtnSeguirLinguagem3;
	private ToggleButton tgLin3;
	private int pontos;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		// inflar layout de linguagem 3
		setContentView(R.layout.linguagem3);
		
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
		
		imgbtnSeguirLinguagem3 = (ImageButton) findViewById(R.id.imgbtnSeguirLinguagem3);
		
		tgLin3 = (ToggleButton) findViewById(R.id.tgLin3);
		tgLin3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				if (isChecked){
					pontos = pontos +3;Toast.makeText(Linguagem3.this, String.valueOf(pontos), Toast.LENGTH_SHORT).show();
					tgLin3.setEnabled(false);
				}
				
			}
		});
		
		imgbtnSeguirLinguagem3.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent = new Intent(Linguagem3.this, Linguagem4.class);
				startActivity(intent);
				
				/*
				 * acumula os pontos e passa para outra classe
				 */
				intent.putExtra("pontos", pontos);
				startActivity(intent);
			}
		});
		
	}

}
