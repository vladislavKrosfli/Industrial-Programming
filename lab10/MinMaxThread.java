import java.util.Arrays;

public class MinMaxThread extends Thread{
    private int min;
    private int max;
    private Integer[] arr;

    void setArr(Integer[] _arr){
        arr = _arr;
    }

    int getMin(){
        return min;
    }

    int getMax(){
        return max;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if(arr[0] > arr[1]){
            max = arr[0];
            min = arr[arr.length - 1];
        }
        else{
            min = arr[0];
            max = arr[arr.length - 1];
        }
    }
}
