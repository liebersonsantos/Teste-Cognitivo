package com.example.testecognitivo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class AtencaoCalculoActivity extends Activity{
	
	/*
	 * declaração das variaveis
	 */
	private ImageButton imgbtnEnviarAtecaoCalculo;
	private ToggleButton tgM,tgU, tgN, tgD, tgO;
	private int pontos;
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.atencao_calculo);
		
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
			
		imgbtnEnviarAtecaoCalculo = (ImageButton) findViewById(R.id.imgbtnEnviarAtencaoCalculo);
		
		tgM = (ToggleButton) findViewById(R.id.tgM);
		tgM.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				if (isChecked){
					pontos = pontos +1; Toast.makeText(AtencaoCalculoActivity.this, String.valueOf(pontos), Toast.LENGTH_SHORT).show();
					tgM.setEnabled(false);
				}
				
			}
		});		
		
		tgU = (ToggleButton) findViewById(R.id.tgU);
		tgU.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				if (isChecked){
					pontos = pontos +1;Toast.makeText(AtencaoCalculoActivity.this, String.valueOf(pontos), Toast.LENGTH_SHORT).show();
					tgU.setEnabled(false);
				}
				
			}
		});		
		
		tgN = (ToggleButton) findViewById(R.id.tgN);
		tgN.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				if (isChecked){
					pontos = pontos +1; Toast.makeText(AtencaoCalculoActivity.this, String.valueOf(pontos), Toast.LENGTH_SHORT).show();
					tgN.setEnabled(false);
				}
				
			}
		});		
		
		tgD = (ToggleButton) findViewById(R.id.tgD);
		tgD.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				if (isChecked){
					pontos = pontos +1; Toast.makeText(AtencaoCalculoActivity.this, String.valueOf(pontos), Toast.LENGTH_SHORT).show();
					tgD.setEnabled(false);
				}
				
			}
		});		
		
		tgO = (ToggleButton) findViewById(R.id.tgO);
		tgO.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				if (isChecked){
					pontos = pontos +1; Toast.makeText(AtencaoCalculoActivity.this, String.valueOf(pontos), Toast.LENGTH_SHORT).show();
					tgO.setEnabled(false);
				}
				
			}
		});			
		
		imgbtnEnviarAtecaoCalculo.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent = new Intent(AtencaoCalculoActivity.this, LembrancasActivity.class);
								
				Intent intentDados = getIntent();
				Medico medico = (Medico) intentDados.getSerializableExtra("medico");
				Paciente paciente = (Paciente) intentDados.getSerializableExtra("paciente");
				
				//Insere o medico e o paciente para enviar á proxima activity
				intent.putExtra("medico", medico); //insere e instancia do medico para envio
				intent.putExtra("paciente", paciente);//insere e instancia do paciente para envio							
				
				//passa para a proxima activity o valor da pontuação
				intent.putExtra("pontos", pontos);
				startActivity(intent);
			}
		});
		
		
		
	}

}
