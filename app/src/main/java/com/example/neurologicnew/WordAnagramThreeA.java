package com.example.neurologicnew;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.neurologicnew.databinding.WordAnagramThreeABinding;

public class WordAnagramThreeA extends Fragment {

    private WordAnagramThreeABinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = WordAnagramThreeABinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.cross.setOnClickListener(view1 -> NavHostFragment.findNavController(WordAnagramThreeA.this)
                .navigate(R.id.anagramthreea_to_word));

        binding.inputBox.setOnClickListener(view1 -> NavHostFragment.findNavController(WordAnagramThreeA.this)
                .navigate(R.id.anagramthreea_to_anagramthreeb));

        binding.keyboard.setOnClickListener(view1 -> NavHostFragment.findNavController(WordAnagramThreeA.this)
                .navigate(R.id.anagramthreea_to_anagramthreeb));

        binding.checkButton.setOnClickListener(view1 -> NavHostFragment.findNavController(WordAnagramThreeA.this)
                .navigate(R.id.anagramthreea_to_anagramthreeb));

        binding.skipButton.setOnClickListener(view1 -> NavHostFragment.findNavController(WordAnagramThreeA.this)
                .navigate(R.id.anagramthreea_to_anagramactivitycomplete));
    };
}