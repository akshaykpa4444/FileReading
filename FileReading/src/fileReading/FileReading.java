package fileReading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args) {
		File file = new File("E:\\Data\\Trainee4\\workspace/StudentInfo.csv");
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(file); // the file is passing inside file reader command to read the file
			br = new BufferedReader(fr);// the readed file is passing inside the buffered reader
			String str = null;

			// checking whether the file has a data or not line by line
			while ((str = br.readLine()) != null) {
				System.out.println(str); // print the values inside the file if data exists
			}
		} catch (IOException e) {

			e.printStackTrace();
		} finally {

			try {
				br.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

		System.out.println("Execution is successful");
	}

}
