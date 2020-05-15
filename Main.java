class Main{
  public static void main(String[] args) {
    Complejo c = new Complejo();

    Complejo c1 = new Complejo();
    Complejo res = new Complejo();

    c.leer();
    c1.leer();

    res = c.suma(c1);
    res.imprimir();

    res = c.resta(c1);
    res.imprimir();

    res = c.mult(c1);
    res.imprimir();

    res = c.conjugado();
    res.imprimir();

    res = c.division(c1);
    res.imprimir();
  }
} 