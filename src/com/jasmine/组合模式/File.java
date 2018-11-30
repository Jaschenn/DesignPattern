package com.jasmine.组合模式;

public class File extends AbstractFile {
    String filename;

    public File(String filename) {
        this.filename = filename;
    }

    @Override
    public void addFile(AbstractFile abstractFile) {

    }

    @Override
    public void deleFile(AbstractFile abstractFile) {

    }

    @Override
    public void display() {
        System.out.println("展示了文件！"+ filename);
    }
}
