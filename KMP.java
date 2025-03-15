public class KMP {
    static int[] get_lps(String pattern, int inicio, int fim) {
        int length = fim - inicio + 1;
        int[] lps = new int[length];
        int j = 0;
        int i = 1;

        while (i < length) {
            if (pattern.charAt(inicio + i) == pattern.charAt(inicio + j)) {
                lps[i] = j + 1;
                i++;
                j++;
            } else {
                if (j > 0) {
                    j = lps[j - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    static void KMP(String cadeia, String pattern) {
        int n = cadeia.length();
        int m = pattern.length();
        if (m > n) { return; } // pattern maior que a cadeia
        int[] lps = get_lps(pattern, 0, pattern.length()-1);
        int i = 0, j = 0; // i percorre a cadeia, j percorre o pattern
        while (i < n) {
            if (cadeia.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
                if (j == m) {
                    System.out.println("Encontrado na posição: " + (i - j));
                    j = lps[j - 1];
                }
            } else {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
    }

    public static void main(String[] args) {
        String cadeia = "AAAATTTCGTTAAATTTGAACATAGGGATA";
        String pattern = "AA";

        KMP(cadeia, pattern);
    }
}
