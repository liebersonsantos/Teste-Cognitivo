package com.example.testecognitivo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class AtencaoCalculoActivity extends Activity{
	
	ImageButton imgbtnEnviarAtecaoCalculo;
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.atencao_calculo);
	
		imgbtnEnviarAtecaoCalculo = (ImageButton) findViewById(R.id.imgbtnEnviarAtencaoCalculo);
		imgbtnEnviarAtecaoCalculo.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent = new Intent(AtencaoCalculoActivity.this, LembrancasActivity.class);
				startActivity(intent);
				
			}
		});
		
		
		
	}

}
