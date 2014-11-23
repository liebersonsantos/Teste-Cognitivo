package com.example.testecognitivo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LocalizacaoActivity extends Activity{
	
	Button btnProxiamPgLocalizacao;	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.localizacao);
		
		btnProxiamPgLocalizacao = (Button) findViewById(R.id.btnProxiamPgLocalizacao);
		btnProxiamPgLocalizacao.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent = new Intent(LocalizacaoActivity.this, RegistroActivity.class);
				startActivity(intent);
			}
		});
		
		
		
		
		
		
		
	}
}
