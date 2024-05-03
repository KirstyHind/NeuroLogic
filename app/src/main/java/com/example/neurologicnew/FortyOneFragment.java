package com.example.neurologicnew;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.neurologicnew.databinding.FragmentFortyOneBinding;
import com.example.neurologicnew.databinding.FragmentThirtyEighthBinding;

public class FortyOneFragment extends Fragment {

    private FragmentFortyOneBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFortyOneBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.imageView55.setOnClickListener(view1 -> NavHostFragment.findNavController(FortyOneFragment.this)
                .navigate(R.id.fortyone_to_fortytwo));

        binding.imageView5.setOnClickListener(view1 -> NavHostFragment.findNavController(FortyOneFragment.this)
                .navigate(R.id.fortyone_to_fourteenth));
    };
}