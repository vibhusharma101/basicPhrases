package com.example.basicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer player;

    public void speak(View view)
    {
        Button btn =(Button)view;
         String tags = btn.getTag().toString();

       /* if(tags.equals("speakEnglish"))
        {
            player = MediaPlayer.create(this,R.raw.doyouspeakenglish);
            player.start();
        }
        else if(tags.equals("hello"))
        {
            player = MediaPlayer.create(this,R.raw.hello);
            player.start();
        }
        else if(tags.equals("evening"))
        {
            player = MediaPlayer.create(this,R.raw.goodevening);
            player.start();

        }

        else if(tags.equals("how"))
        {
            player = MediaPlayer.create(this,R.raw.howareyou);
            player.start();

        }
        else if(tags.equals("livein"))
        {
            player = MediaPlayer.create(this,R.raw.ilivein);
            player.start();
        }
        else if(tags.equals("please"))
        {
            player = MediaPlayer.create(this,R.raw.please);
            player.start();

        }

        else if(tags.equals("name"))
        {
            player = MediaPlayer.create(this,R.raw.mynameis);
            player.start();
        }
        else if(tags.equals("welcome"))
        {
            player = MediaPlayer.create(this,R.raw.welcome);
            player.start();
        }
        */
       player = MediaPlayer.create(this,getResources().getIdentifier(tags,"raw",getPackageName()));
       player.start();

    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
