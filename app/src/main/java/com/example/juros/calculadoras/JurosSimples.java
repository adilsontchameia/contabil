package com.example.juros.calculadoras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import com.example.juros.R;

public class JurosSimples extends AppCompatActivity {

    /*EditTexts*/
    TextView edtValor, edtTempo;
    /*TextViews*/
    TextView taxaTotal, valorTotal, seekValor;
    /*Buttons*/
    Button btnLimpar;
    /*SeekBar*/
    SeekBar seekPorcentagem;
    private double porcentagem = 0;
    /*Fim das Variáveis*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juros_simples);
        /*Hooks*/
        ligacoes();
        seekPorcento();
        /*End*/
        btnLimpar.setVisibility(View.INVISIBLE);
    }

    private void ligacoes() {
        /*EditTexts*/
        edtValor = findViewById(R.id.edtMontante);
        edtTempo = findViewById(R.id.edtTempo);
        /*TextViews*/
        taxaTotal = findViewById(R.id.taxaTotal);
        valorTotal = findViewById(R.id.valorTotal);
        seekValor = findViewById(R.id.seekValor);
        /*Buttons*/
        btnLimpar = findViewById(R.id.btnLimpar);
        /*SeekBar*/
        seekPorcentagem = findViewById(R.id.seekPorcentagem);
    }

    public void calcular() {
        /*Recuperações dos Valores*/
        double valorDigitado = Double.parseDouble(edtValor.getText().toString());
        double tempoDigitado = Double.parseDouble(edtTempo.getText().toString());
        /*Fim*/

        /*Taxas*/
        double porcent =  porcentagem / 100;
        double totTaxa = valorDigitado * tempoDigitado * porcent;
        /*Fim*/

        /*Valores Totais*/
        double totValor = valorDigitado + totTaxa;
        /*Fim*/

        /*Setando os Textos Taxa*/
        taxaTotal.setText("" + Math.round(totTaxa));
        /*Setando os Textos Valores*/
        valorTotal.setText("" + Math.round(totValor));
        /*Fim*/

    }

    public void seekPorcento() {
        seekPorcentagem.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                porcentagem = seekBar.getProgress();
                seekValor.setText(Math.round(porcentagem) + "%");
                calcular();
                btnLimpar.setVisibility(View.VISIBLE);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

    public void limpar(View view) {
        /*Setando os Textos Vazios*/
        edtValor.setText("");
        edtTempo.setText("");
        taxaTotal.setText("");
        valorTotal.setText("");
        /*Fim*/
        btnLimpar.setVisibility(View.INVISIBLE);
    }
}