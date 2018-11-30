package com.jasmine.外观模式;

public class Mainframe {
    CPU cpu = new CPU();
    Memory memory = new Memory();
    OS os = new OS();
    HardDIsk hardDIsk = new HardDIsk();

    public Mainframe() {
        cpu.run();
        memory.check();
        os.load();
        hardDIsk.read();
    }
}
