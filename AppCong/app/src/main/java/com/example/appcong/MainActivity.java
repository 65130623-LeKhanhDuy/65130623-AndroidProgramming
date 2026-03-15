package com.example.appcong;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText so1, so2;
    Button btnTinh;
    TextView txtKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        so1 = findViewById(R.id.so1);
        so2 = findViewById(R.id.so2);
        btnTinh = findViewById(R.id.btnTinh);
        txtKetQua = findViewById(R.id.txtKetQua);

        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a = Integer.parseInt(so1.getText().toString());
                int b = Integer.parseInt(so2.getText().toString());

                int tong = a + b;

                txtKetQua.setText("Tổng = " + tong);
            }
        });
    }
}