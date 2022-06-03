package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{
    ImageView img;
    Button b;
    public static int flag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        configurePlayButton();

        img = (ImageView) findViewById(R.id.charImage);
        b = (Button) findViewById(R.id.changeButton);

        b.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if (flag == 0)
                {
                    img.setImageResource(R.drawable.cat);
                    flag = 1;
                }
                else if (flag == 1)
                {
                    img.setImageResource(R.drawable.cat1);
                    flag = 2;
                }
                else if (flag == 2)
                {
                    img.setImageResource(R.drawable.cat2);
                    flag = 0;
                }
            }
        });//Check box
    }

    private void configurePlayButton()
    {
        Button nextButton = (Button) findViewById(R.id.buttonPlay);
        nextButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(MainActivity.this, PlayScreen.class));
            }
        });
    }//End play button handler
}//End class MainActivity