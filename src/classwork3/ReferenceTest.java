package classwork3;

public class ReferenceTest {
    public static void main(String[] args) {
     int a= 7;
     int b=8;

     swap(a,b);
     System.out.println(a+ " "+ b);
    }
    public static void swap(int a,int b){
        int c=a;
        a=b;
        b=c;
        System.out.println(a+ " " + b);
    }
    public static void swapArray(int[] i, int[] j){
        int[] c = i;
        i=j;
        j=c;
    }
    public static void deleteReference(int[] i){
        i = null;
    }
    public static void changeArray(int[] i){
        i[1]=987654;
    }
    public static void testInt(){
        int i=5;
        int j = increment(i);
        System.out.println(i);
    }
    public static int increment(int i){
        i=i+5;
        return i;
    }
    public static void mainMethodIncluding(){
        int[] array = new int[4];
        array[0]=0;
        array[1]=1;
        array[2]=2;
        array[3]=0;
//        changeArray(array);
        deleteReference(array);
        System.out.println(array[0] + ", " + array[1] + ", " + array[2]+ ", " + array[3]);
    }
    public static void mainMethodIncluding2(){
        int[] array1={1,2,3,0};
        int[] array2={31,23,123,412};

        System.out.println(array1[0]);
        System.out.println(array2[0]);
    }
    public static void mainMethodIncluding3(){
        int a= 7;
        int b=8;

        swap(a,b);
        System.out.println(a+ " "+ b);
    }
}
