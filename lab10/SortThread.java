import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortThread extends Thread {
    private String sorting;
    private Integer[] arr;

    void setArr(Integer[] _arr) {
        arr = _arr;
    }

    Integer[] getArr() {
        return arr;
    }

    void setSorting(String _sorting){
        sorting = _sorting;
    }

    @Override
    public void run(){
        try {
            Thread.sleep(500);
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if(sorting == "increase"){
            Arrays.sort(arr);
        }

        else {
            Arrays.sort(arr, Comparator.reverseOrder());
        }
    }
}