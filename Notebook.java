package com.company;

public class Notebook {
    public int CpuinGiga;
    public int VolymeofMemory;
    public String NameofFirm;
    private String Videocard;
    private String SizeofScreen;
    protected String Vebcam;
    protected int MassofNote;
    public static int battery = 3000;


    Notebook() {

    }

    Notebook(int CpuinGiga, int VolymeofMemory, String NameofFirm, String Videocard) {
        this();
        this.CpuinGiga = CpuinGiga;
        this.VolymeofMemory = VolymeofMemory;
        this.NameofFirm = NameofFirm;
        this.Videocard = Videocard;
    }

    Notebook(int CpuinGiga, int VolymeofMemory, String NameofFirm, String Videocard,
             String SizeofScreen, String Vebcam, int MassofNote) {
        this(CpuinGiga, VolymeofMemory, NameofFirm, Videocard);
        this.SizeofScreen = SizeofScreen;
        this.Vebcam = Vebcam;
        this.MassofNote = MassofNote;
    }

    public String toString() {
        String Information = "The Cpu of this Notebook " + CpuinGiga +
                "\n" + "The Volyme of Memory " + VolymeofMemory +
                "\n" + "Name of FIrm " + NameofFirm +
                "\n" + "The name of Videocard " + Videocard +
                "\n" + "The name Of Vebcam " + Vebcam +
                "\n" + "The The mass of Notebook in kg " + MassofNote +
                "\n" + "The size of notebook " + SizeofScreen + "\n";    // method
        return Information;

    }

    public void getVideocard(String Videocard) {
        this.Videocard = Videocard;
    }

    public String setVideocard() {
        return Videocard;
    }

    public void getSizeofScreen(String SizeofScreen) {
        this.SizeofScreen = SizeofScreen;
    }

    public String setSizeofScreen() {
        return SizeofScreen;
    }

    public static void printStaticBattery() {
        System.out.println(battery);
    }

    public void ptintBattery() {
        System.out.println(battery);
    }

    public void resetValues(int CpuinGiga, int VolymeofMemory, String NameofFirm, String Videocard,
                            String SizeofScreen, String Vebcam, int MassofNote) {
        this.CpuinGiga = CpuinGiga;
        this.VolymeofMemory = VolymeofMemory;
        this.NameofFirm = NameofFirm;
        this.Videocard = Videocard;
        this.SizeofScreen = SizeofScreen;
        this.Vebcam = Vebcam;
        this.MassofNote = MassofNote;
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


