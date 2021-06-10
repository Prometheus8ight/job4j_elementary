package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                for (int j = index; j < array.length; j++) {
                    if (array[j] != null) {
                        swap(array, j, index);
                        break;
                    }
                }
            }
        }
        return array;
    }

    public static String[] swap(String[] array, int source, int destination) {
        String temp = array[source];
        array[source] = array[destination];
        array[destination] = temp;
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}