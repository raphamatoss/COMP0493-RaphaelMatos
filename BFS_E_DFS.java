import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BFS_E_DFS {
    static void DFS_matriz(int x, int[][] matriz_adjacencias, boolean[] visitado) {
        visitado[x] = true;
        System.out.println(x);

        for (int i = 0; i < matriz_adjacencias.length; i++) {
            if (matriz_adjacencias[x][i] == 1 && !visitado[i]) {
                DFS_matriz(i, matriz_adjacencias, visitado);
            }
        }
    }

    static void DFS_lista(int x, ArrayList<ArrayList<Integer>> lista_adjacencias, boolean[] visitado) {
        visitado[x] = true;
        System.out.println(x);

        for (int i = 0; i < lista_adjacencias.get(x).size(); i++) {
            int y = lista_adjacencias.get(x).get(i);
            if (!visitado[y]) {
                DFS_lista(y, lista_adjacencias, visitado);
            }
        }
    }

    static void BFS_matriz_queue(int x, int[][] matriz_adjacencias, boolean[] visitado, Queue<Integer> fila) {
        visitado[x] = true;
        System.out.println(x);

        for (int i = 0; i < matriz_adjacencias.length; i++) {
            if (matriz_adjacencias[x][i] == 1 && !visitado[i]) {
                fila.add(i);
            }
        }

        Integer prox = fila.poll();
        if (prox != null) {
            BFS_matriz_queue(prox, matriz_adjacencias, visitado, fila);
        }
    }

    static void BFS_matriz(int x, int[][] matriz_adjacencias) {
        boolean[] visitado = new boolean[matriz_adjacencias.length];
        visitado[x] = true;
        System.out.println(x);
        Queue<Integer> fila = new LinkedList<>();

        for (int i = 0; i < matriz_adjacencias.length; i++) {
            if (matriz_adjacencias[x][i] == 1 && !visitado[i]) {
                fila.add(i);
            }
        }

        Integer prox = fila.poll();
        if (prox != null) {
            BFS_matriz_queue(prox, matriz_adjacencias, visitado, fila);
        }
    }

    static void BFS_fila_queue(int x, ArrayList<ArrayList<Integer>> lista_adjacencias, boolean[] visitado, Queue<Integer> fila) {
        visitado[x] = true;
        System.out.println(x);

        for (int i = 0; i < lista_adjacencias.get(x).size(); i++) {
            int y = lista_adjacencias.get(x).get(i);
            if (!visitado[y]) {
                fila.add(y);
            }
        }

        Integer prox = fila.poll();
        if (prox != null) {
            BFS_fila_queue(prox, lista_adjacencias, visitado, fila);
        }
    }

    static void BFS_lista(int x, ArrayList<ArrayList<Integer>> lista_adjacencias) {
        boolean[] visitado = new boolean[lista_adjacencias.size()];
        visitado[x] = true;
        System.out.println(x);
        Queue<Integer> fila = new LinkedList<>();

        for (int i = 0; i < lista_adjacencias.get(x).size(); i++) {
            int y = lista_adjacencias.get(x).get(i);
            if (!visitado[y]) {
                fila.add(y);
            }
        }

        Integer prox = fila.poll();
        if (prox != null) {
            BFS_fila_queue(prox, lista_adjacencias, visitado, fila);
        }
    }

    public static void main(String[] args) {
//        boolean[] visitado = new boolean[5];
//        int[][] matriz_adjacencias = {{0,0,0,0,1}, {0,0,0,1,0}, {0,0,0,1,0}, {0,1,1,0,1}, {1,0,0,1,0}};
//        ArrayList<ArrayList<Integer>> lista_adjacencias = new ArrayList<>(5);
//        ArrayList<Integer> lista_elem_0 = new ArrayList<>();
//        lista_elem_0.add(4);
//        lista_adjacencias.add(lista_elem_0);
//        ArrayList<Integer> lista_elem_1 = new ArrayList<>();
//        lista_elem_1.add(3);
//        lista_adjacencias.add(lista_elem_1);
//        ArrayList<Integer> lista_elem_2 = new ArrayList<>();
//        lista_elem_1.add(3);
//        lista_adjacencias.add(lista_elem_2);
//        ArrayList<Integer> lista_elem_3 = new ArrayList<>();
//        lista_elem_3.add(4);
//        lista_elem_3.add(1);
//        lista_elem_3.add(2);
//        lista_adjacencias.add(lista_elem_3);
//        ArrayList<Integer> lista_elem_4 = new ArrayList<>();
//        lista_elem_4.add(0);
//        lista_elem_4.add(3);
//        lista_adjacencias.add(lista_elem_4);

//        int[][] matriz_adjacencias_1 = {{0,1,1,0,0}, {1,0,0,1,0}, {1,0,0,0,1}, {0,1,0,0,0}, {0,0,1,0,0}};
        /* arvore
            0
           / \
          2   1
         /     \
        4       3
        */
//        ArrayList<ArrayList<Integer>> lista_adjacencias = new ArrayList<>(5);
//        ArrayList<Integer> lista_elem_0 = new ArrayList<>();
//        lista_elem_0.add(1);
//        lista_elem_0.add(2);
//        lista_adjacencias.add(lista_elem_0);
//        ArrayList<Integer> lista_elem_1 = new ArrayList<>();
//        lista_elem_1.add(0);
//        lista_elem_1.add(3);
//        lista_adjacencias.add(lista_elem_1);
//        ArrayList<Integer> lista_elem_2 = new ArrayList<>();
//        lista_elem_2.add(0);
//        lista_elem_2.add(4);
//        lista_adjacencias.add(lista_elem_2);
//        ArrayList<Integer> lista_elem_3 = new ArrayList<>();
//        lista_elem_3.add(1);
//        lista_adjacencias.add(lista_elem_3);
//        ArrayList<Integer> lista_elem_4 = new ArrayList<>();
//        lista_elem_4.add(2);
//        lista_adjacencias.add(lista_elem_4);
//        // grafo K5
//        for (int i = 0; i < matriz_adjacencias.length; i++) {
//            for (int j = 0; j < matriz_adjacencias.length; j++) {
//                if (i == j) {
//                    matriz_adjacencias[i][j] = 0;
//                    continue;
//                }
//                matriz_adjacencias[i][j] = 1;
//            }
//            visitado[i] = false;
//        }
//
//        DFS_matriz(1, matriz_adjacencias, visitado);
//        DFS_lista(0, lista_adjacencias, visitado);
//        BFS_matriz(0, matriz_adjacencias_1);
//        BFS_lista(0, lista_adjacencias);
    }
}