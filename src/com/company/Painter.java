package com.company;
import java.util.Scanner;

public class Painter {

        public static void main(String[] args) throws Exception
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the type: ");
            String type= input.nextLine();

            switch (type)
            {
                case "Circle":
                  System.out.println("a circle drawn");
                    break;
                case "Square":
                   System.out.println("a square drawn");
                    break;
                case "Rectangle":
                    System.out.println("a rectangle drawn");
                    break;
                default:
                    System.out.println( "Shape type : "+type+" cannot be instantiated");

            }
        }
    }