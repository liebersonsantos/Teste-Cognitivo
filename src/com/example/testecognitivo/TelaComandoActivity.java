package com.example.testecognitivo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaComandoActivity extends Activity{
	
	private Button btnTelaComandoSeguir;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.tela_comando);
		
		/**
		 * Linka as variaveis java com xml
		 */
		
		btnTelaComandoSeguir = (Button) findViewById(R.id.btnTelaComandoSeguir);
		btnTelaComandoSeguir.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent = new Intent(TelaComandoActivity.this,Linguagem5.class);
				startActivity(intent);				
			}
		});
		
		
		
	}

}
