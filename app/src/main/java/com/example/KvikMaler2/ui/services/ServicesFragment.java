package com.example.KvikMaler2.ui.services;

import static android.content.Context.MODE_PRIVATE;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.KvikMaler2.R;
import com.example.KvikMaler2.databinding.FragmentServicesBinding;

import java.util.ArrayList;

public class ServicesFragment extends Fragment {

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
        services.add(new Services("LaMunca", R.drawable.ic_launcher_foreground));
        services.add(new Services("bre", R.drawable.ic_notifications_24));
        services.add(new Services("LaMunca", R.drawable.ic_money_24));
        services.add(new Services("unca", R.drawable.ic_paint_24));
        services.add(new Services("LaMunca", R.drawable.ic_paint_24));
        services.add(new Services("Lca", R.drawable.ic_login_24));
        services.add(new Services("LaMunca", R.drawable.ic_money_24));
        services.add(new Services("LaMunca", R.drawable.ic_launcher_foreground));
        services.add(new Services("bre", R.drawable.ic_notifications_24));
        services.add(new Services("LaMunca", R.drawable.ic_money_24));
        services.add(new Services("unca", R.drawable.ic_paint_24));
        services.add(new Services("LaMunca", R.drawable.ic_paint_24));
        services.add(new Services("Lca", R.drawable.ic_login_24));
        services.add(new Services("LaMunca", R.drawable.ic_notifications_24));
        services.add(new Services("LaMunca", R.drawable.ic_launcher_foreground));
        services.add(new Services("bre", R.drawable.ic_notifications_24));
        services.add(new Services("LaMunca", R.drawable.ic_money_24));
        services.add(new Services("unca", R.drawable.ic_paint_24));
        services.add(new Services("LaMunca", R.drawable.ic_paint_24));
        services.add(new Services("Lca", R.drawable.ic_login_24));
        services.add(new Services("LaMunca", R.drawable.ic_money_24));
        services.add(new Services("LaMunca", R.drawable.ic_launcher_foreground));
        services.add(new Services("bre", R.drawable.ic_notifications_24));
        services.add(new Services("LaMunca", R.drawable.ic_money_24));
        services.add(new Services("unca", R.drawable.ic_paint_24));
        services.add(new Services("LaMunca", R.drawable.ic_paint_24));
        services.add(new Services("Lca", R.drawable.ic_login_24));
        services.add(new Services("LaMunca", R.drawable.ic_money_24));
        services.add(new Services("LaMunca", R.drawable.ic_launcher_foreground));
        services.add(new Services("bre", R.drawable.ic_notifications_24));
        services.add(new Services("LaMunca", R.drawable.ic_money_24));
        services.add(new Services("unca", R.drawable.ic_paint_24));
        services.add(new Services("LaMunca", R.drawable.ic_paint_24));
        services.add(new Services("Lca", R.drawable.ic_login_24));
        services.add(new Services("LaMunca", R.drawable.ic_notifications_24));
        services.add(new Services("LaMunca", R.drawable.ic_launcher_foreground));
        services.add(new Services("bre", R.drawable.ic_notifications_24));
        services.add(new Services("LaMunca", R.drawable.ic_money_24));
        services.add(new Services("unca", R.drawable.ic_paint_24));
        services.add(new Services("LaMunca", R.drawable.ic_paint_24));
        services.add(new Services("Lca", R.drawable.ic_login_24));
        services.add(new Services("LaMunca", R.drawable.ic_money_24));

        ServicesAdapter adapter= new ServicesAdapter(services);
        recyclerView.setAdapter(adapter);

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        //binding = null;
    }
}