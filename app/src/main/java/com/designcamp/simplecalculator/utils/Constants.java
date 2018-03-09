package com.designcamp.simplecalculator.utils;

import com.designcamp.simplecalculator.R;
import com.designcamp.simplecalculator.models.Animal;

import java.util.ArrayList;

/**
 * Created by HashCode on 1:54 PM 09/03/2018.
 */

public class Constants {

    Animal[] allAnimals = new Animal[5];

    public static ArrayList<Animal> getAnimalArrayList(){
        ArrayList<Animal> animalArrayList = new ArrayList<>();
        animalArrayList.add(new Animal("Dog", R.mipmap.ic_launcher));
        animalArrayList.add(new Animal("Cat", R.mipmap.ic_launcher));
        animalArrayList.add(new Animal("Horse",R.mipmap.ic_launcher ));
        animalArrayList.add(new Animal("Goat",R.mipmap.ic_launcher ));
        animalArrayList.add(new Animal("Lion",R.mipmap.ic_launcher ));
        return animalArrayList;
    }
}
