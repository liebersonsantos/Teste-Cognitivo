package com.example.testecognitivo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBCore extends SQLiteOpenHelper{
	private static final String NOME_DB = "TesteCognitivo_db";
	private static final int VERSAO_DB = 1;

	public DBCore(Context context) {
		super(context, NOME_DB, null, VERSAO_DB);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL("create table paciente("
					+ "_id integer primary key autoincrement,"
					+ "nome text not null,"
					+ "sexo text not null,"
					+ "datanasc text not null,"
					+ "escolaridade text not null,"
					+ "naturalidade text not null,"
					+ "nacionalidade text not null);");
		
		db.execSQL("create table medico("
				+ "_id integer primary key autoincrement,"
				+ "nome text not null,"
				+ "crm text not null,"
				+ "especialidade text not null,"
				+ "login text not null,"
				+ "senha text not null);");
		
		db.execSQL("create table teste("
				+ "_id integer primary key autoincrement,"
				+ "id_paciente integer not null,"
				+ "id_medico integer not null,"
				+ "resultado text not null);");
			
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL("drop table paciente");
		db.execSQL("drop table medico");
		db.execSQL("drop table teste");
		onCreate(db);		
	}
	
}
