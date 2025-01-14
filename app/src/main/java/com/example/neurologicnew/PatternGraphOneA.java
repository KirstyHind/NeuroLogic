package com.example.neurologicnew;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.neurologicnew.databinding.PatternGraphOneABinding;

public class PatternGraphOneA extends Fragment {

    private PatternGraphOneABinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = PatternGraphOneABinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.graphQuestion.setOnClickListener(view1 -> NavHostFragment.findNavController(PatternGraphOneA.this)
                .navigate(R.id.graphonea_to_graphoneb));

        binding.cross.setOnClickListener(view1 -> NavHostFragment.findNavController(PatternGraphOneA.this)
                .navigate(R.id.graphonea_to_pattern));
    };
}