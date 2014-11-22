package com.example.testecognitivo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class LembrancasActivity extends Activity {
	/**
	 * @author tairo declaração de variaveis
	 */
	ImageButton imgBtnEnviarLembrancas;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lembrancas);

		/**
		 * Linka as variaveis java com xml
		 */
		imgBtnEnviarLembrancas = (ImageButton) findViewById(R.id.imgBtnEnviarLembrancas);
		imgBtnEnviarLembrancas.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				/**
				 * @author tairo envia para a tela de liguagem
				 */
				Intent intent = new Intent(LembrancasActivity.this,
						Linguagem.class);
				startActivity(intent);
			}
		});

	}

}
