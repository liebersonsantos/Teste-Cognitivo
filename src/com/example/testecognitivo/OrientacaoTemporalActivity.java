package com.example.testecognitivo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class OrientacaoTemporalActivity extends Activity{
	
	ImageButton imgbtnEnviarAtencaotemp;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.orientacao_temporal2);
		
		imgbtnEnviarAtencaotemp = (ImageButton) findViewById(R.id.imgbtnEnviarAtencaoCalculo);
		imgbtnEnviarAtencaotemp.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent = new Intent(OrientacaoTemporalActivity.this, RegistroActivity.class);
				startActivity(intent);

			}
		});
		
	}

}
