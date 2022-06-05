public class Furniture {

    public void createFurniture(FurnitureName furnitureName, FurnitureColor furnitureColor){
        System.out.println("Вы создали мебель:");
        System.out.println("Имя: "+furnitureName.getName());
        System.out.println("Цвет: "+furnitureColor.getColor());
    }
}
