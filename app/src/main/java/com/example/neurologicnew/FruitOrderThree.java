package com.example.neurologicnew;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.neurologicnew.databinding.FruitOrderThreeBinding;

public class FruitOrderThree extends Fragment {

    private FruitOrderThreeBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FruitOrderThreeBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.lemon.setOnClickListener(view1 -> NavHostFragment.findNavController(FruitOrderThree.this)
                .navigate(R.id.orderthree_to_orderfour));

        binding.cross.setOnClickListener(view1 -> NavHostFragment.findNavController(FruitOrderThree.this)
                .navigate(R.id.orderthree_to_home));
    };
}