package com.example.custoreceitamercadoria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class CadastroEdicaoInsumoActivity extends AppCompatActivity {

    Spinner spinnerTipoMedida;

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
                getApplicationContext(),
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
                listaTipoMedida
        ));
    }
}