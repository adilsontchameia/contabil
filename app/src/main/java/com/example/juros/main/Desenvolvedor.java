package com.example.juros.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.juros.R;

import mehdi.sakout.aboutpage.AboutPage;

public class Desenvolvedor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String descricao = getString(R.string.dev_description);
        View sobre = new AboutPage(this)
                .setImage(R.drawable.ad)
                .setDescription(descricao)
                .addGroup("Contactos")
                .addEmail("eadilsonkchameia@gmail.com", "Email")
                .addGroup("Redes Sociais.")
                .addFacebook("adilsonchameia", "Facebook")
                .addTwitter("adilson_chameia", "Twitter")
                .addGroup("GitPage")
                .addGitHub("adilson_chameia", "GitHub")
                .create();
        setContentView(sobre);
    }

}