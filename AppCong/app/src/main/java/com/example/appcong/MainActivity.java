package com.example.appcong;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText so1, so2;
    Button btnTinh;
    TextView txtKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        so1 = findViewById(R.id.so1);
        so2 = findViewById(R.id.so2);
        btnTinh = findViewById(R.id.btnTinh);
        txtKetQua = findViewById(R.id.txtKetQua);

        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String a = so1.getText().toString();
                String b = so2.getText().toString();

                if(a.isEmpty() || b.isEmpty()){
                    txtKetQua.setText("Vui lòng nhập đủ 2 số");
                    return;
                }

                int soA = Integer.parseInt(a);
                int soB = Integer.parseInt(b);

                int tong = soA + soB;

                txtKetQua.setText("Tổng = " + tong);
            }
        });

    }
}