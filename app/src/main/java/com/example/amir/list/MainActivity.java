package com.example.amir.list;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] items=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        items=getResources().getStringArray(R.array.products);
        ListView mylst=findViewById(R.id.myList);
        mylst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(getApplicationContext(),items[i],Toast.LENGTH_SHORT).show();
               // TextView txt=(TextView)view;
                //txt.setText("Clicked!!!!");
                if(i==0)
                {
                    Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
                    startActivity(intent);
                }

            }
        });
    }
}
