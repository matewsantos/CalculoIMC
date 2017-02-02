package principal;

import entidades.Paciente;

public class Principal {
	public static void main(String[] args) {
		Paciente paciente1 = new Paciente(79.5, 1.72);
		paciente1.setNome("Mateus Santos");
		
		Paciente paciente2 = new Paciente(62, 1.80);
		paciente2.setNome("Rafael Silva");
		
		Paciente paciente3 = new Paciente(115.5, 1.95);
		paciente3.setNome("Leonardo Ferrreira");
		
		System.out.println("Diagnóstico do paciente " + paciente1.getNome() + ": " + paciente1.diagnostico() + ". IMC:" + paciente1.getImc());
		System.out.println("Diagnóstico do paciente " + paciente2.getNome() + ": " + paciente2.diagnostico() + ". IMC:" + paciente2.getImc());
		System.out.println("Diagnóstico do paciente " + paciente3.getNome() + ": " + paciente3.diagnostico() + ". IMC:" + paciente3.getImc());
	}
}
