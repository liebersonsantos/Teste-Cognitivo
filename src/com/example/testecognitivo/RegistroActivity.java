package com.example.testecognitivo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class RegistroActivity extends Activity{
	
	ImageButton imgbtnEnviarRegistro;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.registro);
		
		imgbtnEnviarRegistro = (ImageButton) findViewById(R.id.imgBtnEnviarLembrancas);
		imgbtnEnviarRegistro.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent = new Intent(RegistroActivity.this, AtencaoCalculoActivity.class);
				startActivity(intent);
				
				
			}
		});
		
		
		
		
		
	}

}
