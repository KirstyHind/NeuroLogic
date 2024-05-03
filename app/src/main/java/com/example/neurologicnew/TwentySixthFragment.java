package com.example.neurologicnew;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.neurologicnew.databinding.FragmentTwentyFifthBinding;
import com.example.neurologicnew.databinding.FragmentTwentySixthBinding;

public class TwentySixthFragment extends Fragment {

    private FragmentTwentySixthBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentTwentySixthBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.imageView5.setOnClickListener(view1 -> NavHostFragment.findNavController(TwentySixthFragment.this)
                .navigate(R.id.twentysixth_to_fifteenth));

        binding.button1.setOnClickListener(view1 -> NavHostFragment.findNavController(TwentySixthFragment.this)
                .navigate(R.id.twentysixth_to_twentyeighth));

        binding.button2.setOnClickListener(view1 -> NavHostFragment.findNavController(TwentySixthFragment.this)
                .navigate(R.id.twentysixth_to_twentyseventh));
    };
}