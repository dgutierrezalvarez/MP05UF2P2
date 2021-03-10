package ex2;


import ex1.HashTable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class HashTableTest {

    @org.junit.jupiter.api.Test
    void count () {
        //instanciar el metodo
        ex1.HashTable hashTable = new ex1.HashTable();
        //esto sirve para añadir valores al count
        hashTable.put("1.2", "2.3");
        //sirve para reconocer si hay valores dentro del count
        Assertions.assertEquals(1, hashTable.count());
    }

    @org.junit.jupiter.api.Test
    void size() {
        ex1.HashTable hashTable = new ex1.HashTable();
        Assertions.assertEquals(16, hashTable.size());
    }


    @ParameterizedTest
    @CsvSource({"key, value"})
     void put (String key, String  value){
        ex1.HashTable hashTable = new ex1.HashTable();
        hashTable.put(key,value);
        //el get se Utiliza la key para buscar el value
        Assertions.assertEquals(value, hashTable.get(key));


    }
    @ParameterizedTest
    @CsvSource({"key, value"})
    void get(String key, String  value) {
        ex1.HashTable hashTable = new ex1.HashTable();
        hashTable.put(key,value);
        Assertions.assertEquals(value, hashTable.get(key));
    }

    @ParameterizedTest
    @CsvSource({"5"})
    void drop( String  key) {
        ex1.HashTable hashTable = new HashTable();
        hashTable.put(key,"1.2");
        hashTable.drop(key);
        Assertions.assertEquals(null, hashTable.get(key));
    }






}
