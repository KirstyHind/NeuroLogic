package com.example.neurologicnew;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.neurologicnew.databinding.WordScrabbleThreeABinding;

public class WordScrabbleThreeA extends Fragment {

    private WordScrabbleThreeABinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = WordScrabbleThreeABinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.cross.setOnClickListener(view1 -> NavHostFragment.findNavController(WordScrabbleThreeA.this)
                .navigate(R.id.scrabblethreea_to_word));

        binding.inputBox.setOnClickListener(view1 -> NavHostFragment.findNavController(WordScrabbleThreeA.this)
                .navigate(R.id.scrabblethreea_to_scrabblethreeb));

        binding.keyboard.setOnClickListener(view1 -> NavHostFragment.findNavController(WordScrabbleThreeA.this)
                .navigate(R.id.scrabblethreea_to_scrabblethreeb));

        binding.skipButton.setOnClickListener(view1 -> NavHostFragment.findNavController(WordScrabbleThreeA.this)
                .navigate(R.id.scrabblethreea_to_scrabblecomplete));
    };
}