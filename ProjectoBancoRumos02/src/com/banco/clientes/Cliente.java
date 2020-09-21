package com.banco.clientes;

import com.banco.Agencia;
import com.banco.contas.Conta;
import com.banco.output.Menu;
import java.util.List;

public class Cliente {

    private int numCliente;
    public static int contadorClientes = 0;
    private long numCidadao;
    private String nome;
    private String morada;
    private String profissao;
    private String telefone;
    private String email;
    private int numAgencia;
    public List<Conta> contas;

    public Cliente() {
    }

    public Cliente(int numCliente, long numCidadao, String nome, String morada, String profissao, String telefone, String email, int numAgencia, List<Conta> contas) {
        this.numCliente = numCliente;
        this.numCidadao = numCidadao;
        this.nome = nome;
        this.morada = morada;
        this.profissao = profissao;
        this.telefone = telefone;
        this.email = email;
        this.numAgencia = numAgencia;
        this.contas = contas;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public void setNumCidadao(long numCidadao) {
        this.numCidadao = numCidadao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumAgencia(int numAgencia) {
        this.numAgencia = numAgencia;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public long getNumCidadao() {
        return numCidadao;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public String getNome() {
        return nome;
    }

    public String getMorada() {
        return morada;
    }

    public String getProfissao() {
        return profissao;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public int getNumAgencia() {
        return numAgencia;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public static Cliente novoCliente() {
        int numCliente = contadorClientes;
        long numCidadao = Menu.lerLongMsg("Introduza numero de Cartao de Cidadao do Cliente num "+ numCliente+": ");
        String nome = Menu.lerStringMsg("Introduza o(s) nome(s) do Cliente num "+ numCliente+": ");
        String morada = Menu.lerStringMsg("Introduza a morada do Cliente num "+ numCliente+": ");
        String profissao = Menu.lerStringMsg("Introduza a profissao: do Cliente num "+ numCliente+": ");
        String telefone = Menu.lerStringMsg("Introduza o numero de telefone do Cliente num "+ numCliente+": ");
        String email = Menu.lerStringMsg("Introduza endereco de email do Cliente num "+ numCliente+": ");
        int numAgencia = Menu.lerIntMsg("Introduza o numero de Agencia: 1- Agencia Porto; 2- Agencia Lisboa: ");
        List<Conta> contas = null;
        return new Cliente(numCliente, numCidadao, nome, morada, profissao, telefone, email, numAgencia, contas);
    }

    public void alocarClienteGeralAgencia(Cliente cliente) {
        if (cliente.getNumAgencia() == 1) {
            clientesPorto.add(cliente);
        } else {
            clientesLisboa.add(cliente);
        }
    }

}
