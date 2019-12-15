package com.example.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {

    private ListView listView;
    SearchView searchView;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list_view);


        final ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apples");
        fruits.add("Banana");
        fruits.add("Apples");
        fruits.add("Banana");
        fruits.add("Apples");
        fruits.add("Banana");
        fruits.add("Apples");
        fruits.add("Banana");
        fruits.add("Apples");
        fruits.add("Banana");

        adapter = new ArrayAdapter<String>(this,
                R.layout.support_simple_spinner_dropdown_item, fruits);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "You selected" +
                        fruits.get(position), Toast.LENGTH_SHORT).show();

            }
        });




    }
}