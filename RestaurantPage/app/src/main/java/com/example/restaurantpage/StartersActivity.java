package com.example.restaurantpage;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class StartersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);

        ListView startersList = findViewById(R.id.list_view_starters);
        Dish[] dishes = {
                new Dish("Tortilla Española", "Traditional Spanish omelette made with eggs and potatoes.", 6),
                new Dish("Gazpacho", "Cold tomato-based soup, perfect for hot days.", 5),
                new Dish("Pan con Tomate", "Toasted bread rubbed with garlic, tomato, and olive oil.", 4),
                new Dish("Patatas Bravas", "Crispy potatoes served with spicy tomato sauce and aioli.", 5),
                new Dish("Croquetas", "Creamy bechamel croquettes, often filled with ham or chicken.", 6),
                new Dish("Pimientos de Padrón", "Small green peppers, lightly fried and salted.", 5),
                new Dish("Jamón Ibérico", "Cured Iberian ham, thinly sliced and full of flavor.", 9),
                new Dish("Chorizo a la Sidra", "Chorizo sausage cooked in Asturian cider.", 7),
                new Dish("Boquerones en Vinagre", "White anchovies marinated in vinegar and garlic.", 6),
                new Dish("Pulpo a la Gallega", "Galician-style octopus with paprika and olive oil.", 10),
                new Dish("Albóndigas", "Spanish-style meatballs in a rich tomato sauce.", 7),
                new Dish("Ensaladilla Rusa", "Spanish potato salad with tuna, peas, and mayo.", 5),
                new Dish("Queso Manchego", "Aged sheep cheese from La Mancha region.", 8),
                new Dish("Gambas al Ajillo", "Sizzling prawns in garlic and chili oil.", 9),
                new Dish("Calamares a la Romana", "Deep-fried squid rings in a light batter.", 8),
                new Dish("Espinacas con Garbanzos", "Spinach and chickpeas stew from Andalusia.", 6),
                new Dish("Berenjenas con Miel", "Fried eggplant drizzled with cane honey.", 6),
                new Dish("Caracoles", "Snails cooked in a spicy, garlicky tomato sauce.", 7),
                new Dish("Salmorejo", "Thick tomato and bread-based cold soup from Córdoba.", 5),
                new Dish("Huevos Rotos", "Fried eggs over crispy potatoes, often with ham or chorizo.", 8)
        };

        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);
        startersList.setAdapter(dishesAdapter);
    }
}