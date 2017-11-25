public class VacuumCleanerTest {
    public static void main(String[] args) {

        VacuumCleaner vac1 = new VacuumCleaner("Samsung","Star",1300,4.5);

        VacuumCleaner vac2 = new VacuumCleaner("Zelmer","Dot",1100,3.2);

        System.out.println("Odkurzacz 1:");
        System.out.printf("Producent: %s, model: %s, moc: %dW, pojemność worka: %.1fL", vac1.producer, vac1.model, vac1.power, vac1.bagCapacity);
        System.out.println("\nOdkurzacz 2:");
        System.out.printf("Producent: %s, model: %s, moc: %dW, pojemność worka: %.1fL", vac2.producer, vac2.model, vac2.power, vac2.bagCapacity);

    }
}
