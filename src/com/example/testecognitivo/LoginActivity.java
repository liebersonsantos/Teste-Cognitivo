package com.example.testecognitivo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {

	 private EditText edtLogin,edtSenha;
	 private Button btnEntrar, btnCadastrar;
	 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);		
		setContentView(R.layout.login_activity);
		
		/** Linka os atributos do java com o xml*/
		edtLogin = (EditText) findViewById(R.id.edtLogin);
		edtSenha = (EditText) findViewById(R.id.edtSenha);
		btnEntrar = (Button) findViewById(R.id.btnEntrar);
		btnCadastrar = (Button) findViewById(R.id.btnCadastrar);
				
		btnCadastrar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent = new Intent(LoginActivity.this, CadastroMedicoActivity.class);
				startActivity(intent);
				
			}
		});
		
	
		btnEntrar.setOnClickListener(new View.OnClickListener() {
				
			@Override
			public void onClick(View v) {
				
				/***
				 * Verificação de login 
				 * se ususario for valido ira para tela de dados d paciente
				 */
				
				//Chama o DAO do medico para fazer o login
				MedicoDAO medicoDAO = new  MedicoDAO(LoginActivity.this);
				
				if (medicoDAO.loginMedico(edtLogin.getText().toString(), edtSenha.getText().toString())) {	
					
					/**
					 * @author lieberson
					 * cria a Intent para ser enviada para outra Activity
					 */
					Intent intent = new Intent(LoginActivity.this,DadosPacienteActivity.class);
					intent.putExtra("nomeMedico", edtLogin.getText().toString());
					startActivity(intent);					
				}else{
					Toast.makeText(LoginActivity.this, "Por favor faça o cadastro para de logar", Toast.LENGTH_SHORT).show();
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
