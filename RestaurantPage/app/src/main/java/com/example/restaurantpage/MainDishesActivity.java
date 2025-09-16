package com.example.restaurantpage;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainDishesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_courses);

        ListView mainsList = findViewById(R.id.list_view_mains);
        Dish[] mainDishes = {
                new Dish("Paella Valenciana", "Classic rice dish with chicken, rabbit, and vegetables.", 15),
                new Dish("Fabada Asturiana", "Hearty bean stew with chorizo and morcilla sausage.", 14),
                new Dish("Cochinillo Asado", "Roast suckling pig, crispy skin and tender meat.", 20),
                new Dish("Pollo al Ajillo", "Garlic fried chicken with herbs and olive oil.", 13),
                new Dish("Rabo de Toro", "Slow-cooked oxtail stew with red wine and vegetables.", 18),
                new Dish("Merluza a la Gallega", "Galician style hake fish with paprika and potatoes.", 16),
                new Dish("Callos a la Madrileña", "Spicy tripe stew typical of Madrid.", 14),
                new Dish("Escalivada", "Roasted vegetables with olive oil and garlic.", 12),
                new Dish("Zarzuela de Mariscos", "Seafood stew with a variety of fish and shellfish.", 19),
                new Dish("Chuletas de Cordero", "Grilled lamb chops seasoned with herbs.", 17),
                new Dish("Arroz Negro", "Black rice cooked with squid ink and seafood.", 16),
                new Dish("Fideuà", "Noodle-based seafood dish similar to paella.", 15),
                new Dish("Bacalao a la Vizcaína", "Salted cod with a rich red pepper sauce.", 16),
                new Dish("Lentejas con Chorizo", "Lentil stew with chorizo and vegetables.", 12),
                new Dish("Pisto Manchego", "Spanish ratatouille with zucchini, peppers, and tomatoes.", 13),
                new Dish("Chuletón", "Large grilled T-bone steak, served rare or medium.", 22),
                new Dish("Guiso de Cordero", "Lamb stew with potatoes and aromatic herbs.", 17),
                new Dish("Merluza a la Romana", "Battered and fried hake fillet.", 15),
                new Dish("Tortilla de Camarones", "Shrimp fritters from Cádiz, crispy and savory.", 14),
                new Dish("Paella de Marisco", "Seafood paella loaded with shrimp, mussels, and clams.", 18)
        };
        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mainDishes);
        mainsList.setAdapter(dishesAdapter);
    }
}
