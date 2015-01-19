package kata2;

import java.util.HashMap;

public class Kata2 {
     
    public static void main(String[] args) {
        int[] array = {2,2,11,4,2,6,11,2,3,5,11,5};
        HashMap<Integer,Integer> histogram = new HashMap<>();
        /*
        for (int i=0; i<array.length; i++){
            if (histogram.containsKey(array[i])){
                histogram.put(array[i], histogram.get(array[i])+1);
            }
            else{
                histogram.put(array[i], 1);
            }
        }
        for (Integer key : histogram.keySet()){
            System.out.println(key + "->" + histogram.get(key));
        }
        
         * 
         */
        
        for (int i : array) {
            if(histogram.containsKey(i))
                histogram.put(i, histogram.get(i) + 1);
            else
                histogram.put(i, 1);
        }
        
        for (int key : histogram.keySet()) {
            System.out.println(key + "->" + histogram.get(key));
        }
    }
}
