package org.example;

abstract class Boiler {
    private BoilerType type;
    private BoilerModel model;
    private String series;
    private String unit;
    private String imagePath;
    private String characteristics;
    private String attributes;
    private String advantages;
    private String technicalSpecifications;

    public Boiler(BoilerType type, BoilerModel model, String series, String unit,
                  String imagePath, String characteristics, String attributes,
                  String advantages, String technicalSpecifications) {
        this.type = type;
        this.model = model;
        this.series = series;
        this.unit = unit;
        this.imagePath = imagePath;
        this.characteristics = characteristics;
        this.attributes = attributes;
        this.advantages = advantages;
        this.technicalSpecifications = technicalSpecifications;
    }

    public BoilerType getType() {
        return type;
    }

    public BoilerModel getModel() {
        return model;
    }

    public String getSeries() {
        return series;
    }

    public String getUnit() {
        return unit;
    }

    public String getImagePath() {
        return imagePath;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public String getAttributes() {
        return attributes;
    }

    public String getAdvantages() {
        return advantages;
    }

    public String getTechnicalSpecifications() {
        return technicalSpecifications;
    }

    @Override
    public String toString() {
        return "Type: " + type.getDescription() + ", Model: " + model.getName() + " " + model.getDescription() +
                ", Series: " + series + ", Unit: " + unit + ", Image: " + imagePath +
                ", Characteristics: " + characteristics + ", Attributes: " + attributes +
                ", Advantages: " + advantages + ", Technical Specifications: " + technicalSpecifications;
    }
}

