package com.example.lab9_pdd;

import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

public class end extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_razrab);
    }

    public void OnCloseButtonClick(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(end.this);
        builder.setTitle("Выход из приложения")
                .setIcon(R.drawable.krestik)
                .setMessage("Вы уверены что хотите закрыть приложение?")
                .setPositiveButton("Ок",
                        new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog, int id){
                                finishAffinity();
                            }
                        })
                .setNegativeButton("Отмена",
                        new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog, int id){
                                dialog.cancel();
                            }
                        });
        AlertDialog alert = builder.create();
        alert.show();
    }
}