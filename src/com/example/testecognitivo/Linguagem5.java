package com.example.testecognitivo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Linguagem5 extends Activity{

	private Button btnSeguirLinguagem5;
	//private ImageButton imgbtnVLinguagem5, imgbtnELinguagem5;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.linguagem5);
		
		btnSeguirLinguagem5 = (Button) findViewById(R.id.btnSeguirLinguagem5);
		btnSeguirLinguagem5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent = new Intent(Linguagem5.this, Linguagem6Activity.class);
				startActivity(intent);
				
			}
		});
		
		
		
		
		
	}
	
	
	
}
