package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();
        List<Endereco> enderecos= new ArrayList<>();


        System.out.println("Digite a quantidade de pessoas a serem cadastradas: ");
        int qntd_pessoas = leitura.nextInt();
        for (int i = 1; i <= qntd_pessoas; i++) {
            System.out.println(String.format("\nCadastro de Pessoa [ %s ] - Digite o nome e telefone, respectivamente, separados por ENTER: ", i));
            String nome = leitura.next();
            String telefone = leitura.next();
            System.out.println(String.format("Digite a quantidade de endereços para o cadastro de %s: ", nome));
            int qntd_enderecos = leitura.nextInt();
            for (int j = 1; j <= qntd_enderecos; j++) {
                System.out.println(String.format("\nEndereço [ %s ] - Digite o logradouro, cidade e estado, respectivamente, separados por ENTER: ", j));
                String logradouro = leitura.nextLine();
                String cidade = leitura.nextLine();
                String estado = leitura.nextLine();
                enderecos.add(new Endereco(logradouro ,cidade, estado));
            }
            pessoas.add(new Pessoa(nome, telefone, enderecos));
            enderecos.clear();
        }
        for (Pessoa pessoa:
                pessoas) {
            System.out.println(" - "+ pessoa.getNome() + " - Telefone: "+ pessoa.getTelefone());
            System.out.println(" - Enderecos: ");
            for (Endereco end:
                    pessoa.getEnderecos()) {
                System.out.println(" --- "+ end.getLogradouro() + " - " + end.getCidade() + " - " + end.getEstado());
            }
            System.out.println("\n");
        }
    }
}