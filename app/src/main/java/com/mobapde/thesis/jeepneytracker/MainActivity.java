package com.mobapde.thesis.jeepneytracker;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;

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
    CSVWriterTool csvWriterTool = new CSVWriterTool();
    String path;

    Context ctx;
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
        path  = getApplicationContext().getFilesDir().getPath();
        ctx = getApplicationContext();

        unload_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Unload");
                try{
                    writeCSV("Unload");
                } catch (IOException e) {

                }
            }
        });

        stop_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Stop");
                try{
                    writeCSV("Stop");
                } catch (IOException e) {

                }
            }
        });

        go_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Go");
                try{
                    writeCSV("Go");
                } catch (IOException e) {

                }
            }
        });

        load_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Load");
                try{
                    writeCSV("Load");
                } catch (IOException e) {

                }
            }
        });

        wait_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Wait");
                try{
                    writeCSV("Wait");
                } catch (IOException e) {

                }
            }
        });

        cll2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    System.out.println("Change Lane Left Swerve");

                    writeCSV("2LaneLeft");
                } catch (IOException e) {

                }

            }
        });

        cll1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Change Lane Left Normal");
                try{
                    writeCSV("1LaneLeft");
                } catch (IOException e) {

                }
            }
        });

        clr2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    writeCSV("2LaneRight");
                } catch (IOException e) {
                }
            }
        });

        clr1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Change LAne Right Normal");
                try{
                    writeCSV("1LaneRight");
                } catch (IOException e) {
                }
            }
        });
    }

    private void writeCSV(String event) throws IOException{
        CSVWriterTool.writeCSV(event, ctx);
    }
}
