
package prob1;

public class Rectangulo implements Forma{
    
    private double Area;

    public Rectangulo(){
        
    }
    
    public void setArea(double Area) {
        this.Area = Area;
    }

    public double getArea() {
        return Area;
    }
    
    @Override
    public void CalcularArea() {
        this.Area=25.5;
    }
    
    public void CalcularArea(double base,double altura){
        this.Area=base*altura;
    }
    
}
