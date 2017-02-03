/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoo;

/**
 *
 * @author Jafet
 */
public class LifeSpan {
    private int minimum;
    private int maximum;

    public LifeSpan(){}
    
    public LifeSpan(int minimum, int maximum){
        setMinimum(minimum);
        setMaximum(maximum);
    }
    
    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }
    
    @Override
    public String toString(){
        return "" + getMinimum() + " - " + getMaximum();
    }
}
