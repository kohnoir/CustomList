package com.example.customlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.zone_list);
        final ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
        HashMap<String, String> map;
        String Name = "Name";
        String Description = "Description";
        Data firstObject = new Data("Anton","Funny kid",12);
        Data secondObject = new Data("Georg","Ded",33);


        map = new HashMap<>();
        map.put(Name,firstObject.getName());
        map.put(Description,firstObject.getDescription());
        arrayList.add(map);

        map = new HashMap<>();
        map.put(Name,secondObject.getName());
        map.put(Description,secondObject.getDescription());
        arrayList.add(map);

        final SimpleAdapter adapter = new SimpleAdapter(this ,arrayList , R.layout.item_list_view ,
                new String[]{Name,Description},
                new int[]{R.id.Name,R.id.Description});
        listView.setAdapter(adapter);
    }
}
