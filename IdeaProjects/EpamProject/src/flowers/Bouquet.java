package flowers;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {

        private List<Flower> flowers;

        public Bouquet() {
            flowers = new ArrayList<>();
        }

        public void addFlower(Flower flower) {
            flowers.add(flower);
        }

        public double calculateCost() {
            double totalCost = 0.0;
            for (Flower flower : flowers) {
                totalCost += flower.getCost();
            }
            return totalCost;
        }

public static void main(String[] args){
            Bouquet bouguet= new Bouquet();
    bouguet.addFlower(new Jasmine());
    bouguet.addFlower(new Lily());
   double cost= bouguet.calculateCost();
    System.out.println(cost);

    }
}
