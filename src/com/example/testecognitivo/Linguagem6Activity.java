package com.example.testecognitivo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Linguagem6Activity extends Activity{
	
	private Button btnSeguirLinguagem6;
	// private ToggleButton tgImagem;
	private int pontos;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.linguagem6);
		
		/*
		 * 1-pega a pontuacao da activity anterior
		 * 2-Bundle para pegar os dados da intent
		 * 3-passa os pontos da outra activity para a variavel PONTOS para poder add 
		 * os pontos desta activity
		 */
		Intent intentPontos = getIntent();					//1
		Bundle bundlePontos = intentPontos.getExtras();		//2
		pontos = bundlePontos.getInt("pontos");				//3	
		
		/*
		 * linka as variaveis java com xml
		 */
		
		btnSeguirLinguagem6 = (Button) findViewById(R.id.btnSeguirLinguagem6);
		
	/*
	 * 	tgImagem = (ToggleButton) findViewById(R.id.tgImagem);
	 * tgImagem.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				
				if(isChecked){
					pontos = pontos +1;Toast.makeText(Linguagem6Activity.this, String.valueOf(pontos), Toast.LENGTH_LONG).show();
				}tgImagem.setEnabled(false);
				
			}
		});
		
	 */
		
		btnSeguirLinguagem6.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				
				Intent intent = new Intent(Linguagem6Activity.this, Linguagem7.class);
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
