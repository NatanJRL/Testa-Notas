import java.util.Scanner;
import java.util.ArrayList;
class TestaNotas{
    public static void main(String[] args){

        ArrayList<Integer> notas = new ArrayList<Integer>();


        System.out.println("Insira suas notas: ");
        Scanner leitor = new Scanner(System.in);
        int nota = 0;
        while(nota != -1){
            nota = leitor.nextInt();
            if(nota == -1){
                break;
            }
            notas.add(nota);
            System.out.println(notas);
        }
        int notaTotal = 0;

        for(int i = 0; i < notas.size(); i++){
            notaTotal = notaTotal + notas.get(i);
        }

        int notaFinal = notaTotal/notas.size();

        if (notaFinal >= 7){
            System.out.println("Você está Aprovado!");
        } else if (notaFinal >= 5) {
            System.out.println("Você está de Exame.");
        }else System.out.println("Você está Reprovado.");
    }


}








