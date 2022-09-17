package com.example.teste;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.example.teste.model.Entity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ToggleButton tglBtnOn;
    private ToggleButton tglBtnOff;
    private EditText editTextNome;
    private EditText editTextEmail;
    private AutoCompleteTextView editTextOccupation;
    private Button edtTextBtn;
    private TextView arrayText;
    private ArrayList mesagens;
    private Button clearArrayList;
    private String resumo;
    private Spinner spinner;
    private ArrayAdapter<String> adapter;
    private final String[] occupations = new String[] {
            "Estudante",
            "Desenvolvedor",
            "Funcionário Publico",
            "Desempregado",
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tglBtnOff = findViewById( R.id.OffButton );
        tglBtnOn = findViewById( R.id.OnButton );
        editTextEmail = findViewById(R.id.edtText);
        editTextNome = findViewById(R.id.edtTextName);
        editTextOccupation = findViewById(R.id.edtTextOcupation);

        edtTextBtn = findViewById(R.id.btnTextEdit);
        arrayText = findViewById(R.id.arryStrings);
        clearArrayList = findViewById(R.id.clearArray);

        //spinner
        spinner = findViewById(R.id.spinnerOccupation);
        ArrayAdapter<CharSequence> adapterSpinner =
                ArrayAdapter.createFromResource(this, R.array.occupations, android.R.layout.simple_spinner_item);

        adapterSpinner.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapterSpinner);
        adapter = new ArrayAdapter<String>(this,  android.R.layout.simple_list_item_1, occupations);

        editTextOccupation.setAdapter(adapter);


        tglBtnOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuffer result = new StringBuffer();
                result.append("toggleButton 1 :").append(tglBtnOff.getText());
                result.append("\ntoggleButton 2 :").append(tglBtnOn.getText());

                Toast.makeText(MainActivity.this , result.toString(), Toast.LENGTH_SHORT).show();
            }
        });

        tglBtnOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuffer result = new StringBuffer();
                result.append("toggleButton 1 :").append(tglBtnOff.getText());
                result.append("\ntoggleButton 2 :").append(tglBtnOn.getText());

                Toast.makeText(MainActivity.this , result.toString(), Toast.LENGTH_SHORT).show();
            }
        });

        mesagens = new ArrayList<Entity>();

        edtTextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = editTextEmail.getText().toString();
                String nome = editTextEmail.getText().toString();
                String occupation = editTextOccupation.getText().toString();

                Entity entity = new Entity( nome, email, occupation);

                Toast.makeText(MainActivity.this, entity.toString(), Toast.LENGTH_SHORT).show();

                mesagens.add(entity + "\n");
                resumo = mesagens.toString();
                arrayText.setText(resumo);

                editTextEmail.setText("");
                editTextNome.setText("");
                editTextOccupation.setText("");

            }
        });
        clearArrayList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mesagens.clear();
                arrayText.setText("");
            }
        });


    }

}