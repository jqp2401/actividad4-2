package ar.charlycimino.ejemplos.elfinally;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class VisorDeTXTs {
    public void mostrarTxt(String ruta) {
        File elArchivo = new File(ruta);

        try (BufferedReader br = new BufferedReader(new FileReader(elArchivo))) {
            System.out.println(br.readLine());
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error de E/S: " + e.getMessage());
            throw new RuntimeException("Error inesperado en el catch", e);
        }
    }
}