package com.example.unitconverterapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CardView area,  kilogram, pound, length, power, pressure, speed, volume ;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        kilogram=findViewById(R.id.kg);
        kilogram.setOnClickListener(this);

        area = findViewById(R.id.area);
        area.setOnClickListener(this);

        length = findViewById(R.id.length);
        length.setOnClickListener(this);


        volume = findViewById(R.id.volume);
        volume.setOnClickListener(this);


        pound = findViewById(R.id.pound);
        pound.setOnClickListener(this);

        power = findViewById(R.id.power);
        power.setOnClickListener(this);

        pressure = findViewById(R.id.pressure);
        pressure.setOnClickListener(this);

        speed = findViewById(R.id.speed);
        speed.setOnClickListener(this);



    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.area:
                Intent intent = new Intent(MainActivity.this, Area.class);
                startActivity(intent);
                break;

            case R.id.kg:
                Intent intent1 = new Intent(MainActivity.this, Kilogram.class);
                startActivity(intent1);
                break;

            case R.id.length:
                Intent intent2=new Intent(MainActivity.this,Length.class);
                startActivity(intent2);
                break;



            case R.id.pound:
                Intent intent4=new Intent(MainActivity.this, Pound.class);
                startActivity(intent4);
                break;

            case R.id.power:
                Intent intent5=new Intent(MainActivity.this, Power.class);
                startActivity(intent5);
                break;

            case R.id.pressure:
                Intent intent6 =new Intent(MainActivity.this, Pressure.class);
                startActivity(intent6);
                break;

            case R.id.speed:
                Intent intent7 =new Intent(MainActivity.this, Speed.class);
                startActivity(intent7);
                break;



            case R.id.volume:
                Intent intent9=new Intent(MainActivity.this, Volume.class);
                startActivity(intent9);
                break;




        }
    }
}
