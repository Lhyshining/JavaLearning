package base;

public class Struct {
    public static void main(String[] args) {
        boolean flag = true;
        int choice = 0;
        // if
        if (flag) {
            int i = 0;
        } else if (flag) {
            int i = 1;
        } else if (flag) {
            int i = 2;
        } else {
            int i = 3;
        }

        // switch
        switch (choice) {
            case 0: {
                int i = 0;
                break;
            }
            case 1: {
                int i = 1;
                break;
            }
            default: {
                int i = 2;
            }
        }

        // while
        while (flag) {
            int i = 0;
        }

        // do...while
        do {
            int i = 0;
        } while (flag);

        // for
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // for 遍历数组元素
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i : numbers) {
            System.out.println(i);
        }

    }
}
