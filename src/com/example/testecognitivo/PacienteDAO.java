package com.example.testecognitivo;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;



public class PacienteDAO {

	private SQLiteDatabase db;
	
	public PacienteDAO( Context context) {
		DBCore auxdb = new  DBCore(context);
		db = auxdb.getWritableDatabase();		
	}
	
	public void inserir(Paciente paciente) {
		ContentValues values = new ContentValues();
		values.put("nome", paciente.getNome());
		values.put("sexo", paciente.getSexo());
		values.put("datanasc", paciente.getDataNasc());
		values.put("escolaridade", paciente.getEscolaridade());
		values.put("naturalidade", paciente.getNaturalidade());
		values.put("nacionalidade", paciente.getNacionalidade());
		
		db.insert("paciente", null, values);
	}
	
	public void atualizar(Paciente paciente) {
		ContentValues values = new ContentValues();
		values.put("nome", paciente.getNome());
		values.put("sexo", paciente.getSexo());
		values.put("datanasc", paciente.getDataNasc());
		values.put("escolaridade", paciente.getEscolaridade());
		values.put("naturalidade", paciente.getNaturalidade());
		values.put("nacionalidade", paciente.getNacionalidade());
		
		db.update("paciente", values, "_id = ?", new String[]{""+paciente.getId()});
	}
	
	public void deletar(Paciente paciente) {
		db.delete("paciente", "_id = ?", new String[]{""+paciente.getId()});
	}
	
	

	public  List<Paciente> buscar() {
		List<Paciente> list = new ArrayList<Paciente>();
		String[] columns = {"_id","nome","sexo","datanasc","escolaridade","naturalidade","nacionalidade"};
		Cursor cursor = db.query("paciente", columns, null, null, null, null, "_id");
		if (cursor.getCount() > 0) {
			cursor.moveToFirst();
			
			do {
				Paciente paciente = new Paciente();
				paciente.setId(cursor.getLong(0));
				paciente.setNome(cursor.getString(1));
				paciente.setSexo(cursor.getString(2));
				paciente.setDataNasc(cursor.getString(3));
				paciente.setEscolaridade(cursor.getString(4));
				paciente.setNaturalidade(cursor.getString(5));
				paciente.setNacionalidade(cursor.getString(6));
				
				list.add(paciente);
			} while (cursor.moveToNext());
		}
		return(list);
	}
	
}
