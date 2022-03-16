import java.util.ArrayList;
import java.util.List;

public class A {
        public static List<List<Integer>> generate(int numRows) {
            List<List<Integer>> val = new ArrayList<>();

            List<Integer> val1, pre = null;
            for (int i = 0; i < numRows; i++) {
                val1 = new ArrayList<>();
                for (int j = 0; j <= i; j++) {
                    if (j==0||j==i){
                        val1.add(1);
                    }else{
                        assert pre != null;
                        val1.add(pre.get(j-1)+ pre.get(j));
                    }
                }
                pre = val1;
                val.add(val1);
            }

            return val;
        }
        public static void main(String[] args) {
            int numRows = 5;
            List<List<Integer>> ans=  generate(numRows);
            System.out.println(ans);
        }
    }
