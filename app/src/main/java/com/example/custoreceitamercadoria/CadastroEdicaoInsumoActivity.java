package com.example.custoreceitamercadoria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.custoreceitamercadoria.DBHelper.DBHelper;
import com.example.custoreceitamercadoria.Entidades.TipoMedida;
import com.example.custoreceitamercadoria.Repositorio.TipoMedidaRepository;

public class CadastroEdicaoInsumoActivity extends AppCompatActivity {

    Spinner spinnerTipoMedida;
    //TipoMedidaRepository tipoMedidaRepository = new TipoMedidaRepository(this);
    DBHelper dbHelper = new DBHelper(this);
    String[] listaTipoMedida = new String[]{"", "Litro", "Quilo", "Grama", "Mililitro", "Caixa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_insumo);

        spinnerTipoMedida = findViewById(R.id.spinnerTipoMedida);

        preencherSpinnerTipoMedida();
    }

    private void preencherSpinnerTipoMedida() {
        spinnerTipoMedida.setAdapter(new ArrayAdapter<String>(
               this,
                android.R.layout.simple_list_item_1,
                dbHelper.getTipoMedida()
        ));
    }
}