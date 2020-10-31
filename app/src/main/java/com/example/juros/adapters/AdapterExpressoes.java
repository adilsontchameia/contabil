package com.example.juros.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.juros.R;
import com.example.juros.models.ModelExpressoes;

import java.util.List;

public class AdapterExpressoes extends RecyclerView.Adapter<AdapterExpressoes.MyViewHolder>{

    private List<ModelExpressoes> listaExpressoes;

    public AdapterExpressoes(List<ModelExpressoes> lista) {
        this.listaExpressoes = lista;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemLista = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.model_expressoes,viewGroup,false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int posicao) {
        ModelExpressoes modelExpressoes = listaExpressoes.get(posicao);
        myViewHolder.expressao.setText(modelExpressoes.getExpressao());
        myViewHolder.descricao.setText(modelExpressoes.getDescricao());
    }

    @Override
    public int getItemCount() {
        return listaExpressoes.size();
    }

    //ViewHolder
    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView expressao;
        TextView descricao;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            //Instanciar com a interface
             expressao = itemView.findViewById(R.id.textExpressao);
            descricao = itemView.findViewById(R.id.textDescricao);
        }
    }

}
