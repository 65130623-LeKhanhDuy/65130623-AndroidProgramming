package com.example.th13;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FooterFragment.OnFooterButtonClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.frameContentHolder, new ContentFragment())
                    .add(R.id.frameFooterHolder, new FooterFragment())
                    .commit();
        }
    }

    @Override
    public void onButtonClicked(int buttonIndex) {
        Fragment selectedFragment = null;
        switch (buttonIndex) {
            case 1: selectedFragment = new Fragment1(); break;
            case 2: selectedFragment = new Fragment2(); break;
            case 3: selectedFragment = new Fragment3(); break;
        }

        if (selectedFragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.frameContentHolder, selectedFragment)
                    .commit();
        }
    }
}