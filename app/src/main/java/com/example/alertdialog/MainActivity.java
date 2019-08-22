package com.example.alertdialog;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mudaCor(View elementoDaTelaQueRecebeuOEvento) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("Copa do Brasil");
        builder.setMessage("Escolha o Time Campeão");


        builder.setPositiveButton(
                "Grêmio",
                new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        ConstraintLayout c = findViewById(R.id.tela);
                        c.setBackgroundColor(Color.BLUE);
                    }
                }
        );

        builder.setNegativeButton(
                "Internacional",
                new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        ConstraintLayout c = findViewById(R.id.tela);
                        c.setBackgroundColor(Color.RED);
                    }
                }
        );

        builder.setNeutralButton(
                "Empate",
                new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        ConstraintLayout c = findViewById(R.id.tela);
                        c.setBackgroundColor(Color.YELLOW);
                    }
                }
        );

        AlertDialog a = builder.create();

        a.show();
    }

}
