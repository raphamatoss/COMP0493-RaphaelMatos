#include <iostream>

void merge(string& palavra, string& left, string& right) {
    int i = 0; int j = 0; int k = 0;
    while(i < left.length() && j < right.length()) {
        if (left[i] < right[j])
            palavra[k++] = left[i++];
        else
            palavra[k++] = right[j++];
    }
    while(i < left.length())
        palavra[k++] = left[i++];
    while(j < right.length())
        palavra[k++] = right[j++];
}

void mergesort(string& palavra) {
    if (palavra.length() > 1) {
        int meio = palavra.length() / 2;
        string left_arr = "";
        string right_arr = "";

        for (int i = 0; i < meio; i++) {
            left_arr += palavra[i];
        }
        for (int i = meio; i < palavra.length(); i++) {
            right_arr += palavra[i];
        }

        mergesort(left_arr);
        mergesort(right_arr);
        merge(palavra, left_arr, right_arr);
    }
}

int main() {
	return 0;
}