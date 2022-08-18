package com.example.airline_tickets_booking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class ARRIVAL_LOCATION extends AppCompatActivity {
    ListView list_arrival;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arrival_location);
        list_arrival=(ListView)findViewById(R.id.list_arrival);
    }
}