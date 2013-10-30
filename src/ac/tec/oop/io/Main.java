package ac.tec.oop.io;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("/home/diegomunguia/prueba.txt");

            byte[] buffer = new byte[128];
            int numeroBytesLeidos;
            while ((numeroBytesLeidos = inputStream.read(buffer)) > 0) {
                for (byte b : buffer) {
                    System.out.print(b + ' ');
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error inesperado");
            e.printStackTrace();
        }

        try {
            String linea;
            BufferedReader reader = new BufferedReader(
                    new FileReader("/home/diegomunguia/prueba.txt"));
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error inesperado");
            e.printStackTrace();
        }


    }
}

















