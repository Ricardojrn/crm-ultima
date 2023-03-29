package com.ultimaschool.java.clientes;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ClienteBuilderTest extends TestCase {

    private ClienteBuilder clienteBuilder;
    private ClienteBuilder clienteBuilder2;
    @Before
    public void setUp() throws Exception {
        clienteBuilder2 = new ClienteBuilder();
        clienteBuilder = new ClienteBuilder().comIdentificacao("Joana", "Maria",
                "Rocha", "123.456.789-00","10/01/1993",'F').comContatos(
                "joana@gmail.com","Av. Brasil", "(85) 9999-9999");
    }

    @Test
    public void testGetCpf() {
        Assertions.assertNull(clienteBuilder2.getCpf());
        Assertions.assertEquals(clienteBuilder.getCpf(),"123.456.789-00");
    }
    @Test
    public void testSetCpf() {
        clienteBuilder.setCpf("000.000.000-00");
        Assertions.assertEquals(clienteBuilder.getCpf(),"000.000.000-00");
        clienteBuilder2.setCpf("111.111.111-11");
        Assertions.assertEquals(clienteBuilder2.getCpf(),"111.111.111-11");
    }
    @Test
    public void testGetEmail() {
        Assertions.assertNull(clienteBuilder2.getEmail());
        Assertions.assertEquals(clienteBuilder.getEmail(),"joana@gmail.com");
    }
    @Test
    public void testSetEmail() {
        clienteBuilder.setEmail("joanaM@gmail.com");
        Assertions.assertEquals(clienteBuilder.getEmail(),"joanaM@gmail.com");
        clienteBuilder2.setEmail("maria@gmail.com");
        Assertions.assertEquals(clienteBuilder2.getEmail(),"maria@gmail.com");
    }
    @Test
    public void testGetPrimeiroNome() {
        Assertions.assertNull(clienteBuilder2.getPrimeiroNome());
        Assertions.assertEquals(clienteBuilder.getPrimeiroNome(),"Joana");
    }
    @Test
    public void testSetPrimeiroNome() {
        clienteBuilder.setPrimeiroNome("Aline");
        Assertions.assertEquals(clienteBuilder.getPrimeiroNome(),"Aline");
        clienteBuilder2.setPrimeiroNome("João");
        Assertions.assertEquals(clienteBuilder2.getPrimeiroNome(),"João");
    }
    @Test
    public void testGetNomesMeio() {
        Assertions.assertNull(clienteBuilder2.getNomesMeio());
        Assertions.assertEquals(clienteBuilder.getNomesMeio(),"Maria");
    }
    @Test
    public void testSetNomesMeio() {
        clienteBuilder.setNomesMeio("Maria");
        Assertions.assertEquals(clienteBuilder.getNomesMeio(),"Maria");
        clienteBuilder2.setNomesMeio("José");
        Assertions.assertEquals(clienteBuilder2.getNomesMeio(),"José");
    }
    @Test
    public void testGetSobrenome() {
        Assertions.assertNull(clienteBuilder2.getSobrenome());
        Assertions.assertEquals(clienteBuilder.getSobrenome(),"Rocha");
    }
    @Test
    public void testSetSobrenome() {
        clienteBuilder.setSobrenome("Silva");
        Assertions.assertEquals(clienteBuilder.getSobrenome(),"Silva");
        clienteBuilder2.setSobrenome("Cardoso");
        Assertions.assertEquals(clienteBuilder2.getSobrenome(),"Cardoso");
    }
    @Test
    public void testGetNomeCompleto() {
        Assertions.assertNull(clienteBuilder2.getNomeCompleto());
        Assertions.assertEquals(clienteBuilder.getNomeCompleto(),"Joana Maria Rocha");
    }
    @Test
    public void testSetNomeCompleto() {
        clienteBuilder.setNomeCompleto("Aline Maria Rocha");
        Assertions.assertEquals(clienteBuilder.getNomeCompleto(),"Aline Maria Rocha");
        clienteBuilder2.setNomeCompleto("João Mota");
        Assertions.assertEquals(clienteBuilder2.getNomeCompleto(),"João Mota");
    }
    @Test
    public void testGetDataNascimento(){
        Assertions.assertNull(clienteBuilder2.getDataNascimento());
        Assertions.assertEquals(clienteBuilder.getDataNascimento(),"10/01/1993");
    }
    @Test
    public void testSetDataNascimento(){
        clienteBuilder.setDataNascimento("12/04/1992");
        Assertions.assertEquals(clienteBuilder.getDataNascimento(),"12/04/1992");
    }
    @Test
    public void testGetIdadeAtual(){
        Assertions.assertEquals(clienteBuilder2.getIdadeAtual(),0);
        Assertions.assertEquals(clienteBuilder.getIdadeAtual(),31);
    }
    @Test
    public void testSetIdadeAtual(){
        clienteBuilder.setIdadeAtual(15);
        Assertions.assertEquals(clienteBuilder.getIdadeAtual(),15);
        clienteBuilder2.setIdadeAtual(52);
        Assertions.assertEquals(clienteBuilder2.getIdadeAtual(),52);
    }
    @Test
    public void testGetEndereco(){
        Assertions.assertNull(clienteBuilder2.getEndereco());
        Assertions.assertEquals(clienteBuilder.getEndereco(),"Av. Brasil");
    }
    @Test
    public void testSetEndereco(){
        clienteBuilder.setEndereco("rua Cascavel");
        Assertions.assertEquals(clienteBuilder.getEndereco(),"rua Cascavel");
        clienteBuilder2.setEndereco("Av. Ceará");
        Assertions.assertEquals(clienteBuilder2.getEndereco(),"Av. Ceará");
    }@Test
    public void testGetTelefone(){
        Assertions.assertNull(clienteBuilder2.getTelefone());
        Assertions.assertEquals(clienteBuilder.getTelefone(),"(85) 9999-9999");
    }
    @Test
    public void testSetTelefone(){
        clienteBuilder.setTelefone("(85) 8888-8888");
        Assertions.assertEquals(clienteBuilder.getTelefone(),"(85) 8888-8888");
        clienteBuilder2.setTelefone("(85) 9999-9999");
        Assertions.assertEquals(clienteBuilder2.getTelefone(),"(85) 9999-9999");
    }

    @Test
    public void testToStringIdentificacao(){
        Assertions.assertEquals(clienteBuilder.toStringCIdentificacao(),"Os dados pessoais são; \n" +
                "Sra. Joana Maria Rocha, com cpf 123.456.789-00, data de nascimento 10/01/1993,com idade de 31 anos.");
        clienteBuilder.setGenero(' ');
        Assertions.assertEquals(clienteBuilder.toStringCIdentificacao(),"Os dados pessoais são; \n" +
                " Joana Maria Rocha, com cpf 123.456.789-00, data de nascimento 10/01/1993,com idade de 31 anos.");
        clienteBuilder.setGenero('M');
        Assertions.assertEquals(clienteBuilder.toStringCIdentificacao(),"Os dados pessoais são; \n" +
                "Sr. Joana Maria Rocha, com cpf 123.456.789-00, data de nascimento 10/01/1993,com idade de 31 anos.");
        clienteBuilder.setGenero('@');
        Assertions.assertEquals(clienteBuilder.toStringCIdentificacao(),"Os dados pessoais são; \n" +
                " Joana Maria Rocha, com cpf 123.456.789-00, data de nascimento 10/01/1993,com idade de 31 anos.");
    }

    @After
    public void tearDown() throws Exception {
        clienteBuilder = null;
        clienteBuilder2 = null;
    }
}