package com.example.koska.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    private final zipcodes zipcodes = new Zipcodes();
    private EditText city_text, code_text;
    private ListView listView;
    private ArrayAdapter<Zipcode> adapter;
    private List<Zipcode> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        city_text = findViewById(R.id.txt_city);
        ccode_text = findViewById(R.id.txt_code);
        listView = findViewById(R.id.ListView);


    }
    public void clear(View view){
        code_text.setText("");
        city_text.setText("");
        list.clear();
        adapter.notifyDataSetChanged();
    }
    public void search(View view){
        list = zipcodes.search(code_text.getText().toString().trim(),city_text.getText().toString().trim());
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);
        ListView.setAdapter(adapter);
    }
}
