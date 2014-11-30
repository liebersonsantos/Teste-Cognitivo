package com.example.testecognitivo;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TesteAdapter extends BaseAdapter {

	private Context context;
	private List<Teste> list;

	public TesteAdapter(Context context, List<Teste> list) {
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
		TextView txtResultadoLista = (TextView) layout
				.findViewById(R.id.txtNomePacienteLista);

		txtResultadoLista.setText(list.get(auxposition).getResultado());
		
		return layout;
	}

}