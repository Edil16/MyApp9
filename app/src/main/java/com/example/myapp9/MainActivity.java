package com.example.myapp9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<String> numbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LoadData();
        recyclerView=findViewById(R.id.recycleview);
        NumberAdapter adapter = new NumberAdapter(numbers);
        recyclerView.setAdapter(adapter);
    }
    private void LoadData(){
        numbers=new ArrayList<>();
        numbers.add("+999705000000");
        numbers.add("+999705999999");
        numbers.add("+999705888888");
        numbers.add("+999705777777");
        numbers.add("+999705666666");
        numbers.add("+999705555555");
        numbers.add("+999705444444");
        numbers.add("+999705333333");
        numbers.add("+999705222222");
        numbers.add("+999705111111");
        numbers.add("+999705989898");
        numbers.add("+999705878787");
        numbers.add("+999705656565");
        numbers.add("+999705434343");
        numbers.add("+999705323232");
        numbers.add("+999705212121");
        numbers.add("+999705101010");
    }
}