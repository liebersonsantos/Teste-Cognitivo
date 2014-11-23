package com.example.testecognitivo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Linguagem6Activity extends Activity{
	
	Button btnSeguirLinguagem6;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.linguagem6);
		
		/*
		 * linka as variaveis java com xml
		 */
		
		btnSeguirLinguagem6 = (Button) findViewById(R.id.btnSeguirLinguagem6);
		btnSeguirLinguagem6.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				
				Intent intent = new Intent(Linguagem6Activity.this, Linguagem7.class);
				startActivity(intent);
			}
		});
		
	}
	
	

}
