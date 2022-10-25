package com.example.tutorial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText nairaAmount;
    TextView dollarAmount;
    AppCompatButton convertBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nairaAmount = findViewById(R.id.nairaAmount);
        dollarAmount = findViewById(R.id.dollarAmount);
        convertBtn = findViewById(R.id.convertBtn);

        convertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double nv = Double.parseDouble(nairaAmount.getText().toString());
                double dv = nv * 762;
                dollarAmount.setText("Dollar value: $ "+ dv);
            }
        });
    }
}