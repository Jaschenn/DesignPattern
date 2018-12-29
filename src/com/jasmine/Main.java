package com.jasmine;

import com.jasmine.中介者模式.AbstractChatroom;
import com.jasmine.中介者模式.ChatGroupV2;
import com.jasmine.中介者模式.PlasticMember;
import com.jasmine.享元模式.PieceFactory;
import com.jasmine.代理模式.Proxy;
import com.jasmine.代理模式.Single;
import com.jasmine.备忘录模式.Caretaker;
import com.jasmine.备忘录模式.UserInfoDTO;
import com.jasmine.外观模式.Mainframe;
import com.jasmine.桥接模式.Abstraction;
import com.jasmine.桥接模式.BusImple;
import com.jasmine.桥接模式.Implementor;
import com.jasmine.桥接模式.Road1;
import com.jasmine.组合模式.AbstractFile;
import com.jasmine.组合模式.File;
import com.jasmine.组合模式.Floder;
import com.jasmine.职责链模式_3.Director;
import com.jasmine.职责链模式_3.GeneralManager;
import com.jasmine.职责链模式_3.Manager;
import com.jasmine.职责链模式_3.ViceGeneralManager;
import com.jasmine.装饰模式.ComplexPhone;
import com.jasmine.装饰模式.JarPhone;
import com.jasmine.装饰模式.Phone;
import com.jasmine.装饰模式.SimplePhone;
import com.jasmine.观察者模式.Shareholder;
import com.jasmine.观察者模式.Stocks;
import com.jasmine.迭代器模式.Student;
import com.jasmine.迭代器模式.StudentIterator;
import com.jasmine.迭代器模式.Students;
import com.jasmine.适配器模式.Adapter;
import com.jasmine.适配器模式.Cat;
import com.jasmine.适配器模式.Dog;
import org.junit.Test;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        faced();//外观模式
    }
    public static void faced(){
        new Mainframe();
    }//外观模式
    @Test
    public  void decorate(){

        Phone phone1 = new SimplePhone();
        phone1.remind();
        Phone phone2 = new JarPhone(phone1);
        ((JarPhone) phone2).remind();
        Phone phone3 = new ComplexPhone(phone1);
        ((ComplexPhone) phone3).remind();
    } //装饰模式
    @Test
    public void combine(){
        AbstractFile abstractFile1 = new File("a.txt");
        AbstractFile abstractFile2 = new Floder("A");
        AbstractFile abstractFile3 = new Floder("B");
        AbstractFile abstractFile4 = new File("b.txt");
        abstractFile2.addFile(abstractFile1);
        abstractFile2.addFile(abstractFile3);
        abstractFile3.addFile(abstractFile4);
        abstractFile2.display();
    }//组合模式
    @Test
    public void bridge(){
        Implementor implementor = new BusImple();
        Abstraction abstraction = new Road1(implementor);
        abstraction.roadBuild();
    }//桥接模式
    @Test
    public void adapter(){

       Adapter adapter = new Adapter();

       adapter.setCatAdapter(new Cat());
       adapter.setDogAdapter(new Dog());

       adapter.catchM();
       adapter.yeal();

    }//适配器模式
    @Test
    public void Flyweight(){
        PieceFactory pieceFactory = new PieceFactory();
        pieceFactory.getPiece("white").getType();
        pieceFactory.getPiece("white").getType();
        pieceFactory.getPiece("black").getType();
        pieceFactory.getPiece("black").getType();
    }//享元模式
    @Test
    public void Proxy(){
        Single single = new Single(12);
        Proxy proxy = new Proxy(single);
        proxy.findTarget();
    }//代理模式
    @Test
    public void ResponsibilityChain(){
        Director director = new Director();
        Manager manager = new Manager();
        ViceGeneralManager viceGeneralManager = new ViceGeneralManager();
        GeneralManager generalManager = new GeneralManager();
        director.setSuccessor(manager);
        manager.setSuccessor(viceGeneralManager);
        viceGeneralManager.setSuccessor(generalManager);
        director.handleRequest(0);
        director.handleRequest(3);
        director.handleRequest(8);
        director.handleRequest(12);
        director.handleRequest(88);
    }//职责链模式
    @Test
    public void IteratorPattern(){
        Student student1 = new Student();
        student1.setNo(1);
        student1.setName("ll");
        Student student2 = new Student();
        student2.setNo(2);
        student2.setName("ss");
        Students students = new Students();
        students.addStudent(student1);
        students.addStudent(student2);
        StudentIterator iterator = students.getIterator();
        List list = (List) iterator.getByOrder(false);//true 为升序，false为降序
        for (Object s :
                list) {
            System.out.println(((Student)s).getNo());
        }

    }//迭代器模式
    @Test
    public void Mediator(){
        AbstractChatroom chatroom = new ChatGroupV2();
        PlasticMember plasticMember1 = new PlasticMember("塑料一号");
        PlasticMember plasticMember2 = new PlasticMember("塑料二号");
        PlasticMember plasticMember3 = new PlasticMember("塑料三号");
        plasticMember1.setChatroom(chatroom);
        chatroom.register(plasticMember1);
        chatroom.register(plasticMember2);
        chatroom.register(plasticMember3);
        plasticMember2.setChatroom(chatroom);
        plasticMember3.setChatroom(chatroom);
        plasticMember1.sendTextWithTime("塑料二号","hello !","2018-01-01");
    }//中介者模式
    @Test
    public void Memento(){

        UserInfoDTO user=new UserInfoDTO();
        Caretaker c=new Caretaker();

        user.setAccount("zhangsan");
        user.setPassword("123456");
        user.setTelNo("13000000000");
        System.out.println("状态一：");
        user.show();
        c.setMemento(user.saveMemento());//保存备忘录
        System.out.println("---------------------------");

        user.setPassword("111111");
        user.setTelNo("13100001111");
        System.out.println("状态二：");
        user.show();
        c.setMemento(user.saveMemento());//保存备忘录
        System.out.println("---------------------------");

        user.restoreMemento(c.getMemento(0));//从备忘录中恢复
        System.out.println("回到状态一：");
        user.show();
        System.out.println("---------------------------");

        user.restoreMemento(c.getMemento(1));//从备忘录中恢复
        System.out.println("回到状态二：");
        user.show();
        System.out.println("---------------------------");
    }//备忘录模式
    @Test
    public void Observer(){
        Shareholder shareholder1 = new Shareholder("黎明");
        Shareholder shareholder2 = new Shareholder("王妲");
        Stocks stocks = new Stocks();
        stocks.attach(shareholder1);
        stocks.attach(shareholder2);
        stocks.setCurrentPrice(-1);
        stocks.setCurrentPrice(99);
    }
}
