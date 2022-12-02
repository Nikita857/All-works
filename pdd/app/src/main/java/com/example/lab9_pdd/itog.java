package com.example.lab9_pdd;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class itog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itog);
    }
    public void razrab(View view) {
        Intent intent3 = new Intent(this, end.class);
        startActivity(intent3);
    }

}