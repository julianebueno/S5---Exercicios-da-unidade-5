package P5;

class Foo {
    public void a() {
        System.out.println("a");
    }
    
    public void b() {
        System.out.println("b");
    }
    
    void print() {
        a();
        b();
    }
}

// O tipo da variável de referência é foo, porém, ela aponta para um objeto bar. Graças ao polimorfismo, devemos levar em consideração esse objeto ao avaliar os métodos. 

// Na linha 10 de Bar.java, print() é chamado. O objeto bar não possui esse método, por isso, chama o método de foo. 

// Na linha 13 de Foo.java, o método print() chamará o método a(). Como o objeto é do tipo bar, e este possui uma sobrescrita do método (linha 4 de Bar.java), sua versão será chamada imprimindo “A”. 

// Em seguida, na linha 14 de Foo.java, o método b() será chamado. Não há sobrescrita, por isso, o valor “b” será impresso. 

// Resultado: “Ab”.