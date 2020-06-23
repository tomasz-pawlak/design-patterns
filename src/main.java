package House;

public class main {

    //Z klasą wewnętrzną - Builder używany, gdy ma bardzo dużo argumentów(pól), nie chcemy dużej liczby constr,
    //użytkownik bez dostepu do setterów, ustawianie wartości przy tworzeniu, ale po stworzeniu bez mozliwosci zmian

    //Z interface(klasyczny) - bez mozliwosci ustawiania wartosci na starcie, dyrektor zajmuje sie wszystkim.

    //poznac mozna po strukturze

    //Można używać Lombok, który przyśpieszy tworzenie @Builder
    public static void main(String[] args) {

        SmallHouse smallHouseBuilder = new SmallHouse();
        BigHouse bigHouseBuilder = new BigHouse();

        HouseDirector smallhouseDirector = new HouseDirector(smallHouseBuilder);
        HouseDirector bigHouseDirector = new HouseDirector(bigHouseBuilder);

        smallhouseDirector.buildHouse();
        bigHouseDirector.buildHouse();

        House smallHouse = smallhouseDirector.getHouse();
        House bigHouse = bigHouseDirector.getHouse();

        System.out.println(smallHouse);
        System.out.println(bigHouse);


    }


}
