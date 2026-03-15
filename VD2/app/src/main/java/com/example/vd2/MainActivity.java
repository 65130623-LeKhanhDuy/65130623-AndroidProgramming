package com.example.vd2;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // xử lý cộng
    public void XuLyCong(View v) {

        EditText editTextSo1 = findViewById(R.id.So1);
        EditText editTextSo2 = findViewById(R.id.So2);

        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();

        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);

        float Tong = soA + soB;

        EditText editTextKQ = findViewById(R.id.edtKetqua);

        editTextKQ.setText(String.valueOf(Tong));
    }

    // xử lý trừ
    public void XuLyTru(View v) {

        EditText editTextSo1 = findViewById(R.id.So1);
        EditText editTextSo2 = findViewById(R.id.So2);

        float soA = Float.parseFloat(editTextSo1.getText().toString());
        float soB = Float.parseFloat(editTextSo2.getText().toString());

        float Tru = soA - soB;

        EditText editTextKQ = findViewById(R.id.edtKetqua);

        editTextKQ.setText(String.valueOf(Tru));
    }

    // xử lý nhân
    public void XuLyNhan(View v) {

        EditText editTextSo1 = findViewById(R.id.So1);
        EditText editTextSo2 = findViewById(R.id.So2);

        float soA = Float.parseFloat(editTextSo1.getText().toString());
        float soB = Float.parseFloat(editTextSo2.getText().toString());

        float Nhan = soA * soB;

        EditText editTextKQ = findViewById(R.id.edtKetqua);

        editTextKQ.setText(String.valueOf(Nhan));
    }

    // xử lý chia
    public void XuLyChia(View v) {

        EditText editTextSo1 = findViewById(R.id.So1);
        EditText editTextSo2 = findViewById(R.id.So2);

        float soA = Float.parseFloat(editTextSo1.getText().toString());
        float soB = Float.parseFloat(editTextSo2.getText().toString());

        float Chia = soA / soB;

        EditText editTextKQ = findViewById(R.id.edtKetqua);

        editTextKQ.setText(String.valueOf(Chia));
    }
}