package com.example.lab9_pdd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.widget.Toast;
import android.widget.Button;
import android.view.View;
import android.os.Bundle;

public class vopros extends AppCompatActivity {
    Button button,pesh,nobody,all;
    Color green = new Color(255,0,0);
        @Override
        protected void onCreate(Bundle savedInstanceState) { Intent intent1 = new Intent(this, itog.class);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vopros);
        button = findViewById(R.id.button5);
        pesh = findViewById(R.id.button3);
        nobody = findViewById(R.id.button2);
        all = findViewById(R.id.button4);

        pesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pesh.setBackgroundColor(Color.RED);
                pesh.setTextColor(Color.WHITE);
                Toast pesh = Toast.makeText(getApplicationContext(), "Неправильно", Toast.LENGTH_LONG);
                pesh.show();
            }
        });

        nobody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nobody.setBackgroundColor(Color.RED);
                nobody.setTextColor(Color.WHITE);
                Toast nobody = Toast.makeText(getApplicationContext(), "Неправильно", Toast.LENGTH_LONG);
                nobody.show();
            }
        });

        all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                all.setBackgroundColor(Color.GREEN);
                all.setTextColor(Color.WHITE);
                Toast nobody = Toast.makeText(getApplicationContext(), "Правильно, молодец!", Toast.LENGTH_LONG);
                nobody.show();
                startActivity(intent1);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button.setBackgroundColor(Color.RED);
                button.setTextColor(Color.WHITE);
                Toast vel = Toast.makeText(getApplicationContext(), "Неправильно", Toast.LENGTH_LONG);
                vel.show();
            }
        });


    }

}