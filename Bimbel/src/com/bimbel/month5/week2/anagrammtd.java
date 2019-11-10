package com.bimbel.month5.week2;
import java.util.Arrays;
public class anagrammtd {
	public static void isAnagram(String str1, String str2) 
    { 
		int len, len1, len2, i, j, found, not_found;
		found=0;
		not_found=0;
		len1 = str1.length();
        len2 = str2.length();
		
        if(len1 == len2)
        {
            len = len1;
            for(i=0; i<len; i++)
            {
                found = 0;
                for(j=0; j<len; j++)
                {
                    if(str1.charAt(i) == str2.charAt(j))
                    {
                        found = 1;
                        break;
                    }
                }
                if(found == 0)
                {
                    not_found = 1;
                    break;
                }
            }
            if(not_found == 1)
            {
                System.out.print("Strings are not Anagram to Each Other..!!");
            }
            else
            {
                System.out.print("Strings are Anagram");
            }
        }
        else
        {
            System.out.print("Both Strings Must have the same number of Character to be an Anagram");
        }
    } 

}
