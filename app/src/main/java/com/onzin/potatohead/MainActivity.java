package com.onzin.potatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    //declare all object variables
    ImageView obj_arms;
    ImageView obj_ears;
    ImageView obj_eyebrows;
    ImageView obj_eyes;
    ImageView obj_glasses;
    ImageView obj_hat;
    ImageView obj_mouth;
    ImageView obj_mustache;
    ImageView obj_nose;
    ImageView obj_shoes;

    CheckBox chk_arms;
    CheckBox chk_ears;
    CheckBox chk_eyebrows;
    CheckBox chk_eyes;
    CheckBox chk_glasses;
    CheckBox chk_hat;
    CheckBox chk_mouth;
    CheckBox chk_mustache;
    CheckBox chk_nose;
    CheckBox chk_shoes;
      
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // assigning variable name to all objects
        chk_arms = (CheckBox) findViewById(R.id.arms);
        chk_ears = (CheckBox) findViewById(R.id.ears);
        chk_eyebrows = (CheckBox) findViewById(R.id.eyebrows);
        chk_eyes = (CheckBox) findViewById(R.id.eyes);
        chk_glasses = (CheckBox) findViewById(R.id.glasses);
        chk_hat = (CheckBox) findViewById(R.id.hat);
        chk_mouth = (CheckBox) findViewById(R.id.mouth);
        chk_mustache = (CheckBox) findViewById(R.id.mustache);
        chk_nose = (CheckBox) findViewById(R.id.nose);
        chk_shoes = (CheckBox) findViewById(R.id.shoes);

        obj_arms = (ImageView) findViewById(R.id.arms_img);
        obj_ears = (ImageView) findViewById(R.id.ears_img);
        obj_eyebrows = (ImageView) findViewById(R.id.eyebrows_img);
        obj_eyes = (ImageView) findViewById(R.id.eyes_img);
        obj_glasses = (ImageView) findViewById(R.id.glasses_img);
        obj_hat = (ImageView) findViewById(R.id.hat_img);
        obj_mouth = (ImageView) findViewById(R.id.mouth_img);
        obj_mustache = (ImageView) findViewById(R.id.mustache_img);
        obj_nose = (ImageView) findViewById(R.id.nose_img);
        obj_shoes = (ImageView) findViewById(R.id.shoes_img);

        // initialize potatohead without all parts
        obj_arms.setVisibility(View.INVISIBLE);
        obj_ears.setVisibility(View.INVISIBLE);
        obj_eyebrows.setVisibility(View.INVISIBLE);
        obj_eyes.setVisibility(View.INVISIBLE);
        obj_glasses.setVisibility(View.INVISIBLE);
        obj_hat.setVisibility(View.INVISIBLE);
        obj_mouth.setVisibility(View.INVISIBLE);
        obj_mustache.setVisibility(View.INVISIBLE);
        obj_nose.setVisibility(View.INVISIBLE);
        obj_shoes.setVisibility(View.INVISIBLE);

        // initialize all boxes to uncheck
        chk_arms.setChecked(false);
        chk_ears.setChecked(false);
        chk_eyebrows.setChecked(false);
        chk_eyes.setChecked(false);
        chk_glasses.setChecked(false);
        chk_hat.setChecked(false);
        chk_mouth.setChecked(false);
        chk_mustache.setChecked(false);
        chk_nose.setChecked(false);
        chk_shoes.setChecked(false);


        // for each checkbox, we listen for checked and showq picture
        chk_arms.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                if (chk_arms.isChecked())
                {
                    obj_arms.setVisibility(View.VISIBLE);
                }
                else
                {
                    obj_arms.setVisibility(View.INVISIBLE);
                }
            }
        });

        chk_ears.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){

                if(chk_ears.isChecked())
                {
                    obj_ears.setVisibility(View.VISIBLE);
                }
                else
                {
                    obj_ears.setVisibility(View.INVISIBLE);
                }
            }
        });
        
        chk_eyebrows.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){

                if(chk_eyebrows.isChecked())
                {
                    obj_eyebrows.setVisibility(View.VISIBLE);
                }
                else
                {
                    obj_eyebrows.setVisibility(View.INVISIBLE);
                }
            }
        });
        
        
        chk_eyes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){

                if(chk_eyes.isChecked())
                {
                    obj_eyes.setVisibility(View.VISIBLE);
                }
                else
                {
                    obj_eyes.setVisibility(View.INVISIBLE);
                }
            }
        });
        
        
        chk_glasses.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){

                if(chk_glasses.isChecked())
                {
                    obj_glasses.setVisibility(View.VISIBLE);
                }
                else
                {
                    obj_glasses.setVisibility(View.INVISIBLE);
                }
            }
        });
        
        
        chk_hat.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){

                if(chk_hat.isChecked())
                {
                    obj_hat.setVisibility(View.VISIBLE);
                }
                else
                {
                    obj_hat.setVisibility(View.INVISIBLE);
                }
            }
        });
        
        
        chk_mouth.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){

                if(chk_mouth.isChecked())
                {
                    obj_mouth.setVisibility(View.VISIBLE);
                }
                else
                {
                    obj_mouth.setVisibility(View.INVISIBLE);
                }
            }
        });
        
        
        chk_mustache.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){

                if(chk_mustache.isChecked())
                {
                    obj_mustache.setVisibility(View.VISIBLE);
                }
                else
                {
                    obj_mustache.setVisibility(View.INVISIBLE);
                }
            }
        });
        
        
        chk_nose.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){

                if(chk_nose.isChecked())
                {
                    obj_nose.setVisibility(View.VISIBLE);
                }
                else
                {
                    obj_nose.setVisibility(View.INVISIBLE);
                }
            }
        });
        
        
        chk_shoes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){

                if(chk_shoes.isChecked())
                {
                    obj_shoes.setVisibility(View.VISIBLE);
                }
                else
                {
                    obj_shoes.setVisibility(View.INVISIBLE);
                }
            }
        });


    }


//    @Override
//    public void onSaveInstanceState(Bundle b){
//
//        b.putParcelable("arms",chk_arms.getVisibility());
//    }
//
//    @Override
//    public void onRestoreInstanceState(Bundle b){
//
//        chk_arms.setVisibility( (View) b.getParcelable("arms") );
//
//    }



}