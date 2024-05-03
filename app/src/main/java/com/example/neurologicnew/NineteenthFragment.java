package com.example.neurologicnew;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.neurologicnew.databinding.FragmentNineteenthBinding;

public class NineteenthFragment extends Fragment {

    private FragmentNineteenthBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentNineteenthBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.imageView5.setOnClickListener(view1 -> NavHostFragment.findNavController(NineteenthFragment.this)
                .navigate(R.id.nineteenth_to_fifteenth));

        binding.imageView35.setOnClickListener(view1 -> NavHostFragment.findNavController(NineteenthFragment.this)
                .navigate(R.id.nineteenth_to_twentieth));

        binding.button1.setOnClickListener(view1 -> NavHostFragment.findNavController(NineteenthFragment.this)
                .navigate(R.id.nineteenth_to_twentysecond));

        binding.button2.setOnClickListener(view1 -> NavHostFragment.findNavController(NineteenthFragment.this)
                .navigate(R.id.nineteenth_to_twentysecond));
    };
}