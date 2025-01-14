package com.example.neurologicnew;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.neurologicnew.databinding.PatternGraphThreeCompleteBinding;

public class PatternGraphThreeComplete extends Fragment {

    private PatternGraphThreeCompleteBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = PatternGraphThreeCompleteBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.nextButton.setOnClickListener(view1 -> NavHostFragment.findNavController(PatternGraphThreeComplete.this)
                .navigate(R.id.graphthreecomplete_to_graphactivitycomplete));
    };
}