package com.ultimaschool.java;

import com.ultimaschool.java.clientes.Cliente;
import com.ultimaschool.java.clientes.ClienteBuilder;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Joana", "Maria", "Rocha", "123.456.789-00",
                "10/01/1993",'F',"joana@gmail.com","Av. Brasil",
                "(85) 9999-9999");
        System.out.println(cliente1.toString());

        Cliente cliente2 = new Cliente("João", "Pedro", "Rocha", "453.456.789-00",
                "20/01/1995",'M',"joao@gmail.com","Av. Brasil",
                "(85) 9999-7777");
        System.out.println(cliente2.toString());

        ClienteBuilder cliente3 = new ClienteBuilder().comIdentificacao("Joana", "Maria",
                "Rocha", "123.456.789-00","10/01/1993",'F').comContatos("joana@gmail.com","Av. Brasil",
                "(85) 9999-9999");
        System.out.println(cliente3.toString());
        System.out.println(cliente3.toStringContatos());
        System.out.println(cliente3.toStringCIdentificacao());
    }
}