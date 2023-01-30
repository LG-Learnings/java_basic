package core.java.DataStructure.Arrays;

import java.util.Arrays;

public class ArrayController {

    public static void main(String[] arg){
        String[] colours = new String[5];
        colours[0] = "black";
        colours[1] = "black";
        colours[2] = "white";
        colours[3] = "white";
        colours[4] = "white";
        String[] names  = {"Olwam", "Mbiki"};
        int[] numbers  = {50,20,150};


        compare(colours, names);
        search(colours, "white");
        sort(numbers);
        print(colours);
        loop(colours);

        System.out.println(arraySum(numbers));

    }

    public static int arraySum(int[] numbers) {
        int sum = 0;
        for(int number: numbers){
            sum += number;
        }
        return sum;

    }

    private static void compare(String[] colours, String[] names) {
        System.out.println(Arrays.equals(colours, names));
    }

    private static void search(String[] colours, String searchColour) {
        System.out.println();
        int count = 0;
        for (String colour: colours){
            if (colour.equalsIgnoreCase(searchColour)){
                count++;
                System.out.print(colour+" ");
            }
        }
        System.out.println();
        System.out.print("Total found is: "+ count);
        System.out.println();
        System.out.println();
    }

    private static void sort(int[] numbers) {
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println();
    }

    private static void print(String[] colours) {
        System.out.println("Arrays.toString to print:");
        System.out.println(Arrays.toString(colours));
        System.out.println();
    }

    private static void loop(String[] colours) {
        System.out.println("for loop without index to print:");
        for (String colour: colours){
            System.out.print(colour+" ");
        }
        System.out.println();

        System.out.println("For loop with index:");
        for (int index = 0; index< colours.length; index++){
            System.out.print(colours[index]+" ");
        }
        System.out.println();

        System.out.println("For loop with index to print reverse:");
        for (int index = colours.length-1; index>=0; index--){
            System.out.print(colours[index]+" ");
        }
        System.out.println();

        Arrays.stream(colours).forEach(System.out::println);
        System.out.println();
    }
}
