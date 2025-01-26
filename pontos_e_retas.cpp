// FloresDeFogo.cpp : Este arquivo contém a função 'main'. A execução do programa começa e termina ali.
//

#include <iostream>
#include <cmath>
#include <queue>

class Ponto {
public:
    double x;
    double y;
    Ponto() {}
    Ponto(double x, double y) {
        this->x = x;
        this->y = y;
    }
};

class Circulo {
public:
    Ponto centro;
    double raio;
    Circulo(Ponto centro, double raio) {
        this->centro = centro;
        this->raio = raio;
    }
};

class Reta {
public:
    int a, x, b, y, c;
    Reta(int a, int x, int b, int y, int c) {
        this->a = a;
        this->x = x;
        this->b = b;
        this->y = y;
        this->c = c;
    }
};

double distancia_entre_pontos(Ponto A, Ponto B) {
    return sqrt(pow(A.x - B.x, 2) + pow(A.y - B.y, 2));
}

double distancia_entre_ponto_e_reta(Ponto P, Reta R) {
    return abs(R.a * P.x + R.b * P.y + R.c) / sqrt(pow(R.a, 2) + pow(R.b, 2));
}

using namespace std;

int main() {}

// Executar programa: Ctrl + F5 ou Menu Depurar > Iniciar Sem Depuração
// Depurar programa: F5 ou menu Depurar > Iniciar Depuração

// Dicas para Começar: 
//   1. Use a janela do Gerenciador de Soluções para adicionar/gerenciar arquivos
//   2. Use a janela do Team Explorer para conectar-se ao controle do código-fonte
//   3. Use a janela de Saída para ver mensagens de saída do build e outras mensagens
//   4. Use a janela Lista de Erros para exibir erros
//   5. Ir Para o Projeto > Adicionar Novo Item para criar novos arquivos de código, ou Projeto > Adicionar Item Existente para adicionar arquivos de código existentes ao projeto
//   6. No futuro, para abrir este projeto novamente, vá para Arquivo > Abrir > Projeto e selecione o arquivo. sln
