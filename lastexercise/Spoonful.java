/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lastexercise;

/**
 *
 * @author harperkates
 */
public class Spoonful {

    private int tablespoon;
    private int teaspoon;
    
    public Spoonful(int tablespoon, int teaspoon){
        this.tablespoon = tablespoon;
        this.teaspoon = teaspoon;
    } //Spoonful(int, int)
    
    public Spoonful add(Spoonful other){
        int tbsp = this.tablespoon + other.tablespoon + (this.teaspoon + other.teaspoon) / 3;
        int tsp = (this.teaspoon + other.teaspoon) % 3;
        return new Spoonful(tbsp, tsp);
    } //add(Spoonful)
    
    @Override
    public String toString(){
        return this.tablespoon + " tbsp, " + this.teaspoon + " tsp";
    } //toString()
    
    public static void main(String[] args) {
        Spoonful spoon1 = new Spoonful(3, 2);
        Spoonful spoon2 = spoon1.add(spoon1);
        System.out.println(spoon2);
    } //main(String[])
    
} //Spoonful
