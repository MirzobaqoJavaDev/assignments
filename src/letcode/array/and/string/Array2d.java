package letcode.array.and.string;

import java.util.*;

public class Array2d {
    // "static void main" must be defined in a public class.

    private static void printArray(int[][] a) {

//        for (int i = 0; i < a.length; ++i) {
//            System.out.println(a[i]);
//        }
//        for (int i = 0; i < a.length; ++i) {
//            for (int j = 0; a[i] != null && j < a[i].length; ++j) {
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
    public  int[] findDiagonalOrder(int[][] mat) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int m = mat.length;
        int n =mat[0].length;
        for (int i =0;i<m;i++){
            for (int j=0;j<n;j++){
                int key = i+j;
                map.putIfAbsent(key, new ArrayList<>());
                map.get(key).add(mat[i][j]);
            }
        }
        int[] res = new int[m*n];
        int index = 0;
        for (int i =0;i<m+n-1;i++){
            List<Integer> list = map.get(i);
            if (i%2==0){
                Collections.reverse(list);
            }
            for (int v : list){
                res[index++] = v;
            }
        }
        return res;
    }

    public static void main(String[] args) {
       int[][] mat = {{1,2,3},{4,5,6},{7,8}};

//        System.out.println("Example I:");
//        int[][] a = new int[2][5];
//        printArray(a);
//        System.out.println("Example II:");
//        int[][] b = new int[2][];
//        printArray(b);
//        System.out.println("Example III:");
//        b[0] = new int[3];
//        b[1] = new int[5];
//        printArray(b);
//    }
    }
}
