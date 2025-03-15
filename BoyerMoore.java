public class BoyerMoore {
    static int NUM_CARACTERES = 256;

    static void analisarCaracteresRuins(String pattern, int size, int caracteresRuins[]) {
        for (int i = 0; i < NUM_CARACTERES; i++)
            caracteresRuins[i] = -1;

        for (int i = 0; i < size; i++)
            caracteresRuins[pattern.charAt(i)] = i;
    }

    static void BoyerMooreFn(String cadeia, String pattern) {
        int n = cadeia.length();
        int m = pattern.length();

        int caracteresRuins[] = new int[NUM_CARACTERES];
        analisarCaracteresRuins(pattern, m, caracteresRuins);

        int s = 0;
        while (s <= (n - m)) {
            int j = m - 1;

            while (j >= 0 && pattern.charAt(j) == cadeia.charAt(s + j)) {
                j--;
            }

            if (j < 0) {
                System.out.println("Padrão encontrado na posição: " + s);
                if (s + m < n) {
                    s += m - caracteresRuins[cadeia.charAt(s + m)];
                }
                else {
                    s += 1;
                }
            }
            else {
                int proxCaracter = (s + m < n) ? cadeia.charAt(s + m) : -1;
                s += Math.max(1, j - (proxCaracter != -1 ? caracteresRuins[proxCaracter] : -1));
            }
        }
    }

    public static void main(String[] args) {
        String cadeia = "AAAATTTCGTTAAATTTGAACATAGGGATA";
        String pattern = "AA";

        BoyerMooreFn(cadeia, pattern);
    }
}
