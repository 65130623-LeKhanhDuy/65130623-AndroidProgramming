package com.example.th13;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class FooterFragment extends Fragment {
    public interface OnFooterButtonClickListener {
        void onButtonClicked(int buttonIndex);
    }
    private OnFooterButtonClickListener listener;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof OnFooterButtonClickListener) {
            listener = (OnFooterButtonClickListener) context;
        } else {
            throw new RuntimeException(context.toString() + " phải implement OnFooterButtonClickListener");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_footer, container, false);
        Button btnOne = view.findViewById(R.id.btnOne);
        Button btnTwo = view.findViewById(R.id.btnTwo);
        Button btnThree = view.findViewById(R.id.btnThree);

        btnOne.setOnClickListener(v -> listener.onButtonClicked(1));
        btnTwo.setOnClickListener(v -> listener.onButtonClicked(2));
        btnThree.setOnClickListener(v -> listener.onButtonClicked(3));
        return view;
    }
}