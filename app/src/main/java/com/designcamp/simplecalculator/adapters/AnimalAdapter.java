package com.designcamp.simplecalculator.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.designcamp.simplecalculator.R;
import com.designcamp.simplecalculator.models.Animal;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by HashCode on 2:43 PM 09/03/2018.
 */

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder> {
    ArrayList<Animal> allAnimals;
    Context mContext;

    public AnimalAdapter(Context context, ArrayList<Animal> animals){
        mContext = context;
        allAnimals = animals;
    }
    @NonNull
    @Override
    public AnimalAdapter.AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.each_animal_layout, parent, false);
        return new AnimalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalAdapter.AnimalViewHolder holder, int position) {
        Animal animal = allAnimals.get(position);
        holder.nameTextView.setText(animal.getName());
        holder.animalImageView.setImageDrawable(mContext.getResources().getDrawable(animal.getPicUrl()));

    }

    @Override
    public int getItemCount() {
        return allAnimals.size();
    }

    public class AnimalViewHolder extends RecyclerView.ViewHolder {
        CircleImageView animalImageView;
        TextView nameTextView;
        public AnimalViewHolder(View itemView) {
            super(itemView);
            animalImageView = itemView.findViewById(R.id.animal_image_view);
            nameTextView = itemView.findViewById(R.id.animal_name_text_view);
        }
    }
}
