package com.dotplays.a5pet.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.dotplays.a5pet.R;
import com.dotplays.a5pet.model.Pet;
import com.dotplays.a5pet.view.VerdanaText5Pet;

/**
 * Created by MAC2015 on 3/16/17.
 */

class PetSearchHolder extends RecyclerView.ViewHolder {

    public ImageView img_avatar;
    public VerdanaText5Pet tv_name;
    public VerdanaText5Pet tv_distance;
    public Pet pet;

    public PetSearchHolder(View itemView) {
        super(itemView);
        img_avatar = (ImageView) itemView.findViewById(R.id.img_avatar);
        tv_name = (VerdanaText5Pet) itemView.findViewById(R.id.tv_name);
        tv_distance = (VerdanaText5Pet) itemView.findViewById(R.id.tv_distance);
    }
}
