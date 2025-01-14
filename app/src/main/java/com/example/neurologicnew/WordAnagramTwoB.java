package com.example.neurologicnew;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.neurologicnew.databinding.WordAnagramTwoBBinding;

public class WordAnagramTwoB extends Fragment {

    private WordAnagramTwoBBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = WordAnagramTwoBBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.cross.setOnClickListener(view1 -> NavHostFragment.findNavController(WordAnagramTwoB.this)
                .navigate(R.id.anagramtwob_to_word));

        binding.checkButton.setOnClickListener(view1 -> NavHostFragment.findNavController(WordAnagramTwoB.this)
                .navigate(R.id.anagramtwob_to_anagramtwocomplete));

        binding.skipButton.setOnClickListener(view1 -> NavHostFragment.findNavController(WordAnagramTwoB.this)
                .navigate(R.id.anagramtwob_to_anagramthreea));
    };
}