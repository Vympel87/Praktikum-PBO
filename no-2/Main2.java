public class Main2 {
    public static void main(String[] args) {
        Person org = new Person("andro", "Condong Catur");
        Student siswa = new Student("rafa", "Pogung lor","TRPL", 2022, 1000000);
        Staff staf = new Staff("oke", "jogja", "Univ", 300000);

        System.out.println(org.toString());
        System.out.println(siswa.toString());
        System.out.println(staf.toString());
    }
}
