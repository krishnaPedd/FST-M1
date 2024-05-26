package activities;

import org.apache.commons.io.FileUtils;

import java.io.*;

public class Activity14 {
    public static void main(String args[]) throws IOException {
        try {
            File file = new File("../newfile.txt");
            System.out.println("file path :" + file.getAbsolutePath());
            boolean fStatus = file.createNewFile();
            if (fStatus)
                System.out.println("file created successfully");
            else
                System.out.println("file already exist at this path");
            FileUtils.writeStringToFile(file, "hello i am krishna", "UTF8");
            File fileUtil = FileUtils.getFile("../newfile.txt");
            System.out.println("Data in file :" + FileUtils.readFileToString(fileUtil, "UTF8"));
            File destDir = new File("Resources");
            FileUtils.copyFileToDirectory(file, destDir);
            File newFile = FileUtils.getFile(destDir, "newfile.txt");
            FileUtils.writeStringToFile(newFile, "hello i am krishna verifying files", "UTF8");
            String newFiledata = FileUtils.readFileToString(newFile, "UTF8");
            System.out.println("data in new File is :" + newFiledata);
        }
     catch(IOException ie)
        {
            System.out.println(ie.getMessage());
        }

    }

}
