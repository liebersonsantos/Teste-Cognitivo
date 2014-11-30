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

public class MedicoAdapter extends BaseAdapter {

	private Context context;
	private List<Medico> list;

	public MedicoAdapter(Context context, List<Medico> list) {
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
		TextView txtNomeMedicoLista = (TextView) layout
				.findViewById(R.id.txtNomePacienteLista);

		txtNomeMedicoLista.setText(list.get(auxposition).getNome());
		
		txtNomeMedicoLista.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				
				Intent intent = new Intent(context,CadastroMedicoActivity.class);
				intent.putExtra("id", list.get(auxposition).getId());
				intent.putExtra("nome", list.get(auxposition).getNome());
				intent.putExtra("crm", list.get(auxposition).getCrm());
				intent.putExtra("especialidade", list.get(auxposition).getEspecialidade());
				intent.putExtra("login", list.get(auxposition).getLogin());
				intent.putExtra("senha", list.get(auxposition).getSenha());
				context.startActivity(intent);
								
			}
		});
		return layout;
	}

}