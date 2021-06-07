package com.coderbd.arrayList;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerilizedDeserilized {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("Hafij");
        arrayList.add("Faruk");
        arrayList.add("Kabir");

        try
        {
            //Serialization
            FileOutputStream fos=new FileOutputStream("file");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(arrayList);
            fos.close();
            oos.close();
            //Deserialization
            FileInputStream fis=new FileInputStream("file");
            ObjectInputStream ois=new ObjectInputStream(fis);
            ArrayList  list=(ArrayList)ois.readObject();
            System.out.println(list);
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }

}
