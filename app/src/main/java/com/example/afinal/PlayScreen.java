package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class PlayScreen extends AppCompatActivity
{
    //Variables
    private RelativeLayout myLayout = null;
    private ImageView imageMove = null;
    private float x;
    private float y;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_screen);

        myLayout = (RelativeLayout) findViewById(R.id.playScreen);
        imageMove = (ImageView) findViewById(R.id.imageMove);

        myLayout.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View view, MotionEvent event)
            {
                x = event.getX();
                y = event.getY();

                //if statement
                if (event.getAction() == MotionEvent.ACTION_MOVE)
                {
                    imageMove.setX(x);
                    imageMove.setY(y);
                }//end if move
                return true;
            }//onTouch boolean
        });//onTouchListener
    }
}//End class PlayScreen