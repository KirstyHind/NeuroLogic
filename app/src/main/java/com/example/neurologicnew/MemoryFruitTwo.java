package com.example.neurologicnew;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.neurologicnew.databinding.MemoryFruitTwoBinding;

public class MemoryFruitTwo extends Fragment {

    private MemoryFruitTwoBinding binding;
    private Handler handler;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = MemoryFruitTwoBinding.inflate(inflater, container, false);
        // Initialize the Handler
        handler = new Handler();
        // Schedule a task to move to the second fragment after 2 seconds
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                NavHostFragment.findNavController(MemoryFruitTwo.this)
                        .navigate(R.id.fruittwo_to_fruitthree);
            }
        }, 2000);
        return binding.getRoot();

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
        // Remove any pending callbacks and messages from the Handler
        handler.removeCallbacksAndMessages(null);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.cross.setOnClickListener(view1 -> NavHostFragment.findNavController(MemoryFruitTwo.this)
                .navigate(R.id.second_to_eleventh));
    }
}