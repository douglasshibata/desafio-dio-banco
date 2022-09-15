package me.dio.web.banco;

import java.util.ArrayList;
import java.util.List;

import me.dio.web.banco.model.Banco;
import me.dio.web.banco.model.Cliente;
import me.dio.web.banco.model.Conta;
import me.dio.web.banco.model.ContaCorrente;
import me.dio.web.banco.model.ContaPoupanca;

public class BancoDioMain {
	public static void main(String[] args) {
		Cliente alguem = new Cliente();
		alguem.setNome("Alguém");

		Conta cc = new ContaCorrente(alguem);
		Conta poupanca = new ContaPoupanca(alguem);

		cc.depositar(100);
		cc.transferir(100, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		Banco banco = new Banco();
		List<Conta> contas = new ArrayList<>();
		contas.add(poupanca);
		contas.add(cc);
		banco.setContas(contas);
		banco.listarClientes();
	}
}
