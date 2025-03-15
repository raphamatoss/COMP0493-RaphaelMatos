public class Primalidade {
    static boolean forcaBruta(int n) {
        if (n < 2) {
            return false;
        }
        else if(n == 2) {
            return true;
        }
        else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    static boolean otimizado(int n) {
        if (n < 2) {
            return false;
        }
        else if(n == 2) {
            return true;
        }
        else if (n % 2 == 0) {
            return false;
        }
        else {
            for (int i = 3; i < Math.sqrt(n); i = i + 2) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        int primo = 17;
        System.out.println(forcaBruta(primo));
        System.out.println(otimizado(primo));
    }
}
