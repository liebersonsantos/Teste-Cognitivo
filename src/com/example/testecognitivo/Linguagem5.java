package com.example.testecognitivo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Linguagem5 extends Activity{

	private Button btnSeguirLinguagem5;
	private ToggleButton tglim5;
	private int pontos;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.linguagem5);
		
		/*
		 * 1-pega a pontuacao da activity anterior
		 * 2-Bundle para pegar os dados da intent
		 * 3-passa os pontos da outra activity para a variavel PONTOS para poder add 
		 * os pontos desta activity
		 */
		Intent intentPontos = getIntent();					//1
		Bundle bundlePontos = intentPontos.getExtras();		//2
		
		if (intentPontos != null) {
			pontos = bundlePontos.getInt("pontos");
		}			//3		 
		
		
		btnSeguirLinguagem5 = (Button) findViewById(R.id.btnSeguirLinguagem5);
		
		tglim5 = (ToggleButton) findViewById(R.id.tglim5);
		tglim5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				
				if (isChecked){
					pontos = pontos +1;Toast.makeText(Linguagem5.this, String.valueOf(pontos), Toast.LENGTH_LONG).show();
					tglim5.setEnabled(false);
				}
				
			}
		});
		
		btnSeguirLinguagem5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent intentDados = getIntent();
				Medico medico = (Medico) intentDados.getSerializableExtra("medico");
				Paciente paciente = (Paciente) intentDados.getSerializableExtra("paciente");
				
				Intent intent = new Intent(Linguagem5.this, Linguagem6Activity.class);
				
				//Insere o medico e o paciente para enviar á proxima activity
				intent.putExtra("medico", medico); //insere e instancia do medico para envio
				intent.putExtra("paciente", paciente);//insere e instancia do paciente para envio
			
				/*
				 * passa os pontos acumulados desta, para a proxima activity
				 */
				intent.putExtra("pontos", pontos);
				startActivity(intent);				
			}
		});	
		
	}
	
	
	
}
