package com.example.testecognitivo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class DadosPacienteActivity extends Activity {

	/**
	 * Declaração de variaveis
	 */

	EditText edtNomePaciente, edtDataNacPaciente, edtNaturalidadePaciente,
			edtNacionalidadePaciente;
	RadioButton rdMasculino, rdFeminino;
	RadioGroup rdgSexo;
	Button btnSalvarDadosPaciente;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dados_paciente);
		
		/*
		 * Intent intent = getIntent(); String nomeMedico =
		 * intent.getStringExtra("nomeMedico");
		 * Toast.makeText(DadosPacienteActivity.this, nomeMedico,
		 * Toast.LENGTH_SHORT).show();
		 */
		
		/**
		 * Linka as variaveis do java com o xml
		 */
		edtNomePaciente = (EditText) findViewById(R.id.edtNomePaciente);
		edtDataNacPaciente = (EditText) findViewById(R.id.edtDataNascPaciente);
		edtNaturalidadePaciente = (EditText) findViewById(R.id.edtNaturalidadePaciente);
		edtNacionalidadePaciente = (EditText) findViewById(R.id.edtNacionalidadePaciente);

		rdMasculino = (RadioButton) findViewById(R.id.rdMasculino);
		rdFeminino = (RadioButton) findViewById(R.id.rdFeminino);
		rdgSexo = (RadioGroup) findViewById(R.id.rdgSexo);

		btnSalvarDadosPaciente = (Button) findViewById(R.id.btnSalvarDadosPaciente);

		/**
		 * @author tairo Capitura o evento de clique do botão de salver
		 */
		btnSalvarDadosPaciente.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(DadosPacienteActivity.this,
						Apresentacao.class);
				startActivity(intent);
			}
		});

	}
}
