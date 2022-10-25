package HousePackage;


public class House
{

    private int id;
    private int number;
    private float area;
    private int floor;
    private int roomCount;
    private String street;

    /**
     * пустий конструктор
     */
    public House()
    {
        this.id = 0;
        this.number = 0;
        this.area = 0;
        this.floor = 0;
        this.roomCount = 0;
        this.street = "Empty";
    }

    /**
     * Конструктор з параметрами
     * @param id
     * @param number
     * @param area
     * @param floor
     * @param roomCount
     * @param street
     */
    public House(int id, int number, float area, int floor, int roomCount, String street)
    {
        this.id = id;
        this.number = number;
        this.area = area;
        this.floor = floor;
        this.roomCount = roomCount;
        this.street = street;
    }

    /**
     * Сетер id
     * @param id
     */

    public void setId(int id)
    {
        this.id = id;
    }

    /**
     *  Сетер number
     * @param number
     */
    public void setNumber(int number)
    {
        this.number = number;
    }

    /**
     * Сетер Area
     * @param area
     */
    public void setArea(float area)
    {
        this.area = area;
    }

    /**
     * Сетер Floor
     * @param floor
     */
    public void setFloor(int floor)
    {
        this.floor = floor;
    }

    /**
     * Сетер roomCount
     * @param roomCount
     */
    public void setRoomCount(int roomCount)
    {
        this.roomCount = roomCount;
    }

    /**
     * Сетер setStreet
     * @param street
     */
    public void setStreet(String  street)
    {
        this.street = street;
    }

    /**
     * гетер getNumber
     * @return
     */
    public int getNumber()
    {
        return this.number;
    }

    /**
     * гетер getId
     * @return
     */
    public int getId()
    {
        return this.id;
    }

    /**
     * гетер getFloor
     * @return
     */
    public int getFloor()
    {
        return this.floor;
    }

    /**
     *гетер getRoomCount
     * @return
     */
    public int getRoomCount()
    {
        return this.roomCount;
    }

    /**
     * гетер getArea
     * @return
     */
    public float getArea()
    {
        return this.area;
    }

    /**
     * гетер getStreet
     * @return
     */
    public String getStreet()
    {
        return this.street;
    }



    /**
     * І метод повернення стрічки про будинок
     * @return
     */
    public String getString()

    {
        return "Street: " + getStreet() + ". Number: " + getNumber() + ". Floor: " + getFloor() + ". Id: " + getId() +
                ".\nArea: " + getArea() + ". Rooms count: " + getRoomCount();
    }
}
