package com.example.lap_04_gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView grvThing;
    ArrayList<ElectricThing> arrayList;
    CustomAdapter ctAdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        
        grvThing = findViewById(R.id.grvThing);

        arrayList = new ArrayList<>();
        arrayList.add(new ElectricThing("Cáp chuyển từ Cổng USB sang PS2...",3,10000,15,R.drawable.giacchuyen1,20));
        arrayList.add(new ElectricThing("Cáp chuyển từ Cổng USB sang PS2...",3,10000,15,R.drawable.giacchuyen1,20));

        ctAdt = new CustomAdapter(MainActivity.this,R.layout.item_girdview,arrayList);
        grvThing.setAdapter(ctAdt);

    }
}