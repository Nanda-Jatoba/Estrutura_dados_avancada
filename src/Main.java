//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Vetor lista = new Vetor();

        //System.out.printf("Hello and welcome!");
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Aluno a4 = new Aluno();
        Aluno a5 = new Aluno();
        Aluno a6 = new Aluno();
        Aluno a7 = new Aluno();
        Aluno a8 = new Aluno();
        Aluno a9 = new Aluno();
        Aluno a10 = new Aluno();
        Aluno a11 = new Aluno();
        Aluno a12 = new Aluno();
        Aluno a13 = new Aluno();
        Aluno a14 = new Aluno();
        Aluno a15 = new Aluno();


        a1.setNome("Glevson");
        a2.setNome("Francisco");
        a3.setNome("Maria");
        a4.setNome("João");
        a5.setNome("Pedro");
        a6.setNome("Nanda");
        a7.setNome("Pedrão");
        a8.setNome("Joaquim");
        a9.setNome("Larissa");
        a10.setNome("Mateus");
        a11.setNome("Natalia");
        a12.setNome("Otávio");
        a13.setNome("Paula");
        a14.setNome("Rafael");
        a15.setNome("Sara");


        //System.out.println("\nAlunos: "+ a2.getNome());
        //System.out.println("Alunos: "+ a1.getNome());


        lista.Adiciona(a1);
        lista.Adiciona(a2);
        lista.Adiciona(a3);
        lista.Adiciona(a4);
        lista.Adiciona(a5);
        lista.Adiciona(a6);
        lista.Adiciona(a7);
        lista.Adiciona(a8);
        lista.Adiciona(a9);
        lista.Adiciona(a10);
        lista.Adiciona(a11);
        lista.Adiciona(a12);
        lista.Adiciona(a13);
        lista.Adiciona(a14);
        lista.Adiciona(a15);

        System.out.println(lista);

        System.out.println("Total de alunos: " +lista.getTotalDealunos());

        lista.Remove(8);
        lista.Remove(11);

        //System.out.println(lista);

        //System.out.println("Total de alunos: " +lista.getTotalDealunos());

        lista.Imprima();

        //System.out.println(lista.contem(a6));

        //System.out.println(lista.pega(6));


    }
}