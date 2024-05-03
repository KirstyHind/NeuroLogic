package com.example.neurologicnew;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.neurologicnew.databinding.FragmentSeventhBinding;

public class SeventhFragment extends Fragment {

    private FragmentSeventhBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentSeventhBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.imageView7.setOnClickListener(view1 -> NavHostFragment.findNavController(SeventhFragment.this)
                .navigate(R.id.seventh_to_eighth));

        binding.imageView5.setOnClickListener(view1 -> NavHostFragment.findNavController(SeventhFragment.this)
                .navigate(R.id.seventh_to_eleventh));
    };
}