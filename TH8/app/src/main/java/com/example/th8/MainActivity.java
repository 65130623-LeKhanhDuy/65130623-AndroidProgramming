package com.example.th8;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvDanhSachMonAn;
    ArrayList<MonAn> mangMonAn;
    MonAnAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvDanhSachMonAn = findViewById(R.id.lvDanhSachMonAn);

        mangMonAn = new ArrayList<>();
        mangMonAn.add(new MonAn("Cơm Sườn", 35000, "Cơm sườn nướng mỡ hành", R.drawable.ic_launcher_background));
        mangMonAn.add(new MonAn("Gà Xối Mỡ", 40000, "Gà chiên giòn rụm", R.drawable.ic_launcher_background));
        mangMonAn.add(new MonAn("Cơm Tấm Đặc Biệt", 55000, "Sườn, bì, chả, trứng", R.drawable.ic_launcher_background));

        adapter = new MonAnAdapter(MainActivity.this, mangMonAn);
        lvDanhSachMonAn.setAdapter(adapter);

        lvDanhSachMonAn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MonAn monDuocChon = mangMonAn.get(position);
                Toast.makeText(MainActivity.this, "Bạn chọn: " + monDuocChon.getTenMonAn(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}