package org.example;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {

        SerializableClass.savePerson(new PersonSer("John", 30));
        SerializableClass.savePerson(new Department("IT", "Software engineering", "USA"));



        SerializableClass.loadAndDestroy("org.example.PersonSer_8146364d-9f26-4535-b692-a801f22bdbe4");







    }
}