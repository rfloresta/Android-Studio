package com.android.romario.componentes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DatosRecibidosActivity extends AppCompatActivity {

    TextView txtUsu, txtPass;
    Button  btnRegresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_recibidos);
        btnRegresar = (Button) findViewById(R.id.btnRegresar1);
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DatosRecibidosActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
        datosRecibidos();
    }

    public void datosRecibidos(){

        Bundle extras=getIntent().getExtras();
        String usu=extras.getString("txtUsu");
        String pass=extras.getString("txtPass");

        txtUsu = (TextView) findViewById(R.id.txtUsu);
        txtPass = (TextView) findViewById(R.id.txtPass);

        txtUsu.setText(usu);
        txtPass.setText(pass);
    }
}
