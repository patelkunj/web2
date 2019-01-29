package com.example.kunj.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

public class week2_class2 extends AppCompatActivity {

    ImageView imageview;
    Button button;
    RadioButton rdbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week2_class2);

        imageview = findViewById(R.id.imageview);
        button = findViewById(R.id.btn);
        rdbutton = findViewById(R.id.Bulbasaur);
        rdbutton.setChecked(true);
    }


    public void rbClick(View view) {
        switch(view.getId()){
            case R.id.blastoties:
                imageview.setImageResource(R.drawable.blastoise);
                break;
            case R.id.chamander:
                imageview.setImageResource(R.drawable.charmander);
                break;
            case R.id.Bulbasaur:
                imageview.setImageResource(R.drawable.bulbasaur);
                break;
            case R.id.chrizard:
                imageview.setImageResource(R.drawable.charizard);
                break;
            case R.id.butterfree:
                imageview.setImageResource(R.drawable.butterfree);
                break;
        }
    }
}
