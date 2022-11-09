package com.ufc.projetofinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.ufc.projetofinal.model.Medico;
import com.ufc.projetofinal.view.CustomAdapter;

import java.util.ArrayList;
public class UserView extends AppCompatActivity {
    //    public void alterScreen(View view){
//        Intent i = new Intent(UserPanel.this, MainActivity.class);
//        startActivity(i);
//    }
//
//    public void onDestroi(){
//
//    }
//    CustomAdapter adapter;
//    RecyclerView listaConteudo;
//    ArrayList<Medico> medicos;
//    TextView nomeProfissional, ocupacao, horario, nomeDentista, horarioDente;
//

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_view);

        //        medicos = new ArrayList<>();
//
//        adapter = new CustomAdapter(medicos);
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
//
//
//        listaConteudo = findViewById(R.id.listaRecycle);
//        listaConteudo.setAdapter(adapter);
//        listaConteudo.setLayoutManager(linearLayoutManager);
//        listaConteudo.addItemDecoration(
//                new DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
//        );
//
//        nomeProfissional= findViewById(R.id.nomeProfissional);
//        ocupacao = findViewById(R.id.ocupacao);
//        horario = findViewById(R.id.horario);
//        nomeDentista = findViewById(R.id.nomeDentista);
//        horarioDente = findViewById(R.id.horarioDente);

    }
}