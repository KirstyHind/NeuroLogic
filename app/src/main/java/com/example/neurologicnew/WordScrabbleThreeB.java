package com.example.neurologicnew;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.neurologicnew.databinding.WordScrabbleThreeBBinding;

public class WordScrabbleThreeB extends Fragment {

    private WordScrabbleThreeBBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = WordScrabbleThreeBBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.cross.setOnClickListener(view1 -> NavHostFragment.findNavController(WordScrabbleThreeB.this)
                .navigate(R.id.scrabblethreeb_to_word));

        binding.skipButton.setOnClickListener(view1 -> NavHostFragment.findNavController(WordScrabbleThreeB.this)
                .navigate(R.id.scrabblethreeb_to_scrabblecomplete));

        binding.doneButton.setOnClickListener(view1 -> NavHostFragment.findNavController(WordScrabbleThreeB.this)
                .navigate(R.id.scrabblethreeb_to_scrabblecomplete));
    };
}