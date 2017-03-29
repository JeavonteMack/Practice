
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeavonte Staley
 */
public class GTest 
{
        static String introPrompt = "What is your name?:" + "";
        static String outputPrompt = "Your name is:"+" ";
    
    public static void main(String[] args) 
    {
        Scanner userInput = new Scanner(System.in);
        String name;
        
        System.out.print(introPrompt +"");
        name = userInput.nextLine();
        
        System.out.println(outputPrompt + name);
    }
    
}

