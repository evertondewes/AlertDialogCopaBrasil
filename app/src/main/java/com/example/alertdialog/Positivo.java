package com.example.alertdialog;

import android.content.DialogInterface;
import android.support.constraint.ConstraintLayout;
import android.util.Log;

public class Positivo implements DialogInterface.OnClickListener {
    @Override
    public void onClick(DialogInterface dialogInterface, int i) {
        Log.i("Positivo: ", "Grêmio");
    }
}
