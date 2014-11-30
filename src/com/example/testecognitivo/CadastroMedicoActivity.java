package com.example.testecognitivo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CadastroMedicoActivity extends Activity {

	/**
	 * @author lieberson Declaracao de variaveis
	 */

	EditText edtNomeMed, edtCrmMed, edtEspecialidadeMed, edtLoginMed,
			edtSenhaMed;
	Button btnSalvarMed;

	// Declaração do Medico que será cadastrado
	Medico medico = new Medico();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.cadastro_medico);

		/**
		 * Linka as variaveis do java com o xml ativando o botao salvar
		 * */

		edtNomeMed = (EditText) findViewById(R.id.edtNomeMedico);
		edtCrmMed = (EditText) findViewById(R.id.edtCrmMed);
		edtEspecialidadeMed = (EditText) findViewById(R.id.edtEspecialidadeMed);
		edtLoginMed = (EditText) findViewById(R.id.edtLoginMed);
		edtSenhaMed = (EditText) findViewById(R.id.edtSenhaMed);

		/**
		 * @author lieberson captura o evento de clique do botao
		 */

		btnSalvarMed = (Button) findViewById(R.id.btnSalvarMed);

		btnSalvarMed.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

				// Atribui os dados do Xml par o objeto, para que
				// posso ser armazenado na base de dados
				medico.setNome(edtNomeMed.getText().toString());
				medico.setCrm(edtCrmMed.getText().toString());
				medico.setEspecialidade(edtEspecialidadeMed.getText().toString());
				medico.setLogin(edtLoginMed.getText().toString());
				medico.setSenha(edtSenhaMed.getText().toString());
				
				MedicoDAO medicoDAO = new MedicoDAO(CadastroMedicoActivity.this);
				medicoDAO.inserir(medico);
				Toast.makeText(CadastroMedicoActivity.this,"Médico salvo com sucesso..!!", Toast.LENGTH_SHORT).show();

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
