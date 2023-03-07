package com.ultimaschool.java;

import com.ultimaschool.java.clientes.Cliente;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("123.456.789-00", "joana@gmail.com",
                                    "Joana Maria Rocha", 'F');
        System.out.println(cliente1.toString());

        Cliente cliente2 = new Cliente("123.456.789-00", "joao@gmail.com",
                "João José Rocha", 'M');
        System.out.println(cliente2.toString());
    }
}