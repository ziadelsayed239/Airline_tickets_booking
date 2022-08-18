package com.example.airline_tickets_booking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class FLIGHTS extends AppCompatActivity {
    Button btn_choose_depature,btn_choose_arrival,btn_choose_class,btn_search_flights;
    EditText edt_depature,edt_arrival,edt_passenger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flights);

        btn_choose_depature=(Button)findViewById(R.id.btn_choose_depature);
        btn_choose_depature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FLIGHTS.this, DEPATURE_LOCATION.class);
                startActivity(intent);

            }
        });
        btn_choose_arrival=(Button)findViewById(R.id.btn_choose_arrival);
        btn_choose_arrival.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FLIGHTS.this, ARRIVAL_LOCATION.class);
                startActivity(intent);

            }
        });
        btn_choose_class=(Button)findViewById(R.id.btn_choose_class);
        btn_choose_class.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FLIGHTS.this, CLASS.class);
                startActivity(intent);

            }
        });
        btn_search_flights=(Button)findViewById(R.id.btn_search_flights);
        btn_search_flights.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FLIGHTS.this, SEARCH.class);
                startActivity(intent);

            }
        });
        edt_depature=(EditText)findViewById(R.id.edt_depature);    //data
        edt_arrival=(EditText)findViewById(R.id.edt_arrival);      //data
        edt_passenger=(EditText)findViewById(R.id.edt_passenger);  //data

    }
}