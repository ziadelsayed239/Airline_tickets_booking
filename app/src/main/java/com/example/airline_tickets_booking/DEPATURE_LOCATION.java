package com.example.airline_tickets_booking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class DEPATURE_LOCATION extends AppCompatActivity {
    ListView list_depature;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depature_location);
        list_depature=(ListView)findViewById(R.id.list_depature);
    }
}