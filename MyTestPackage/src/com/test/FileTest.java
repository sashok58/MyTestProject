package com.test;

import java.io.*;

/**
 * Created by Z on 5/30/2016.
 */
public class FileTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*File path = new File("c://install/");
        String [] filename = path.list();
        for (String s : filename) {
            File file = new File("C://install/" + s.toString());
            System.out.println(file.getName());
            System.out.println(file.canRead());
            System.out.println(file.canWrite());

        }*/

        /*BufferedReader in = new BufferedReader(new FileReader("c://install/AmigosViewer.ini"));
        String s;
        StringBuilder sb = new StringBuilder();
        while((s=in.readLine())!=null){
            sb.append(s+'\n');

        }
in.close();*/
       // System.out.println(sb);
/*DataInputStream inn = new DataInputStream(new BufferedInputStream(new FileInputStream("c://install/AmigosViewer.ini")));
    while (inn.available()!=0){
        System.out.println((char)inn.readByte());
    }*/
        /*System.out.println(System.getProperty("file.encoding"));*/
        /*SerializableSample p1 = new SerializableSample("Alex",25,"M");
        System.out.println(p1);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("c://install/seriazable.txt"));
        out.writeObject(p1);
        out.close();*/
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("c://install/seriazable.txt"));
        SerializableSample p2 = (SerializableSample)in.readObject();
        System.out.println(p2);
}
}
