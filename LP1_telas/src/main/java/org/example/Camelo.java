package org.example;//

public class Camelo {
    String dividirCamelo(int quantidadeDeCamelo) {//número que vem da controller (tela) pro método
        //int quantidadeDeCamelo;


           //O que entra pelos parênteses é o dado que vem de fora (do usuário).

        //O que está dentro são as contas que o método calcula sozinho para gerar o resultado.

            int Bereniz = quantidadeDeCamelo / 2;
            int Hamaded = quantidadeDeCamelo / 3;
            int Harim = quantidadeDeCamelo / 9;
            int contador = quantidadeDeCamelo - (Bereniz + Hamaded + Harim);
            return ("\nDepois do contador adicionar mais um camelo o total foi 36 camelos sendo\n Bereniz ficou com: " + Bereniz + "\n Hamaded ficou com: " + Hamaded + "\n Harim ficou com: " + Harim + "\n De pagamento para o contador é: " + contador);
        }
    }

