package com.example.testecognitivo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Linguagem7 extends Activity{
	
	Button btnSeguirLinguagem7;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.linguagem7);
		
		btnSeguirLinguagem7 = (Button) findViewById(R.id.btnSeguirLinguagem7);
		btnSeguirLinguagem7.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				/**
				 * envia para tela resultado
				 */
				
				//pega o "id" do paciente e o "id" do medico que veio de outra tela
				//aqui tem que modifica pegar o id, com uma intent de outra tela
				long id_paciente = 1;
				long id_medico = 1;
				
				Intent intent = new Intent(Linguagem7.this, ResultadoActivity.class);
				intent.putExtra("id_paciente", id_paciente);
				intent.putExtra("id_medico", id_medico);
				startActivity(intent);			
				
			}
		});
		
		
		
	}
		
		
	}
	
	


