package com.company;

public class Notebook {
    public int сpuinGiga;
    public int volymeofMemory;
    public String nameofFirm;
    private String videocard;
    private String sizeofScreen;
    protected String vebcam;
    protected int massofNote;
    public static int battery = 3000;

    Notebook() {
 }

    Notebook(int cpuinGiga, int volymeofMemory, String nameofFirm, String videocard) {
        this();
        this.cpuinGiga = cpuinGiga;
        this.volymeofMemory = volymeofMemory;
        this.nameofFirm = nameofFirm;
        this.videocard = videocard;
    }

    Notebook(int cpuinGiga, int volymeofMemory, String nameofFirm, String videocard,
             String sizeofScreen, String vebcam, int massofNote) {
        this(cpuinGiga, volymeofMemory, nameofFirm, videocard);
        this.sizeofScreen = sizeofScreen;
        this.vebcam = vebcam;
        this.massofNote = massofNote;
    }

    public String toString() {
        String Information = "The Cpu of this Notebook " + cpuinGiga +
                "\n" + "The Volyme of Memory " + volymeofMemory +
                "\n" + "Name of FIrm " + nameofFirm +
                "\n" + "The name of Videocard " + videocard +
                "\n" + "The name Of Vebcam " + vebcam +
                "\n" + "The The mass of Notebook in kg " + massofNote +
                "\n" + "The size of notebook " + sizeofScreen + "\n";    // method
        return Information;

    }

    public void getvideocard(String videocard) {
        this.videocard = videocard;
    }

    public String setvideocard() {
        return videocard;
    }

    public void getsizeofScreen(String sizeofScreen) {
        this.sizeofScreen = sizeofScreen;
    }

    public String setsizeofScreen() {
        return sizeofScreen;
    }

    public static void printStaticBattery() {
        System.out.println(battery);
    }

    public void ptintBattery() {
        System.out.println(battery);
    }

    public void resetValues(int cpuinGiga, int volymeofMemory, String nameofFirm, String videocard,
                            String sizeofScreen, String vebcam, int massofNote) {
        this.cpuinGiga = cpuinGiga;
        this.volymeofMemory = volymeofMemory;
        this.nameofFirm = nameofFirm;
        this.videocard = videocard;
        this.sizeofScreen = sizeofScreen;
        this.vebcam = vebcam;
        this.massofNote = massofNote;
    }


    public static void main(String[] args) {
        Notebook notebook_1 = new Notebook();
        Notebook notebook_2 = new Notebook(4, 8, "Sony", "GTX");
        Notebook notebook_3 = new Notebook(6, 16,
                "acer", "Geforce",
                "16x9" , "HXSJ", 2);


        System.out.print("\n" + notebook_1.toString());
        System.out.print("\n" + notebook_2.toString());
        System.out.print("\n" + notebook_3.toString());

        notebook_2.ptintBattery();
        Notebook.printStaticBattery();
    }
}


