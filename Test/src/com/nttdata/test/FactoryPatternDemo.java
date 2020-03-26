package com.nttdata.test;

import java.util.Scanner;

public class FactoryPatternDemo {

	   public static void main(String[] args) {
	      ShapeFactory shapeFactory = new ShapeFactory();
	      int a;
	      Scanner sc= new Scanner(System.in);
	      do{
	      System.out.println("\nEnter Your Choice\nPress 1.Circle\n      2.Rectangle\n      3.Square\n      4.Exit");
	       a=sc.nextInt();
	     
	      if(a==1){
	      Shape shape1 = shapeFactory.getShape("CIRCLE");
	      shape1.draw();
	      }
	      else if(a==2){
	      Shape shape2 = shapeFactory.getShape("RECTANGLE");
	      shape2.draw();
	      }
	      else if(a==3){
	      Shape shape3 = shapeFactory.getShape("SQUARE");
	      shape3.draw();
	      }
	      }while(a!=4);
	     
	}
}