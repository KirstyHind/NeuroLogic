package com.example.neurologicnew;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.neurologicnew.databinding.PatternGraphTwoABinding;

public class PatternGraphTwoA extends Fragment {

    private PatternGraphTwoABinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = PatternGraphTwoABinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.graphAnswer.setOnClickListener(view1 -> NavHostFragment.findNavController(PatternGraphTwoA.this)
                .navigate(R.id.graphtwoa_to_graphtwob));

        binding.cross.setOnClickListener(view1 -> NavHostFragment.findNavController(PatternGraphTwoA.this)
                .navigate(R.id.graphtwob_to_pattern));
    };
}