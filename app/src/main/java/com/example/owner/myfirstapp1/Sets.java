package com.example.owner.myfirstapp1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Sets extends AppCompatActivity {

private EditText editTxt;
private ImageButton but4;
private ListView list;
private ArrayAdapter<String> adapter;
private ArrayList<String> arrayList;
//    String[] nameArray = {"Dog", "Car"};
//    Integer[] imageArray = {R.drawable.skating, R.drawable.skiing};
//    ListView listView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //nameArray = (String[]) arrayList.toArray();
        setContentView(R.layout.activity_sets);

        editTxt = (EditText) findViewById(R.id.editTxt);
        but4 = (ImageButton) findViewById(R.id.but4);
        list = (ListView) findViewById(R.id.list);
        arrayList = new ArrayList<String>();

        adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item, arrayList);

        list.setAdapter(adapter);

        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayList.add(editTxt.getText().toString());
                adapter.notifyDataSetChanged();
            }
        });

//        CustomListAdapter whatever = new CustomListAdapter(this, nameArray, imageArray);
//
//        listView = (ListView) findViewById(R.id.list);
//        listView.setAdapter(whatever);
//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
//                Intent intent = new Intent(Sets.this,newset.class);
//                String message = nameArray[position];
//                intent.putExtra("animal", message);
//                startActivity(intent);
//            }
//        });

    }

//Singleton public static(makes accesible to entire app) namearrray and image array singleton will be array list
    //within class convert arraylist back to array
    //anonymous moving class
    //ArrayList<String> arrayList = new ArrayList<>(); //put into new class.java singleton

}

