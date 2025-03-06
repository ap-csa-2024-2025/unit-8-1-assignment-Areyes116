import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Example 2D array for sumOfDiag method
    int[][] matrix = {
      {8, 7, 5, 8},
      {1, 3, 9, 5},
      {3, 4, 6, 2}
    };

    // Calling sumOfDiag method and printing the result
    System.out.println("Sum of diagonal: " + sumOfDiag(matrix));

    // Example call to productTable method
    int[][] multiplicationTable = productTable(6, 5);

    // Printing the multiplication table
    for (int[] row : multiplicationTable)
    {
      for (int elem : row)
      {
        System.out.print(elem + " ");
      }
      System.out.println();
    }
  }

  // Problem 1: sumOfDiag method to calculate the sum of the lead diagonal
  public static int sumOfDiag(int[][] matrix)
  {
    int sum = 0;
    // Loop through the matrix to sum diagonal elements
    for (int i = 0; i < matrix.length; i++)
    {
      // Ensuring we don't go beyond the bounds of the array
      if (i < matrix[i].length)
      {
        sum += matrix[i][i];
      }
    }
    return sum;
  }

  // Problem 2: productTable method to generate multiplication table
  public static int[][] productTable(final int numRows, final int numCols)
  {
    int[][] table = new int[numRows][numCols];

    for (int i = 0; i < numRows; i++)
    {
      for (int j = 0; j < numCols; j++)
      {
        table[i][j] = i * j;
      }
    }

    return table;
  }
}