package Pertemuan12;
public class SLLMain24 {
    public static void main(String[] args) {
        SingleLinkedList24 sll = new SingleLinkedList24();

        Mahasiswa24 m1 = new Mahasiswa24("22211201", "Rifat", "1A", 3.9);
        Mahasiswa24 m2 = new Mahasiswa24("22211202", "Cintia", "3C", 3.5);
        Mahasiswa24 m3 = new Mahasiswa24("2321201", "Bimon", "2B", 3.8);
        Mahasiswa24 m4 = new Mahasiswa24("22211203", "Sharren", "1F", 4.0);

        sll.addFirst(m1);
        sll.addLast(m2);
        sll.addLast(m3);
        sll.addLast(m4);

        System.out.println("data index 1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("bimon"));
        System.out.println();
        sll.print();

        sll.removeFirst();
        sll.removeLast();
        sll.print();

        sll.removeAt(0);
        sll.print();
    }
}

