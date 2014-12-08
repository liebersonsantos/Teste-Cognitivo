package com.example.testecognitivo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class RegistroActivity extends Activity{
	
	private ImageButton imgbtnEnviarRegistro;
	private ToggleButton tgVaso, tgCarro, tgTijolo;
	private int pontos;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);		
		setContentView(R.layout.registro);
		
		/*
		 * Pega a pontuação da Activity anterior
		 */
		Intent intentPontos = getIntent();
		/*
		 * Bundle para pegar os dados da intent
		 */
		Bundle bundlePontos = intentPontos.getExtras();
				
	    /*
	     * passa os pontos da outra activity para a variável "ponto"
	     * para poder adicionar os pontos dessa Activity
	     */
	    
		if (intentPontos != null) {
			pontos = bundlePontos.getInt("pontos");
		}
						
		/*
		 * Linka o Java com Xml	
		 * Aqui precisa pegar todos os botões do xml para implementar o clique	
		 */
		
				
		imgbtnEnviarRegistro = (ImageButton) findViewById(R.id.imgBtnEnviarLembrancas);
		
		tgVaso = (ToggleButton) findViewById(R.id.tgVaso);
		tgVaso.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				if (isChecked){
					pontos = pontos +1; Toast.makeText(RegistroActivity.this, String.valueOf(pontos), Toast.LENGTH_SHORT).show();
					tgVaso.setEnabled(false);
				}
				
			}
		});
		
		tgCarro = (ToggleButton) findViewById(R.id.tgCarro);
		tgCarro.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				if (isChecked){
					pontos = pontos +1; Toast.makeText(RegistroActivity.this, String.valueOf(pontos), Toast.LENGTH_SHORT).show();
					tgCarro.setEnabled(false);
				}
				
			}
		});
		
		tgTijolo = (ToggleButton) findViewById(R.id.tgTijolo);
		tgTijolo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				if (isChecked){
					pontos = pontos +1; Toast.makeText(RegistroActivity.this, String.valueOf(pontos), Toast.LENGTH_SHORT).show();
					tgTijolo.setEnabled(false);
				}
				
			}
		});		
		
		imgbtnEnviarRegistro.setOnClickListener(new View.OnClickListener() {						
			@Override
			public void onClick(View v) {
								
				/*
				 * Chama a proxima activity
				 */
				Intent intent = new Intent(RegistroActivity.this, AtencaoCalculoActivity.class);
				startActivity(intent);
				
				Intent intentDados = getIntent();
				Medico medico = (Medico) intentDados.getSerializableExtra("medico");
				Paciente paciente = (Paciente) intentDados.getSerializableExtra("paciente");
				
				//Insere o medico e o paciente para enviar á proxima activity
				intent.putExtra("medico", medico); //insere e instancia do medico para envio
				intent.putExtra("paciente", paciente);//insere e instancia do paciente para envio	
				
				/*
				 * passa para a prixima activity o valor da pontuação
				 */
				intent.putExtra("pontos", pontos);
				startActivity(intent);				
			}
		});
		
		
		
		
		
	}

}
