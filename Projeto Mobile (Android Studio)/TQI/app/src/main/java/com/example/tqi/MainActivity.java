package com.example.tqi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView numvalor, numparcelas;
    SeekBar barravalor, barraparcelas;
    EditText motivo, data;
    Button solicitar, acompanhar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numvalor = findViewById(R.id.numvalor);
        numparcelas = findViewById(R.id.numparcelas);
        barravalor = findViewById(R.id.barravalor);
        barraparcelas = findViewById(R.id.barraparcelas);
        motivo = findViewById(R.id.motivo);
        data = findViewById(R.id.data);
        solicitar = findViewById(R.id.solicitar);
        acompanhar = findViewById(R.id.acompanhar);


        barravalor.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                numvalor.setText("R$" + i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        barraparcelas.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                numparcelas.setText("" + i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}