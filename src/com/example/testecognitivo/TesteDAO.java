package com.example.testecognitivo;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class TesteDAO {
	private SQLiteDatabase db;
	
	public TesteDAO( Context context) {
		DBCore auxdb = new  DBCore(context);
		db = auxdb.getWritableDatabase();		
	}
	
	public void inserir(Teste teste,Paciente paciente,Medico medico) {
		ContentValues values = new ContentValues();
		values.put("id_paciente", paciente.getId());
		values.put("id_medico", medico.getId());
		values.put("resultado", teste.getResultado());
		
		db.insert("teste", null, values);
	}
	
	public void atualizar(Teste teste,Paciente paciente,Medico medico) {
		ContentValues values = new ContentValues();
		values.put("id_paciente", paciente.getId());
		values.put("id_medico", medico.getId());
		values.put("resultado", teste.getResultado());
		
		db.update("teste", values, "_id = ?", new String[]{""+teste.getId()});
	}
	
	
	public void deletar(Teste teste) {
		db.delete("teste", "_id = ?", new String[]{""+teste.getId()});
	}
	
	

	public  List<Teste> buscar() {
		List<Teste> list = new ArrayList<Teste>();
		String[] columns = {"_id","id_paciente","id_medico","resultado"};
		Cursor cursor = db.query("teste", columns, null, null, null, null, "_id");
		if (cursor.getCount() > 0) {
			cursor.moveToFirst();
			
			do {
				Teste teste = new Teste();
				teste.setId(cursor.getLong(0));
				teste.setIdPaciente(cursor.getInt(1));
				teste.setIdMedico(cursor.getInt(2));
				teste.setResultado(cursor.getString(3));
				
				list.add(teste);
			} while (cursor.moveToNext());
		}
		return(list);
	}
	
    public Teste getTeste(String id_paciente, String id_medico) {   
    	Teste teste = new Teste();
    	
    	String[] columns = {"_id","id_paciente","id_medico","resultado"};
    	String  where = "id_paciente = ? AND id_medico = ?";
    	String[] param = {id_paciente,id_medico};
    	
		Cursor cursor = db.query("teste",columns, where, param, null, null, null);
		if (cursor.getCount() > 0) {
			cursor.moveToFirst();
			
			teste.setId(cursor.getLong(0));
			teste.setIdPaciente(cursor.getLong(2));
			teste.setIdMedico(cursor.getLong(1));		
			teste.setResultado(cursor.getString(3));
			return teste;
		}else{
			return teste;
		}
    } 
}
