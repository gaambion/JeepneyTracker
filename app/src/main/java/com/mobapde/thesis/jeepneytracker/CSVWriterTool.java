package com.mobapde.thesis.jeepneytracker;

import android.content.Context;
import android.os.Environment;

import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

/**
 * Created by Brandon on 2/8/2018.
 */

public class CSVWriterTool {

    public CSVWriterTool(){

    }
    public static void writeCSV(String event, Context ctx) throws IOException{
        String outputFile = "output.csv";
        boolean alreadyExists = new File(outputFile).exists();

        File file = new File(android.os.Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS),"output.csv");
        if(!file.exists()){
            System.out.println("File already exists");
            file.getParentFile().mkdir();
        }

        try{
            Date d = new Date();

            String csv = android.os.Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)+"/output.csv";
            System.out.println(csv);
            CSVWriter writer = new CSVWriter(new FileWriter(file));

            String [] entry = {event, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(d)};
            writer.writeNext(entry);
            writer.close();
            System.out.println("Entry 0 " + entry[0]);
            System.out.println("Entry 1 " + entry[1]);
        } catch (IOException e){
            System.out.println("Error save");
            e.printStackTrace();
        }
    }
}
