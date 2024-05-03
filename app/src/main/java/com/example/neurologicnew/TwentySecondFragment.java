package com.example.neurologicnew;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.neurologicnew.databinding.FragmentNineteenthBinding;
import com.example.neurologicnew.databinding.FragmentTwentySecondBinding;

public class TwentySecondFragment extends Fragment {

    private FragmentTwentySecondBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentTwentySecondBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.imageView5.setOnClickListener(view1 -> NavHostFragment.findNavController(TwentySecondFragment.this)
                .navigate(R.id.twentysecond_to_fifteenth));

        binding.imageView35.setOnClickListener(view1 -> NavHostFragment.findNavController(TwentySecondFragment.this)
                .navigate(R.id.twentysecond_to_twentythird));

        binding.button1.setOnClickListener(view1 -> NavHostFragment.findNavController(TwentySecondFragment.this)
                .navigate(R.id.twentysecond_to_twentyfourth));

        binding.button2.setOnClickListener(view1 -> NavHostFragment.findNavController(TwentySecondFragment.this)
                .navigate(R.id.twentysecond_to_twentyfourth));
    };
}