package com.epam.creationalpatterns;

/**
 * Created by Alex on 3/5/2017.
 */
public class Main {

    public static void main(String[] args) {

        //Using singleton as main class for application that control application lifecycle
        Application app = Application.getInstance();
        app.start("prototype");
        app.start("factory_method");
        app.start("abstract_factory");
        app.start("builder");

        app.exit();
    }

}
