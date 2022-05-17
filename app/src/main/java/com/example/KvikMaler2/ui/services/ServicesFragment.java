package com.example.KvikMaler2.ui.services;

import static android.content.Context.MODE_PRIVATE;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.KvikMaler2.R;
import com.example.KvikMaler2.databinding.FragmentServicesBinding;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class ServicesFragment extends Fragment implements ServicesAdapter.OnlistItemClickListener{

    RecyclerView recyclerView;
    ServicesAdapter servicesAdapter;

    private ServicesViewModel viewModel;
    View view;

    //private FragmentServicesBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        //ServicesViewModel servicesViewModel =
               // new ViewModelProvider(this).get(ServicesViewModel.class);

        //binding = FragmentServicesBinding.inflate(inflater, container, false);
        //View root = binding.getRoot();

        //final TextView textView = binding.textServices;
        //servicesViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        //return root;

        view = inflater.inflate(R.layout.fragment_services, container, false);

        viewModel = new ViewModelProvider(this).get(ServicesViewModel.class);

        recyclerView= view.findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.hasFixedSize();
        //servicesAdapter = new ServicesAdapter(new ArrayList<>());

        ArrayList<Services> services= new ArrayList<>();
        services.add(new Services("Apartment - painting", R.drawable.apart_paint));
        services.add(new Services("Apartment - Renovation ", R.drawable.apart_renov));
        services.add(new Services("Apartment - Total renovation", R.drawable.apartment));
        services.add(new Services("House - interior painting", R.drawable.house_int_paint));
        services.add(new Services("House - renovation", R.drawable.house_renov));
        services.add(new Services("House - total renovation", R.drawable.house_total_renov));
        services.add(new Services("Room - painting", R.drawable.room_paint));
        services.add(new Services("Room - renovation", R.drawable.room_renov));
        services.add(new Services("Facade painting", R.drawable.facade_paint));
        services.add(new Services("Exterior wood - painting", R.drawable.ext_wood_paint));

        ServicesAdapter adapter= new ServicesAdapter(services, this);
        recyclerView.setAdapter(adapter);

        return view;
    }

    @Override
    public void onClick(int position) {
        Snackbar.make(view,"Position" + position, BaseTransientBottomBar.LENGTH_SHORT).show();
   }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        //binding = null;
    }
}