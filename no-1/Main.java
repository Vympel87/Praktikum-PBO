public class Main {
    public static void main(String[] args) {
        Circle lingkaran = new Circle();
        lingkaran.setColor("Yellow");
        System.out.println(lingkaran);
        System.out.println("Pembatas \n");
        Cylinder Tabung1 = new Cylinder(7);
        Cylinder Tabung2 = new Cylinder(7, 10);
        Cylinder Tabung3 = new Cylinder(7,10, "red");
        Cylinder[] listTabung = {Tabung1, Tabung2, Tabung3};

        for(int i = 0; i<3; i++){
            System.out.println("Tabung ke " + (i+1));
            listTabung[i].setHeight(15);
            System.out.println("Tinggi tabung = " + listTabung[i].getHeight());
            System.out.println("Volume tabung = " + listTabung[i].getVolume());
            System.out.println(listTabung[i]);
        }
    }
}