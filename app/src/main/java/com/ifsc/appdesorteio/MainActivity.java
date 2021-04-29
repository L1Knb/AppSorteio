package com.ifsc.appdesorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

import static com.ifsc.appdesorteio.R.*;

public class MainActivity extends AppCompatActivity {

    EditText edInicial, edFinal;
    TextView nmrSorteado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        edInicial=findViewById(id.editTextValorInicial);
        edFinal=findViewById(id.editTextValorFinal);
        nmrSorteado=findViewById(id.editNmrSorteado);
    }

    public void sorteioNumero(View view){
        int vInicial=0,vFinal=0;
        vInicial = Integer.parseInt(edInicial.getText().toString());
        vFinal = Integer.parseInt(edFinal.getText().toString());
        int numeroSorteado= (new Random().nextInt((vFinal-vInicial)+1))+vInicial;
        Log.i("ValorRandom", Integer.toString(numeroSorteado));

        nmrSorteado.setText(Integer.toString(numeroSorteado));

    }

}
