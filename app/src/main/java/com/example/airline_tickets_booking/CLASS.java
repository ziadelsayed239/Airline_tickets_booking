package com.example.airline_tickets_booking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CLASS extends AppCompatActivity {
    TextView btn_economy,btn_Premium_Economy,btn_Business_Class,btn_first_Class;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class);
        btn_economy=(TextView)findViewById(R.id.btn_economy);
        btn_economy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CLASS.this,FLIGHTS.class);
                startActivity(intent);

            }
        });
        btn_Premium_Economy=(TextView)findViewById(R.id.btn_Premium_Economy);
        btn_Premium_Economy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CLASS.this,FLIGHTS.class);
                startActivity(intent);

            }
        });
        btn_Business_Class=(TextView)findViewById(R.id.btn_Business_Class);
        btn_Business_Class.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CLASS.this,FLIGHTS.class);
                startActivity(intent);

            }
        });
        btn_first_Class=(TextView)findViewById(R.id.btn_first_Class);
        btn_first_Class.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CLASS.this,FLIGHTS.class);
                startActivity(intent);

            }
        });

    }
}