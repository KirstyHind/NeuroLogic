package com.example.neurologicnew;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.neurologicnew.databinding.FruitOrderTwoBinding;

public class FruitOrderTwo extends Fragment {

    private FruitOrderTwoBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FruitOrderTwoBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.banana.setOnClickListener(view1 -> NavHostFragment.findNavController(FruitOrderTwo.this)
                .navigate(R.id.ordertwo_to_orderthree));

        binding.cross.setOnClickListener(view1 -> NavHostFragment.findNavController(FruitOrderTwo.this)
                .navigate(R.id.ordertwo_to_home));
    };

}