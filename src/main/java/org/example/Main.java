package org.example;

import org.apache.commons.lang3.RandomStringUtils;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Написать класс с двумя методами:
 * 1. принимает объекты, имплементирующие интерфейс serializable, и сохраняющие их в файл. Название файл - class.getName() + "_" + UUID.randomUUID().toString()
 * 2. принимает строку вида class.getName() + "_" + UUID.randomUUID().toString() и загружает объект из файла и удаляет этот файл.
 *
 * Что делать в ситуациях, когда файла нет или в нем лежит некорректные данные - подумать самостоятельно.
 */

public class Main {
    public static void main(String[] args) {


        SerializableClass.createDepartments(15).stream().forEach(SerializableClass::saveObject);

        SerializableClass.loadAndDestroy("org.example.PersonSer_8146364d-9f26-4535-b692-a801f22bdbe4");
        SerializableClass.loadAndDestroy("org.example.PersonSer_8146364d-9f26-4535-b692-a801f22bdbe4");
    }
}