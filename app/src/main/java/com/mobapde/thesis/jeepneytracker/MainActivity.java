package com.mobapde.thesis.jeepneytracker;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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


        final int duration = Toast.LENGTH_SHORT;

        unload_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Unload");
                try{
                    writeCSV("Unload");
                    Toast.makeText(ctx, "Unloading Passengers", duration).show();
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
                    Toast.makeText(ctx, "Jeepney Stopping", duration).show();
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
                    Toast.makeText(ctx, "Jeepnney is running", duration).show();
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
                    Toast.makeText(ctx, "Loading Passengers", duration).show();
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
                    Toast.makeText(ctx, "Waiting on Passengers", duration).show();
                } catch (IOException e) {

                }
            }
        });

        cll2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    System.out.println("Change Lane Left Swerve");
                    Toast.makeText(ctx, "Changed Lane Left Swerve", duration).show();
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
                    Toast.makeText(ctx, "Changed Lane Left Normal", duration).show();
                } catch (IOException e) {

                }
            }
        });

        clr2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    writeCSV("2LaneRight");
                    Toast.makeText(ctx, "Changed Lane Right Swerve", duration).show();
                } catch (IOException e) {
                }
            }
        });

        clr1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Change Lane Right Normal");
                try{
                    writeCSV("1LaneRight");
                    Toast.makeText(ctx, "Changed Lane Right Normal", duration).show();
                } catch (IOException e) {
                }
            }
        });
    }

    private void writeCSV(String event) throws IOException{
        CSVWriterTool.writeCSV(event, ctx);
    }
}
