package com.example.neurologicnew;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.neurologicnew.databinding.WordAnagramOneABinding;

public class WordAnagramOneA extends Fragment {

    private WordAnagramOneABinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = WordAnagramOneABinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.cross.setOnClickListener(view1 -> NavHostFragment.findNavController(WordAnagramOneA.this)
                .navigate(R.id.anagramonea_to_word));

        binding.inputBox.setOnClickListener(view1 -> NavHostFragment.findNavController(WordAnagramOneA.this)
                .navigate(R.id.anagramonea_to_anagramoneb));

        binding.keyboard.setOnClickListener(view1 -> NavHostFragment.findNavController(WordAnagramOneA.this)
                .navigate(R.id.anagramonea_to_anagramoneb));

        binding.checkButton.setOnClickListener(view1 -> NavHostFragment.findNavController(WordAnagramOneA.this)
                .navigate(R.id.anagramonea_to_anagramoneb));

        binding.skipButton.setOnClickListener(view1 -> NavHostFragment.findNavController(WordAnagramOneA.this)
                .navigate(R.id.anagramonea_to_anagramtwoa));
    };
}