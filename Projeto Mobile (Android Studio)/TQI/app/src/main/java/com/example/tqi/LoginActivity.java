package com.example.tqi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText email, senha;
    Button entrar, cadastro;
    CheckBox lembrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = findViewById(R.id.email);
        senha = findViewById(R.id.senha);
        entrar = findViewById(R.id.entrar);
        cadastro = findViewById(R.id.cadastro);
        lembrar = findViewById(R.id.lembrar);

        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent novatela = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(novatela);
                finish();
            }
        });

        cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent novatela = new Intent(LoginActivity.this, CadastroActivity.class);
                startActivity(novatela);
                finish();
            }
        });
    }
}