package com.example.juros.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.juros.R;

import mehdi.sakout.aboutpage.AboutPage;

public class Sobre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_sobre);
        String descricao = getString(R.string.info);
        View sobre = new AboutPage(this)
                .setImage(R.drawable.about)
                .setDescription(descricao)
                .addGroup("Contacte-me e envie sua opnião.")
                .addEmail("eadilsonkchameia@gmail.com", "Envie Um Email")
                .addGroup("Redes Sociais.")
                .addFacebook("adilsonchameia", "Facebook")
                .addTwitter("adilson_chameia", "Twitter")
                .addGroup("GitPage")
                .addGitHub("adilson_chameia", "GitHub")
                .create();
        setContentView(sobre);
        //.addYoutube("UCdPQtdWIsg7_pi4mrRu46vA")
        //.addWebsite("https://mehdisakout.com/")
        // .addPlayStore("com.ideashower.readitlater.pro")
        // .addInstagram("medyo80")
    }
}