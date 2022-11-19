public class WizardAdapter implements Fighter {

    private Wizard wizard;

    public WizardAdapter(Wizard wizard) {
        this.wizard = wizard;
    }

    @Override
    public void attack() {
        this.wizard.castLightBeam();
    }

    @Override
    public void defend() {
        this.wizard.fireBird();
    }

    @Override
    public void escape() {
        this.wizard.openPortal();
    }
}