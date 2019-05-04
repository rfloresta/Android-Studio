package com.android.romario.componentes;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ComponentesActivity extends AppCompatActivity {

    Button btnSetTexto,btnAmarillo,btnAzul,btnVerde,btnRegresar,btnMensaje;
    TextView txtDefault;
    ImageView viewAzul,viewVerde,viewAmarillo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_componentes);

        btnSetTexto = (Button) findViewById(R.id.btnSetTexto);
        btnMensaje = (Button) findViewById(R.id.btnMensaje);
        btnAmarillo = (Button) findViewById(R.id.btnAmarillo);
        btnAzul = (Button) findViewById(R.id.btnAzul);
        btnVerde = (Button) findViewById(R.id.btnVerde);
        btnRegresar = (Button) findViewById(R.id.btnRegresar);
        txtDefault = (TextView) findViewById(R.id.txtDefault);
        viewAzul = (ImageView) findViewById(R.id.viewAzul);
        viewAmarillo = (ImageView) findViewById(R.id.viewAmarillo);
        viewVerde = (ImageView) findViewById(R.id.viewVerde);

        btnSetTexto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtDefault.setText("Qué tal!!!");
            }
        });
        btnAzul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewAzul.setColorFilter(Color.BLUE);
            }
        });
        btnAmarillo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewAmarillo.setColorFilter(Color.YELLOW);
            }
        });
        btnVerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewVerde.setColorFilter(Color.GREEN);
            }
        });
        btnMensaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Esto es un mensaje", Toast.LENGTH_LONG).show();
            }
        });
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ComponentesActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
