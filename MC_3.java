/*

 Metacube  Assignment 03 

 Dear sir  

 this  is  just  the  for  functionality  check  i will  commit  all  the  changes  after  green  signal  from  your  side  

 Thank You

*/


import java.util.*;
import java.lang.*;
class MC_3 {


 public static int equals( String str1 , String str2 )
  {
     if(str1.length() != str2.length() )
        return 0;

     for( int i=0; i<str1.length(); i++ )
        { 
          if( str1.charAt(i) != str2.charAt(i) )
             return 0;
        }

    return 1;
  }



 public static String reverse( String str1 )
  {
     String str2 = "";

     for( int i=str1.length()-1; i>=0; i-- )
         str2 += String.valueOf(str1.charAt(i) );
        
    return str2;
  }


 public static String Upper_to_Lower( String str1 )
  {
      String str2 ="";

      for( int i=0; i<str1.length(); i++ )
         { 
           int temp = str1.charAt(i);

           if( temp >= 65 && temp <= 90 )
             {
               
                temp += 32;
                 
                
                str1 = str1.substring(0,i) + String.valueOf((char)temp) + str1.substring(i+1);
             }
         }

      return str1;
  }


 public static String Lower_to_Upper( String str1 )
  {
 
      String str2 ="";

      for( int i=0; i<str1.length(); i++ )
         { 
           int temp = str1.charAt(i);

           if( temp >= 97 && temp <= 122 )
             {
               temp -= 32;
               str1 = str1.substring(0,i) +  String.valueOf( (char)temp ) + str1.substring(i+1);
             }
         }

      return str1;
  }






 public static void main(String args[] )
  {
    Scanner s = new Scanner(System.in);
    Scanner s1 = new Scanner(System.in);
    String str1 = s.nextLine();
    String str2 = s1.nextLine();

   System.out.println(Upper_to_Lower(str1) );
   System.out.println(Lower_to_Upper(str2) );

  }
 }