import java.util.Scanner;
public class arrays2
{
    public static void main(String[] args) 
        {
            Scanner sc=new Scanner(System.in);
            int marks[]={10,20,30,40,50};
           int min=Integer.MAX_VALUE;
            for(int i=0;i<marks.length;i++){
                if(marks[i]<min){
                    min=marks[i];
                }
            }
            System.out.println("minimum marks"+min);

        }
    
}