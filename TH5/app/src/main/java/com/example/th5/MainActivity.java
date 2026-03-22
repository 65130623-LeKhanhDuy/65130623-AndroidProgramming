package com.example.th5;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editTextSo1, editTextSo2, editTextKQ;
    Button nutCong, nutTru, nutNhan, nutChia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ánh xạ (Đã sửa lại ID cho khớp với XML)
        editTextSo1 = findViewById(R.id.edtSo1);
        editTextSo2 = findViewById(R.id.edtSo2);
        editTextKQ = findViewById(R.id.edtKetqua);

        nutCong = findViewById(R.id.btnCong);
        nutTru = findViewById(R.id.btnTru);
        nutNhan = findViewById(R.id.btnNhan);
        nutChia = findViewById(R.id.btnChia);

        // anonymous listener
        nutCong.setOnClickListener(v -> XULY_CONG());
        nutTru.setOnClickListener(v -> XULY_TRU());
        nutNhan.setOnClickListener(v -> XULY_NHAN());
        nutChia.setOnClickListener(v -> XULY_CHIA());
    }


    void XULY_CONG() {
        String so1 = editTextSo1.getText().toString();
        String so2 = editTextSo2.getText().toString();

        float num1 = Float.parseFloat(so1);
        float num2 = Float.parseFloat(so2);

        float tong = num1 + num2;

        String chuoiKQ = String.valueOf(tong);
        editTextKQ.setText(chuoiKQ);
    }


    void XULY_TRU() {
        String so1 = editTextSo1.getText().toString();
        String so2 = editTextSo2.getText().toString();

        float num1 = Float.parseFloat(so1);
        float num2 = Float.parseFloat(so2);

        float kq = num1 - num2;

        editTextKQ.setText(String.valueOf(kq));
    }


    void XULY_NHAN() {
        String so1 = editTextSo1.getText().toString();
        String so2 = editTextSo2.getText().toString();

        float num1 = Float.parseFloat(so1);
        float num2 = Float.parseFloat(so2);

        float kq = num1 * num2;

        editTextKQ.setText(String.valueOf(kq));
    }


    void XULY_CHIA() {
        String so1 = editTextSo1.getText().toString();
        String so2 = editTextSo2.getText().toString();

        float num1 = Float.parseFloat(so1);
        float num2 = Float.parseFloat(so2);

        if (num2 == 0) {
            editTextKQ.setText("Không chia được cho 0");
            return;
        }

        float kq = num1 / num2;

        editTextKQ.setText(String.valueOf(kq));
    }
}