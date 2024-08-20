package org.example;

class BoilerFactory {
    public static Boiler createBoiler(BoilerType type, BoilerModel model) {
        switch (type) {
            case TOIVO:
                return new ToivoBoiler(model);
            case SUARI:
                return new SuariBoiler(model);
            case AINOVA:
                return new AinovaBoiler(model);
            case SALMI:
                return new SalmiBoiler(model);
            default:
                throw new IllegalArgumentException("Unknown boiler type");
        }
    }
}
