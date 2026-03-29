package com.example.th9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerLand;
    ArrayList<LandScape> listData;
    LandscapeAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerLand = findViewById(R.id.recyclerLand);


        listData = new ArrayList<>();
        listData.add(new LandScape("cot_co_hanoi", "Cột cờ Hà Nội"));
        listData.add(new LandScape("buckingham", "Cung điện Buckingham"));
        listData.add(new LandScape("tuong_nu_than", "Tượng Nữ thần Tự do"));
        listData.add(new LandScape("cot_co_hanoi", "Cột cờ Hà Nội 2")); // Thêm 1 cái cho chẵn 4 ô


        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerLand.setLayoutManager(layoutManager);

        adapter = new LandscapeAdapter(this, listData);
        recyclerLand.setAdapter(adapter);
    }
}