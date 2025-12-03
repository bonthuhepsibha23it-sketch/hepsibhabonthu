import java.util.Scanner;
public class arrays1
{
    public static void main(String[] args) {
        {
            Scanner sc=new Scanner(System.in);
            int marks[]={10,20,30,40,50};
           
            for(int i=0;i<marks.length;i++){
                if(marks[i]==30){
                    System.out.println(i+"");
                }
            }
        }
    }
}