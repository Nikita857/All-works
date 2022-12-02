package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClickedCow1(View view) {
        Toast Cow1 = Toast.makeText(getApplicationContext(),"Вы выбрали корову", Toast.LENGTH_LONG);
                Cow1.show();
    }
    public void buttonClickedCat(View view) {
        Toast Cat = Toast.makeText(getApplicationContext(),"Вы выбрали кошака", Toast.LENGTH_LONG);
        Cat.show();
    }
    public void buttonClickedCow2(View view) {
        Toast Cow2 = Toast.makeText(getApplicationContext(),"Вы выбрали мудрое дерево", Toast.LENGTH_LONG);
        Cow2.show();
    }
}
