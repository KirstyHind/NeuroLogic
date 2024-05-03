package com.example.neurologicnew;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.neurologicnew.databinding.FragmentEighteenthBinding;

public class EighteenthFragment extends Fragment {

    private FragmentEighteenthBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentEighteenthBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.button1.setOnClickListener(view1 -> NavHostFragment.findNavController(EighteenthFragment.this)
                .navigate(R.id.eighteenth_to_nineteenth));

        binding.button2.setOnClickListener(view1 -> NavHostFragment.findNavController(EighteenthFragment.this)
                .navigate(R.id.eighteenth_to_nineteenth));

        binding.imageView5.setOnClickListener(view1 -> NavHostFragment.findNavController(EighteenthFragment.this)
                .navigate(R.id.eighteenth_to_fifteenth));
    };
}