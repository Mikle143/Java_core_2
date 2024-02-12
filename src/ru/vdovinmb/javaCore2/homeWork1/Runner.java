package ru.vdovinmb.javaCore2.homeWork1;

import ru.vdovinmb.javaCore2.homeWork1.House.Flat;
import ru.vdovinmb.javaCore2.homeWork1.House.Floor;
import ru.vdovinmb.javaCore2.homeWork1.House.House;
import ru.vdovinmb.javaCore2.homeWork1.House.Room;

public class Runner {
    public static void main(String[] args) {


        Room entranceRoom = new Room(true);//проходная комната
        Room room = new Room(false);//обычная комната

        Flat flat1_1 = new Flat(1, new Room[]{room, entranceRoom});// создаю 8 квартир с разным набором комнат для дома №1
        Flat flat1_2 = new Flat(2, new Room[]{entranceRoom, room, entranceRoom});
        Flat flat1_3 = new Flat(3, new Room[]{room, entranceRoom});
        Flat flat1_4 = new Flat(4, new Room[]{room, room});
        Flat flat1_5 = new Flat(5, new Room[]{entranceRoom});
        Flat flat1_6 = new Flat(6, new Room[]{room, room, room, entranceRoom});
        Flat flat1_7 = new Flat(7, new Room[]{room, room, entranceRoom, entranceRoom});
        Flat flat1_8 = new Flat(8, new Room[]{room, room, room});

        Flat flat2_1 = new Flat(1, new Room[]{room, entranceRoom});// создаю 6 квартир с разным набором комнат для дома №2
        Flat flat2_2 = new Flat(2, new Room[]{entranceRoom, room, entranceRoom});
        Flat flat2_3 = new Flat(3, new Room[]{room, entranceRoom});
        Flat flat2_4 = new Flat(4, new Room[]{room, room});
        Flat flat2_5 = new Flat(5, new Room[]{entranceRoom});
        Flat flat2_6 = new Flat(6, new Room[]{room, room, room, entranceRoom});

        Floor floor1_1 = new Floor(1, new Flat[]{flat1_1, flat1_2});// создаю 3 этажа для дома №1
        Floor floor1_2 = new Floor(2, new Flat[]{flat1_3, flat1_4, flat1_5});
        Floor floor1_3 = new Floor(3, new Flat[]{flat1_6, flat1_7, flat1_8});

        Floor floor2_1 = new Floor(1, new Flat[]{flat2_1, flat2_2, flat2_3});// создаю 2 этажа для дома №2
        Floor floor2_2 = new Floor(2, new Flat[]{flat2_4, flat2_5, flat2_6});

        House house1 = new House(35, new Floor[]{floor1_1, floor1_2, floor1_3});// создаю дома №1 и №2 с разным набором разных этажей
        House house2 = new House(36, new Floor[]{floor2_1, floor2_2});

        flat1_1.print();
        floor1_1.print();

        printAllInformation(house1);
        printAllInformation(house2);
    }

    public static void printAllInformation(House house) {
        System.out.println(house.toString());

    }

}
