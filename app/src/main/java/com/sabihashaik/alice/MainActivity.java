package com.sabihashaik.alice;

import android.content.DialogInterface;
import android.os.Message;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button mtop;
    Button mBottom;
    TextView mStoryTextView;
    int mindex=1;

    StoryPath[] s1=new StoryPath[]{
            new StoryPath(R.string.T1_Story,R.string.T1_Ans1,R.string.T1_Ans2),
            new StoryPath(R.string.T5_Story,R.string.T5_Ans1,R.string.T5_Ans2),
            new StoryPath(R.string.T7_Story,R.string.T7_Ans1,R.string.T7_Ans2),
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        //Find View by Id
        mtop=(Button)findViewById(R.id.mtopbutton);
        mBottom=(Button)findViewById(R.id.mbottombutton);
        mStoryTextView=(TextView) findViewById(R.id.mStoryText);


        //On click listener for top button
        mtop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(mindex==1){
                mindex=2;
                mStoryTextView.setText(R.string.T3_Story);
                mtop.setText(R.string.T3_Ans1);
                mBottom.setVisibility(View.INVISIBLE);
            }else if(mindex==2){
                mindex=3;
                mStoryTextView.setText(R.string.T4_Story);
                mtop.setText(R.string.T4_Ans1);
                mBottom.setVisibility(View.INVISIBLE);
            }
                else if(mindex==3){
                mStoryTextView.setText(s1[mindex-2].getStoryID());
                mtop.setText(s1[mindex-2].getTop());
                mBottom.setVisibility(View.VISIBLE);
                mBottom.setText(s1[mindex-2].getBot());
                mindex=4;
            }
                else if(mindex==4){
                mindex=6;
                mStoryTextView.setText(R.string.T6_Story);
                mtop.setText(R.string.T6_Ans1);
                mBottom.setVisibility(View.INVISIBLE);
            }
                 else if(mindex==5){
                mStoryTextView.setText(R.string.T6_End);
                mtop.setVisibility(View.INVISIBLE);
                mBottom.setVisibility(View.INVISIBLE);

                }
                else if(mindex==6) {
                mStoryTextView.setText(R.string.T6_End);
                mtop.setVisibility(View.INVISIBLE);
                mBottom.setVisibility(View.INVISIBLE);


            }
            }
        });

        //On click listener for bottom button
        mBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mindex==1){
                    mStoryTextView.setText(R.string.T4_End);
                    mtop.setVisibility(View.INVISIBLE);
                    mBottom.setVisibility(View.INVISIBLE);
                }
                else if(mindex==4){

                    mStoryTextView.setText(s1[mindex-2].getStoryID());
                    mtop.setText(s1[mindex-2].getTop());
                    mBottom.setVisibility(View.VISIBLE);
                    mBottom.setText(s1[mindex-2].getBot());
                    mindex=5;

                }
                else if(mindex==5){
                    mStoryTextView.setText(R.string.T8_End);
                    mtop.setVisibility(View.INVISIBLE);
                    mBottom.setVisibility(View.INVISIBLE);
                }

            }
        });


    }


}

