package br.usjt.deswebmob.servicedeskcco;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    private EditText txtFila;
    public static final String FILA = "br.usjt.deswebmob.servicedeskcco.fila";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtFila = (EditText)findViewById(R.id.busca_fila);
    }
    public void buscarChamados(View view){
        String fila = txtFila.getText().toString();
        Intent intent = new Intent(this, ListarChamadosActivity.class);
        intent.putExtra(FILA, fila);
        startActivity(intent);
    }
}