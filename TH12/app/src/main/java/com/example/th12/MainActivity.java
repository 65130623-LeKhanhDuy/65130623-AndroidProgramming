package com.example.th12;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if (savedInstanceState == null) {


            FragmentManager fragmentManager = getSupportFragmentManager();


            fragmentManager.beginTransaction()
                    .add(R.id.frameContentHolder, new ContentFragment())
                    .add(R.id.frameFooterHolder, new FooterFragment())
                    .commit();
        }
    }
}