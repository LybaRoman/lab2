package MainPackage;

import HousePackage.House;


import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    final static int arrCount = 10;

    public static void main(String[] args)
    {
        House[] arrHouses = create(arrCount);

        Scanner scanner = new Scanner(System.in);
        House[] arrRooms = givenRoomCount(scanner, arrHouses);
        printArr(arrRooms);

        House[] arrFloor =floorInterval(scanner, arrHouses);
        printArr(arrFloor);

        House[] arrCheck = areaCheck(scanner, arrHouses);
        printArr(arrCheck);
    }

    /**
     * метод створення масиву
     * @param size
     * @return
     */
    public static House[] create(int size)
    {
        Random random = new Random();

        House[] arrHouses = new House[size];
        for(int i = 0; i < size; i++)
        {
            House temp = new House(random.nextInt(100), random.nextInt(60), random.nextFloat(60),
                    random.nextInt(9) + 1, random.nextInt(4) + 1, "NewStreet");

            arrHouses[i] = temp;
        }
        System.out.println("Our array:");
        for(int i = 0; i < arrCount; i++)
        {
            System.out.println(arrHouses[i].getString());
        }
        System.out.print("\n\n\n");
        return arrHouses;
    }

    /**
     * вивілд масиву
     * @param array
     */
    public static void printArr(House[] array)
    {
        for (House house : array)
        {
            System.out.println(house.getString());
        }
        System.out.print("\n\n\n");
    }

    /**
     * перевірка кімнат
     * @param scanner
     * @param array
     * @return
     */
    public static House[] givenRoomCount(Scanner scanner, House[] array)
    {
        House[] temp = new House[array.length];
        System.out.print("Print count of rooms: ");
        int count = scanner.nextInt();
        int h = 0;

        for(int i = 0; i < array.length; i++)
        {
            if(array[i].getRoomCount() == count)
            {
                temp[h] = array[i];
                h++;
            }
        }
        if(h == 0)
        {
            return null;
        }
        House[] arrHouses = new House[h];
        System.arraycopy(temp,0,arrHouses,0, h);

        return arrHouses;
    }

    /**
     * перевірка на ітрервал поверха
     * @param scanner
     * @param array
     * @return
     */
    public static House[] floorInterval(Scanner scanner, House[] array)
    {
        House[] temp = new House[array.length];
        int h = 0;

        System.out.print("Print count of rooms and floor interval: ");
        int count = scanner.nextInt();
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        for(int i = 0; i < array.length; i++)
        {
            if(array[i].getRoomCount() == count)
            {
                if(array[i].getFloor() <= end && start <= array[i].getFloor())
                {
                    temp[h] = array[i];
                    h++;
                }
            }
        }
        if(h == 0)
        {
            return null;
        }
        House[] arrHouses = new House[h];
        System.arraycopy(temp,0,arrHouses,0, h);

        return arrHouses;
    }

    /**
     * перевірка на тереторію
     * @param scanner
     * @param array
     * @return
     */
    public static House[] areaCheck(Scanner scanner, House[] array)
    {
        System.out.print("Print area: ");
        float area = scanner.nextFloat();
        House[] temp = new House[array.length];
        int h = 0;

        for(int i = 0; i < array.length; i++)
        {
            if(array[i].getArea() > area)
            {
                temp[h] = array[i];
                h++;
            }
        }
        if(h == 0)
        {
            return null;
        }
        House[] arrHouses = new House[h];
        System.arraycopy(temp,0,arrHouses,0, h);

        return arrHouses;
    }
}