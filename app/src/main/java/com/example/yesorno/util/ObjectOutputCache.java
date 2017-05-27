package com.example.yesorno.util;

import android.content.Context;

import com.example.yesorno.model.Brainteaser;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectOutputCache {

    private Context context;
    private String fileName;

    public ObjectOutputCache(String fileName, Context context) {
        this.context = context;
        this.fileName = fileName;
    }

    public void cacheWriter(ArrayList<Brainteaser> list) {

        File cacheFile = new File(context.getCacheDir(), fileName);
        ObjectOutputStream writer;
        try {
            writer = new ObjectOutputStream(new FileOutputStream(cacheFile));
            writer.writeObject(list);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
