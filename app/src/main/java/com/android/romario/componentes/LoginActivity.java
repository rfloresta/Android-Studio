package com.android.romario.componentes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    Button btnEnviar, btnRegresar;
    EditText txtUsu, txtPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnEnviar = (Button) findViewById(R.id.btnEnviar);
        btnRegresar = (Button) findViewById(R.id.btnRegresar);
        txtUsu = (EditText) findViewById(R.id.txtUsu);
        txtPass = (EditText) findViewById(R.id.txtPass);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, DatosRecibidosActivity.class);
                intent.putExtra("txtUsu",txtUsu.getText().toString());
                intent.putExtra("txtPass",txtPass.getText().toString());
                startActivity(intent);
            }
        });
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
