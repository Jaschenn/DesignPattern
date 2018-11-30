package com.jasmine.组合模式;

import java.util.ArrayList;

public class Floder extends AbstractFile {
    String fileName;
    ArrayList fileList = new ArrayList();

    public Floder(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void addFile(AbstractFile abstractFile) {
        fileList.add(abstractFile);
        System.out.println("增加了文件");
    }

    @Override
    public void deleFile(AbstractFile abstractFile) {
        fileList.remove(abstractFile);
        System.out.println("删除了文件");
    }

    @Override
    public void display() {
        for (Object o :
                fileList) {
            ((AbstractFile)o).display();
        }
    }
}
