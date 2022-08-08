package aulas.aula2;
/**
 * CalculaArea
 */

public class CalculaArea {
    public static double area(double aresta) {
        return aresta * aresta;  
    }
    public static double area(double aresta1, double aresta2) {
        return aresta1 * aresta2;  
    }
    public static double area(double baseMaior, double baseMenor, double altura) {
        return ((baseMaior+baseMenor)*altura) / 2;  
    }
    public static double area(float diagonal1, float diagonal2) {
      return (diagonal1 * diagonal2)/2;  
    }
}