public class DataTypes {
    public static void main(String[] args){
//        byte myByte = 10;
//        short sht = 100;
//        System.out.println(sht);
//        int mInt = 22/7;
//        float mFloat = 22/7f;
//        double mDouble = 22/7d;
//        System.out.println("Integer is " + mInt);
//        System.out.println("Float is " + mFloat);
//        System.out.println("Double is " + mDouble);
          boolean isActive = false;
          System.out.println(isActive);
          char mChar = 'A';
          System.out.println(mChar);
          String mUnicode = Integer.toHexString(mChar);
          System.out.println("Printing the unicode value: " + mUnicode);
          char mUni = '\u0065';
          System.out.println("Printing the actual value from unicode: " + mUni);
          String mStr = "I am String";
          System.out.println(mStr.toUpperCase());
          System.out.println(mStr);

    }
}
