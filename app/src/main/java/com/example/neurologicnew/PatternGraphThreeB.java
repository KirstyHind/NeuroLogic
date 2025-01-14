package com.example.neurologicnew;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.neurologicnew.databinding.PatternGraphThreeBBinding;

public class PatternGraphThreeB extends Fragment {

    private PatternGraphThreeBBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = PatternGraphThreeBBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.checkAnswer.setOnClickListener(view1 -> NavHostFragment.findNavController(PatternGraphThreeB.this)
                .navigate(R.id.graphthreeb_to_graphthreecomplete));

        binding.cross.setOnClickListener(view1 -> NavHostFragment.findNavController(PatternGraphThreeB.this)
                .navigate(R.id.graphthreeb_to_pattern));
    };
}