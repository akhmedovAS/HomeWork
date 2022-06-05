import Furniture.FurnitureType;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите тип мебели. На выбор доступны только Кровать, Шкаф, Стол, Стул:");
        String type = scanner.nextLine();
        System.out.println("Введите любое название мебели:");
        String name = scanner.nextLine();
        System.out.println("Введите любой цвет мебели:");
        String color = scanner.nextLine();

        FurnitureName furnitureName = new FurnitureName(name);
        FurnitureColor furnitureColor = new FurnitureColor(color);
        FurnitureConstructor furnitureConstructor = new FurnitureConstructor();
        Furniture furniture = new Furniture();

        furniture.createFurniture(furnitureName,furnitureColor);
        System.out.println("Тип: "+furnitureConstructor.userType(type));




    }
}
