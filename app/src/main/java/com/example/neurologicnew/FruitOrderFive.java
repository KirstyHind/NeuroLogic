package com.example.neurologicnew;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.neurologicnew.databinding.FruitOrderFiveBinding;

public class FruitOrderFive extends Fragment {

    private FruitOrderFiveBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FruitOrderFiveBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.checkAnswer.setOnClickListener(view1 -> NavHostFragment.findNavController(FruitOrderFive.this)
                .navigate(R.id.orderfive_to_correct));

        binding.cross.setOnClickListener(view1 -> NavHostFragment.findNavController(FruitOrderFive.this)
                .navigate(R.id.orderfive_to_home));
    };
}