package com.campusdual.classroom;

import com.campusdual.util.Utils;

import java.io.*;

public class Exercise32 {

    public static void main(String[] args) {
        String textoParaGardar = generateStringToSave(null);

        printToFile(textoParaGardar);


    }

    public static String generateStringToSave(String string) {

        if (string == null) {
            return generateUserInputToSave();
        } else {
            return string;
        }
    }

    private static String generateUserInputToSave() {

        StringBuilder sb = new StringBuilder();
        System.out.println("Escribe debajo el texto que quieras. Pulsa \"ENTER\" 2 veces seguidas para finalizar:");
        String string;

        while (!(string = Utils.string()).isEmpty()) {
            sb.append(string).append(System.lineSeparator());
        }
        return sb.toString();
    }

    public static void printToFile(String string) {


        try (BufferedWriter bw = new BufferedWriter(new PrintWriter("src/main/resources/data.txt"))) {
            bw.write(string);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
