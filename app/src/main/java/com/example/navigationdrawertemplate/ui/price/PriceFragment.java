package com.example.navigationdrawertemplate.ui.price;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.navigationdrawertemplate.databinding.FragmentPricesBinding;
import com.example.navigationdrawertemplate.databinding.FragmentPricesBinding;

public class PriceFragment extends Fragment {

    private FragmentPricesBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        PriceViewModel priceViewModel =
                new ViewModelProvider(this).get(PriceViewModel.class);

        binding = FragmentPricesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textPrices;
        priceViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}