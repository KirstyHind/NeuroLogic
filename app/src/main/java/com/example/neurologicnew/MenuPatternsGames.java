package com.example.neurologicnew;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.neurologicnew.databinding.MenuPatternsGamesBinding;

public class MenuPatternsGames extends Fragment {

    private MenuPatternsGamesBinding binding;
    private Handler handler;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = MenuPatternsGamesBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.cross.setOnClickListener(view1 -> NavHostFragment.findNavController(MenuPatternsGames.this)
                .navigate(R.id.patterns_to_home));

        binding.patternsGraphical.setOnClickListener(view1 -> NavHostFragment.findNavController(MenuPatternsGames.this)
                .navigate(R.id.patterns_to_graphonea));
    }
}