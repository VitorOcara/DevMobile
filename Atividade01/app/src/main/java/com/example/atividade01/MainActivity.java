package com.example.atividade01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton tglBtnOn;
    private ToggleButton tglBtnOff;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tglBtnOff = findViewById( R.id.OffButton );
        tglBtnOn = findViewById( R.id.OnButton );

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
    }
}