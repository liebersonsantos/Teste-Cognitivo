package com.example.testecognitivo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Linguagem4 extends Activity{
	
	ImageButton imgbtnComando;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.linguagem4);
	
		imgbtnComando = (ImageButton) findViewById(R.id.imgbtnComando);
		imgbtnComando.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent = new Intent(Linguagem4.this, TelaComandoActivity.class);
				startActivity(intent);
				
				
			}
		});
		
	}
	
	
	

}
