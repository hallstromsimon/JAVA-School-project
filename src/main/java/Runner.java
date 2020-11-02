package se.jensen;

public class Runner {
    public  static void main(String[]args) {
        Fruit Fruit = new Fruit();
        Fruit.SetI("My-value");
        System.out.println(Fruit.GetId());

        GenaricExamle<Integer> GenaricExamle = new GenaricExamle<integer>();
        GenaricExamle.setValue(1);
        System.out.println(GenaricExamle.getValue());

        GenaricExamle<Fruit> fruitGenaricExamle = new GenaricExamle<fruit>();
        fruitGenaricExamle.setValue() Fruit;
        System.out.println(fruitGenaricExamle.GEtValue());
    }
}
