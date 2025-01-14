package com.example.neurologicnew;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.neurologicnew.databinding.MenuMemoryGamesBinding;

public class MenuMemoryGames extends Fragment {

    private MenuMemoryGamesBinding binding;
    private Handler handler;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = MenuMemoryGamesBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.memoryFruit.setOnClickListener(view1 -> NavHostFragment.findNavController(MenuMemoryGames.this)
                .navigate(R.id.memory_to_fruitone));

        binding.cross.setOnClickListener(view1 -> NavHostFragment.findNavController(MenuMemoryGames.this)
                .navigate(R.id.memory_to_home));
    }
}