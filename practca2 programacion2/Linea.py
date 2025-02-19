class Punto:
    def _init_(self, x, y):
        self.x = x
        self.y = y

    def _str_(self):
        return f"({self.x}, {self.y})"

class Linea:
    def _init_(self, p1, p2):
        self.p1 = p1
        self.p2 = p2

    def _str_(self):
        return f"Línea: {self.p1} -> {self.p2}"

    def dibujaLinea(self):
        print(f"Dibujando línea desde {self.p1} hasta {self.p2}")

class Circulo:
    def _init_(self, centro, radio):
        self.centro = centro
        self.radio = radio

    def _str_(self):
        return f"Círculo: centro={self.centro}, radio={self.radio}"

    def dibujaCirculo(self):
        print(f"Dibujando círculo con centro en {self.centro} y radio {self.radio}")

p1 = Punto(1, 2)
p2 = Punto(4, 6)
linea = Linea(p1, p2)
print(linea)
linea.dibujaLinea()

centro = Punto(3, 3)
circulo = Circulo(centro, 2)
print(circulo)