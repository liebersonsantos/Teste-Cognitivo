package com.example.testecognitivo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class TelaComandoActivity extends Activity{
	
	/*
	 * Declaraçao de Variaveis
	 */
	private Button btnComandoSeguir;
	private ToggleButton tgFecha;
	private int pontos;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.tela_comando);
		
		/*
		 * 1-pega a pontuacao da activity anterior
		 * 2-Bundle para pegar os dados da intent
		 * 3-passa os pontos da outra activity para a variavel PONTOS para poder
		 * add os pontos desta activity
		 */
		Intent intentPontos = getIntent();				//1
		
		Bundle bundlePontos = intentPontos.getExtras();	//2
		
		if (intentPontos != null) {
			pontos = bundlePontos.getInt("pontos");
		}		//3
		
		
		
		/*
		 * Linka as variaveis java com xml
		 */
		
		btnComandoSeguir = (Button) findViewById(R.id.btnComandoSeguir);
		
		tgFecha = (ToggleButton) findViewById(R.id.tgFecha);
		tgFecha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				
				if(isChecked){
					pontos = pontos +1; Toast.makeText(TelaComandoActivity.this,String.valueOf(pontos),Toast.LENGTH_SHORT).show();
					tgFecha.setEnabled(false);
				}
				
			}
		});	
		
		btnComandoSeguir.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				/*
				 * chama a proxima activity
				 */
				Intent intent = new Intent(TelaComandoActivity.this, Linguagem5.class);
				
				Intent intentDados = getIntent();
				Medico medico = (Medico) intentDados.getSerializableExtra("medico");
				Paciente paciente = (Paciente) intentDados.getSerializableExtra("paciente");
				
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
