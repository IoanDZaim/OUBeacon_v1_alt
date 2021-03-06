package com.IoanzaimGmailCom.IoanzaimGmailComSProxi9Bt.Rooms.SummerClasses;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;


import com.IoanzaimGmailCom.IoanzaimGmailComSProxi9Bt.R;
import com.IoanzaimGmailCom.IoanzaimGmailComSProxi9Bt.Rooms.CardAdapter;
import com.google.android.glass.widget.CardBuilder;
import com.google.android.glass.widget.CardScrollView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ioannis.D on 19-Jan-16.
 */
public class Lesson1 extends Activity {

    private CardScrollView SummLes1;

    @Override
    protected void onCreate(Bundle bundle){
        super.onCreate(bundle);
        SummLes1=new CardScrollView(this);
        SummLes1.setAdapter(new CardAdapter(createCards(this)));
        setContentView(SummLes1);
    }//onCreate

    private List<CardBuilder> createCards(Context context) {
        ArrayList<CardBuilder> cards = new ArrayList<>();

        cards.add(new CardBuilder(context, CardBuilder.Layout.TEXT_FIXED)
                        .setText("Hello! This lesson will demonstrate you how to connect your laptop to the beamer through the use of an HDMI cable.")
                        .setFootnote("Summer")
        );
        cards.add(new CardBuilder(context, CardBuilder.Layout.COLUMNS)
                        .setText("First things first, check if you have an HDMI port on your laptop. It looks like the image on the left.")
                        .addImage(R.drawable.hdmiport)
                        .setFootnote("Summer")
        );
        cards.add(new CardBuilder(context, CardBuilder.Layout.COLUMNS)
                        .setText("If you do, great! Find the HDMI cable and connect it to your PC. The cable looks like the one on the image and it's usually on top of the table")
                        .addImage(R.drawable.hdmicable)
                        .setFootnote("Summer")
        );
        cards.add(new CardBuilder(context, CardBuilder.Layout.COLUMNS)
                        .setText("Well done! Now you must see your screen projected on the wall!")
                        .addImage(R.drawable.vault_boy)
                        .setFootnote("Summer")
        );
        return cards;
    }//List
    @Override
    protected void onResume(){
        super.onResume();
        SummLes1.activate();
    }//onResume
    @Override
    protected void onPause(){
        SummLes1.deactivate();
        super.onPause();
    }//onPause
}
