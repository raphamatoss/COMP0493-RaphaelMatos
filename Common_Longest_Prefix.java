//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Common_Longest_Prefix {
    static void mergesort(String[] array) {
        if (array.length > 1) {
            int meio = array.length / 2;
            String[] left = new String[meio];
            String[] right = new String[array.length - meio];

            for (int i = 0; i < meio; i++) {
                left[i] = array[i];
            }
            for (int i = meio; i < array.length; i++) {
                right[i - meio] = array[i];
            }

            mergesort(left);
            mergesort(right);

            int i = 0, j = 0, k = 0;
            while (i < left.length && j < right.length) {
                if (left[i].compareTo(right[j]) < 0) {
                    array[k++] = left[i++];
                }
                else {
                    array[k++] = right[j++];
                }
            }

            while (i < left.length) {
                array[k++] = left[i++];
            }
            while (j < right.length) {
                array[k++] = right[j++];
            }
        }
    }

    static String longestPrefix(String[] array) {
        mergesort(array);

        String primeiro = array[0];;
        String ultimo = array[array.length-1];

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (primeiro.charAt(i) == ultimo.charAt(i))
                sb.append(primeiro.charAt(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String[] array = {"abcdefg", "abcdxxxx", "abcdyyyy", "abcdffff", "abcdkkkkk"};
        System.out.println(longestPrefix(array));
    }
}