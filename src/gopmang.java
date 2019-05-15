import java.util.Scanner;
public class gopmang {
    public static void main(String[] args) {
        int length1;
        int length2;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao chieu dai cua mang 1 :");
        length1 = input.nextInt();
        System.out.println("Nhap vao chieu dai cua mang 2 :");
        length2 = input.nextInt();
        int[] arr1 = new int[length1];
        int[] arr2 = new int[length2];
        int[] arr3 = new int[length1+length2];
        for(int i = 0; i < length1; i ++) {
            System.out.println("Nhap gia tri cho vi tri " +(i + 1) + " cua mang 1");
            arr1[i] = input.nextInt();
        }

        for(int j = 0; j < length2; j ++) {
            System.out.println("Nhap gia tri cho vi tri " +(j + 1) + " cua mang 2");
            arr2[j] = input.nextInt();
        }
            int j = 0;
        for(int i = 0; i < length1 + length2; i ++) {
            if(i < length1) {
                arr3[i] = arr1[i];
            } else {
                arr3[i] = arr2[j];
                j ++;
            }

        }
        for(int i = 0; i < arr3.length; i ++){
            System.out.print(arr3[i] + "\t");
        }
    }
}
