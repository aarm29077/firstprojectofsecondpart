package classwork10.buffer;

import classwork10.buffer.Buffer;
import classwork10.buffer.MyBuffer;

public class RandomPutter {
    private String value;
//    private Buffer buffer = new MyBuffer();
    private Buffer buffer;

    public RandomPutter(Buffer buffer){
        this.buffer = buffer;
    }

    public void start(){

        for (int  i= 0;; i+=2) {
            buffer.put("text : " + i);
            waitSecond();
            System.out.println(buffer.get());
            waitSecond();

        }
    }


    public static void waitSecond(){
        long startMillis = System.currentTimeMillis();
        while (System.currentTimeMillis()-startMillis<1000){}
    }

}
