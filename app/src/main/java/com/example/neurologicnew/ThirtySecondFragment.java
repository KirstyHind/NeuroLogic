package com.example.neurologicnew;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.neurologicnew.databinding.FragmentThirtySecondBinding;

public class ThirtySecondFragment extends Fragment {

    private FragmentThirtySecondBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentThirtySecondBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.imageView5.setOnClickListener(view1 -> NavHostFragment.findNavController(ThirtySecondFragment.this)
                .navigate(R.id.thirtysecond_to_fifteenth));

        binding.button1.setOnClickListener(view1 -> NavHostFragment.findNavController(ThirtySecondFragment.this)
                .navigate(R.id.thirtysecond_to_thirtyfourth));

        binding.button2.setOnClickListener(view1 -> NavHostFragment.findNavController(ThirtySecondFragment.this)
                .navigate(R.id.thirtysecond_to_thirtythird));
    };
}