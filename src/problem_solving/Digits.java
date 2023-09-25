/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem_solving;

import java.util.Scanner;

/**
 *
 * @author PcDoctor
 */
public class Digits {
      public void digits(){
      Scanner s=new Scanner(System.in);
      System.out.println("please enter the number");
      int size=s.nextInt();
      for(int i=0;i<size;i++){
      int value=s.nextInt();
      if(value==0){
          System.out.println("0");
          continue;
      }
      while(value!=0){
          int mynum = value % 10;
          System.out.print(mynum+" ");
          value=value/10;
          
      }
       System.out.println();
          
      }
      
      }
}
