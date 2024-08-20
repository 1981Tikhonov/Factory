package org.example;

// все характеристики по каждому типу забил для примера, это не точные, мне нужно понять, я в рпавильном направлении иду

class ToivoBoiler extends Boiler {
    public ToivoBoiler(BoilerModel model) {
        super(BoilerType.TOIVO, model, "Series A", "kW", "toivo_image.png",
                "High Efficiency", "Compact Design", "Cost-effective", "20-50 kW");
    }
}

class SuariBoiler extends Boiler {
    public SuariBoiler(BoilerModel model) {
        super(BoilerType.SUARI, model, "Series B", "kW", "suari_image.png",
                "Durable", "Long Lifespan", "Low Maintenance", "15-40 kW");
    }
}

class AinovaBoiler extends Boiler {
    public AinovaBoiler(BoilerModel model) {
        super(BoilerType.AINOVA, model, "Series C", "kW", "ainova_image.png",
                "Energy Efficient", "Quiet Operation", "Environmentally Friendly", "10-30 kW");
    }
}

class SalmiBoiler extends Boiler {
    public SalmiBoiler(BoilerModel model) {
        super(BoilerType.SALMI, model, "Series D", "litres", "salmi_image.png",
                "Compact Size", "Stylish Design", "Fast Heating", "50-150 litres");
    }
}
