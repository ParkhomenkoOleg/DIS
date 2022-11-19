public class Main {
    public static void main(String[] args) {
        Fighter barbarian = new Knight();
        Wizard wizard = new Wizard();
        WizardAdapter wizardAdapter = new WizardAdapter(wizard);

        System.out.println("<----Barbarian's Action----->");
        barbarian.attack();
        barbarian.defend();
        barbarian.escape();

        System.out.println("\n<----Wizard's Action----->");
        wizardAdapter.attack();
        wizardAdapter.defend();
        wizardAdapter.escape();
    }
}
