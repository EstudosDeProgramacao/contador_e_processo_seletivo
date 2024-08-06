package br.com.damatomos.candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void selecaoCandidatos()
    {
        String[] candidatos = {"FELIPE", "PAULO", "MARIA", "RAISSA", "LUCAS", "ANA"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0d;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length)
        {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.printf("O candidato %s solicitou este valor de salário %.2f\n", candidato, salarioPretendido);
            if (salarioBase >= salarioPretendido)
            {
                System.out.printf("O candidato %s foi selecionado para a vaga\n", candidato);
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    public static double valorPretendido()
    {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    public static void analisarCandidato(double salarioPretendido)
    {
        double salarioBase = 2000.0d;
        if (salarioBase > salarioPretendido)
        {
            System.out.println("Ligar para o candidato");
        } else if(salarioBase==salarioPretendido)
        {
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}
