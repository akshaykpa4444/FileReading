package fileReading;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileMerging {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		try {

			BufferedReader readingInfo1 = new BufferedReader(
					new FileReader("E:\\Data\\Trainee4\\workspace/StudentInfo.csv"));
			BufferedReader readingInfo2 = new BufferedReader(
					new FileReader("E:\\Data\\Trainee4\\workspace/StudentMarksInfo2.csv"));

			List<String> studentlist = new ArrayList<String>();// creating a list to store the data

			String studentInfo = null;
			while ((studentInfo = readingInfo1.readLine()) != null) { // reading the student info file values
				studentlist.add(studentInfo); // adding the readed info to studentlist array
			}

			String marksInfo = null;
			while ((marksInfo = readingInfo2.readLine()) != null) { // reading the Student marks file values

				String[] studentData = marksInfo.split(","); // creating a string obj to store the readed marksinfo

				for (int i = 0; i < studentlist.size(); i++) { // looping inside the studentlist

					String[] marksData = studentlist.get(i).split(","); // creating another string obj to store the
																		// studentlist data to iterate

					if (marksData[0].contains(studentData[0])) { // if the data in the studentlist contains the
																	// marksinfo it will be printed
						System.out.println(studentlist.get(i) + "," + marksInfo);
					}
				}
			}

		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println("File Merging Successful");
	}
}
