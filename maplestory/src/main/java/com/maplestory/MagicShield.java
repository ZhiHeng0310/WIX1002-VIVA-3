package com.maplestory;

public class MagicShield {

    // -----------------------
    // Instance Variables
    // -----------------------
    private double radius;
    private double thickness;
    private String elementType;

    // -----------------------
    // Static Variables
    // -----------------------
    private static final double DEFAULT_RADIUS = 1.0;
    private static final double DEFAULT_THICKNESS = 5.0;
    private static int shieldCount = 0;

    // -----------------------
    // Constructors
    // -----------------------
    public MagicShield() {
        this.radius = DEFAULT_RADIUS;
        this.thickness = DEFAULT_THICKNESS;
        this.elementType = "Neutral";
        shieldCount++;
    }

    public MagicShield(double radius, double thickness, String elementType) {
        setRadius(radius);
        setThickness(thickness);
        setElementType(elementType);
        shieldCount++;
    }

    // -----------------------
    // Encapsulation Methods
    // -----------------------
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Invalid radius");
        }
        this.radius = radius;
    }

    public double getThickness() {
        return thickness;
    }

    public void setThickness(double thickness) {
        if (thickness < 0) {
            throw new IllegalArgumentException("Invalid thickness");
        }
        this.thickness = thickness;
    }

    public String getElementType() {
        return elementType;
    }

    public void setElementType(String elementType) {
        if (elementType == null || elementType.isEmpty()) {
            this.elementType = "Neutral";
        } else {
            this.elementType = elementType;
        }
    }

    // -----------------------
    // Instance Methods
    // -----------------------
    public double calculateDefensePower() {
        return calculateDefensePower(radius, thickness, elementType);
    }

    public double calculateManaCost() {
        return radius * 10 + thickness * 2;
    }

    // -----------------------
    // Static Methods
    // -----------------------
    public static int getShieldCount() {
        return shieldCount;
    }

    public static boolean isValidSize(double size) {
        return size >= 0;
    }

    public static double calculateDefensePower(double radius,
                                                double thickness,
                                                String elementType) {

        double coefficient;

        switch (elementType) {
            case "Fire": coefficient = 1.1; break;
            case "Ice": coefficient = 1.2; break;
            case "Light": coefficient = 1.3; break;
            case "Dark": coefficient = 1.4; break;
            default: coefficient = 1.0;
        }

        return (radius * thickness) * coefficient;
    }

    public static double calculateManaCost(double radius, double thickness) {
        return radius * 10 + thickness * 2;
    }

    // -----------------------
    // toString
    // -----------------------
    @Override
    public String toString() {
        return String.format(
            "[\u001B[92mMagicShield Info\u001B[0m]\n" +
            "Element Type: %s\n" +
            "Radius: %.1f m\n" +
            "Thickness: %.1f cm\n" +
            "Defense Power: %.2f\n" +
            "Mana Cost: %.1f",
            elementType, radius, thickness,
            calculateDefensePower(), calculateManaCost()
        );
    }
    
}
