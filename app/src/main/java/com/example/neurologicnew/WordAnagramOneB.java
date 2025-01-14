package com.example.neurologicnew;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.neurologicnew.databinding.WordAnagramOneBBinding;

public class WordAnagramOneB extends Fragment {

    private WordAnagramOneBBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = WordAnagramOneBBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.cross.setOnClickListener(view1 -> NavHostFragment.findNavController(WordAnagramOneB.this)
                .navigate(R.id.anagramoneb_to_word));

        binding.skipButton.setOnClickListener(view1 -> NavHostFragment.findNavController(WordAnagramOneB.this)
                .navigate(R.id.anagramoneb_to_anagramtwoa));

        binding.checkButton.setOnClickListener(view1 -> NavHostFragment.findNavController(WordAnagramOneB.this)
                .navigate(R.id.anagramoneb_to_anagramonecomplete));
    };
}