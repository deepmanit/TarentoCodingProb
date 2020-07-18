package com.tarentogroup.reader;

import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class TextFileReader implements IReader{

    @Override
    public List<String> readLink(String fileName) {
        FileReader fr = null;
        BufferedReader br = null;
        List<String> linkList = new ArrayList<>();
        String currLine = null;
        try {
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);
            while ((currLine = br.readLine()) != null) {
                linkList.add(currLine);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            return linkList;
        } finally {
            try {
                fr.close();
                br.close();
                return linkList;
            } catch (Exception ex) {
                ex.printStackTrace();
                return linkList;
            }

        }
    }
}
