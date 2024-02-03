package ne222hz_assign3.Exercise2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PrintJavaMain {

	static void recursivePrint(File[] arr, int index, int level) {
		if (index == arr.length)
			return;

		for (int i = 0; i < level; i++)
			System.out.print("\t");

		if (arr[index].isFile()) {
			if (isValidateFileName(arr[index].getName())) {
				int count = countLineNumber(arr[index]);
				System.out.println("FileName: [" + arr[index].getName() + "] - LineNumber: [" + count + "]");
			}
		} else if (arr[index].isDirectory()) {
			System.out.println("[" + arr[index].getName() + "]");
			recursivePrint(arr[index].listFiles(), 0, level + 1);
			System.out.println();
		}
		recursivePrint(arr, ++index, level);
	}

	public static void main(String[] args) {
		// add your directory pass here
		String dirPath = "C:\\Users\\noori\\OneDrive\\Skrivbord\\Hangman\\src\\hangman";
		File directory = new File(dirPath);
		if (directory.exists() && directory.isDirectory()) {
			printAllJavaFiles(new File(dirPath));
		} else {
			System.out.println("directory dose not exist");
		}

	}

	public static void printAllJavaFiles(File directory) {
		File arr[] = directory.listFiles();
		System.out.println("Files from main directory : " + directory);
		recursivePrint(arr, 0, 0);

	}

	private static int countLineNumber(File file) {
		int count = 0;
		try {
			FileInputStream fileInputStream = new FileInputStream(file);
			byte[] byteArray = new byte[(int) file.length()];
			fileInputStream.read(byteArray);
			String data = new String(byteArray);
			String[] stringArray = data.split("\r\n");
			count = stringArray.length;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return count;
		
	}

	private static boolean isValidateFileName(String fileName) {
		return fileName.endsWith(".java");
	}
}
