package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState); // always call super
        ImageView image = (ImageView) findViewById(R.id.Arms);
        ImageView image2 = (ImageView) findViewById(R.id.Eyebrows);
        ImageView image3 = (ImageView) findViewById(R.id.Ears);
        ImageView image4 = (ImageView) findViewById(R.id.Eyes);
        ImageView image5 = (ImageView) findViewById(R.id.Glasses);
        ImageView image6 = (ImageView) findViewById(R.id.Hat);
        ImageView image7 = (ImageView) findViewById(R.id.Mouth);
        ImageView image8 = (ImageView) findViewById(R.id.Mustache);
        ImageView image9 = (ImageView) findViewById(R.id.Nose);
        ImageView image10 = (ImageView) findViewById(R.id.Shoes);
        if(image.getVisibility() == View.VISIBLE){
            outState.putBoolean("image", true);
        } else {
            outState.putBoolean("image", false);
        }
        if(image2.getVisibility() == View.VISIBLE){
            outState.putBoolean("image2", true);
        } else {
            outState.putBoolean("image2", false);
        }
        if(image3.getVisibility() == View.VISIBLE){
            outState.putBoolean("image3", true);
        } else {
            outState.putBoolean("image3", false);
        }
        if(image4.getVisibility() == View.VISIBLE){
            outState.putBoolean("image4", true);
        } else {
            outState.putBoolean("image4", false);
        }
        if(image5.getVisibility() == View.VISIBLE){
            outState.putBoolean("image5", true);
        } else {
            outState.putBoolean("image5", false);
        }
        if(image6.getVisibility() == View.VISIBLE){
            outState.putBoolean("image6", true);
        } else {
            outState.putBoolean("image6", false);
        }
        if(image7.getVisibility() == View.VISIBLE){
            outState.putBoolean("image7", true);
        } else {
            outState.putBoolean("image7", false);
        }
        if(image8.getVisibility() == View.VISIBLE){
            outState.putBoolean("image8", true);
        } else {
            outState.putBoolean("image8", false);
        }
        if(image9.getVisibility() == View.VISIBLE){
            outState.putBoolean("image9", true);
        } else {
            outState.putBoolean("image9", false);
        }
        if(image10.getVisibility() == View.VISIBLE){
            outState.putBoolean("image10", true);
        } else {
            outState.putBoolean("image10", false);
        }

    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        ImageView image = (ImageView) findViewById(R.id.Arms);
        ImageView image2 = (ImageView) findViewById(R.id.Eyebrows);
        ImageView image3 = (ImageView) findViewById(R.id.Ears);
        ImageView image4 = (ImageView) findViewById(R.id.Eyes);
        ImageView image5 = (ImageView) findViewById(R.id.Glasses);
        ImageView image6 = (ImageView) findViewById(R.id.Hat);
        ImageView image7 = (ImageView) findViewById(R.id.Mouth);
        ImageView image8 = (ImageView) findViewById(R.id.Mustache);
        ImageView image9 = (ImageView) findViewById(R.id.Nose);
        ImageView image10 = (ImageView) findViewById(R.id.Shoes);
        if(savedInstanceState.getBoolean("image")){
            image.setVisibility(View.VISIBLE);
        } else {
            image.setVisibility(View.INVISIBLE);
        }
        if(savedInstanceState.getBoolean("image2")){
            image2.setVisibility(View.VISIBLE);
        } else {
            image2.setVisibility(View.INVISIBLE);
        }
        if(savedInstanceState.getBoolean("image3")){
            image3.setVisibility(View.VISIBLE);
        } else {
            image3.setVisibility(View.INVISIBLE);
        }
        if(savedInstanceState.getBoolean("image4")){
            image4.setVisibility(View.VISIBLE);
        } else {
            image4.setVisibility(View.INVISIBLE);
        }
        if(savedInstanceState.getBoolean("image5")){
            image5.setVisibility(View.VISIBLE);
        } else {
            image5.setVisibility(View.INVISIBLE);
        }
        if(savedInstanceState.getBoolean("image6")){
            image6.setVisibility(View.VISIBLE);
        } else {
            image6.setVisibility(View.INVISIBLE);
        }
        if(savedInstanceState.getBoolean("image7")){
            image7.setVisibility(View.VISIBLE);
        } else {
            image7.setVisibility(View.INVISIBLE);
        }
        if(savedInstanceState.getBoolean("image8")){
            image8.setVisibility(View.VISIBLE);
        } else {
            image8.setVisibility(View.INVISIBLE);
        }
        if(savedInstanceState.getBoolean("image9")){
            image9.setVisibility(View.VISIBLE);
        } else {
            image9.setVisibility(View.INVISIBLE);
        }
        if(savedInstanceState.getBoolean("image10")){
            image10.setVisibility(View.VISIBLE);
        } else {
            image10.setVisibility(View.INVISIBLE);
        }


    }
    public void checkClicked(View v) {
        Log.d("potato", "checkClicked: ");
        CheckBox checkbox = (CheckBox) v;
        checkbox.getText().toString();
        ImageView image = (ImageView) findViewById(R.id.Arms);
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkBox12);

        if (checkBox1.isChecked()) {
            image.setVisibility(View.VISIBLE);
        } else {
            image.setVisibility(View.INVISIBLE);
        }


        ImageView image2 = (ImageView) findViewById(R.id.Eyebrows);
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkBox13);
        if (checkBox2.isChecked()) {
            image2.setVisibility(View.VISIBLE);
        } else {
            image2.setVisibility(View.INVISIBLE);
        }

        ImageView image3 = (ImageView) findViewById(R.id.Ears);
        CheckBox checkBox3 = (CheckBox) findViewById(R.id.checkBox14);
        if (checkBox3.isChecked()) {
            image3.setVisibility(View.VISIBLE);
        } else {
            image3.setVisibility(View.INVISIBLE);
        }

        ImageView image4 = (ImageView) findViewById(R.id.Eyes);
        CheckBox checkBox4 = (CheckBox) findViewById(R.id.checkBox15);
        if (checkBox4.isChecked()) {
            image4.setVisibility(View.VISIBLE);
        } else {
            image4.setVisibility(View.INVISIBLE);
        }

        ImageView image5 = (ImageView) findViewById(R.id.Glasses);
        CheckBox checkBox5 = (CheckBox) findViewById(R.id.checkBox16);
        if (checkBox5.isChecked()) {
            image5.setVisibility(View.VISIBLE);
        } else {
            image5.setVisibility(View.INVISIBLE);
        }

        ImageView image6 = (ImageView) findViewById(R.id.Hat);
        CheckBox checkBox6 = (CheckBox) findViewById(R.id.checkBox17);
        if (checkBox6.isChecked()) {
            image6.setVisibility(View.VISIBLE);
        } else {
            image6.setVisibility(View.INVISIBLE);
        }

        ImageView image7 = (ImageView) findViewById(R.id.Mouth);
        CheckBox checkBox7 = (CheckBox) findViewById(R.id.checkBox18);
        if (checkBox7.isChecked()) {
            image7.setVisibility(View.VISIBLE);
        } else {
            image7.setVisibility(View.INVISIBLE);
        }

        ImageView image8 = (ImageView) findViewById(R.id.Mustache);
        CheckBox checkBox8 = (CheckBox) findViewById(R.id.checkBox19);
        if (checkBox8.isChecked()) {
            image8.setVisibility(View.VISIBLE);
        } else {
            image8.setVisibility(View.INVISIBLE);
        }

        ImageView image9 = (ImageView) findViewById(R.id.Nose);
        CheckBox checkBox9 = (CheckBox) findViewById(R.id.checkBox20);
        if (checkBox9.isChecked()) {
            image9.setVisibility(View.VISIBLE);
        } else {
            image9.setVisibility(View.INVISIBLE);
        }

        ImageView image10 = (ImageView) findViewById(R.id.Shoes);
        CheckBox checkBox10 = (CheckBox) findViewById(R.id.checkBox21);
        if (checkBox10.isChecked()) {
            image10.setVisibility(View.VISIBLE);
        } else {
            image10.setVisibility(View.INVISIBLE);
        }

    }
}

