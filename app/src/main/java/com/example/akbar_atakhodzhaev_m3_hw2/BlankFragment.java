package com.example.akbar_atakhodzhaev_m3_hw2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class BlankFragment extends Fragment {

    private TextView counterTextView;
    private int counterValue = 0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_blank, container, false);

        counterTextView = rootView.findViewById(R.id.text_counter);
        Button incrementButton = rootView.findViewById(R.id.button_increment);
        Button decrementButton = rootView.findViewById(R.id.button_decrement);

        incrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterValue++;
                updateCounter();
            }
        });

        decrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterValue--;
                updateCounter();
            }
        });

        updateCounter();

        return rootView;
    }

    private void updateCounter() {
        counterTextView.setText(String.valueOf(counterValue));
    }
}
