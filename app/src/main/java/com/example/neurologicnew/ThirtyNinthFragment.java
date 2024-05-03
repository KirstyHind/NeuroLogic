package com.example.neurologicnew;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.neurologicnew.databinding.FragmentThirtyEighthBinding;
import com.example.neurologicnew.databinding.FragmentThirtyFifthBinding;
import com.example.neurologicnew.databinding.FragmentThirtyNinthBinding;

public class ThirtyNinthFragment extends Fragment {

    private FragmentThirtyNinthBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentThirtyNinthBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.button.setOnClickListener(view1 -> NavHostFragment.findNavController(ThirtyNinthFragment.this)
                .navigate(R.id.thirtyninth_to_fortieth));

        binding.imageView5.setOnClickListener(view1 -> NavHostFragment.findNavController(ThirtyNinthFragment.this)
                .navigate(R.id.thirtyninth_to_fourteenth));
    };
}