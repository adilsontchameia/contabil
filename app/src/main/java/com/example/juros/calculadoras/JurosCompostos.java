package com.example.juros.calculadoras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

import com.example.juros.R;

public class JurosCompostos extends AppCompatActivity {
    /*EditTexts*/
    TextView edtValor, edtTempo;
    /*TextViews*/
    TextView taxaTotal, valorTotal, seekValor;
    /*Buttons*/
    Button btnLimpar;
    /*SeekBar*/
    SeekBar seekPorcentagem;
    private double porcentagem = 0;
    /*switchMeses*/
    Switch switchMeses;
    /*Fim das Variáveis*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juros_compostos);

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
        /*Switch*/
        switchMeses = findViewById(R.id.switchMeses);
    }

    public void calcular() {
        /*Recuperações dos Valores*/
        double valorDigitado = Double.parseDouble(edtValor.getText().toString());
        int tempoDigitado = Integer.parseInt(edtTempo.getText().toString());

        if (switchMeses.isChecked()) {
            /*Calculos Basics*/
            double meses = (int) (tempoDigitado * 12.008);
            double porcent = porcentagem / 100;
            double porcentFinal = 1 + porcent;
            /*Fim de Calculos Baisos*/

            /*Calculos de Juros*/
            double totTaxa = Math.pow(porcentFinal, meses);
            double totValor = valorDigitado * totTaxa;
            /*Fim de Calculos de Juros*/

            switchMeses.setText("Calculo em Meses");
            taxaTotal.setText("" + Math.round(totTaxa));
            valorTotal.setText("" + totValor);

        } else {
            /*Calculos Basics*/
            double porcent = porcentagem / 100;
            double porcentFinal = 1 + porcent;
            /*Fim de Calculos Baisos*/

            /*Calculos de Juros*/
            double totTaxa = Math.pow(porcentFinal, tempoDigitado);
            double totValor = valorDigitado * totTaxa;
            /*Fim de Calculos de Juros*/

            switchMeses.setText("Calculo em Anos");
            taxaTotal.setText("" + Math.round(totTaxa));
            valorTotal.setText("" + totValor);
        }
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