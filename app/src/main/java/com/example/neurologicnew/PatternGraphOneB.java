package com.example.neurologicnew;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.neurologicnew.databinding.PatternGraphOneBBinding;

public class PatternGraphOneB extends Fragment {

    private PatternGraphOneBBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = PatternGraphOneBBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.checkAnswer.setOnClickListener(view1 -> NavHostFragment.findNavController(PatternGraphOneB.this)
                .navigate(R.id.graphoneb_to_graphonecomplete));

        binding.cross.setOnClickListener(view1 -> NavHostFragment.findNavController(PatternGraphOneB.this)
                .navigate(R.id.graphoneb_to_pattern));
    };
}