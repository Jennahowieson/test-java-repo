public class Runner {
    public static void main(String[] args) {

        Planet mars = new Planet("mars", 908973);

//        System.out.println(mars.getName() + " is " + mars.getSize());
        System.out.println(String.format("%s is %s", mars.getName(), mars.getSize()));


        System.out.println(mars.explode());
    }
}
