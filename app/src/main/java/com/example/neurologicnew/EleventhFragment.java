package com.example.neurologicnew;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.neurologicnew.databinding.FragmentEleventhBinding;

public class EleventhFragment extends Fragment {

    private FragmentEleventhBinding binding;
    private Handler handler;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentEleventhBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.imageView17.setOnClickListener(view1 -> NavHostFragment.findNavController(EleventhFragment.this)
                .navigate(R.id.eleventh_to_thirteenth));

        binding.imageView21.setOnClickListener(view1 -> NavHostFragment.findNavController(EleventhFragment.this)
                .navigate(R.id.eleventh_to_twelth));

        binding.imageView18.setOnClickListener(view1 -> NavHostFragment.findNavController(EleventhFragment.this)
                .navigate(R.id.eleventh_to_fourteenth));

        binding.imageView19.setOnClickListener(view1 -> NavHostFragment.findNavController(EleventhFragment.this)
                .navigate(R.id.eleventh_to_fifteenth));

        binding.imageView23.setOnClickListener(view1 -> NavHostFragment.findNavController(EleventhFragment.this)
                .navigate(R.id.eleventh_to_first));

        binding.imageView22.setOnClickListener(view1 -> NavHostFragment.findNavController(EleventhFragment.this)
                .navigate(R.id.eleventh_to_sixteenth));
    }
}