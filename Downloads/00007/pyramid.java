public class pyramid
{
    public static void main(String[] args)
    {
        int n=5;
        for(int i=n;i<=1;i--){
            for(int s=i;s<=n;s++){
               System.out.print(" ");
        }
        for(int j=i;j<=n;j++)
          System.out.print("*");
        System.out.println();
        }
    }
}