package org.FatimaHasT.qamp.zadaci.zadaca5.task1;

public class Furniture {

    private String type;
    private String material;
    private int height;
    private boolean collapsible;

    public Furniture(final String type, final String material, final int height) {
        this.type = type;
        this.material = material;
        this.height = height;
        this.collapsible = false;
    }

    public Furniture(final String type, final String material, final int height, final boolean collapsible) {
        this.type = type;
        this.material = material;
        this.height = height;
        this.collapsible = collapsible;
    }

    public void collapse() {
        if (collapsible) {
            System.out.println(type + " is collapsible.");
        } else {
            System.out.println(type + " cannot be collapsed.");
        }
    }

    public void disassemble() {
        if (collapsible) {
            System.out.println(type + " can be disassembled.");
        } else {
            System.out.println(type + " cannot be disassembled.");
        }
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(final String material) {
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(final int height) {
        this.height = height;
    }

    public boolean Collapsible() {
        return collapsible;
    }

    public void setCollapsible(final boolean collapsible) {
        this.collapsible = collapsible;
    }

}
