package Case_Study.Util;

import Case_Study.Model.House;
import Case_Study.Model.Room;
import Case_Study.Model.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadFile {

    public static void writeFile(String filePath, String data) {
        try {
            FileWriter fr = new FileWriter(filePath, true);
            BufferedWriter bf = new BufferedWriter(fr);
            bf.write(data);
            bf.newLine();
            bf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> readFile(String filePath) {
        List<String> strings = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String string = "";
            while ((string = bufferedReader.readLine()) != null) {
                strings.add(string);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strings;
    }

    public static void clearFile(String filePath) {
        try {
            FileWriter fileWriter = new FileWriter(filePath, false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<Room> roomList = new ArrayList<>();
        List<House> housesList = new ArrayList<>();
        List<Villa> villaList = new ArrayList<>();

        housesList.add(new House("Thue nha", 200, 2000, 20, "theo tháng", "sạch sẽ thoáng mát", 5, 1));
        roomList.add(new Room("thue phong", 60, 500, 7, "theo tuan", "tam ho boi", 2));
        villaList.add(new Villa("thue villa", 500, 5000, 30, "theo ngày ", "siêu rộng", 100, 4, 3));

        writeFile("src/Case_Study/Data/Facility.txt","d");
    }

}
