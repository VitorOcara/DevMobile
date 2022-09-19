package com.example.teste;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.teste.model.Entity;

import java.util.ArrayList;

public class Secondary extends AppCompatActivity {
    private Button back, btnAdd, btnLimpar;
    EditText edtNome, edtEmail, edtOcupacao;

    ListView listView;
    ArrayList<Entity> lista;
    ArrayAdapter<Entity> adapterEntity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        edtNome = findViewById(R.id.edtNome);
        edtEmail = findViewById(R.id.edtEmail);
        edtOcupacao = findViewById(R.id.edtOcupacao);


        back = findViewById(R.id.btnBack);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Secondary.this, MainActivity.class);
                startActivity(i);
            }
        });


        lista = new ArrayList<>();
        listView = findViewById(R.id.listViewEntities);
        adapterEntity = new ArrayAdapter<Entity>(
                this, android.R.layout.simple_list_item_1, lista
        );

        listView.setAdapter(adapterEntity);

        btnAdd = findViewById(R.id.btnAdd);
        btnLimpar = findViewById(R.id.btnLimpar);

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int pos, long l) {
                lista.remove( pos );
                adapterEntity.notifyDataSetChanged();

                Toast.makeText(Secondary.this, "Entidade Removida", Toast.LENGTH_SHORT).show();


                return true;
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = edtNome.getText().toString();
                String email = edtEmail.getText().toString();
                String ocupacao = edtOcupacao.getText().toString();

                Entity entity = new Entity(nome, email, ocupacao);
                lista.add(entity);
                adapterEntity.notifyDataSetChanged();

                edtNome.setText("");
                edtEmail.setText("");
                edtOcupacao.setText("");

                Toast.makeText(Secondary.this, "Adicionado com Sucesso", Toast.LENGTH_SHORT).show();

            }
        });

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lista.clear();

                edtNome.setText("");
                edtEmail.setText("");
                edtOcupacao.setText("");

            }
        });

    }

}