public class Methods {
    public static void main(String args[]){
        System.out.println(minNum(5,4));
    }
    public static int minNum(int a,int b){
        int min=a;
        if(b<a){
            min = b;
        }
        return min;
    }
}
