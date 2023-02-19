/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2023/01/19 18:14
 */

package Utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CommonUtils {
    private BufferedReader bufferedReader;
    private String filePath;

    public CommonUtils(String userName, String day, String fileName) {
        try {
            if (userName.equals("myself") || "".equals(userName))
                userName = "Jumanazar";
            if( fileName == null || fileName.isEmpty() || fileName.length() > 20)
                fileName = "input.txt";
            filePath = "C:\\Users\\jimmy\\IdeaProjects\\advent_of_code_uz\\2022\\Java\\"+userName+"\\"+day+"\\"+fileName;
            File file = new File(filePath);
            this.bufferedReader = new BufferedReader(new FileReader(file));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public BufferedReader getBufferedReader() {
        return bufferedReader;
    }

    public static List<List<Integer>> getListNumbers(String path) throws IOException {
        List<Integer> numberList = null;
        List<List<Integer>> result = new ArrayList<>();
        File file = new File(
                "C:\\Users\\jimmy\\IdeaProjects\\advent_of_code_uz\\2022\\Java\\Jumanazar\\day04\\input.txt");

        // Creating an object of BufferedReader class
        BufferedReader br
                = new BufferedReader(new FileReader(file));

        // Declaring a string variable
        String lineStr;
        String[] numberRange;
        String[] numbers;

        // Condition holds true till
        // there is character in a string
        while ((lineStr = br.readLine()) != null){
            numberRange = lineStr.split(",");
            numberList = new ArrayList<>();
            for (String range : numberRange) {
                numbers = range.split("-");
                for (String number : numbers) {
                    numberList.add(Integer.parseInt(number));
                }
            }
            result.add(numberList);
        }

        return result;
    }
}
