package server.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Developer dev = new Developer();
        DeveloperBack developerBack = new DeveloperBack();


//        Честно говоря не совсем понял задание, сделал так:
        FrontEnder frontEnder = new Developer();
        frontEnder.createFront();

//        List<BackEnder>backEnderList= new ArrayList<>();
//        backEnderList.add(dev);
//        backEnderList.add(developerBack);
//
//
//        for (BackEnder backEnder:backEnderList) {
//            backEnder.createServer();
//        }


//        dev.createFront();
//        dev.createServer();
//        developerBack.createServer();
    }
}
