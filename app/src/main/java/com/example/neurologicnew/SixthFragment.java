package com.example.neurologicnew;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.neurologicnew.databinding.FragmentSixthBinding;

public class SixthFragment extends Fragment {

    private FragmentSixthBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentSixthBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.imageView3.setOnClickListener(view1 -> NavHostFragment.findNavController(SixthFragment.this)
                .navigate(R.id.sixth_to_seventh));

        binding.imageView5.setOnClickListener(view1 -> NavHostFragment.findNavController(SixthFragment.this)
                .navigate(R.id.sixth_to_eleventh));
    };

}