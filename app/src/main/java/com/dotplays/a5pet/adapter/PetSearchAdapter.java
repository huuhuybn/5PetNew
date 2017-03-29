package com.dotplays.a5pet.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dotplays.a5pet.R;
import com.dotplays.a5pet.model.Pet;

import java.util.List;
import java.util.Random;

/**
 * Created by MAC2015 on 3/16/17.
 */

public class PetSearchAdapter extends RecyclerView.Adapter<PetSearchHolder> {

    private View view;
    private Context context;

    private List<Pet> pets;

    public PetSearchAdapter(Context context, List<Pet> pets) {
        this.context = context;
        this.pets = pets;

    }

    @Override
    public PetSearchHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        view = LayoutInflater.from(context).inflate(R.layout.adapter_search_pet, parent, false);
        return new PetSearchHolder(view);
    }

    @Override
    public void onBindViewHolder(PetSearchHolder holder, int position) {
        holder.pet = pets.get(position);
        holder.tv_name.setText(holder.pet.getName());
        Random random = new Random();
        holder.tv_distance.setText(random.nextInt(1000) + "m");
    }

    @Override
    public int getItemCount() {
        if (pets == null)
            return 0;
        else return pets.size();
    }
}
