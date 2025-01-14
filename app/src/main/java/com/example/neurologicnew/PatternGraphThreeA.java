package com.example.neurologicnew;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.neurologicnew.databinding.PatternGraphThreeABinding;

public class PatternGraphThreeA extends Fragment {

    private PatternGraphThreeABinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = PatternGraphThreeABinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.graphAnswer.setOnClickListener(view1 -> NavHostFragment.findNavController(PatternGraphThreeA.this)
                .navigate(R.id.graphthreea_to_graphthreeb));

        binding.cross.setOnClickListener(view1 -> NavHostFragment.findNavController(PatternGraphThreeA.this)
                .navigate(R.id.graphthreea_to_pattern));
    };
}