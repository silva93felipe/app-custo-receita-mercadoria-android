package com.example.custoreceitamercadoria.DBHelper;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.custoreceitamercadoria.Entidades.TipoMedida;

import java.util.ArrayList;
import java.util.List;

public class DBHelper extends SQLiteOpenHelper {

    public DBHelper(Context ctx){
        super(ctx, "minhareceita.sqlite", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL("CREATE TABLE tipo_medida (" +
                "id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, " +
                "descricao TEXT NOT NULL, " +
                "sigla TEXT NOT NULL, " +
                "fator REAL NOT NULL DEFAULT 0," +
                "data_cadastro TEXT NOT NULL DEFAULT CURRENT_TIMESTAMP, " +
                "data_atualizacao TEXT NOT NULL DEFAULT CURRENT_TIMESTAMP)");
        db.execSQL("CREATE TABLE producao (" +
                "id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, " +
                "descricao TEXT NOT NULL, " +
                "percentual_lucro REAL NOT NULL DEFAULT 0, " +
                "valor_venda REAL NOT NULL DEFAULT 0, " +
                "data_cadastro TEXT NOT NULL DEFAULT CURRENT_TIMESTAMP, " +
                "data_atualizacao TEXT NOT NULL DEFAULT CURRENT_TIMESTAMP)");
        db.execSQL("CREATE TABLE insumo (" +
                "id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, " +
                //por que? "descricao TEXT NOT NULL, " +
                "tipo_medida_compra_id INTEGER NOT NULL, " +
                "tipo_medida_quantidade_representada_id INTEGER NOT NULL, " +
                "quantidade_representada REAL NOT NULL DEFAULT 0, " +
                "data_cadastro TEXT NOT NULL DEFAULT CURRENT_TIMESTAMP," +
                "data_atualizacao TEXT NOT NULL DEFAULT CURRENT_TIMESTAMP," +
                "FOREIGN KEY (tipo_medida_compra_id) REFERENCES tipo_medida (id), " +
                "FOREIGN KEY (tipo_medida_quantidade_representada_id) REFERENCES tipo_medida (id))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        if(oldVersion < 2){
            db.execSQL("");
        }
        if(oldVersion < 3){
            db.execSQL("");
        }
    }

    @SuppressLint("Range")
    public ArrayList<String> getTipoMedida(){
        SQLiteDatabase db = getReadableDatabase();
        ArrayList<String> medidas = new ArrayList<>();
        Cursor cur = db.rawQuery("SELECT descricao FROM tipo_medida ORDER BY descricao ASC", null);
        cur.moveToFirst();
        for(int i = 0; i < cur.getCount(); i++){
            medidas.add(cur.getString(cur.getColumnIndex("descricao")) );
        }
        return medidas;
    }
}
