package com.example.neurologicnew;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.neurologicnew.databinding.HomeScreenBinding;

public class HomeScreen extends Fragment {

    private HomeScreenBinding binding;
    private Handler handler;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = HomeScreenBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.memoryIcon.setOnClickListener(view1 -> NavHostFragment.findNavController(HomeScreen.this)
                .navigate(R.id.home_to_memory));

        binding.mathsGamesIcon.setOnClickListener(view1 -> NavHostFragment.findNavController(HomeScreen.this)
                .navigate(R.id.home_to_maths));

        binding.patternsIcon.setOnClickListener(view1 -> NavHostFragment.findNavController(HomeScreen.this)
                .navigate(R.id.home_to_patterns));

        binding.wordGamesIcon.setOnClickListener(view1 -> NavHostFragment.findNavController(HomeScreen.this)
                .navigate(R.id.home_to_word));

        binding.randomIcon.setOnClickListener(view1 -> NavHostFragment.findNavController(HomeScreen.this)
                .navigate(R.id.memory_to_fruitone));

        binding.sudokuIcon.setOnClickListener(view1 -> NavHostFragment.findNavController(HomeScreen.this)
                .navigate(R.id.home_to_sudoku));
    }
}