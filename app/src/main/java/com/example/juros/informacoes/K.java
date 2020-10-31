package com.example.juros.informacoes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.juros.R;
import com.example.juros.adapters.AdapExpressoesA;
import com.example.juros.models.ModelExpressoes;

import java.util.ArrayList;
import java.util.List;

public class K extends AppCompatActivity {

    RecyclerView recyclerView;
    private List<ModelExpressoes> listaModelExpressoes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_k);
        recyclerView = findViewById(R.id.recyclerView);
        //Listegem de Filmes
        this.criarExpressoes();

        //Configurar o Adapter
        AdapExpressoesA adapterExpressoes = new AdapExpressoesA(listaModelExpressoes);

        //Configurar RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapterExpressoes);
    }
    private void criarExpressoes() {
        ModelExpressoes modelExpressoes = new ModelExpressoes("Divida a", "Divida a Pagar a Um Fornecedor");
        this.listaModelExpressoes.add(modelExpressoes);

        modelExpressoes = new ModelExpressoes("Divida de", "Divida a Receber de Um Cliente");
        this.listaModelExpressoes.add(modelExpressoes);

        modelExpressoes = new ModelExpressoes("Credito de", "Divida a Pagar a Um Fornecedor");
        this.listaModelExpressoes.add(modelExpressoes);

        modelExpressoes = new ModelExpressoes("Debito a", "Divida a Pagar a Um Fornecedor");
        this.listaModelExpressoes.add(modelExpressoes);

        modelExpressoes = new ModelExpressoes("Credito a", "Divida a Receber a Um Fornecedor");
        this.listaModelExpressoes.add(modelExpressoes);

        modelExpressoes = new ModelExpressoes("Factura de", "Divida a Pagar a Um Fornecedor");
        this.listaModelExpressoes.add(modelExpressoes);

        modelExpressoes = new ModelExpressoes("Factura a", "Divida a Receber de Um Cliente");
        this.listaModelExpressoes.add(modelExpressoes);

        modelExpressoes = new ModelExpressoes("Aceite de", "Divida a Receber de Um Cliente");
        this.listaModelExpressoes.add(modelExpressoes);

        modelExpressoes = new ModelExpressoes("Aceite a", "Divida a Pagar a Um Fornecedor");
        this.listaModelExpressoes.add(modelExpressoes);

        modelExpressoes = new ModelExpressoes("Saque a", "Divida a Pagar a Um Fornecedor");
        this.listaModelExpressoes.add(modelExpressoes);

        modelExpressoes = new ModelExpressoes("Saque de", "Divida a Receber de Um Cliente");
        this.listaModelExpressoes.add(modelExpressoes);

        modelExpressoes = new ModelExpressoes("Nota de Dédito de", "Divida a Receber de Um Cliente");
        this.listaModelExpressoes.add(modelExpressoes);

        modelExpressoes = new ModelExpressoes("Nota de Crédito a", "Divida a Pagar a Um Fornecedor");
        this.listaModelExpressoes.add(modelExpressoes);

        modelExpressoes = new ModelExpressoes("Nota de Crédito de", "Divida a Receber de Um Cliente");
        this.listaModelExpressoes.add(modelExpressoes);

        modelExpressoes = new ModelExpressoes("Nota de Crédito ã", "Divida a Receber de Um Cliente");
        this.listaModelExpressoes.add(modelExpressoes);
    }
}