package lesson2.homework.demo;

public class Demo {
    public static void main(String[] args) {
        String CREATE_TABLE = "CREATE TABLE PRODUCT(" +
                "ID NUMBER," +
                "CONSTRAINT PRODUCT_id PRIMARY KEY (ID)," +
                "NAME NVARCHAR2(50)," +
                "MANUFACTURER_NAME NVARCHAR2(50)," +
                "COST_PRICE NUMBER" +
                ");";
    }
}
