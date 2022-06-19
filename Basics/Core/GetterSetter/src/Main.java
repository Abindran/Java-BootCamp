public class Main {

    public static void main(String args[]){
        MyClass john = new MyClass();
//        john.name =  "John Doe";
//        System.out.println(john.name);

        john.setAge(19);
        System.out.println(john.getAge());
    }

}
class MyClass {
    private String name;
    private int age;
    private int accNo;

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }


}