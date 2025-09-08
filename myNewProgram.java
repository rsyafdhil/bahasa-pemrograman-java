import java.lang.reflect.Method;
import java.util.*;
import javax.swing.JOptionPane;

class Mahasiswa {
    String nama;

    public Mahasiswa(String nama) {
        this.nama = nama;
    }
}

public class myNewProgram {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        String operasi;
        do {
            operasi = JOptionPane.showInputDialog(null,
                    "Masukkan Operasi yang mau dilakukan:\n1. Tambah Mahasiswa\n2. Menghapus Data Mahasiswa\n3. Mengubah Data Mahasiswa\n4. Mengurutkan Data Mahasiswa\n5. Menampilkan Data Mahasiswa\n");

            switch (operasi) {
                case "1": // Tambah mhs
                    String tambahNama = JOptionPane
                            .showInputDialog(operasi + ". Masukkan Nama Mahasiswa yang mau ditambahkan:");
                    daftarMahasiswa.add(new Mahasiswa(tambahNama));
                    break;
                case "2": // Hapus mhs
                    String hapusNama = JOptionPane
                            .showInputDialog(operasi + ". Masukkan nama mahasiswa yang mau dihapus: ");
                    boolean isDeleted = false;
                    Iterator<Mahasiswa> iterator = daftarMahasiswa.iterator();
                    while (isDeleted == false && iterator.hasNext()) {
                        Mahasiswa mhs = iterator.next();
                        if (mhs.nama.equals(hapusNama)) {
                            iterator.remove();
                            isDeleted = true;
                        }
                    }
                    if (isDeleted) {
                        System.out.println("Data mahasiswa " + hapusNama + " berhasil dihapus.");
                    } else {
                        System.out.println("Data mahasiswa " + hapusNama + " tidak ditemukan.");
                    }
                    break;
                case "3": // edit mhs
                    String cariNama = JOptionPane
                            .showInputDialog(operasi + ". Masukkan nama mahasiswa yang mau diubah: ");
                    boolean isEdited = false;
                    ListIterator<Mahasiswa> listIterator = daftarMahasiswa.listIterator();
                    while (isEdited == false && listIterator.hasNext()) {
                        Mahasiswa mhs = listIterator.next();
                        if (mhs.nama.equals(cariNama)) {
                            String namaBaru = JOptionPane
                                    .showInputDialog(mhs.nama + " ditemukan. Masukkan nama baru : ");
                            mhs.nama = namaBaru;
                            isEdited = true;
                        }
                    }
                    if (isEdited) {
                        System.out.println("Data mahasiswa " + cariNama + " berhasil diubah. ");

                    } else {
                        System.out.println("Data mahasiswa " + cariNama + " tidak ditemukan.");
                    }
                    break;
                case "4": // urutkan mhs
                    Collections.sort(daftarMahasiswa, new Comparator<Mahasiswa>() {
                        @Override
                        public int compare(Mahasiswa m1, Mahasiswa m2) {
                            return m1.nama.compareTo(m2.nama);
                        }
                    });
                    System.out.println("Data mahasiswa berhasil diurutkan secara alfabet.");
                    break;
                case "5":
                    StringBuilder daftar = new StringBuilder();
                    for (Mahasiswa mhs : daftarMahasiswa) {
                        daftar.append(mhs.nama).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, daftar.toString(), "Daftar Mahasiswa",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    break;
            }
        } while (!operasi.equals("6"));
        System.out.println(daftarMahasiswa);
    }
}