public class VacuumCleanerTest {
    public static void main(String[] args) {

        VacuumCleaner vac1 = new VacuumCleaner();
        vac1.producer = "Samsung";
        vac1.model = "Star";
        vac1.power = 1300;
        vac1.bagCapacity = 4.5;

        VacuumCleaner vac2 = new VacuumCleaner();
        vac2.producer = "Zelmer";
        vac2.model = "Dot";
        vac2.power = 1100;
        vac2.bagCapacity = 3.2;

        System.out.println("Odkurzacz 1:");
        System.out.printf("Producent: %s, model: %s, moc: %dW, pojemność worka: %.1fL", vac1.producer, vac1.model, vac1.power, vac1.bagCapacity);
        System.out.println("\nOdkurzacz 2:");
        System.out.printf("Producent: %s, model: %s, moc: %dW, pojemność worka: %.1fL", vac2.producer, vac2.model, vac2.power, vac2.bagCapacity);

    }
}
