public class FurnitureConstructor {




    public FurnitureType userType(String type) {
        switch (type.toLowerCase()) {
            case "шкаф":
                return FurnitureType.CUPBOARD;

            case "стол":
                return FurnitureType.TABLE;

            case "кровать":
                return FurnitureType.BED;

            case "стул":
                return FurnitureType.CHAIR;

            default:
                System.out.println("Может быть только 4 типа мебели!");
        }
        return FurnitureType.DEFAULT;
    }


}