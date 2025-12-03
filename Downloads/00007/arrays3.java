import java.util.Scanner;
public class arrays3
{
    public static void main(String[] args) 
        {
            Scanner sc=new Scanner(System.in);
            int marks[]={10,20,30,40,50};
           int max=Integer.MIN_VALUE;
            for(int i=0;i<marks.length;i++){
                if(marks[i]>max){
                    max=marks[i];
                }
            }
            int freq[]=new int[max+1];
            for(int i=0;i<marks.length;i++){
                freq[marks[i]]++;
            }
            for(int i=0;i<freq.length;i++){
                if(freq[i]>0){
                    System.out.println(i+"-->"+freq[i]);
                }
            }


        }
    
}