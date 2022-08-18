package com.example.airline_tickets_booking;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edt_name,edt_phone;
    Button btn_flights;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_name=(EditText)findViewById(R.id.edt_name);
        edt_phone=(EditText)findViewById(R.id.edt_phone);
        btn_flights=(Button)findViewById(R.id.btn_flights);
        btn_flights.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edt_name.getText().toString();
                String phone = edt_phone.getText().toString();
                if (name.isEmpty() || phone.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Please, enter your name and phone number together",Toast.LENGTH_LONG).show();
                }
                else {
                    Intent intent=new Intent(MainActivity.this,FLIGHTS.class);
                    startActivity(intent);
                }

            }
        });
    }
}