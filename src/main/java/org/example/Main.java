package org.example;

public class Main {
    public static void main(String[] args) {
        Boiler toivoBoiler = BoilerFactory.createBoiler(BoilerType.TOIVO, BoilerModel.TOIVO_DUAL_CIRCUIT);
        System.out.println(toivoBoiler);

        Boiler suariBoiler = BoilerFactory.createBoiler(BoilerType.SUARI, BoilerModel.SUARI_TURBO);
        System.out.println(suariBoiler);

        Boiler ainovaBoiler = BoilerFactory.createBoiler(BoilerType.AINOVA, BoilerModel.AINOVA_STANDARD);
        System.out.println(ainovaBoiler);

        Boiler salmiBoiler = BoilerFactory.createBoiler(BoilerType.SALMI, BoilerModel.SALMI_FLAT_PREMIUM);
        System.out.println(salmiBoiler);
    }
}
