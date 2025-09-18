package com.example.portfolioofprojects;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        RecyclerView list = findViewById(R.id.recycler_view_projects);

        Project[] projects = {
                new Project("Getting Started Project", "Basic 'Hello World' app to learn how Android Studio works", R.drawable.ben_kolde_ajcipx1vdxi_unsplash),
                new Project("BMI Calculator", "An app to calculate Body Mass Index based on user input", R.drawable.goran_ivos_t8lmin09_mo_unsplash),
                new Project("ToDo List", "A simple task management app to organize daily activities", R.drawable.matam_jaswanth_lypq_bq97km_unsplash),
                new Project("Weather App", "Displays current weather information using an API", R.drawable.pakata_goh_apqwhxh4tm4_unsplash),
                new Project("Recipe Finder", "App to search and display recipes based on ingredients", R.drawable.tracy_adams_qvsm28o_k3y_unsplash),
                new Project("Getting Started Project", "Basic 'Hello World' app to learn how Android Studio works", R.drawable.ben_kolde_ajcipx1vdxi_unsplash),
                new Project("BMI Calculator", "An app to calculate Body Mass Index based on user input", R.drawable.goran_ivos_t8lmin09_mo_unsplash),
                new Project("ToDo List", "A simple task management app to organize daily activities", R.drawable.matam_jaswanth_lypq_bq97km_unsplash),
                new Project("Weather App", "Displays current weather information using an API", R.drawable.pakata_goh_apqwhxh4tm4_unsplash),
                new Project("Recipe Finder", "App to search and display recipes based on ingredients", R.drawable.tracy_adams_qvsm28o_k3y_unsplash),
                new Project("Getting Started Project", "Basic 'Hello World' app to learn how Android Studio works", R.drawable.ben_kolde_ajcipx1vdxi_unsplash),
                new Project("BMI Calculator", "An app to calculate Body Mass Index based on user input", R.drawable.goran_ivos_t8lmin09_mo_unsplash),
                new Project("ToDo List", "A simple task management app to organize daily activities", R.drawable.matam_jaswanth_lypq_bq97km_unsplash),
                new Project("Weather App", "Displays current weather information using an API", R.drawable.pakata_goh_apqwhxh4tm4_unsplash),
                new Project("Recipe Finder", "App to search and display recipes based on ingredients", R.drawable.tracy_adams_qvsm28o_k3y_unsplash),
        };

        ProjectsAdapter adapter = new ProjectsAdapter(projects);
        list.setAdapter(adapter);

    }
}