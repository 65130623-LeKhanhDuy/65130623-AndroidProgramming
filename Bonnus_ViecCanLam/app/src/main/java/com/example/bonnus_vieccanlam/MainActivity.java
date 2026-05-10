package com.example.bonnus_vieccanlam;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvVCL;
    List<Task> listVCL;
    TaskAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rvVCL = findViewById(R.id.rvVCL);
        listVCL = new ArrayList<>();


        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        rvVCL.setLayoutManager(layoutManager);


        DividerItemDecoration divider = new DividerItemDecoration(this, layoutManager.getOrientation());
        rvVCL.addItemDecoration(divider);


        adapter = new TaskAdapter(listVCL);
        rvVCL.setAdapter(adapter);


        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("TASKS");

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                listVCL.clear();

                for (DataSnapshot obj : snapshot.getChildren()) {
                    Task t = obj.getValue(Task.class);
                    if (t != null) {
                        listVCL.add(t);
                    }
                }


                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Log.w("KiemTraFirebase", "Lỗi đọc dữ liệu: ", error.toException());
            }
        });
    }
}