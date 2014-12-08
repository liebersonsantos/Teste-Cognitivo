package com.example.testecognitivo;

import java.util.List;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PacienteAdapter extends BaseAdapter {

	private Context context;
	private List<Paciente> list;

	public PacienteAdapter(Context context, List<Paciente> list) {
		this.context = context;
		this.list = list;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return list.get(position).getId();
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		final int auxposition = position;

		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(context.LAYOUT_INFLATER_SERVICE);

		final LinearLayout layout = (LinearLayout) inflater.inflate(
				R.layout.paciente, null);
		TextView txtNomePacienteLista = (TextView) layout
				.findViewById(R.id.txtNomePacienteLista);

		txtNomePacienteLista.setText(list.get(auxposition).getNome());
		txtNomePacienteLista.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				
				Intent intent = new Intent(context,MostraResultado.class);
				PacienteDAO pacienteDAO = new PacienteDAO(context);
				Paciente paciente = pacienteDAO.getPaciente(list.get(auxposition).getId());
				intent.putExtra("paciente", paciente);
				context.startActivity(intent);								
			}
		});
		return layout;
	}

}