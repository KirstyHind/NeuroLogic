package com.example.neurologicnew;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.neurologicnew.databinding.FragmentSeventeenthBinding;

public class SeventeenthFragment extends Fragment {

    private FragmentSeventeenthBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentSeventeenthBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.button1.setOnClickListener(view1 -> NavHostFragment.findNavController(SeventeenthFragment.this)
                .navigate(R.id.seventeenth_to_nineteenth));

        binding.imageView35.setOnClickListener(view1 -> NavHostFragment.findNavController(SeventeenthFragment.this)
                .navigate(R.id.seventeenth_to_eighteenth));

        binding.imageView5.setOnClickListener(view1 -> NavHostFragment.findNavController(SeventeenthFragment.this)
                .navigate(R.id.seventeenth_to_fifteenth));

        binding.button2.setOnClickListener(view1 -> NavHostFragment.findNavController(SeventeenthFragment.this)
                .navigate(R.id.seventeenth_to_nineteenth));
    };
}