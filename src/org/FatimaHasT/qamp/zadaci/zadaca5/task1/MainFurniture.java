package org.FatimaHasT.qamp.zadaci.zadaca5.task1;

public class MainFurniture {
    public static void main(String[] args) {
        Furniture chair = new Furniture("chair", "wood", 80, true);
        Furniture wardrobe = new Furniture("wardrobe", "metal", 200);

        System.out.println("Type of furniture: " + chair.getType());
        System.out.println("Material of furniture: " + chair.getMaterial());
        System.out.println("High of furniture: " + chair.getHeight());
        System.out.println("is Collapsible? " + chair.Collapsible());
        chair.collapse();
        chair.disassemble();

        System.out.println("Type of furniture: " + wardrobe.getType());
        System.out.println("Material of furniture: " + wardrobe.getMaterial());
        System.out.println("High of furniture: " + wardrobe.getHeight());
        System.out.println("is Collapsible? " + wardrobe.Collapsible());
        wardrobe.collapse();
        wardrobe.disassemble();

    }
}
