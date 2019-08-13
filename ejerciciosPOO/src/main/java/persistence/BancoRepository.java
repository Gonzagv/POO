package persistence;

import com.google.gson.Gson;
import modelo.Banco;

import java.io.*;
import java.util.ArrayList;

public class BancoRepository extends Banco {
    private static final String filepath="/persistence/datos.json";

    public void writeObjectToFile(ArrayList<String> datos) {
        try {
            FileOutputStream fileOut = new FileOutputStream(filepath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(datos);
            objectOut.close();
            System.out.println("The Object  was succesfully written to a file");
        }catch (Exception ex){

        }
    }

    public void readObjectFromFile() throws IOException {
        FileInputStream fileIn = new FileInputStream(filepath);
        ObjectInputStream objectIn = new ObjectInputStream(fileIn);
        try {
            objectIn.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

 public Object readFile()throws FileNotFoundException {
     final String dir = System.getProperty("user.dir");
     String path = "resources/banco.json";
     BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
     Gson gson = new Gson();
     Object banco = gson.fromJson(bufferedReader, Object.class);
     return banco;
 }
}
