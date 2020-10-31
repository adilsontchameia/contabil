package com.example.juros.main;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;
import androidx.navigation.ui.NavigationUI;

import com.example.juros.R;
import com.example.juros.calculadoras.AnosMeses;
import com.example.juros.calculadoras.Irt;
import com.example.juros.calculadoras.Iss;
import com.example.juros.calculadoras.Iva;
import com.example.juros.calculadoras.JurosCompostos;
import com.example.juros.calculadoras.JurosSimples;
import com.example.juros.calculadoras.Porcentagem;
import com.example.juros.informacoes.B;
import com.example.juros.informacoes.C;
import com.example.juros.informacoes.D;
import com.example.juros.informacoes.E;
import com.example.juros.informacoes.Expressoes;
import com.example.juros.informacoes.ExpressoesA;
import com.example.juros.informacoes.F;
import com.example.juros.informacoes.G;
import com.example.juros.informacoes.H;
import com.example.juros.informacoes.I;
import com.example.juros.informacoes.J;
import com.example.juros.informacoes.K;
import com.example.juros.informacoes.L;
import com.example.juros.informacoes.M;
import com.example.juros.informacoes.N;
import com.example.juros.informacoes.O;
import com.example.juros.informacoes.P;
import com.example.juros.informacoes.Q;
import com.example.juros.informacoes.Re;
import com.example.juros.informacoes.S;
import com.example.juros.informacoes.T;
import com.example.juros.informacoes.U;
import com.example.juros.informacoes.V;
import com.example.juros.informacoes.W;
import com.example.juros.informacoes.X;
import com.example.juros.informacoes.Y;
import com.example.juros.informacoes.Z;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //NavView
        NavigationView navigationView = (NavigationView) findViewById(R.id.navView);
        navigationView.setNavigationItemSelectedListener(this);
        //ToolBar
        //DrawerComponents
        Toolbar toolbar = findViewById(R.id.toolbar);
        ActionBar actionBar = getSupportActionBar();
        toolbar.setTitle(R.string.titulo);
        toolbar.setSubtitle(R.string.subtitulo);
        setSupportActionBar(toolbar);

        //Drawer
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_drawer, R.string.close_drawer);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


    }

    //MethodSwith for Drawer
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_inicio: {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.nav_porcento: {
                Intent intent = new Intent(getApplicationContext(), Porcentagem.class);
                startActivity(intent);
                break;
            }
            case R.id.nav_compostos: {
                Intent intent = new Intent(getApplicationContext(), JurosCompostos.class);
                startActivity(intent);
                break;
            }
            case R.id.nav_simples: {
                Intent intent = new Intent(getApplicationContext(), JurosSimples.class);
                startActivity(intent);
                break;
            }
            case R.id.nav_irt: {
                Intent intent = new Intent(getApplicationContext(), Irt.class);
                startActivity(intent);
                break;
            }
            case R.id.nav_year: {
                Intent intent = new Intent(getApplicationContext(), AnosMeses.class);
                startActivity(intent);
                break;
            }
            case R.id.nav_dev: {
                Intent intent = new Intent(getApplicationContext(), Desenvolvedor.class);
                startActivity(intent);
                break;
            }
            case R.id.nav_iss: {
                Intent intent = new Intent(getApplicationContext(), Iss.class);
                startActivity(intent);
                break;
            }
            case R.id.nav_iva: {
                Intent intent = new Intent(getApplicationContext(), Iva.class);
                startActivity(intent);
                break;
            }
            case R.id.nav_about: {
                Intent intent = new Intent(getApplicationContext(), Sobre.class);
                startActivity(intent);
                break;
            }
            default: {
                //Toast.makeText(this, "Default", Toast.LENGTH_SHORT).show();
                break;
            }
        }
        //Clossing
        drawerLayout.closeDrawer(GravityCompat.START);

        return true;
    }

    //DrawerAlso
    @Override
    public void onBackPressed() {

        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    //AbrirIntents Expressoes- CardViews
    public void expressoes(View view) {
        Intent intent = new Intent(getApplicationContext(), Expressoes.class);
        startActivity(intent);
    }

    public void abrirA(View view) {
        Intent intent = new Intent(getApplicationContext(), ExpressoesA.class);
        startActivity(intent);
    }

    public void abrirB(View view) {
        Intent intent = new Intent(getApplicationContext(), B.class);
        startActivity(intent);
    }

    public void abrirC(View view) {
        Intent intent = new Intent(getApplicationContext(), C.class);
        startActivity(intent);
    }

    public void abrirD(View view) {
        Intent intent = new Intent(getApplicationContext(), D.class);
        startActivity(intent);
    }

    public void abrirE(View view) {
        Intent intent = new Intent(getApplicationContext(), E.class);
        startActivity(intent);
    }

    public void abrirF(View view) {
        Intent intent = new Intent(getApplicationContext(), F.class);
        startActivity(intent);
    }

    public void abrirG(View view) {
        Intent intent = new Intent(getApplicationContext(), G.class);
        startActivity(intent);
    }

    public void abrirH(View view) {
        Intent intent = new Intent(getApplicationContext(), H.class);
        startActivity(intent);
    }

    public void abrirI(View view) {
        Intent intent = new Intent(getApplicationContext(), I.class);
        startActivity(intent);
    }

    public void abrirJ(View view) {
        Intent intent = new Intent(getApplicationContext(), J.class);
        startActivity(intent);
    }

    public void abrirK(View view) {
        Intent intent = new Intent(getApplicationContext(), K.class);
        startActivity(intent);
    }

    public void abrirL(View view) {
        Intent intent = new Intent(getApplicationContext(), L.class);
        startActivity(intent);
    }

    public void abrirM(View view) {
        Intent intent = new Intent(getApplicationContext(), M.class);
        startActivity(intent);
    }

    public void abrirN(View view) {
        Intent intent = new Intent(getApplicationContext(), N.class);
        startActivity(intent);
    }

    public void abrirO(View view) {
        Intent intent = new Intent(getApplicationContext(), O.class);
        startActivity(intent);
    }

    public void abrirP(View view) {
        Intent intent = new Intent(getApplicationContext(), P.class);
        startActivity(intent);
    }

    public void abrirQ(View view) {
        Intent intent = new Intent(getApplicationContext(), Q.class);
        startActivity(intent);
    }

    public void abrirR(View view) {
        Intent intent = new Intent(getApplicationContext(), Re.class);
        startActivity(intent);
    }

    public void abrirS(View view) {
        Intent intent = new Intent(getApplicationContext(), S.class);
        startActivity(intent);
    }

    public void abrirT(View view) {
        Intent intent = new Intent(getApplicationContext(), T.class);
        startActivity(intent);
    }

    public void abrirU(View view) {
        Intent intent = new Intent(getApplicationContext(), U.class);
        startActivity(intent);
    }

    public void abrirV(View view) {
        Intent intent = new Intent(getApplicationContext(), V.class);
        startActivity(intent);
    }

    public void abrirW(View view) {
        Intent intent = new Intent(getApplicationContext(), W.class);
        startActivity(intent);
    }

    public void abrirX(View view) {
        Intent intent = new Intent(getApplicationContext(), X.class);
        startActivity(intent);
    }

    public void abrirY(View view) {
        Intent intent = new Intent(getApplicationContext(), Y.class);
        startActivity(intent);
    }

    public void abrirZ(View view) {
        Intent intent = new Intent(getApplicationContext(), Z.class);
        startActivity(intent);
    }

}