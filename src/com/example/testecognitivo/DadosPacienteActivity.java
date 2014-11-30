package com.example.testecognitivo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class DadosPacienteActivity extends Activity {

	/**
	 * Declaração de variaveis
	 */

	private EditText edtNomePaciente, edtDataNacPaciente,
			edtNaturalidadePaciente, edtNacionalidadePaciente;
	private RadioButton rdMasculino, rdFeminino;
	private RadioGroup rdgSexo;
	private Button btnSalvarDadosPaciente;
	private Spinner spinnerEscolaridade;
	private String[] ecolaridade = new String[] { "Ensino infantil",
			"Ensino fundamental", "Ensino médio", "Ensino superior" };
	
	//Declaração de paciente para a realização do teste
	Paciente paciente = new Paciente();
	
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
		spinnerEscolaridade = (Spinner) findViewById(R.id.spinnerEscolaridade);
		edtNaturalidadePaciente = (EditText) findViewById(R.id.edtNaturalidadePaciente);
		edtNacionalidadePaciente = (EditText) findViewById(R.id.edtNacionalidadePaciente);
		rdMasculino = (RadioButton) findViewById(R.id.rdMasculino);
		rdFeminino = (RadioButton) findViewById(R.id.rdFeminino);
		rdgSexo = (RadioGroup) findViewById(R.id.rdgSexo);
		btnSalvarDadosPaciente = (Button) findViewById(R.id.btnSalvarDadosPaciente);

		// Preenche o Spinner com os ,valores do grau de escolaridade
		ArrayAdapter<String> adapterEscolaridade = new ArrayAdapter<String>(
				DadosPacienteActivity.this,
				android.R.layout.simple_list_item_1, ecolaridade);
		spinnerEscolaridade.setAdapter(adapterEscolaridade);

		/**
		 * @author tairo Capitura o evento de clique do botão de salver
		 */
		btnSalvarDadosPaciente.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				
				//Verifica o sexo selecionado
				String sexo = "";
				if (rdFeminino.isChecked()) {
					sexo = "Feminino";
				}else{
					sexo = "Masculino";
				}
				
				//Atribui os dados do Xml par o objeto, para que 
				//posso ser armazenado na base de dados
				paciente.setNome(edtNomePaciente.getText().toString());
				paciente.setSexo(sexo);
				paciente.setDataNasc(edtDataNacPaciente.getText().toString());
				paciente.setEscolaridade(spinnerEscolaridade.getSelectedItem().toString());
				paciente.setNaturalidade(edtNaturalidadePaciente.getText().toString());
				paciente.setNacionalidade(edtNacionalidadePaciente.getText().toString());
				PacienteDAO pacienteDAO = new PacienteDAO(DadosPacienteActivity.this);
				pacienteDAO.inserir(paciente);
				Toast.makeText(DadosPacienteActivity.this, "Paciente salvo com sucesso..!!",Toast.LENGTH_SHORT).show();
				
				
				Intent intent = new Intent(DadosPacienteActivity.this,
						Apresentacao.class);
				startActivity(intent);
				
			}
		});	
		
	}
	
	public void listarPacientes( View view) {
		Intent intent = new Intent(DadosPacienteActivity.this,ListaPaciente.class);
		startActivity(intent);
	}
}
