package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
 ListView listView;
 ArrayList<String> arrNames = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        arrNames.add("Ram");
        arrNames.add("Raman");
        arrNames.add("Hemant");
        arrNames.add("Ankit");
        arrNames.add("Shivam");
        arrNames.add("Sandeep");
        arrNames.add("Govind");
        arrNames.add("ShivamA");
        arrNames.add("Ram");
        arrNames.add("Raman");
        arrNames.add("Hemant");
        arrNames.add("Ankit");
        arrNames.add("Shivam");
        arrNames.add("Sandeep");
        arrNames.add("Govind");
        arrNames.add("ShivamA");
        arrNames.add("Ram");
        arrNames.add("Raman");
        arrNames.add("Hemant");
        arrNames.add("Ankit");
        arrNames.add("Shivam");
        arrNames.add("Sandeep");
        arrNames.add("Govind");
        arrNames.add("ShivamA");
        arrNames.add("Ram");
        arrNames.add("Raman");
        arrNames.add("Hemant");
        arrNames.add("Ankit");
        arrNames.add("Shivam");
        arrNames.add("Sandeep");
        arrNames.add("Govind");
        arrNames.add("ShivamA");
        arrNames.add("Ram");
        arrNames.add("Raman");
        arrNames.add("Hemant");
        arrNames.add("Ankit");
        arrNames.add("Shivam");
        arrNames.add("Sandeep");
        arrNames.add("Govind");
        arrNames.add("ShivamA");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,arrNames);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    Toast.makeText(MainActivity.this,"Clicked First item",Toast.LENGTH_SHORT);
                }

            }
        });
    }
}