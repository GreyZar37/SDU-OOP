package CSVFiles;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Matrix {
   public static double data[][];

   public Matrix(int rows, int cols){
      data = new double[rows][cols];
   }

   public double GetElement(int row, int col) {
       return data[row][col];
   }
   public void SetElement(int row, int col, double value) {
       data[row][col] = value;
   }
   public static void SaveData(String fileName, double[][] data ) throws IOException {
       File file = new File(fileName +".txt");
       if(file.createNewFile()){
           System.out.println("File created: " + file.getName() + "\n" + "Path: " + file.getAbsolutePath());
       }
         else{
              System.out.println("File already exists.");
         }

       PrintWriter pw = new PrintWriter(file);
         for(int i = 0; i < data.length; i++){
              for(int j = 0; j < data[i].length; j++){
                pw.print(data[i][j] + " ");
              }
              pw.println();
         }
            pw.close();

   }

    public static void main(String[] args) throws IOException {
        Matrix m1 = new Matrix(2,2);
        m1.SetElement(0,0,1);
        m1.SetElement(0,1,2);
        m1.SetElement(1,0,3);
        System.out.println(m1.GetElement(1,0)) ;
        SaveData("test", m1.data);
    }

}


