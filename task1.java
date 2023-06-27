import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class task1 {
    
    static int makeInt(Deque<String> arr) {
        int res=0; 
        String inS;   
        int krat = 1;
        while(arr.size() != 0) {
            inS = arr.pollFirst();
            if (!inS.equals("-")) {
                res = res + krat * (Integer.parseInt(inS));
                krat *= 10;
            } else {
                res *= -1;
            }
        }
        return res;
    }

    static Queue<String> Pack(int in) {
        Deque<String> q = new LinkedList<>();
        int temp = 0;
        
        while (in > 0) {
            temp = in % 10;
            in = (in - temp) / 10;
            q.addFirst(Integer.toString(temp));
        }
        
        return q;
    }
    
    
    public static void main(String[] args) {

        
        Deque<String> list_1 = new LinkedList<>(Arrays.asList("3","2","1"));
        Deque<String> list_2 = new LinkedList<>(Arrays.asList("5","4","3"));      
        
        
        System.out.println("Списки: " + list_1 +  ", " + list_2);
            System.out.println();

      

        
        int first_num = makeInt(list_1);
        int second_num = makeInt(list_2);
        int composition = first_num * second_num;
        int compositionSum = first_num + second_num;
        System.out.printf("%d * %d = %d\n", first_num, second_num, composition);
        System.out.printf("%d + %d = %d\n", first_num, second_num, compositionSum);
        
        System.out.println();
        System.out.println("Результирующие коллекции: ");
        System.out.println(Pack(composition));
        System.out.println(Pack(compositionSum));
        
    }
}
