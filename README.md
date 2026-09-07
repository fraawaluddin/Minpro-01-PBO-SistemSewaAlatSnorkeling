# Sistem Manajemen Sewa Alat Snorkeling & Diving

## Deskripsi

Sistem Manajemen Sewa Alat Snorkeling & Diving merupakan program berbasis Java yang digunakan untuk membantu pemilik usaha dalam mengelola data alat snorkeling dan diving serta proses penyewaan alat.

Program ini dibuat menggunakan konsep Pemrograman Berorientasi Objek (PBO) dan menerapkan class, object, constructor, ArrayList, percabangan, perulangan, serta encapsulation.

## Fitur Program

1. Kelola Data Alat
   - Tambah data alat
   - Lihat data alat
   - Ubah data alat
   - Hapus data alat

2. Buat Penyewaan
   - Memasukkan data penyewa
   - Memilih alat yang akan disewa
   - Menentukan jumlah alat
   - Menentukan durasi sewa
   - Menghitung total biaya secara otomatis
   - Mengurangi jumlah alat yang tersedia

3. Lihat Data Penyewaan
   - Menampilkan data penyewaan
   - Menampilkan data penyewa
   - Menampilkan alat yang disewa
   - Menampilkan jumlah unit
   - Menampilkan durasi sewa
   - Menampilkan total biaya
   - Menampilkan status penyewaan

4. Pengembalian Alat
   - Mengembalikan jumlah alat ke stok
   - Mengubah status penyewaan menjadi DIKEMBALIKAN
   - Mencegah pengembalian alat yang sama lebih dari satu kali

## Class yang Digunakan

### AlatSelam

Digunakan untuk menyimpan data alat yang disewakan.

Atribut:
- idAlat
- namaAlat
- ukuran
- tarifPerHari
- kondisi
- jumlahTersedia

### Penyewa

Digunakan untuk menyimpan data orang yang melakukan penyewaan.

Atribut:
- idPenyewa
- namaPenyewa
- noHp

### Penyewaan

Digunakan untuk menyimpan data transaksi penyewaan.

Atribut:
- idPenyewaan
- penyewa
- alat
- jumlahUnit
- durasiHari
- totalBiaya
- statusSewa

## Alur Program

Program dimulai dari menu utama:

1. Kelola Data Alat
2. Buat Penyewaan
3. Lihat Data Penyewaan
4. Pengembalian Alat
5. Keluar

Pada menu Kelola Data Alat, pengguna dapat melakukan proses CRUD terhadap data alat.

Pada menu Buat Penyewaan, pengguna memasukkan data penyewa, memilih alat, menentukan jumlah unit dan durasi sewa. Sistem kemudian menghitung total biaya dan mengurangi jumlah alat yang tersedia.

Pada menu Pengembalian Alat, pengguna memasukkan ID penyewaan. Sistem akan mengembalikan jumlah alat ke stok dan mengubah status penyewaan menjadi DIKEMBALIKAN.

Program menggunakan perulangan sehingga menu terus ditampilkan sampai pengguna memilih menu Keluar.

## Konsep PBO yang Diterapkan

- Class
- Object
- Constructor
- Attribute
- Method
- Encapsulation
- Access Modifier
- Object Reference
- ArrayList

## Value Added

Program memiliki beberapa pengembangan tambahan:

1. Atribut class menggunakan access modifier `private`.
2. Menggunakan getter dan setter sebagai penerapan encapsulation.
3. Validasi ID alat agar tidak boleh duplikat.
4. Validasi tarif, jumlah alat, jumlah unit, dan durasi sewa.
5. ID penyewa dan ID penyewaan dibuat secara otomatis.
6. Sistem mencegah pengembalian alat yang sama lebih dari satu kali.

## Perhitungan Biaya

Total Biaya = Tarif Per Hari × Jumlah Unit × Durasi Sewa

Contoh:

Rp50.000 × 2 unit × 3 hari = Rp300.000

## Cara Menjalankan Program

1. Buka project menggunakan NetBeans.
2. Jalankan file `Main.java`.
3. Pilih menu sesuai kebutuhan.
4. Program akan terus berjalan sampai memilih menu `5. Keluar`.