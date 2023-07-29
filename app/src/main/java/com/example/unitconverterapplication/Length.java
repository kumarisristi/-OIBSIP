package com.example.unitconverterapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Length extends AppCompatActivity {

    private TextView textView;
    private EditText editText;
    private Button button;

    ImageView imageView;
    private EditText editText1;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);



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
                int m = Integer.parseInt(s);
                double mm = 1000* m;
                editText1.setText("mm- "+mm);
            }
        });



    }
}