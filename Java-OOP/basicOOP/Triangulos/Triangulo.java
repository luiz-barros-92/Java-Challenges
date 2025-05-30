package triangulos;

public class Triangulo {
    private float lado1;
    private float lado2;
    private float lado3;
    
    public Triangulo(float l1, float l2, float l3) {
        this.lado1 = l1;
        this.lado2 = l2;
        this.lado3 = l3;
    }
    
    public float getLado1() {
        return lado1;
    }
    public float getLado2() {
        return lado2;
    }
    public float getLado3() {
        return lado3;
    }
    
    public float calcularArea(){
        float p = (this.getLado1() + this.getLado2() + this.getLado3()) / 2;
        
        float area = (float) Math.sqrt(p * ((p - this.getLado1()) * (p - this.getLado2()) * (p - this.getLado3())));
        
        return area;
    }
    
}

