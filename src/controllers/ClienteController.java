package controllers;

import java.util.Scanner;

import entities.Cliente;
import repositories.ClienteRepository;

public class ClienteController {

	public void cadastrarCliente() {

		try {

			System.out.println("\nCADASTRO DE CLIENTES:\n");

			Cliente cliente = new Cliente();
			Scanner scanner = new Scanner(System.in);

			System.out.println("NOME DO CLIENTE.....:");
			cliente.setNome(scanner.nextLine());

			System.out.println("EMAIL DO CLIENTE....:");
			cliente.setEmail(scanner.nextLine());

			ClienteRepository clienteRepository = new ClienteRepository();
			clienteRepository.create(cliente);

			System.out.println("\nCLIENTE CADASTRADO COM SUCESSO!");

		} catch (Exception e) {
			System.out.println("\nFALHA AO CADASTRAR O CLIENTE!");
			e.printStackTrace();
		}
	}
}
