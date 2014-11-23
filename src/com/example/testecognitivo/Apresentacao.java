package com.example.testecognitivo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Apresentacao extends Activity {

	Button btnInicioTeste;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.apresentacao);
		
		btnInicioTeste = (Button) findViewById(R.id.btnInicioTeste);

		btnInicioTeste.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent intent = new Intent(Apresentacao.this,
						OrientacaoTemporalActivity.class);
				startActivity(intent);
//
			}
		});

	}

}
