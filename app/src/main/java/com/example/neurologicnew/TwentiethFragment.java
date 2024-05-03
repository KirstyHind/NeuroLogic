package com.example.neurologicnew;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.neurologicnew.databinding.FragmentTwentiethBinding;

public class TwentiethFragment extends Fragment {

    private FragmentTwentiethBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentTwentiethBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.imageView5.setOnClickListener(view1 -> NavHostFragment.findNavController(TwentiethFragment.this)
                .navigate(R.id.twentieth_to_fifteenth));

        binding.imageView39.setOnClickListener(view1 -> NavHostFragment.findNavController(TwentiethFragment.this)
                .navigate(R.id.twentieth_to_twentyfirst));

        binding.button1.setOnClickListener(view1 -> NavHostFragment.findNavController(TwentiethFragment.this)
                .navigate(R.id.twentieth_to_twentysecond));

        binding.button2.setOnClickListener(view1 -> NavHostFragment.findNavController(TwentiethFragment.this)
                .navigate(R.id.twentieth_to_twentysecond));
    };
}