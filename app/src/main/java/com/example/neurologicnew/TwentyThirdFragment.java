package com.example.neurologicnew;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.neurologicnew.databinding.FragmentTwentyThirdBinding;

public class TwentyThirdFragment extends Fragment {

    private FragmentTwentyThirdBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentTwentyThirdBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.imageView5.setOnClickListener(view1 -> NavHostFragment.findNavController(TwentyThirdFragment.this)
                .navigate(R.id.twentythird_to_fifteenth));

        binding.button1.setOnClickListener(view1 -> NavHostFragment.findNavController(TwentyThirdFragment.this)
                .navigate(R.id.twentythird_to_twentyfourth));

        binding.button2.setOnClickListener(view1 -> NavHostFragment.findNavController(TwentyThirdFragment.this)
                .navigate(R.id.twentythird_to_twentyfourth));
    };
}