package ru.lessons.customspinnerlesson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

import java.util.ArrayList;

import ru.lessons.customspinnerlesson.Adapters.AutoBrandsSpinnerAdapter;
import ru.lessons.customspinnerlesson.AdditionalClasses.AutoBrandClass;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<AutoBrandClass> autoBrandsList = new ArrayList<>();

        autoBrandsList.add(new AutoBrandClass("Toyota", "https://www.toyota.com", R.drawable.toyota));
        autoBrandsList.add(new AutoBrandClass("Nissan", "http://www.nissan-global.com", R.drawable.nissan));
        autoBrandsList.add(new AutoBrandClass("BMW", "https://www.bmw.com", R.drawable.bmw));

        Spinner spAutoBrands = (Spinner) findViewById(R.id.spAutoBrands);

        AutoBrandsSpinnerAdapter spinnerAdapter = new AutoBrandsSpinnerAdapter(this, autoBrandsList);

        spAutoBrands.setAdapter(spinnerAdapter);
    }
}
