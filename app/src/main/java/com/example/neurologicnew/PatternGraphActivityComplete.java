package com.example.neurologicnew;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.neurologicnew.databinding.PatternGraphActivityCompleteBinding;

public class PatternGraphActivityComplete extends Fragment {

    private PatternGraphActivityCompleteBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = PatternGraphActivityCompleteBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.activitiesButton.setOnClickListener(view1 -> NavHostFragment.findNavController(PatternGraphActivityComplete.this)
                .navigate(R.id.graphactivitycomplete_to_home));
    };
}