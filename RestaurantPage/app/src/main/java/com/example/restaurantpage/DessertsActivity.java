package com.example.restaurantpage;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DessertsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_desserts);
        ListView dessertsList = findViewById(R.id.list_view_desserts);

        Dish[] desserts = {
                new Dish("Churros con Chocolate", "Fried dough pastries served with thick hot chocolate for dipping.", 6),
                new Dish("Tarta de Santiago", "Almond cake from Galicia, traditionally topped with powdered sugar and the Cross of Saint James.", 7),
                new Dish("Flan", "Creamy caramel custard dessert popular throughout Spain.", 5),
                new Dish("Leche Frita", "Fried milk pudding coated in cinnamon and sugar.", 6),
                new Dish("Arroz con Leche", "Rice pudding flavored with cinnamon and lemon zest.", 5),
                new Dish("Crema Catalana", "Spanish version of crème brûlée with a caramelized sugar crust.", 7),
                new Dish("Panellets", "Small marzipan cakes typically eaten during All Saints' Day.", 6),
                new Dish("Tocino de Cielo", "Rich egg yolk and sugar dessert similar to flan but denser.", 7),
                new Dish("Mantecados", "Crumbly shortbread cookies often enjoyed during Christmas.", 5),
                new Dish("Polvorones", "Spanish almond cookies that crumble easily, also traditional at Christmas.", 6),
                new Dish("Rosquillas", "Fried doughnuts usually coated with sugar or glaze.", 5),
                new Dish("Ensaimada", "Spiral-shaped pastry from Mallorca, dusted with powdered sugar.", 6),
                new Dish("Pestiños", "Fried dough pastries flavored with sesame and honey or sugar.", 5),
                new Dish("Huesos de Santo", "Marzipan sweets shaped like little bones, eaten during All Saints' Day.", 7),
                new Dish("Natillas", "Vanilla custard dessert topped with cinnamon.", 5),
                new Dish("Frutas de Aragón", "Chocolate-covered fruits typical from Aragón.", 6),
                new Dish("Coca de Llardons", "Catalan pastry with pork cracklings and sugar.", 6),
                new Dish("Turrón", "Nougat typically made with almonds and honey, traditional at Christmas.", 7),
                new Dish("Bizcocho", "Simple sponge cake often served with coffee.", 5),
                new Dish("Gelatina de Vino", "Wine-flavored gelatin dessert, light and refreshing.", 5)
        };

        ArrayAdapter<Dish> dessertsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, desserts);
        dessertsList.setAdapter(dessertsAdapter);

    }
}