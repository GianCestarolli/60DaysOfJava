public class EX {
    public static void main(String[] args) {

        //Define the initial shape as double
        double shapeValue = 42.75;

        System.out.println("Initial shape: " + shapeValue);

        System.out.println("Transforming into different shapes...");

        //Transforms the type to Int
        int intShape = (int) shapeValue;

        System.out.println("Int shape: " + intShape);

        //Transforms the type to long
        long longShape = (long) shapeValue;

        System.out.println("Long shape: " + longShape);

        //Transforms the type to float
        float floatShape = (float) shapeValue;

        System.out.println("Float shape: " + floatShape);
    }
}
