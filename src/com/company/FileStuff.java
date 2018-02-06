package com.company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by max on 2/5/18.
 */
public class FileStuff {

    File file;

    public FileStuff(String filename) throws IOException {
        // super(); not needed/not extending
        this.file = new File(filename);
        this.file.createNewFile();
    }

    /**
     * ^
     * /|\
     * /|\
     * |
     */
    public void writeTree() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(this.file.getName()));
        writer.write(" ^ \n");
        writer.write("/|\\\n");
        writer.write("/|\\\n");
        writer.write(" | \n");
        writer.flush();
    }

}
