package com.lf.util;

import java.io.InputStream;
import java.util.Scanner;

public class FileUtil {

    public static Scanner getScanner(String filePath) {
        InputStream inputStream = FileUtil.class.getClassLoader().getResourceAsStream(filePath);
        return new Scanner(inputStream);
    }
}
