package com.example.unitconverterapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Kilogram extends AppCompatActivity {

    private TextView textView;
    private EditText editText;
    private EditText editText1;
    private Button button;

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kilogram);
        textView= findViewById(R.id.text);
        editText = findViewById(R.id.number);
        button  = findViewById(R.id.button);
        editText1 = findViewById(R.id.number1);

        imageView= findViewById(R.id.btn_back);

        ImageView btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(view -> {
            Intent secondActivityIntent = new Intent(
                    getApplicationContext(), MainActivity.class
            );
            startActivity(secondActivityIntent);
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editText.getText().toString();
                int gram = Integer.parseInt(s);
                double kg = 0.001* gram;
                editText1.setText("kg- "+kg);
            }
        });


    }
}