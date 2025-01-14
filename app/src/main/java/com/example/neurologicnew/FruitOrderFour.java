package com.example.neurologicnew;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.neurologicnew.databinding.FruitOrderFourBinding;

public class FruitOrderFour extends Fragment {

    private FruitOrderFourBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FruitOrderFourBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.banana.setOnClickListener(view1 -> NavHostFragment.findNavController(FruitOrderFour.this)
                .navigate(R.id.orderfour_to_orderfive));

        binding.cross.setOnClickListener(view1 -> NavHostFragment.findNavController(FruitOrderFour.this)
                .navigate(R.id.orderfour_to_home));
    };
}