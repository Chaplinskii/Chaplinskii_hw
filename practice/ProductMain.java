package less1.practice;

import less1.practice.impl.BottleOfWater;
import less1.practice.impl.EPackage;
import less1.practice.impl.HotDrink;
import less1.practice.impl.WaterVendingMachine;

import java.time.LocalDate;
import java.util.List;

public class ProductMain {

    public static void main(String[] args) {
        Product bottle1 = new BottleOfWater("Родники", 55, LocalDate.of(2024, 5, 1));

        Product bottle2 = new BottleOfWater("Родники Газированная", 55, LocalDate.of(2024, 5, 1),
                true, EPackage.GLASS.getMaterial(), 0.5F);
        Product bottle3 = new HotDrink("Coffee", 160, LocalDate.of(2024, 5, 1),
                false, EPackage.GLASS.getMaterial(), 0.3F, 90);

        VendingMachine vm = new WaterVendingMachine();

        System.out.println(vm.getProducts());

        vm.addProducts(List.of(bottle1, bottle2));
        vm.addProducts(List.of (bottle3));

        System.out.println(vm.getProducts());

        vm.getProduct("Родники");

        System.out.println(vm.getProducts());

    }
}
