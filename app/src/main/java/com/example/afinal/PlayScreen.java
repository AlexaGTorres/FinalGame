package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
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
    int temp = MainActivity.flag-1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_screen);
        configureQuitButton();

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

        if (temp == 0)
        {
            imageMove.setImageResource(R.drawable.cat);
        }
        else if (temp == 1)
        {
            imageMove.setImageResource(R.drawable.cat1);
        }
        else if (temp == 2)
        {
            imageMove.setImageResource(R.drawable.cat2);
        }
    }

    private void configureQuitButton()
    {
        Button quitButton = (Button) findViewById(R.id.quitButton);
        quitButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(PlayScreen.this, ResultScreen.class));
            }
        });
        }//End quit button handler
}//End class PlayScreen