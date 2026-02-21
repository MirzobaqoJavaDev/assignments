package kitob1;

public class Calculate {
    public static void main(String[] args) {
         int sum = 0;
         int x = 1;

         while (x<=6){
             sum +=x;
             ++x;
         }

        System.out.printf("The sum is %d%n", sum);

         int a =1;
         int total =0;
        System.out.println("Kvadrat   Kub");
         while (a<=10){
             int y = a*a;
             int z = a*a*a;
             System.out.printf(" %d      %d%n", y, z);
             total += y;
             ++a;
         }

        System.out.printf("Total is %d%n", total);



         int count = 1;
         while (count<=10){
             System.out.println(count % 3 == 2 ? "***" :"++++++");
             count++;
         }
        System.out.println("--------------------------------------");


         int row =10;
         while (row >= 1){
             int column = 1;
             while (column <=10){
                 System.out.println(row % 2 == 1 ? "<" : ">");
                 column++;
             }
             --row;
             System.out.println();

         }
    }


}
