package Lab1;


public class Lab1Part1Array {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5};
        int[] y = {6, 7, 8, 9, 10};
        int[] z = new int[5];

        for (int i = 0; i < z.length; i++) {
            z[i] = Math.max(x[i], y[i]);
    }
         System.out.print("Array x = {");
         for (int i = 0; i < x.length; i++) {
             System.out.print(x[i]);
             if (i < x.length - 1) {
                 System.out.print(", ");
             }
         }
         System.out.println("}");
         
         System.out.print("Array y = {");
         for (int i = 0; i < y.length; i++) {
             System.out.print(y[i]);
             if (i < y.length - 1) {
                 System.out.print(", ");
             }
         }
         System.out.println("}");

         System.out.print("Array z = x + y = {");
         for (int i = 0; i < z.length; i++) {
             System.out.print(z[i]);
             if (i < z.length - 1) {
                 System.out.print(", ");
             }
         }
         System.out.println("}");
}
}