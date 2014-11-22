package com.example.testecognitivo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Linguagem6 extends Activity{
	
	Button btnSeguirLinguagem6;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.linguagem6);
		
		btnSeguirLinguagem6 = (Button) findViewById(R.id.btnSeguirLinguagem6);
		btnSeguirLinguagem6.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				/**
				 * envia para tela resultado
				 */
				
				Intent intent = new Intent(Linguagem6.this, ResultadoActivity.class);
				startActivity(intent);
				
				
			}
		});
		
		
		
	}
		
		
	}
	
	


