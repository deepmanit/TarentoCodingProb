package com.tarentogroup.reader;

public class ReaderFactory {

    public static IReader getReader(String readerType)
    {
        if(readerType.equalsIgnoreCase("text")) {
            return new TextFileReader();
        } else
            return null;
    }
}
