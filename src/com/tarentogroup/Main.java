package com.tarentogroup;

import com.tarentogroup.reader.IReader;
import com.tarentogroup.reader.ReaderFactory;
import com.tarentogroup.service.DAGService;
import com.tarentogroup.string.StringMerger;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        DAGService<Integer> ser = new DAGService<>();
        //Here we can read from file
        ser.addLink(1, 2);
        ser.addLink(1, 3);
        ser.addLink(1, 4);
        ser.addLink(1, 5);
        ser.addLink(2, 6);
        ser.addLink(3, 6);
        ser.addLink(3, 7);
        ser.addLink(4, 7);
        ser.addLink(4, 8);
        ser.addLink(5, 8);
        ser.PrintAllPathFromSource(1);
        DAGService<String> serTest = new DAGService<>();
        IReader reader = ReaderFactory.getReader("text");
        System.out.println("***********Configurable solution******************");
        List<String> strLinkList = reader.readLink("sample.txt");
        strLinkList.forEach(str->{
            StringTokenizer st1 = new StringTokenizer(str, ",");
            String src = st1.nextToken();
            String dest = st1.nextToken();
            serTest.addLink(src.trim(),dest.trim());
        });
        serTest.PrintAllPathFromSource("1");
        System.out.println("******String Solution********");
        String str1 = "ADGJ";
        String str2 = "BEHK";
        String str3 = "CFIL";
        StringMerger merger = new StringMerger();
      System.out.println(merger.merge(str1,str2,str3));

        
        
        
        
        
        
        

    }
}
