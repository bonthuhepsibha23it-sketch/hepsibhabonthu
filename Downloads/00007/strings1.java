public class strings1
{
    public static void main(String[] args) {
     String name=new String("anits");
     String clgname=new String("anits");
     int res=name.compareTo(clgname);
     if(res==0){
        System.out.println("stings are equal");
     }   
     else{
        System.out.println("strings are not equal");
     }
    }
}