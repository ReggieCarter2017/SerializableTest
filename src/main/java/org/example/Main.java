package org.example;
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
