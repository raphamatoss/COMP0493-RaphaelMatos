#include <iostream>
#include <cmath>
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
