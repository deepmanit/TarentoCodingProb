package com.tarentogroup.string;

public class StringMerger {
    private StringBuilder resultString = new StringBuilder();
    public String merge(String first, String second, String third)
    {
        int length = first.length();
        if(length != second.length()  || length != third.length())
        {
            throw new IllegalArgumentException("String is not of same length");
        }
        mergeRecursive(0,first,second,third);
        return resultString.toString();

    }
    private void mergeRecursive(int start, String first, String second, String third)
    {
        if(start == first.length())
            return;
        resultString.append(first.charAt(start));
        resultString.append(second.charAt(start));
        resultString.append(third.charAt(start));
        mergeRecursive(start+1, first,second,third);

    }
}
