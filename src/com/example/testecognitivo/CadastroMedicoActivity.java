package com.example.testecognitivo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CadastroMedicoActivity extends Activity {

	/**
	 * @author lieberson Declaracao de variaveis
	 */

	EditText edtNomeMed, edtCrmMed, edtEspecialidadeMed, edtLoginMed,
			edtSenhaMed;
	Button btnSalvarMed;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.cadastro_medico);

		/**
		 * Linka as variaveis do java com o xml ativando o botao salvar
		 * */

		edtNomeMed = (EditText) findViewById(R.id.edtNomeMed);
		edtCrmMed = (EditText) findViewById(R.id.edtCrmMed);
		edtEspecialidadeMed = (EditText) findViewById(R.id.edtEspecialidadeMed);
		edtLoginMed = (EditText) findViewById(R.id.edtLoginMed);
		edtSenhaMed = (EditText) findViewById(R.id.edtSenhaMed);

		/**
		 * @author lieberson 
		 * captura o evento de clique do botao
		 */
		
		btnSalvarMed = (Button) findViewById(R.id.btnSalvarMed);
		
		btnSalvarMed.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

				/**
				 * tem que ser implementado um metodo para gravar os dados no
				 * banco. apos isso, sera redirecionado para a tela de login
				 */

				
				/**
				 * criando o objeto intent para redirecionamento para a tela de
				 * login
				 */
				Intent intent = new Intent(CadastroMedicoActivity.this,
						LoginActivity.class);

				startActivity(intent);

			}
		});

	}

}
