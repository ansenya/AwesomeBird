package com.example.awesomebird.model;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.example.awesomebird.R;

public class Bird extends GameObject{
    private Bitmap sprite;
    private Bitmap up;
    private Bitmap straight;
    private Bitmap down;
    private float ySpeed = 0;
    private static final float ACCELERATION = 9.7f;


    public Bird(Context context, float x, float y) {
        super(x, y);
        sprite = BitmapFactory.decodeResource(context.getResources(), R.drawable.bluebird_2);
    }

    public Bitmap getSprite() {
        return sprite;
    }

    public void fly (){
        ySpeed =- 50;
    }

    public void update(){
        y += ySpeed;
        ySpeed+=ACCELERATION;
    }

}
