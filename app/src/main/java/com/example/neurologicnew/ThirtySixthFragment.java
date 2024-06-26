package com.example.neurologicnew;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.neurologicnew.databinding.FragmentThirtyFifthBinding;
import com.example.neurologicnew.databinding.FragmentThirtySixthBinding;

public class ThirtySixthFragment extends Fragment {

    private FragmentThirtySixthBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentThirtySixthBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.button.setOnClickListener(view1 -> NavHostFragment.findNavController(ThirtySixthFragment.this)
                .navigate(R.id.thirtysixth_to_thirtyseventh));

        binding.imageView5.setOnClickListener(view1 -> NavHostFragment.findNavController(ThirtySixthFragment.this)
                .navigate(R.id.thirtysixth_to_fourteenth));
    };
}