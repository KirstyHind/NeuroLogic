package com.example.neurologicnew;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.neurologicnew.databinding.FragmentTwentyEighthBinding;

public class TwentyEighthFragment extends Fragment {

    private FragmentTwentyEighthBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentTwentyEighthBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.imageView5.setOnClickListener(view1 -> NavHostFragment.findNavController(TwentyEighthFragment.this)
                .navigate(R.id.twentyeighth_to_fifteen));

        binding.imageView44.setOnClickListener(view1 -> NavHostFragment.findNavController(TwentyEighthFragment.this)
                .navigate(R.id.twentyeighth_to_twentyninth));

        binding.button1.setOnClickListener(view1 -> NavHostFragment.findNavController(TwentyEighthFragment.this)
                .navigate(R.id.twentyeighth_to_thirtyfirst));
    };
}