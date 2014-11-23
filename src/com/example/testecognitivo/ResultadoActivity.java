package com.example.testecognitivo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ResultadoActivity extends Activity{
	
	Button btnCalcule;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.resultado);
		
		btnCalcule = (Button) findViewById(R.id.btnCalcule);
		btnCalcule.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			
				
			}
		});
		
		
		
		
	}
	

}
