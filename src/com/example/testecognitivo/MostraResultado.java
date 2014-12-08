package com.example.testecognitivo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MostraResultado extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mostra_resultado);
		
		Intent intentDados= getIntent();					
		if (intentDados != null) {
			
			TextView nomeMedico = (TextView) findViewById(R.id.txtNmMedicoResult);
			TextView crmMedico = (TextView) findViewById(R.id.txtCrmResultado);
			TextView nomePaciente = (TextView) findViewById(R.id.txtNomePacienteResultado);
			TextView idadePaciente = (TextView) findViewById(R.id.txtIdadePacienteResultado);
			TextView escoPaciente = (TextView) findViewById(R.id.txtEscoPacienteResultado);
			TextView txtResultado = (TextView) findViewById(R.id.txtResultPacienteResultado);
			
			
			
			
			
			
		}	
	}
}
