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

public class ThirtyEighthFragment extends Fragment {

    private FragmentThirtyEighthBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentThirtyEighthBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.imageView52.setOnClickListener(view1 -> NavHostFragment.findNavController(ThirtyEighthFragment.this)
                .navigate(R.id.thirtyeighth_to_thirtyninth));

        binding.imageView5.setOnClickListener(view1 -> NavHostFragment.findNavController(ThirtyEighthFragment.this)
                .navigate(R.id.thirtyeighth_to_fourteenth));
    };
}