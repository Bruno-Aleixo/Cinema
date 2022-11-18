import java.util.Scanner;
import java.util.ArrayList;


public class Cinema {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] Filmes = {"Obi-Wan","Mandalorian","A resistencia","Star Wars"};
        String[] Sessoes = {"1 - 18:00","2 - 20:00","3 - 22:00","4 - 23:30"};

        int ingressos_inteira = 32;
        int ingresso_meia = 16;
        System.out.println("\\ = \\ = \\ BEM VINDO AO CINEMANIA! //=//=// ");
        System.out.println("");
        System.out.println("Filmes disponiveis: ");
        Scanner filme = new Scanner(System.in);
        listafilmes();
        System.out.println("Escolha seu filme: ");
        int filmes1 = filme.nextInt();
        System.out.println("Ok! o fime escolhido foi: "+Filmes[filmes1 -1]);
        System.out.println("==============================================");
        System.out.println("Sessoes disponiveis: ");
        Scanner sessoes = new Scanner(System.in);
        listasessoes();
        System.out.println("Escolha uma das sessoes disponiveis: ");
        int sessoes1 = filme.nextInt();
        System.out.println("Ok! a sessao escolhida foi: "+Sessoes[sessoes1 -1]);
        System.out.println("==============================================");
        System.out.println("Quantos ingressos pretende comprar para o filme "+Filmes[filmes1]+"?");
        int ingressos = input.nextInt();

        System.out.println("Digite 1 Ingressos Inteiro e 2 para meia-entrada:");
        int ingressos1 = input.nextInt();
        System.out.println("==============================================");
        if (ingressos1 == 1) {
            System.out.println("Ok! tudo pronto!");
            System.out.println("Seu filme foi "+Filmes[filmes1]+" e a sessao escolhida foi de "+Sessoes[sessoes1]+" Horas.");
            int total = ingressos * ingressos_inteira;

            System.out.println("O valor total foi de: "+total+" R$.");
            System.out.println("Tenha um ótimo filme!");

        }
        if (ingressos1 ==2){
            System.out.println("Ok! tudo pronto!");
            System.out.println("Seu filme foi "+Filmes[filmes1]+" e a sessao escolhida foi de "+Sessoes[sessoes1]+" Horas.");
            int total = ingressos * ingresso_meia;

            System.out.println("O valor total foi de: "+total+" R$.");
            System.out.println("Tenha um ótimo filme!");
        }

    }
    static void listafilmes() {
        ArrayList<String> filmes = new ArrayList<>();
        filmes.add("Obi-Wan");
        filmes.add("Mandalorian");
        filmes.add("A resistencia");
        filmes.add("Star Wars");
        for (int i = 0; i < filmes.size(); i++) {
            System.out.println(i+1 + " - " + filmes.get(i));
        }

    }

    static void listasessoes(){
        ArrayList<String> sessoes = new ArrayList<>();
        sessoes.add("18:00");
        sessoes.add("20:00");
        sessoes.add("22:00");
        sessoes.add("23:30");
        for (int i = 0; i < sessoes.size(); i++) {
            System.out.println(i+1 + " - " + sessoes.get(i));
        }

    }
}
