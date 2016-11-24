package com.caqmei.speakcantonese;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void speak(View view) {
        //how I did it
//        switch(view.getId()) {
//            case R.id.thnxBtn:
//                final MediaPlayer thankYou = MediaPlayer.create(this, R.raw.thanks);
//                thankYou.start();
//                break;
//            case R.id.nameBtn:
//                final MediaPlayer name = MediaPlayer.create(this, R.raw.whats_your_name);
//                name.start();
//                break;
//            case R.id.loveBtn:
//                final MediaPlayer loveYou = MediaPlayer.create(this, R.raw.iloveyou);
//                loveYou.start();
//                break;
//            case R.id.fromBtn:
//                final MediaPlayer whereFrom = MediaPlayer.create(this, R.raw.where_you_from);
//                whereFrom.start();
//                break;
//            case R.id.dinnerBtn:
//                final MediaPlayer dinner = MediaPlayer.create(this, R.raw.are_you_free_this_evening);
//                dinner.start();
//                break;
//            case R.id.lunchBtn:
//                final MediaPlayer lunch = MediaPlayer.create(this, R.raw.are_you_free_for_lunch);
//                lunch.start();
//                break;
//            case R.id.meetUBtn:
//                final MediaPlayer meetYou = MediaPlayer.create(this, R.raw.pleased_to_meet_u);
//                meetYou.start();
//                break;
//            case R.id.phoneBtn:
//                final MediaPlayer phone = MediaPlayer.create(this, R.raw.can_i_have_your_phone_number);
//                phone.start();
//                break;
//            default:
//                throw new RuntimeException("Unknown button ID");
//        }

        int id = view.getId();
        String ourId = "";

        ourId = view.getResources().getResourceEntryName(id);

        int resourceId = getResources().getIdentifier(ourId, "raw", "com.caqmei.speakcantonese");

        MediaPlayer mPlayer = MediaPlayer.create(this, resourceId);
        mPlayer.start();

        Log.i("Button tapped", ourId);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
