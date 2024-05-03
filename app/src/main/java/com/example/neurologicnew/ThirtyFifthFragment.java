package com.example.neurologicnew;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.neurologicnew.databinding.FragmentNinthBinding;
import com.example.neurologicnew.databinding.FragmentThirtyFifthBinding;

public class ThirtyFifthFragment extends Fragment {

    private FragmentThirtyFifthBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentThirtyFifthBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.imageView49.setOnClickListener(view1 -> NavHostFragment.findNavController(ThirtyFifthFragment.this)
                .navigate(R.id.thirtyfifth_to_thirtysixth));

        binding.imageView5.setOnClickListener(view1 -> NavHostFragment.findNavController(ThirtyFifthFragment.this)
                .navigate(R.id.thirtyfifth_to_fourteenth));
    };
}