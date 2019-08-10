package com.hfad.kodectatask.models;

public class niz {

    private String time;
    private String tx1;
    private String tx2;
    public static final niz[] array = {
            new niz("09:30", "Physiotherapy", "Raum 505, Block F"),
            new niz("10:30", "Jogging", "Raum 3200, Building A"),
            new niz("15:00", "Physiotherapy", "Raum 2141, Pavilion 25")

    };

    public niz(String time, String tx1, String tx2) {
        this.time = time;
        this.tx1 = tx1;
        this.tx2 = tx2;
    }

    public String getTime() {
        return time;
    }

    public String getTx1() {
        return tx1;
    }

    public String getTx2() {
        return tx2;
    }

}
