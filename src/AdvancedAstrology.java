
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


    public static void printRightLeaningTriangle(int size) {
        System.out.println();
        int space = size - 1;
        int star = 1;
        while(star <=size) {
            printSpaces(space);
            printStars(star);
            star++;
            space--;
            System.out.println();
        }

    }

    public static void printTriangle(int height) {
        System.out.println();
        int space = height - 1;
        int star = 1;
        int leftLeaningTriangleStar = 0;
        while(star <=height) {
            printSpaces(space);
            printStars(star);
            printStars(leftLeaningTriangleStar);
            star++;
            space--;
            leftLeaningTriangleStar++;
            System.out.println();
        }
    }

    public static void printBase(int height) {
        int lastLineLength = 2 * height - 1; // Width of the last line of the tree
        int baseWidth = 3;                   // Base width is fixed at 3 stars
        int space = (lastLineLength - baseWidth) / 2;
        for(int i = 0; i < 2; i++) {
            printSpaces(space);
            printStars(baseWidth);
            System.out.println();
        }
    }

    public static void christmasTree(int height) {
        printTriangle(height);
        printBase(height);
        
    }


    public static void main(String[] args) {
        //printTriangle(4);
        christmasTree(4);
        christmasTree(10);
    }
}