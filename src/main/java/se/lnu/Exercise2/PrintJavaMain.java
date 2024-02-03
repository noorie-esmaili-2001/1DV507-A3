package se.lnu.Exercise2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;

public class PrintJavaMain {

    public static void main(String[] args) {
        File directory = new File("src/main/resources/Ferry");


        if (directory.exists() && directory.isDirectory()) {
            printAllJavaFiles(directory);
        } else {
            System.out.println("Directory does not exist");
        }
    }

    public static void printAllJavaFiles(File directory) {
        File[] files = directory.listFiles();

        if (files != null) {
            System.out.println("Files from main directory: " + directory);
            recursivePrint(files, 0, 0);
        }
    }

    private static void recursivePrint(File[] arr, int index, int level) {
        if (index == arr.length) {
            return;
        }

        for (int i = 0; i < level; i++) {
            System.out.print("\t");
        }

        if (arr[index].isFile() && isJavaFile(arr[index])) {
            int count = countLineNumber(arr[index]);
            System.out.println("FileName: [" + arr[index].getName() + "] - LineNumber: [" + count + "]");
        } else if (arr[index].isDirectory()) {
            System.out.println("[" + arr[index].getName() + "]");
            recursivePrint(Objects.requireNonNull(arr[index].listFiles()), 0, level + 1);
            System.out.println();
        }

        recursivePrint(arr, ++index, level);
    }

    private static int countLineNumber(File file) {
        int count = 0;

        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            byte[] byteArray = new byte[(int) file.length()];
            int bytesRead = fileInputStream.read(byteArray);

            if (bytesRead != -1) {
                String data = new String(byteArray, 0, bytesRead);
                String[] stringArray = data.split("\r\n");
                count = stringArray.length;
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return count;
    }


    private static boolean isJavaFile(File file) {
        return file.getName().endsWith(".java");
    }
}
