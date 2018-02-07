package com.mobapde.thesis.jeepneytracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button stop_btn;
    Button go_btn;
    Button load_btn;
    Button unload_btn;
    Button wait_btn;
    Button cll2_btn; // cll = Change lane left
    Button cll1_btn;
    Button clr2_btn; // clr = Change lane right
    Button clr1_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stop_btn = (Button) findViewById(R.id.stop_btn);
        go_btn = (Button) findViewById(R.id.go_btn);
        load_btn = (Button) findViewById(R.id.load_btn);
        unload_btn = (Button) findViewById(R.id.unload_btn);
        wait_btn = (Button) findViewById(R.id.wait_btn);
        cll2_btn = (Button) findViewById(R.id.cll2_btn);
        cll1_btn = (Button) findViewById(R.id.cll1_btn);
        clr2_btn = (Button) findViewById(R.id.clr2_btn);
        clr1_btn = (Button) findViewById(R.id.clr1_btn);

        unload_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Unload");
            }
        });

        stop_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Stop");
            }
        });

        go_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Go");
            }
        });

        load_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Load");
            }
        });

        wait_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Wait");
            }
        });

        cll2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Change Lane Left Swerve");
            }
        });

        cll1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Change Lane Left Normal");
            }
        });

        clr2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Change Lane Right Swerve");
            }
        });

        clr1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Change LAne Right Normal");
            }
        });
    }
}
