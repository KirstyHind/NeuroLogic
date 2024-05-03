package com.example.neurologicnew;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.neurologicnew.databinding.FragmentFifteenthBinding;


public class FifteenthFragment extends Fragment {

    private FragmentFifteenthBinding binding;
    private Handler handler;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFifteenthBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.imageView5.setOnClickListener(view1 -> NavHostFragment.findNavController(FifteenthFragment.this)
                .navigate(R.id.fifteenth_to_eleventh));

        binding.imageView30.setOnClickListener(view1 -> NavHostFragment.findNavController(FifteenthFragment.this)
                .navigate(R.id.fifteenth_to_seventeenth));

        binding.imageView29.setOnClickListener(view1 -> NavHostFragment.findNavController(FifteenthFragment.this)
                .navigate(R.id.fifteenth_to_twentyfifth));
    }
}