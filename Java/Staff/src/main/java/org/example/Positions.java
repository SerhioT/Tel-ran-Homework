package org.example;

public enum Positions {
    BACER(150),              //Пекарь
    BACER_MOULDER(125),      //Пекарь-формовщик
    BACER_PUFF(125),         //Пекарь слоёнщик
    CONFECTIONER(150),       //Кондитер
    COOK(125),               //Повар
    KITCHEN_WORKER(100),     //Кухонный работник
    SALESMAN(128),           //Продавец
    SENIOR_SALESMAN(150),    //Старший продавец
    MANAGER(85),             //Заведующая
    DIRECTOR(200);

    private int paymentHour;

    Positions(int paymentHour) {
        this.paymentHour = paymentHour;
    }

//    private int paymentShift;
//
//
//
//
//    Positions(int paymentShift) {
//        this.paymentShift = paymentShift;
//    }

}
