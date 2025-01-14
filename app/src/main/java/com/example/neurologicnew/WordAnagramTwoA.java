package com.example.neurologicnew;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.neurologicnew.databinding.WordAnagramTwoABinding;

public class WordAnagramTwoA extends Fragment {

    private WordAnagramTwoABinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = WordAnagramTwoABinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.cross.setOnClickListener(view1 -> NavHostFragment.findNavController(WordAnagramTwoA.this)
                .navigate(R.id.anagramtwoa_to_word));

        binding.inputBox.setOnClickListener(view1 -> NavHostFragment.findNavController(WordAnagramTwoA.this)
                .navigate(R.id.anagramtwoa_to_anagramtwob));

        binding.keyboard.setOnClickListener(view1 -> NavHostFragment.findNavController(WordAnagramTwoA.this)
                .navigate(R.id.anagramtwoa_to_anagramtwob));

        binding.checkButton.setOnClickListener(view1 -> NavHostFragment.findNavController(WordAnagramTwoA.this)
                .navigate(R.id.anagramtwoa_to_anagramtwob));

        binding.skipButton.setOnClickListener(view1 -> NavHostFragment.findNavController(WordAnagramTwoA.this)
                .navigate(R.id.anagramtwoa_to_anagramthreea));
    };
}