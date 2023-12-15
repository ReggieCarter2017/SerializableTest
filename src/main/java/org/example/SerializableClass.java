package org.example;

import org.apache.commons.lang3.RandomStringUtils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SerializableClass {
    public static void saveObject(Object object) {
        if (Serializable.class.isAssignableFrom(object.getClass())) {
            Path path = Path.of(object.getClass().getName() + "_" + UUID.randomUUID().toString());
            try {
                OutputStream outputStream = Files.newOutputStream(path);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
                objectOutputStream.writeObject(object);
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(object.getClass().getName() + ": этот класс невозможно сериализовать.");
        }
    }

    public static void loadAndDestroy(String string) {
        try {
            Path path = Path.of(string);
            ObjectInputStream objectInputStream = new ObjectInputStream(Files.newInputStream(path));
            Object object = objectInputStream.readObject();
            System.out.println(object);
            Files.delete(path);
            objectInputStream.close();
        } catch (NoSuchFileException | ClassNotFoundException e) {
            System.out.println("Нет файла с названием -> " + string);;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Department> createDepartments(int count) {
        String randomString = RandomStringUtils.randomAlphabetic(10);
        List<Department> departments = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            departments.add(new Department(randomString, randomString, randomString));
        }
        return departments;
    }
}
