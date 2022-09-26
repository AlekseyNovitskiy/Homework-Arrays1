public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int  [] weight = new int  [3];
        weight[0]=1;
        weight[1]=2;
        weight[2]=3;

        double [] numbers1 = {1.57, 7.654, 9.986};
        int [] numbers = {3, 7, 11, 15, 18};

        // Задание 2
        System.out.println("Задание 2");
        for (int i = 0; i < weight.length; i++) {
            System.out.print(weight[i]);
            if (i!=weight.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < numbers1.length; i++) {
            System.out.print(numbers1[i]);
            if (i!=numbers1.length-1) {
                System.out.print(", ");
            }

        }
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i!=numbers.length-1) {
                System.out.print(", ");
            }

        }
        System.out.println();

        // Задание 3
        System.out.println("Задание 3");
        for (int i = weight.length-1; i >= 0; i--) {
            System.out.print(weight[i]);
            if (i!=0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = numbers1.length-1; i >= 0; i--) {
            System.out.print(numbers1[i]);
            if (i!=0) {
                System.out.print(", ");
            }

        }
        System.out.println();
        for (int i = numbers.length-1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i!=0) {
                System.out.print(", ");
            }

        }
        System.out.println();

        // Задание 4
        System.out.println("Задание 4");
        for (int i = 0; i < weight.length; i++) {

            if (weight[i]%2 != 0) {
                weight[i]++;
            };
            System.out.print(weight[i]);
            if (i!=2) {
                System.out.print(", ");
            }
        }
                
    }
}