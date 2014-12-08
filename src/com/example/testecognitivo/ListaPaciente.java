package com.example.testecognitivo;



import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class ListaPaciente extends ActionBarActivity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lista_de_pacientes);
		
		//Linka o Xml com o java
		ListView listaPacientes = (ListView) findViewById(R.id.lista);	
		//Pega os dados do medico logado na activity anterior
		Intent intentDados = getIntent();
		Medico medico = (Medico) intentDados.getSerializableExtra("medico");
		
		//Buscar todos os pacientes da base de dados 
		PacienteDAO pacienteDAO = new  PacienteDAO(this);		
		BaseAdapter adapter = new PacienteAdapter(this, pacienteDAO.buscar(),medico);
		
		//MedicoDAO medicoDAO = new  MedicoDAO(ListaPaciente.this);		
		//BaseAdapter adapter = new MedicoAdapter(ListaPaciente.this, medicoDAO.buscar());
		
		//TesteDAO testeDAO = new  TesteDAO(ListaPaciente.this);		
		//BaseAdapter adapter = new TesteAdapter(ListaPaciente.this, testeDAO.buscar());
		
		//preenche a lista do layout com os dados
		listaPacientes.setAdapter(adapter);	
	}
}
