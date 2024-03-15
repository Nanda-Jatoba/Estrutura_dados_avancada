public class Vetor {
    private Aluno[] alunos = new Aluno[40];
    private String AlunosSalvo[];

    private int totalDealunos = 0;

    public void Adiciona (Aluno aluno){
        this.alunos[this.totalDealunos]= aluno;
        this.totalDealunos++;
    }

    public int getTotalDealunos(){
        return totalDealunos;
    }

    public void adicionaPosicao(int posicao, Aluno aluno){
        alunos[posicao] = aluno;
    }

    public void Alunopega (int posicao){
    }

    public void Remove(int posicao){
        alunos[posicao] = null;
    }

    public  boolean contem(Aluno aluno){
        for(int i=0; i<alunos.length; i++){
            if(aluno==alunos[i]) {
                return true;
            }
        }
        return false;
    }

    public int tamanho (){
        return this.totalDealunos;
    }

    public String toString() {
        if(this.totalDealunos==0){
            return "[]";
        }

        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < this.totalDealunos- 1; i++) {
            builder.append(this.alunos[i]);
            builder.append(", ");
        }
        builder.append(this.alunos[this.totalDealunos- 1]);
        builder.append("]");

        return builder.toString();
    }

    private boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao < this.totalDealunos;
    }

    public Aluno pega(int posicao){
        if(!this.posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.alunos[posicao];
    }

    public void Imprima() {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null) {
                System.out.print(alunos[i] + ", ");
            }
        }
        System.out.println();
    }


}
