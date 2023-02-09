/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2023/02/05 11:50
 */

package Utils;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Day_template {
    CommonUtils commonUtils;
    // Declaring a string variable
    String lineStr;
    int result;

    public Day_template() throws FileNotFoundException {
        String filePath = "";
        commonUtils = new CommonUtils(filePath);
    }

    public int problem01() throws IOException {
        result = 0;
        // Condition holds true till
        // there is character in a string

        // Q: In how many assignment pairs does one range fully contain the other?
        // to fully contain the other range of numbers, two conditions should hold true:
        // 1st: starting section number (of 1st Elf) should be smaller or equal to the 2nd Elf's starting section AND ending section number (of the 1st Elf) should be greater or equal to the ending section number of the 2nd Elf. Ex: 3-96, 25-96
        // 2nd: starting section number (of 2nd Elf) should be smaller or equal to the 1st Elf's starting section AND ending section number (of the 2nd Elf) should be greater or equal to the ending section number of the 1st Elf. Ex: 25-96, 3-96

        while ((lineStr = commonUtils.getBufferedReader().readLine()) != null) {

        }
        return result;
    }

    public int problem02() throws IOException {
        result = 0;
        while ((lineStr = commonUtils.getBufferedReader().readLine()) != null) {

        }
        return result;
    }
}
