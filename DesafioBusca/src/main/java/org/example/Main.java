package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in).useDelimiter("\n");;
        List<Pessoa> pessoas = new ArrayList<>();


        System.out.println("Digite a quantidade de pessoas a serem cadastradas: ");
        int qntd_pessoas = leitura.nextInt();
        for (int i = 1; i <= qntd_pessoas; i++) {
            List<Endereco> enderecos= new ArrayList<>();
            System.out.println(String.format("\nCadastro de Pessoa [ %s ] - Digite o nome e telefone, respectivamente, separados por ENTER: ", i));
            String nome = leitura.next();
            String telefone = leitura.next();
            System.out.println(String.format("\nDigite a quantidade de endereços para o cadastro de %s: ", nome));
            int qntd_enderecos = leitura.nextInt();
            for (int j = 1; j <= qntd_enderecos; j++) {
                System.out.println(String.format("\nEndereço [ %s ] - Digite o logradouro, cidade e estado, respectivamente, separados por ENTER: ", j));
                String logradouro = leitura.next();
                String cidade = leitura.next();
                String estado = leitura.next();
                enderecos.add(new Endereco(logradouro ,cidade, estado));
            }
            pessoas.add(new Pessoa(nome, telefone, enderecos));
        }
        System.out.println("\nDigite o nome da pessoa que deseja ver informações:");
        String nomePessoa = leitura.next();
        for (Pessoa pessoa:
                pessoas) {
            if(pessoa.getNome().equals(nomePessoa)){
                System.out.println("\n");
                System.out.println(String.format("- Nome: %s \n- Telefone: %s \n- Endereços:", pessoa.getNome(), pessoa.getTelefone()));
                for (Endereco end:
                        pessoa.getEnderecos()) {
                    System.out.println(String.format(" --- %s , %s - %s", end.getLogradouro(), end.getCidade(), end.getEstado()));
                }
                System.out.println("\n");
                nomePessoa = "";
            }
        }
        if (!nomePessoa.isEmpty()){
            System.out.println("\nNenhuma pessoa foi encontrada com o nome: " + nomePessoa);
        }
    }
}