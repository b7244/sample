package com.example.sample.ui.sample;

import  android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.example.sample.R;


public class SampleFragment extends Fragment {

    private SampleViewModel sampleViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        sampleViewModel =
                ViewModelProviders.of(this).get(SampleViewModel.class);
        View root = inflater.inflate(R.layout.fragment_sample, container, false);
        //final TextView textView = root.findViewById(R.id.text_sample);
        sampleViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                //textView.setText(s);
            }
        });
        return root;
    }
}