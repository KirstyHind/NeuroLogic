package com.example.neurologicnew;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.neurologicnew.databinding.PatternGraphTwoBBinding;

public class PatternGraphTwoB extends Fragment {

    private PatternGraphTwoBBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = PatternGraphTwoBBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.checkAnswer.setOnClickListener(view1 -> NavHostFragment.findNavController(PatternGraphTwoB.this)
                .navigate(R.id.graphtwob_to_graphtwocomplete));

        binding.cross.setOnClickListener(view1 -> NavHostFragment.findNavController(PatternGraphTwoB.this)
                .navigate(R.id.graphtwob_to_pattern));
    };
}