package com.example.testecognitivo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Linguagem3 extends Activity {
	
	private ImageButton imgbtnSeguirLinguagem3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		// inflar layout de linguagem 3
		setContentView(R.layout.linguagem);
		
		imgbtnSeguirLinguagem3 = (ImageButton) findViewById(R.id.imgbtnSeguirLinguagem3);
		imgbtnSeguirLinguagem3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent = new Intent(Linguagem3.this, Linguagem4.class);
				startActivity(intent);
				
			}
		});
		
	}

}
