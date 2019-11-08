package testaponto;
/**
 *
 * @author gabriel.mmcarmo
 */
public class TestaPonto {
    //Classe cliente para executar projeto
    public static void main(String[] args) {
        Ponto p1 = new Ponto(3,4);
        Ponto p2 = new Ponto(3,5);
        
        System.out.println(p1.igual(p2));
    }
}
