package com.elif.mybookarchive;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.elif.mybookarchive.databinding.ActivityBookactivityBinding;

public class Bookactivity extends AppCompatActivity {
private ActivityBookactivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityBookactivityBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

    }

    public void save(View view) {
    }

    public void selectImage(View view) {
    }
}