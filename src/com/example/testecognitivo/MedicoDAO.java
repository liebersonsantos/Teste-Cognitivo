package com.example.testecognitivo;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class MedicoDAO {
	private SQLiteDatabase db;
	
	public MedicoDAO( Context context) {
		DBCore auxdb = new  DBCore(context);
		db = auxdb.getWritableDatabase();		
	}
	
	public void inserir(Medico medico) {
		ContentValues values = new ContentValues();
		values.put("nome", medico.getNome());
		values.put("crm", medico.getCrm());
		values.put("especialidade", medico.getEspecialidade());
		values.put("login", medico.getLogin());
		values.put("senha", medico.getSenha());
		
		db.insert("medico", null, values);
	}
	
	public void atualizar(Medico medico) {
		ContentValues values = new ContentValues();
		values.put("nome", medico.getNome());
		values.put("crm", medico.getCrm());
		values.put("especialidade", medico.getEspecialidade());
		values.put("login", medico.getLogin());
		values.put("senha", medico.getSenha());
		
		db.update("medico", values, "_id = ?", new String[]{""+medico.getId()});
	}
	
	public void deletar(Medico medico) {
		db.delete("medico", "_id = ?", new String[]{""+medico.getId()});
	}
	
	

	public  List<Medico> buscar() {
		List<Medico> list = new ArrayList<Medico>();
		String[] columns = {"_id","nome","crm","especialidade","login","senha"};
		Cursor cursor = db.query("medico", columns, null, null, null, null, "_id");
		if (cursor.getCount() > 0) {
			cursor.moveToFirst();
			
			do {
				Medico medico = new Medico();
				medico.setId(cursor.getLong(0));
				medico.setNome(cursor.getString(1));
				medico.setCrm(cursor.getString(2));
				medico.setEspecialidade(cursor.getString(3));
				medico.setLogin(cursor.getString(4));
				medico.setSenha(cursor.getString(5));
				
				list.add(medico);
			} while (cursor.moveToNext());
		}
		return(list);
	}
	
	
	/** 
     * @param usuario 
     * @param senha 
     * @return 
     */  
    public Medico loginMedico(String login, String senha) {   
    	Medico medico = new Medico();
    	
    	String[] columns = {"_id","nome","crm","especialidade","login","senha"};
    	String  where = "login = ? AND senha = ?";
    	String[] param = {login,senha};
    	
		Cursor cursor = db.query("medico",columns, where, param, null, null, null);
		if (cursor.getCount() > 0) {
			cursor.moveToFirst();
			
			medico.setId(cursor.getLong(0));
			medico.setNome(cursor.getString(1));
			medico.setCrm(cursor.getString(2));
			medico.setEspecialidade(cursor.getString(3));
			medico.setLogin(cursor.getString(4));
			medico.setSenha(cursor.getString(5));
			return medico;
		}else{
			return medico;
		}
    } 
}
