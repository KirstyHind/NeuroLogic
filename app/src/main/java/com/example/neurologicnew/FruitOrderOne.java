package com.example.neurologicnew;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.neurologicnew.databinding.FruitOrderOneBinding;

public class FruitOrderOne extends Fragment {

    private FruitOrderOneBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FruitOrderOneBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.orange.setOnClickListener(view1 -> NavHostFragment.findNavController(FruitOrderOne.this)
                .navigate(R.id.orderone_to_ordertwo));

        binding.cross.setOnClickListener(view1 -> NavHostFragment.findNavController(FruitOrderOne.this)
                .navigate(R.id.orderone_to_home));
        };
}