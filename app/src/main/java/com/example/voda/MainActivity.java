package com.example.voda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnClick1(View view) {
        Toast myToast = Toast.makeText(getApplicationContext(),
                "Ура! Вы тыкнули на 2 воду", Toast.LENGTH_SHORT);
        myToast.show();
    }

    public void btnClick2(View view) {
        Toast myToast = Toast.makeText(getApplicationContext(),
                "Ура! Вы тыкнули на 3 воду", Toast.LENGTH_SHORT);
        myToast.show();
    }

    public void btnClick3(View view) {
        Toast myToast = Toast.makeText(getApplicationContext(),
                "Ура! Вы тыкнули на 1 воду", Toast.LENGTH_SHORT);
        myToast.show();
    }
}