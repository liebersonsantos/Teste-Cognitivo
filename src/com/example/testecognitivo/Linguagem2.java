package com.example.testecognitivo;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;

public class Linguagem2 extends Activity{
	
	/**
	 * @author tairo declaração de variaveis
	 */
	ImageButton imgBtnEnviarLinguagem2;
	@Override
	protected void onChildTitleChanged(Activity childActivity,
			CharSequence title) {
		// TODO Auto-generated method stub
		super.onChildTitleChanged(childActivity, title);
		
		setContentView(R.layout.linguagem2);
		/**
		 * Linka as variaveis java com xml
		 */
		imgBtnEnviarLinguagem2 = (ImageButton) findViewById(R.id.imgBtnEnviarLinguagem2);
		imgBtnEnviarLinguagem2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				/**
				 * @author tairo envia para a tela de liguagem
				 */
				Intent intent = new Intent(Linguagem2.this,
						Linguagem3.class);
				startActivity(intent);
			}
		});
	}

}
