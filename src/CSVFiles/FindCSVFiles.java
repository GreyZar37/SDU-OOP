package CSVFiles;

import java.io.File;

public class FindCSVFiles {

    public static void main(String[] args) {
        String folderPath = "C:\\Users\\olegs\\Documents\\SDU-OOP\\src\\CSVFilesForTest";
        File folder = new File(folderPath);

        if (folder.exists() && folder.isDirectory()) {
            findCSVFiles(folder); // Call the function to find CSV files in the folder and its subfolders
        } else {
            System.out.println("The folder does not exist or is not a directory.");
        }
    }

    private static void findCSVFiles(File folder) {
        File[] files = folder.listFiles(); // Get a list of files and directories in the current folder

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    // If it's a subfolder, call the function recursively to search within it
                    findCSVFiles(file);
                } else {
                    // If it's a file, check if it's a CSV file
                    if (file.getName().endsWith(".csv")) {
                        System.out.println("Path to CSV file: " + file.getAbsolutePath());
                    }
                }
            }
        }
        else if(folder.listFiles() == null){
            System.out.println("The folder is empty.");
        }
    }
}
