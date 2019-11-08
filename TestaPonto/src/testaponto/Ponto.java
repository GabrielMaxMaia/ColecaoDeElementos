package testaponto;
/**
 *
 * @author gabriel.mmcarmo
 */
public class Ponto {
    //Atributos
    private int x, y;
    
    //Construtores
    public Ponto(){
        this.x = 0;
        this.y = 0;
    }
    
    public Ponto(int x, int y){
        this.x = x;
        this.y = y;
    }

    //Getters e Setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    //Métodos do objeto
    public boolean igual (Ponto ponto){
        return this.x == ponto.getX() && this.y == ponto.getY();
    }
}
