package com.jasmine;

import com.jasmine.外观模式.Mainframe;
import com.jasmine.桥接模式.Abstraction;
import com.jasmine.桥接模式.BusImple;
import com.jasmine.桥接模式.Implementor;
import com.jasmine.桥接模式.Road1;
import com.jasmine.组合模式.AbstractFile;
import com.jasmine.组合模式.File;
import com.jasmine.组合模式.Floder;
import com.jasmine.装饰模式.ComplexPhone;
import com.jasmine.装饰模式.JarPhone;
import com.jasmine.装饰模式.Phone;
import com.jasmine.装饰模式.SimplePhone;
import com.jasmine.适配器模式.Adapter;
import com.jasmine.适配器模式.Cat;
import com.jasmine.适配器模式.CatAdapter;
import com.jasmine.适配器模式.Dog;
import org.junit.Test;

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
}
