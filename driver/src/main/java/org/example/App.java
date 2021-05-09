package org.example;

import org.example.Module;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Module module = new Module();

        System.out.println(module.sayHello("test message"));
    }
}
