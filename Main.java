package com.company;
public class Main {
  public static int countVariants(int stearsCount){
      //base cases
      if(stearsCount==0){ return 1;}
      if(stearsCount==1){ return 1;}
      //recursion
     return countVariants(stearsCount-1) +countVariants(stearsCount-2);
  }
    public static void main(String[] args){
         //note we have a fibonacci sequence
        System.out.println(countVariants(3));
        System.out.println(countVariants(4));
        System.out.println(countVariants(5));
        System.out.println(countVariants(6));


     }
 }
