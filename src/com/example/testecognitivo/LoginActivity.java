package com.example.testecognitivo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {

	 private EditText edtNome,edtSenha;
	 private Button btnEntrar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);		
		setContentView(R.layout.login_activity);
		
		/** Linka os atributos do java com o xml*/
		edtNome = (EditText) findViewById(R.id.edtNome);
		edtSenha = (EditText) findViewById(R.id.edtSenha);
		btnEntrar = (Button) findViewById(R.id.btnEntrar);
		
		btnEntrar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				/***
				 * Verificação de login 
				 * se ususario for valido ira para tela de 
				 */
				if ((edtNome.getText().toString().equals("Lieberson")) && (edtSenha.getText().toString().equals(""))) {					
					
					
					Toast.makeText(LoginActivity.this, "Você está Logado cabaço", Toast.LENGTH_SHORT).show();
				}
			}
		});
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.principal, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
