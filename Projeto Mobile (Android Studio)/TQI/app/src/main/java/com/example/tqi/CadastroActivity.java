package com.example.tqi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CadastroActivity extends AppCompatActivity {

    EditText nome, cpf, email, senha;
    Button confirmar, cancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        nome = findViewById(R.id.nome);
        cpf = findViewById(R.id.cpf);
        email = findViewById(R.id.email);
        senha = findViewById(R.id.senha);
        confirmar = findViewById(R.id.confirmar);
        cancelar = findViewById(R.id.cancelar);

        confirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent novatela = new Intent(CadastroActivity.this, LoginActivity.class);
                startActivity(novatela);
                finish();
            }
        });

        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent novatela = new Intent(CadastroActivity.this, LoginActivity.class);
                startActivity(novatela);
                finish();
            }
        });
    }
}