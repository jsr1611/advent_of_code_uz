/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2023/02/05 11:50
 */

import Utils.CommonUtils;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Day_template {
    CommonUtils commonUtils;
    // Declaring a string variable
    String lineStr;
    int result;

    public Day_template() throws FileNotFoundException {
        String filePath = ""; // add here folderName\\input.txt
        commonUtils = new CommonUtils("", "", filePath);
    }

    public int problem01() throws IOException {
        result = 0;

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
