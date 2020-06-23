import House.House;

public class main {

    //Z klasą wewnętrzną - Builder używany, gdy ma bardzo dużo argumentów(pól), nie chcemy dużej liczby constr,
    //użytkownik bez dostepu do setterów, ustawianie wartości przy tworzeniu, ale po stworzeniu bez mozliwosci zmian

    //Z interface(klasyczny) - bez mozliwosci ustawiania wartosci na starcie, dyrektor zajmuje sie wszystkim.

    //poznac mozna po strukturze

    //Można używać Lombok, który przyśpieszy tworzenie @Builder
    public static void main(String[] args) {

         House house = new House.HouseBuilder()
                 .buildDoors("4")
                 .buildWalls("10")
                 .buildRoofs("1")
                 .build();

        System.out.println(house);

    }


}
