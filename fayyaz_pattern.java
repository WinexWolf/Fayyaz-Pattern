import java.util.*;
public class fayyaz_pattern
{
    public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("How many times would like the pattern to repeat?");
    int n=sc.nextInt();
    int repno=2*n;
    System.out.println("Enter  a number for the size of the pattern ");
    int a = sc.nextInt();  
    for(int rep=0;rep<repno;rep++)
    {//part1  
    for(int i=0;i<a+1;i++){
           for(int m=0;m<i;m++){
             System.out.print(" ");  
            }
        for(int j=a+1;j>i;j--){
            System.out.print(" ");
            if (rep%2==0)
            System.out.print("|");  
            else
            System.out.print("-"); 
             
       
        }
      for(int k=0;k<i+1;k++){
                System.out.print(" ");
                System.out.print("+");
             
        }
        for(int l=a+1;l>i;l--){
              System.out.print(" ");
              if(rep%2==0)
              System.out.print("|");  
             else
             System.out.print("-");
               
        }
         System.out.println();
        }
        //line with +
        for(int t=0;t<a+1;t++)
        {
         System.out.print(" ");
        }
         
         for(int p=0;p<=a+1;p++){
          System.out.print(" +");}
           System.out.println();
        //part2
         for(int i=0;i<a+1;i++){
           for(int m=a+1;m>i+1;m--){
             System.out.print(" ");  
            }
        for(int j=0;j<i+1;j++){
            System.out.print(" ");
            if(rep%2==0)
            System.out.print("-");
            else
            System.out.print("|");
             
       
        }
      for(int k=a+1;k>i;k--){
                System.out.print(" ");
                System.out.print("+");
             
        }
        for(int l=0;l<i+1;l++){
              System.out.print(" ");
             if(rep%2==0)
            System.out.print("-");
            else
            System.out.print("|");  
        }
         System.out.println();
        }
        //line with -
        for(int q=0; q<=2*(a+1)+1;q++)
        {
        if(rep%2==0)
            System.out.print("- ");
            else
            System.out.print("| ");
    }
    System.out.println(); 
}
System.out.println(" The number of diamonds is "+(4+6*(n-1))); 
}}
