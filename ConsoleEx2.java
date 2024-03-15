package org.javalearn;


import java.io.Console;

public class ConsoleEx2{

public static void main(String[] args){

Console console = System.console();

int name = Integer.parseInt(console.readLine());


System.out.println(name);




}


}