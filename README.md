# Sistem Manajemen Sewa Alat Snorkeling & Diving

Nama: Muhammad Farel Awaluddin
NIM: 2509116055

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

Program dimulai dari menu utama. Pengguna bisa memilih menu yang ingin dipilih seperti Kelola Data Alat, Buat Penyewaan, Lihat Data Penyewaan, Pengembalian Alat, atau Keluar.

Pada menu kelola data alat, pengguna bisa memilih menu yang ingin dipilih seperti Tambah alat untuk menambahkan alat, lihat alat untuk melihat alat yang pernah ditambahkan, ubah alat jika ingin mengubah data terkait alat, hapus alat jika alat dirasa kurang relevan, dan kembali ke menu utama.

Pada menu Buat Penyewaan, pengguna memasukkan data penyewa, memilih alat, menentukan jumlah unit dan durasi sewa. Sistem menghitung total biaya dan mengurangi jumlah alat yang tersedia.

Pada menu lihat Data Penyewaan, sistem menampilkan transaksi yang telah tersimpan.

Pada menu Pengembalian Alat, pengguna memasukkan ID penyewaan. Sistem menambah kembali stok alat dan mengubah status penyewaan menjadi dikembalikan.

Program menggunakan perulangan agar menu terus berjalan sampai pengguna memilih keluar.

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

## Nilai Tambah

Penjelasan Nilai Tambah:

### Access Modifier

<img width="330" height="185" alt="image" src="https://github.com/user-attachments/assets/bf358e8d-6072-48f4-9490-d78470e591df" />

Program menggunakan access modifier private pada atribut class AlatSelam. Hal ini digunakan untuk membatasi akses langsung terhadap data yang terdapat di dalam class sehingga data tidak dapat diakses atau diubah secara langsung dari luar class.

### Encapsulation

<img width="546" height="805" alt="image" src="https://github.com/user-attachments/assets/99ea671f-d862-481d-bd45-180003563a72" />

Encapsulation diterapkan dengan menyembunyikan atribut menggunakan private dan menyediakan method getter dan setter untuk mengakses atau mengubah data. Dengan demikian, data pada object AlatSelam tidak diakses secara langsung dari luar class.

### Validasi Input

<img width="616" height="163" alt="image" src="https://github.com/user-attachments/assets/9e17a149-ab70-4427-bb78-4b94d866329f" />

<img width="635" height="178" alt="image" src="https://github.com/user-attachments/assets/03377155-1953-4ab2-b510-84969ea472a0" />

Program menerapkan validasi input untuk memastikan nilai tarif per hari harus lebih dari 0. Jika pengguna memasukkan nilai 0 atau nilai negatif, program akan menampilkan pesan kesalahan dan data tidak akan disimpan.

## Perhitungan Biaya

Total Biaya = Tarif Per Hari × Jumlah Unit × Durasi Sewa

Contoh:

Rp50.000 × 2 unit × 3 hari = Rp300.000

## Dokumentasi Program

### 1. Menu Utama

<img width="518" height="156" alt="image" src="https://github.com/user-attachments/assets/904d8f75-a1eb-4491-ae3e-26fe3d0866d1" />

Menu Utama merupakan tampilan awal sistem yang digunakan untuk memilih fitur yang ada. Pengguna memilih menu melalui input, lalu program menggunakan percabangan switch untuk menjalankan proses sesuai pilihan yang dipilih. Perulangan do-while digunakan agar menu terus ditampilkan sampai pengguna memilih menu keluar.

### 2. Menu Kelola Data Alat

<img width="241" height="155" alt="image" src="https://github.com/user-attachments/assets/897fee8c-d16f-4971-ba1e-cacb12ccf0b7" />

Kelola Data Alat merupakan menu yang digunakan untuk mengelola data alat snorkeling dan diving. Menu ini menyediakan CRUD, yaitu tambah data, lihat data, ubah data, dan hapus data alat. Data alat disimpan menggunakan ArrayList<AlatSelam>.

### 3. Tambah Data Alat

<img width="246" height="187" alt="image" src="https://github.com/user-attachments/assets/f776260b-03be-4ef0-b762-01f50dd5877d" />

Tambah Alat digunakan untuk menambahkan data alat baru ke dalam sistem. Pengguna memasukkan ID alat, nama alat, ukuran, tarif per hari, kondisi, dan jumlah tersedia. Setelah data dinyatakan sesuai, sistem membuat object AlatSelam menggunakan constructor kemudian menyimpannya ke dalam ArrayList.

### 4. Lihat Data Alat

<img width="283" height="315" alt="image" src="https://github.com/user-attachments/assets/13d95299-b983-4326-bcc8-6f4605f89cf3" />

Lihat Data Alat digunakan untuk menampilkan seluruh data alat yang tersimpan dalam sistem. Data ditampilkan menggunakan perulangan for-each terhadap ArrayList<AlatSelam>, sehingga setiap object alat dapat ditampilkan satu per satu.

### 5. Ubah Data Alat

<img width="407" height="177" alt="image" src="https://github.com/user-attachments/assets/7330208f-ecf9-4cbf-9515-c53dd284e536" />

Ubah Alat dgunakan untuk memperbarui data alat berdasarkan ID. Sistem mencari data alat yang sesuai, kemudian mengubah atributnya menggunakan setter. Fitur ini merupakan bagian dari proses CRUD dan juga menunjukkan penerapan encapsulation melalui getter dan setter.

### 6. Hapus Data Alat

<img width="398" height="95" alt="image" src="https://github.com/user-attachments/assets/c5b58d6e-d75b-48de-8bad-27d99e48d58a" />

Hapus Alat digunakan untuk menghapus data alat berdasarkan ID. Sistem mencari data yang sesuai di dalam ArrayList, kemudian menghapusnya menggunakan method remove(). Fitur ini merupakan bagian dari proses CRUD pada data alat.

### 7. Validasi Input

<img width="233" height="86" alt="image" src="https://github.com/user-attachments/assets/39cf6384-8738-4fc9-bb94-a5365418a2e2" />

Validasi Input digunakan untuk mencegah data yang tidak sesuai. Pada contoh ini, sistem memeriksa ID alat yang dimasukkan. Karena ALAT01 sudah digunakan, sistem menolak input tersebut dan menampilkan pesan bahwa ID alat sudah digunakan. Validasi lain juga diterapkan pada tarif, jumlah stok, jumlah unit yang disewa, dan durasi sewa.

### 8. Buat Penyewaan

<img width="317" height="307" alt="image" src="https://github.com/user-attachments/assets/94444394-d6bc-4c4b-8358-38858dd28aae" />

Buat Penyewaan digunakan untuk membuat transaksi penyewaan alat. Pengguna memasukkan nama penyewa, nomor HP, ID alat, jumlah unit, dan durasi sewa. Sistem kemudian mencari alat berdasarkan ID, menghitung total biaya menggunakan tarif per hari x jumlah unit x durasi sewa, membuat ID penyewa dan ID penyewaan secara otomatis, serta mengurangi jumlah alat yang ada.

### 9. Lihat Data Penyewaan

<img width="285" height="240" alt="image" src="https://github.com/user-attachments/assets/53de96b7-13ca-40df-be7b-b505be54a5f5" />

Lihat Data Penyewaan digunakan untuk menampilkan data transaksi penyewaan yang telah tersimpan. Informasi yang ditampilkan meliputi ID penyewaan, data penyewa, alat yang disewa, jumlah unit, durasi, total biaya, dan status sewa. Data transaksi disimpan dalam ArrayList<Penyewaan> dan ditampilkan menggunakan perulangan.

### 10. Pengembalian Alat

<img width="326" height="152" alt="image" src="https://github.com/user-attachments/assets/0b588f16-8f5f-410e-be34-cc5fd1dad948" />

Pengembalian Alat digunakan untuk memproses pengembalian berdasarkan ID penyewaan. Setelah pengembalian berhasil, jumlah alat yang tersedia bertambah kembali dan status penyewaan berubah dari aktif menjadi dikembalikan.

### 11. Pencegahan Pengembalian Dua Kali

<img width="323" height="76" alt="image" src="https://github.com/user-attachments/assets/de9bbe25-e4d8-4476-bfa1-0a85aa6722f8" />

Validasi Pengembalian digunakan untuk mencegah pengembalian alat yang sama lebih dari satu kali. Sistem ini memeriksa status penyewaan sebelum memproses pengembalian. Jika status sudah dikembalikan, sistem tidak menambahkan stok kembali dan menampilkan pesan bahwa alat sudah dikembalikan sebelumnya.


