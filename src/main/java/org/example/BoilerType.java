package org.example;

enum BoilerType {
    TOIVO("Котлы настенные газовые"),
    SUARI("Водонагреватели проточные газовые"),
    AINOVA("Котлы настенные электрические"),
    SALMI("Водонагреватели электрические накопительные");

    private String description;

    BoilerType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

enum BoilerModel {
    // TOIVO Models
    TOIVO_SINGLE_CIRCUIT_NO_VALVE("Одноконтурные", "(с закрытой камерой) без трёхходового клапана"),
    TOIVO_SINGLE_CIRCUIT_WITH_VALVE("Одноконтурные", "(с закрытой камерой) с трёхходовым клапаном"),
    TOIVO_DUAL_CIRCUIT("Двухконтурные", "(с закрытой камерой)"),

    // SUARI Models
    SUARI_CLASSIC_MECHANICAL("Классические модели", "(с механической регулировкой)"),
    SUARI_CLASSIC_ELECTRONIC("Классические модели", "(с электронной модуляцией пламени)"),
    SUARI_SEMI_TURBO("Полутурбо", "(дымоход в комплекте)"),
    SUARI_TURBO("Турбо", "(дымоход в комплекте)"),

    // AINOVA Models
    AINOVA_STANDARD("Стандарт", ""),
    AINOVA_MINI("Миникотельные", ""),

    // SALMI Models
    SALMI_SMALL_LITRE("Малый литраж", ""),
    SALMI_ROUND_ECONOMY("Круглые эконом", ""),
    SALMI_ROUND_COMFORT("Круглые комфорт", ""),
    SALMI_FLAT_COMFORT("Плоские комфорт", ""),
    SALMI_FLAT_PREMIUM("Плоские премиум", ""),
    SALMI_LARGE_LITRE("Большой литраж", "");

    private String name;
    private String description;

    BoilerModel(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}

