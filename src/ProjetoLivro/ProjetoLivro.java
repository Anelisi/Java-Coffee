package ProjetoLivro;

public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[4];

        p[0] = new Pessoa("Anelisi", 33, "F");
        p[1] = new Pessoa("Arthur", 33, "M");

        l[0] = new Livro("Getulio","Lira Neto", 500,p[0]);
        l[1] = new Livro("Nárnia","C.S.Lewis", 300,p[1]);
        l[2] = new Livro("CãoCenso","John Bradshaw", 200,p[1]);
        l[3] = new Livro("A décima Profecia","James Redfild", 150,p[0]);

        l[0].abrir();
        l[0].folhear(200);
        l[0].proxPag();

        System.out.println(l[0].detalhes());

    }
}
