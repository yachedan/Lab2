package com.company;

public class Main {

    public static void main(String[] args) {
	String entry = "Аргентина манит негра.";
	entry = entry.toLowerCase();
	entry = entry.replaceAll("\\s+","");
	entry = entry.replaceAll("\\p{Punct}","");
	int entryLen = entry.length();
	String entryReversed = "";
	for (int i = entryLen-1; i >= 0; i--)
        {
            entryReversed += entry.charAt(i);
        }
	if (entry.equals(entryReversed))
        System.out.println(entryReversed + " is a palindrome");
	else
        System.out.println(entryReversed + " is NOT a palindrome");
    }
}
