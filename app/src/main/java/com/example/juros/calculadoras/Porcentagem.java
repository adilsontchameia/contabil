package com.example.juros.calculadoras;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.juros.R;

public class Porcentagem extends AppCompatActivity {

    EditText edt_valor, edt_porcento;
    TextView tv_taxa, tv_total;
    Button btnLimpar, btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_porcentagem);

        /*Hooks*/
        ligacoes();
        /*End*/
        btnLimpar.setVisibility(View.INVISIBLE);
    }

    private void ligacoes() {
        /*EditTexts*/
        edt_valor = findViewById(R.id.edt_valor);
        edt_porcento = findViewById(R.id.edt_porcento);
        /*TextViews*/
        tv_taxa = findViewById(R.id.tv_taxa);
        tv_total = findViewById(R.id.tv_total);
        /*Buttons*/
        btnLimpar = findViewById(R.id.btnLimpar);
        btnCalcular = findViewById(R.id.btnCalcular);
    }

    public void calcular(View view) {

        if (edt_valor.getText().toString().isEmpty() || edt_porcento.getText().toString().isEmpty()) {
            Toast.makeText(this, "Por favor, preecha todos campso.", Toast.LENGTH_SHORT).show();
        } else {
            /*Recuperações dos Valores*/
            double valorDigitado = Double.parseDouble(edt_valor.getText().toString());
            double porcentoDigitado = Double.parseDouble(edt_porcento.getText().toString());
            /*Fim*/
            /*Taxas*/
            double totTaxa = valorDigitado * porcentoDigitado / 100;
            /*Fim*/

            /*Valores Totais*/
            double totValor = valorDigitado + totTaxa;
            /*Fim*/

            /*Setando os Textos Taxa*/
            tv_taxa.setText("" + totTaxa);

            /*Setando os Textos Valores*/
            tv_total.setText("" + totValor);
            /*Fim*/
            btnCalcular.setVisibility(View.INVISIBLE);
            btnLimpar.setVisibility(View.VISIBLE);
        }

    }

    public void limpar(View view) {
        /*Setando os Textos Vazios*/
        tv_taxa.setText("0%");
        tv_total.setText("0.0");
        edt_valor.setText("");
        edt_porcento.setText("");
        /*Fim*/
        btnLimpar.setVisibility(View.INVISIBLE);
        btnCalcular.setVisibility(View.VISIBLE);
    }
}