package org.example;

import java.util.ResourceBundle;

public class Module {

    String sayHello(String s) {

        ResourceBundle rb = ResourceBundle.getBundle("rest");

        return "Message is \"" + s + "\". Module name is " + rb.getString("module") + ".";
    }

}
