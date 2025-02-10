import java.util.Arrays;

public class IntroTo2DArrays{
  public static void main(String[] args){
    int[][] ray = new int[2][3];

    ray[0][0] = 1;
    ray[0][1] = 2;
    ray[0][2] = 3;
    ray[1][0] = 4;
    ray[1][1] = 5;
    ray[1][2] = 6;

    System.out.println(Arrays.toString(ray));

    System.out.println(Arrays.toString(ray[0]));
    System.out.println(Arrays.toString(ray[1]));

    for (int row=0; row<ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }
    for (int row=0; row<ray.length; row++)
    {   
      for (int column=0; column<ray[row].length; column++)
      {
        ray[row][column]=7;
      }
    }
    for (int row=0; row<ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }
    for(int row=0; row<ray.length; row++)
     for(int col = 0;col<ray[row].length; col++)
     ray[row][col] = (int)(Math.random()*11 +0);
     for (int row=0; row<ray.length; row++)
     {
       System.out.println(Arrays.toString(ray[row]));
     }
     
   
     for(int row=0; row<ray.length; row++)
    {
      int count = 0;
     for(int col = 0;col<ray[row].length; col++)
     {
    
      count += ray[row][col];
      
        
     }
     System.out.println("The sum of row " + row + " is: " + count);
    }
    
    System.out.println("\n\n\nHomework assignment");
    //Add up the columns of each row using for each loops
    int count = 0;
    for(int[] row: ray)
    { 
      for(int col: row)
      {
      count += count + ray[row][col];
      }
      System.out.println("The sum of row " + row + " is: " + count);
    }
     
}
}
