package com.example.mrpeter1.bab5listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        final ListView myListView = findViewById(R.id.listviewji);
//
//        final ArrayList<String> myFamily =    new ArrayList<String>();
//        myFamily.add("peter");
//        myFamily.add("aldi");
//        myFamily.add("arwin");
//        myFamily.add("muchlis");
//
//        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myFamily);
//        myListView.setAdapter(arrayAdapter);
//
//        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Log.i("yang mengklik ", myFamily.get(position));
//            }
//        });

        ListView myListView = findViewById(R.id.listviewji);

        final ArrayList<String> myFamily = new ArrayList<>();
        myFamily.add("ikhsan");
        myFamily.add("palureng");
        myFamily.add("muchlis");
        myFamily.add("adriyan");
        myFamily.add("muchlis");

        ArrayAdapter<String> arrayAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myFamily);
        myListView.setAdapter(arrayAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"yang klik adalah "+ myFamily.get(position), Toast.LENGTH_SHORT).show();
            }
        });



    }
}
