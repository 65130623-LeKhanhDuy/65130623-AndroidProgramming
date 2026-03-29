package com.example.th6;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText edtA, edtB;
    TextView tvKQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edtA = findViewById(R.id.edta);
        edtB = findViewById(R.id.edtb);
        tvKQ = findViewById(R.id.tvkq);
    }


    public void xuLyCong(View view) {

        String strA = edtA.getText().toString();
        String strB = edtB.getText().toString();


        int a = Integer.parseInt(strA);
        int b = Integer.parseInt(strB);


        int tong = a + b;


        String strKQ = String.valueOf(tong);
        tvKQ.setText(strKQ);
    }
}