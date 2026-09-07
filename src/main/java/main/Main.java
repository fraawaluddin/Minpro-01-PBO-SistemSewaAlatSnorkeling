    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package main;

    import java.util.ArrayList;
    import java.util.Scanner;
    import model.AlatSelam;
    import model.Penyewa;
    import model.Penyewaan;
    /**
     *
     * @author MyBook Z Series
     */
    public class Main {

        static ArrayList<AlatSelam> daftarAlat = new ArrayList<>();
        static ArrayList<Penyewa> daftarPenyewa = new ArrayList<>();
        static ArrayList<Penyewaan> daftarPenyewaan = new ArrayList<>();
        
        public static void main(String[] args) {

            AlatSelam alat1 = new AlatSelam(
                    "ALAT01", "Masker Selam", "M", 50000, "Baik", 10);

            Penyewa penyewa1 = new Penyewa(
                    "PNYW01", "Farel", "081253453879");
                        
          
            daftarAlat.add(alat1);
            daftarPenyewa.add(penyewa1);         

            Scanner input = new Scanner(System.in);

            int pilihan;

            do {
                System.out.println("\n=== SISTEM MANAJEMEN SEWA ALAT SNORKELING & DIVING ===");
                System.out.println("1. Kelola Data Alat");
                System.out.println("2. Buat Penyewaan");
                System.out.println("3. Lihat Data Penyewaan");
                System.out.println("4. Pengembalian Alat");
                System.out.println("5. Keluar");
                System.out.print("Pilih menu: ");

                pilihan = input.nextInt();

                switch (pilihan) {
                    case 1:
                        int pilihanAlat;

                        do {
                            System.out.println("\n=== KELOLA DATA ALAT ===");
                            System.out.println("1. Tambah Alat");
                            System.out.println("2. Lihat Alat");
                            System.out.println("3. Ubah Alat");
                            System.out.println("4. Hapus Alat");
                            System.out.println("5. Kembali");
                            System.out.print("Pilih menu: ");

                            pilihanAlat = input.nextInt();

                            switch (pilihanAlat) {
                                case 1:
                                    System.out.println("\n=== TAMBAH ALAT ===");

                                    input.nextLine();

                                    System.out.print("ID Alat: ");
                                    String idAlat = input.nextLine();
                                    
                                    boolean idSudahAda = false;
                                    
                                    for (AlatSelam alat : daftarAlat) {
                                        if (alat.getIdAlat().equalsIgnoreCase(idAlat)) {
                                            idSudahAda = true;
                                            break;
                                        }
                                    }
                                    
                                    if(idSudahAda) {
                                        System.out.println("ID Alat sudah digunakan");
                                        break;
                                    }

                                    System.out.print("Nama Alat: ");
                                    String namaAlat = input.nextLine();

                                    System.out.print("Ukuran: ");
                                    String ukuran = input.nextLine();

                                    System.out.print("Tarif Per Hari: ");
                                    double tarifPerHari = input.nextDouble();
                                    
                                    if (tarifPerHari <= 0) {
                                        System.out.println("Tarif per hari harus lebih dari 0");
                                        break;
                                    }
                                    
                                    input.nextLine();

                                    System.out.print("Kondisi: ");
                                    String kondisi = input.nextLine();

                                    System.out.print("Jumlah Tersedia: ");
                                    int jumlahTersedia = input.nextInt();
                                    
                                    if (jumlahTersedia <= 0) {
                                        System.out.println("Jumlah tersedia harus lebih dari 0");
                                        break;
                                    }

                                    AlatSelam alatBaru = new AlatSelam(
                                            idAlat,
                                            namaAlat,
                                            ukuran,
                                            tarifPerHari,
                                            kondisi,
                                            jumlahTersedia
                                    );

                                    daftarAlat.add(alatBaru);

                                    System.out.println("Alat berhasil ditambahkan");
                                    break;

                                case 2:
                                    System.out.println("\n=== DAFTAR ALAT ===");

                                    for (AlatSelam alat : daftarAlat) {
                                        System.out.println("ID Alat        : " + alat.getIdAlat());
                                        System.out.println("Nama Alat      : " + alat.getNamaAlat());
                                        System.out.println("Ukuran         : " + alat.getUkuran());
                                        System.out.println("Tarif Per Hari : " + alat.getTarifPerHari());
                                        System.out.println("Kondisi        : " + alat.getKondisi());
                                        System.out.println("Jumlah Tersedia: " + alat.getJumlahTersedia());
                                        System.out.println("---------------------");
                                    }
                                    break;

                                case 3:
                                    System.out.println("\n=== UBAH ALAT ===");
                                    
                                    input.nextLine();
                                    
                                    System.out.print("Masukkan ID Alat yang ingin diubah: ");
                                    String idCari = input.nextLine();
                                    
                                    boolean ditemukan = false;
                                    
                                    for (AlatSelam alat : daftarAlat) {
                                        if (alat.getIdAlat().equalsIgnoreCase(idCari)) {
                                            
                                            System.out.print("Nama Alat Baru: ");
                                            String namaBaru = input.nextLine();                                                                                        
                                            
                                            System.out.print("Ukuran Baru: ");
                                            String ukuranBaru = input.nextLine();                                                                                        
                                            
                                            System.out.print("Tarif Per Hari Baru: ");
                                            double tarifBaru = input.nextDouble();
                                            
                                            input.nextLine();
                                            
                                            System.out.print("Kondisi Baru: ");
                                            String kondisiBaru = input.nextLine();
                                            
                                            System.out.print("Jumlah Tersedia Baru: ");
                                            int jumlahBaru = input.nextInt();                                            
                                            
                                            if (tarifBaru <= 0) {
                                                System.out.println("Tarif per hari harus lebih dari 0");
                                                ditemukan = true;
                                                break;
                                            }                                                                                                                                                

                                            if (jumlahBaru <= 0) {
                                                System.out.println("Jumlah tersedia harus lebih dari 0");
                                                ditemukan = true;
                                                break;
                                            }    
                                            
                                            alat.setNamaAlat(namaBaru);
                                            alat.setUkuran(ukuranBaru);
                                            alat.setTarifPerHari(tarifBaru);
                                            alat.setKondisi(kondisiBaru);
                                            alat.setJumlahTersedia(jumlahBaru);
                                            
                                            System.out.println("Data alat berhasil diubah");
                                            
                                            ditemukan = true;
                                            break;
                                        }
                                    }
                                    if (!ditemukan) {
                                        System.out.println("ID Alat tidak ditemukan");
                                    }                                  
                                    
                                    break;

                                case 4:
                                    System.out.println("\n=== HAPUS ALAT ===");
                                    
                                    input.nextLine();
                                    
                                    System.out.print("Masukkan ID Alat yang ingin dihapus: ");
                                    String idHapus = input.nextLine();
                                    
                                    boolean ditemukanHapus = false;
                                    
                                    for (int i = 0; i < daftarAlat.size(); i++) {
                                        
                                      if (daftarAlat.get(i).getIdAlat().equalsIgnoreCase(idHapus)) {
                                        
                                        daftarAlat.remove(i);
                                        
                                        System.out.println("Data alat berhasil dihapus");
                                        ditemukanHapus = true;
                                        break;
                                    }                                   
                                }
                                    
                                if (!ditemukanHapus) {
                                    System.out.println("ID Alat tidak ditemukan");
                                }                                                                                                          
                                    break;

                                case 5:
                                    System.out.println("Kembali ke menu utama");
                                    break;    

                                default:
                                    System.out.println("Pilihan tidak tersedia");
                                    break;                                                        
                            }

                        } while (pilihanAlat != 5);

                        break;

                    case 2:
                        System.out.println("\n=== BUAT PENYEWAAN ===");

                        input.nextLine();

                        System.out.print("Nama Penyewa: ");
                        String namaPenyewa = input.nextLine();

                        System.out.print("No HP: ");
                        String noHp = input.nextLine();

                        System.out.print("ID Alat yang ingin disewa: ");
                        String idAlatSewa = input.nextLine();

                        AlatSelam alatDipilih = null;

                        for (AlatSelam alat : daftarAlat) {
                            if (alat.getIdAlat().equalsIgnoreCase(idAlatSewa)) {
                                alatDipilih = alat;
                                break;
                            }
                        }

                        if (alatDipilih == null) {
                            System.out.println("ID Alat tidak ditemukan");
                            break;
                        }

                        System.out.println("Alat ditemukan: " + alatDipilih.getNamaAlat());
                        System.out.println("Jumlah tersedia: " + alatDipilih.getJumlahTersedia());
                        System.out.println("Tarif per hari: " + alatDipilih.getTarifPerHari());

                        System.out.print("Jumlah unit yang disewa: ");
                        int jumlahUnit = input.nextInt();

                        if (jumlahUnit <= 0) {
                            System.out.println("Jumlah unit harus lebih dari 0");
                            break;
                        }

                        if (jumlahUnit > alatDipilih.getJumlahTersedia()) {
                            System.out.println("Jumlah alat tidak mencukupi");
                            break;
                        }

                        System.out.print("Durasi sewa (hari): ");
                        int durasiHari = input.nextInt();

                        if (durasiHari <= 0) {
                            System.out.println("Durasi sewa harus lebih dari 0 hari");
                            break;
                        }

                        // Semua validasi berhasil, baru buat data penyewa
                        String idPenyewa = "PNYW0" + (daftarPenyewa.size() + 1);

                        Penyewa penyewaBaru = new Penyewa(
                                idPenyewa,
                                namaPenyewa,
                                noHp
                        );

                        daftarPenyewa.add(penyewaBaru);

                        double totalBiaya = alatDipilih.getTarifPerHari()
                                * jumlahUnit
                                * durasiHari;

                        alatDipilih.setJumlahTersedia(
                                alatDipilih.getJumlahTersedia() - jumlahUnit
                        );

                        String idPenyewaan = "SW0" + (daftarPenyewaan.size() + 1);

                        Penyewaan penyewaanBaru = new Penyewaan(
                                idPenyewaan,
                                penyewaBaru,
                                alatDipilih,
                                jumlahUnit,
                                durasiHari,
                                totalBiaya,
                                "AKTIF"
                        );

                        daftarPenyewaan.add(penyewaanBaru);

                        System.out.println("Data penyewa berhasil disimpan");
                        System.out.println("ID Penyewa: " + idPenyewa);
                        System.out.println("Penyewaan berhasil dibuat");
                        System.out.println("ID Penyewaan: " + idPenyewaan);
                        System.out.println("Total biaya: Rp " + totalBiaya);

                        break;

                    case 3:
                        System.out.println("\n=== DATA PENYEWAAN ===");
                        
                        if(daftarPenyewaan.isEmpty()) {
                            System.out.println("Belum ada data penyewaan");                            
                        } else {
                            for (Penyewaan sewa : daftarPenyewaan) {
                                System.out.println("ID Penyewaan : " + sewa.getIdPenyewaan());
                                System.out.println("ID Penyewa   : " + sewa.getPenyewa().getIdPenyewa());
                                System.out.println("Nama Penyewa : " + sewa.getPenyewa().getNamaPenyewa());
                                System.out.println("No HP        : " + sewa.getPenyewa().getNoHp());
                                System.out.println("Nama Alat    : " + sewa.getAlat().getNamaAlat());
                                System.out.println("Jumlah Unit  : " + sewa.getJumlahUnit());
                                System.out.println("Durasi       : " + sewa.getDurasiHari() + " hari");
                                System.out.println("Total Biaya  : Rp " + sewa.getTotalBiaya());
                                System.out.println("Status Sewa  : " + sewa.getStatusSewa());
                                System.out.println("----------------------------");
                            }
                        }
                                                
                        break;

                    case 4:
                        System.out.println("\n=== PENGEMBALIAN ALAT ===");
                        
                        input.nextLine();
                        
                        System.out.print("Masukkan ID Penyewaan: ");
                        String idSewa = input.nextLine();
                        
                        boolean ditemukanSewa = false;
                        
                        for (Penyewaan sewa : daftarPenyewaan) {
                            
                            if (sewa.getIdPenyewaan().equalsIgnoreCase(idSewa)) {
                                
                                ditemukanSewa = true;
                                
                                if (sewa.getStatusSewa().equals("AKTIF")) {
                                    
                                    AlatSelam alat = sewa.getAlat();
                                    
                                    alat.setJumlahTersedia(
                                            alat.getJumlahTersedia() + sewa.getJumlahUnit());
                                    
                                    sewa.setStatusSewa("DIKEMBALIKAN");
                                    
                                    System.out.println("Alat berhasil dikembalikan");
                                    System.out.println("Nama Alat           : " + alat.getNamaAlat());
                                    System.out.println("Jumlah Dikembalikan : " + sewa.getJumlahUnit());
                                    System.out.println("Jumlah Tersedia     : " + alat.getJumlahTersedia());
                                    System.out.println("Status Sewa         : " + sewa.getStatusSewa());
                                                                        
                                } else {
                                    System.out.println("Alat sudah dikembalikan sebelumnya");                                    
                                }
                                
                                break;
                            }
                        }
                        
                        if (!ditemukanSewa) {
                            System.out.println("ID Penyewaan tidak ditemukan");                            
                        }
                        
                        break;                    

                    case 5:
                        System.out.println("Program Selesai");
                        break;
                        
                    default:
                        System.out.println("Pilihan tidak tersedia");
                        break;
                }

            } while (pilihan != 5);
        }
    }

