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
public class Factorial {
    
    public void factorial(){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number ");
        int num=s.nextInt();
        int result=1;
        for(int i=1;i<=num;i++){
        result=result*i;
        }
        System.out.println("factorial is "+ result);
        
    
    }
    
}
