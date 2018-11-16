package com.example.amir.list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import business.Drinks;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ArrayAdapter<Drinks> drinksArrayAdapter=new ArrayAdapter<Drinks>(this,android.R.layout.simple_list_item_1,Drinks.drinks);
        ListView lst=findViewById(R.id.drinkList);
        lst.setAdapter(drinksArrayAdapter);
    }
}
