package com.example.testecognitivo;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;

public class Linguagem extends Activity{
	
	/**
	 * @author tairo declaração de variaveis
	 */
	ImageButton imgBtnEnviarLinguagem;
	@Override
	protected void onChildTitleChanged(Activity childActivity,
			CharSequence title) {
		// TODO Auto-generated method stub
		super.onChildTitleChanged(childActivity, title);
		
		setContentView(R.layout.linguagem);

		/**
		 * Linka as variaveis java com xml
		 */
		imgBtnEnviarLinguagem = (ImageButton) findViewById(R.id.imgBtnEnviarLinguagem2);
		imgBtnEnviarLinguagem.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				/**
				 * @author tairo envia para a tela de liguagem
				 */
				Intent intent = new Intent(Linguagem.this,
						Linguagem2.class);
				startActivity(intent);
			}
		});
	}

}
