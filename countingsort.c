#include <stdio.h>
#include <stdlib.h>

int* countingsort(int *array, int max, int size) {
	int array_size = size;
	int r_max = max+1;
	// cria o vetor "count" e inicializa tudo como zero
	int *count = (int*)malloc(r_max*sizeof(int));
	for (int i = 0; i <= r_max; i++)
		count[i] = 0;

	// contando o numero de vezes que o mesmo elemento aparece e somando no vetor de conta
	for (int i = 0; i < array_size; i++)
		count[array[i]]++;

	// somando os elementos com seus antecessores
	for (int i = 0; i <= r_max; i++) {
		if (i == 0)
			continue;
		count[i] = count[i] + count[i-1];
	}

	// criando o array de output e ordenando o vetor
	int *output = (int*)malloc(array_size*sizeof(int));
	for (int i = array_size-1; i >= 0; i--) {
		output[--count[array[i]]] = array[i];
	}

	free(count);
	return output;
 }

int main() {
	int array[] = {10, 4, 40, 32, 5};
	int *sorted = countingsort(array, 40, 5);

	for (int i = 0; i < 5; i++)
		printf("%d ", sorted[i]);
	return 0;
}

