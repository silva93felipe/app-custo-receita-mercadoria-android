package com.example.custoreceitamercadoria.Repositorio;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.custoreceitamercadoria.DBHelper.DBHelper;
import com.example.custoreceitamercadoria.Entidades.TipoMedida;

import java.util.ArrayList;
import java.util.List;

public class RepositorioCadastro {

    private DBHelper dbHelper;
    private SQLiteDatabase db;

    public RepositorioCadastro(Context ctx){
        dbHelper = new DBHelper(ctx);
        db = dbHelper.getWritableDatabase();
    }

    /* Tipo Medida */
    @SuppressLint("Range")
    public List<TipoMedida> getTipoMedida(){
        List<TipoMedida> medidas = new ArrayList<>();
        Cursor cur = db.rawQuery("SELECT id, nome, sigla, fator FROM tipo_medida ORDER BY nome ASC", null);
        cur.moveToFirst();
        for(int i = 0; i < cur.getCount(); i++){
            TipoMedida tmp = new TipoMedida();
            tmp.setId( cur.getInt(cur.getColumnIndex("id")) );
            tmp.setNome( cur.getString(cur.getColumnIndex("nome")) );
            tmp.setSigla( cur.getString(cur.getColumnIndex("sigla")) );
            tmp.setFator( cur.getInt(cur.getColumnIndex("fator")) );
            medidas.add(tmp);
        }
        return medidas;
    }

    @SuppressLint("Range")
    public TipoMedida getTipoMedidaById(int id){
        String[] parametros = new String[]{
                String.valueOf(id)
        };

        TipoMedida medida = new TipoMedida();
        Cursor cur = db.rawQuery("SELECT id, nome, sigla, fator FROM tipo_medida WHERE id = ? ORDER BY nome ASC", parametros);
        cur.moveToFirst();

        for(int i = 0; i < cur.getCount(); i++){
            medida.setId( cur.getInt(cur.getColumnIndex("id")) );
            medida.setNome( cur.getString(cur.getColumnIndex("nome")) );
            medida.setSigla( cur.getString(cur.getColumnIndex("sigla")) );
            medida.setFator( cur.getInt(cur.getColumnIndex("fator")) );
        }
        return medida;
    }

    @SuppressLint("Range")
    public int setTipoMedida(TipoMedida medida){
        int id = medida.getId();

        if(medida.getId() == 0){
            Object[] parametros = new Object[]{
                    medida.getNome(),
                    medida.getSigla(),
                    medida.getFator()
            };
            db.execSQL("INSERT INTO tipo_medida (nome, sigla, fator, data_cadastro, data_atualizacao) VALUES (?, ?, ?, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP)", parametros);
        }else{
            Object[] parametros = new Object[]{
                    medida.getNome(),
                    medida.getSigla(),
                    medida.getFator(),
                    medida.getId()
            };
            db.execSQL("UPDATE tipo_medida SET nome = ?, sigla = ?, fator = ?, data_atualizacao = CURRENT_TIMESTAMP WHERE id = ?", parametros);
            Cursor cur = db.rawQuery("SELECT last_insert_rowid() AS id", null);
            cur.moveToFirst();
            id = cur.getInt(cur.getColumnIndex("id"));
        }

        return id;
    }
    
    /* Produção */
    // Implementar


    /* Insumo */
    // Implementar
    
}
