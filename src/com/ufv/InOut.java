package com.ufv;

import java.io.*;

public class InOut {

    Persona persona = new Persona();

    Persona LecturaFichero(String archivo) throws IOException, FileNotFoundException {
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        int i = 0;
        while((cadena = b.readLine())!=null) {
            if (i==0) {
                persona.setNombre(cadena);
            } else if (i==1){
                persona.setApellidos(cadena);
            }            else if (i==2){
                persona.setEdad(Integer.parseInt(cadena));
            } else if (i== 3){
                persona.setEdad(Integer.parseInt(cadena));
            }
            System.out.println(cadena);
        }
        b.close();
        return persona;
    }

}
