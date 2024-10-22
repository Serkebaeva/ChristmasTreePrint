
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
    }

    public static void printSpaces(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        System.out.println();
        int space = size - 1;
        int star = 1;
        int leftLeaningTriangleStar = 0;
        while(star <=size) {
            printSpaces(space);
            printStars(star);
            printStars(leftLeaningTriangleStar);
            printSpaces(space);
            star++;
            space--;
            leftLeaningTriangleStar++;
            System.out.println();

        }
    }

    public static void christmasTree(int height) {
        printTriangle(height);       
        
    }


    public static void main(String[] args) {
        //printTriangle(4);
        christmasTree(4);
        System.err.println();
        //christmasTree(10);
    }
}