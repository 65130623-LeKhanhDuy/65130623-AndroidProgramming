package com.example.th7;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ListView lvDanhSach;
    ArrayList<String> dsTinhThanh;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lvDanhSach = findViewById(R.id.lvDanhSach);


        dsTinhThanh = new ArrayList<>();
        dsTinhThanh.add("Hà Nội");
        dsTinhThanh.add("Đà Nẵng");
        dsTinhThanh.add("Khánh Hòa");
        dsTinhThanh.add("Ninh Thuận");
        dsTinhThanh.add("Bình Thuận");
        dsTinhThanh.add("Đồng Nai");
        dsTinhThanh.add("TP. Hồ Chí Minh");


        adapter = new ArrayAdapter<>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                dsTinhThanh
        );

        lvDanhSach.setAdapter(adapter);

        lvDanhSach.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String tenDuocChon = dsTinhThanh.get(position);

                Toast.makeText(MainActivity.this, "Bạn vừa chọn: " + tenDuocChon, Toast.LENGTH_SHORT).show();
            }
        });
    }
}