CREATE TABLE TBL_USER (
id_user varchar2 (20) PRIMARY KEY ,
nama_user varchar2(50),
nohp varchar2(20),
username varchar2(20),
pasword varchar(20));

CREATE TABLE KATEGORI (
id_kategori varchar2 (20) PRIMARY KEY ,
nama_kategori varchar2(50));

CREATE TABLE TUJUAN (
id_tujuan varchar2 (20) PRIMARY KEY ,
nama_tujuan varchar2(50),
ongkir number(11));

CREATE TABLE PRODUK (
id_produk varchar2 (20) ,
nama_produk varchar2(50),
id_kategori varchar2(20),
harga varchar2(20),
stock varchar(20),
gambar blob,
CONSTRAINT pk_id_produk PRIMARY KEY (id_produk),
CONSTRAINT fk_id_kategori foreign KEY (id_kategori) REFERENCES kategori(id_kategori));

CREATE TABLE PEMESANAN (
id_pemesanan varchar2 (20),
id_user varchar2(20),
id_produk varchar2(20),
id_tujuan varchar2(20),
alamat varchar2(100),
jumlah_beli NUMBER (11),
total_belanja NUMBER (11),
ongkir NUMBER (11),
total_bayar NUMBER (11),
CONSTRAINT pk_id_pemesanan PRIMARY KEY (id_pemesanan),
CONSTRAINT fk_id_user foreign KEY (id_user) REFERENCES TBL_USER (id_user),
CONSTRAINT fk_id_produk foreign KEY (id_produk) REFERENCES PRODUK (id_produk),
CONSTRAINT fk_id_tujuan foreign KEY (id_tujuan) REFERENCES TUJUAN (id_tujuan)
);

CREATE TABLE PEMBAYARAN (
id_pembayaran varchar2 (20) ,
id_pemesanan varchar2(20),
total_bayar NUMBER (11),
tgl_pembayaran DATE,
bukti_bayar blob ,
CONSTRAINT pk_pembayaran PRIMARY KEY (id_pembayaran),
CONSTRAINT fk_id_pemesanan foreign KEY (id_pemesanan) REFERENCES PEMESANAN (id_pemesanan));

CREATE TABLE KERANJANG (
ID_KERANJANG varchar2 (20) ,
id_USER varchar2(20),
ID_PRODUK VARCHAR2 (11),
HARGA NUMBER(11),
JUMLAH_BELI NUMBER(11),
SUB_TOTAL NUMBER(11),
CONSTRAINT pk_ID_KERANJANG PRIMARY KEY (ID_KERANJANG),
CONSTRAINT fk_ID_USER1 foreign KEY (ID_USER) REFERENCES TBL_USER (ID_USER),
CONSTRAINT fk_ID_PRODUK1 foreign KEY (ID_PRODUK) REFERENCES PRODUK (ID_PRODUK));


-------------------------------------------------------------------

INSERT INTO hr.TBL_USER U  (u.ID_USER,u.NAMA_USER,u.NOHP,u.USERNAME,u.PASWORD)
VALUES ('U001','DEVA DEWSON','085163634553','DEWSON14','ADMIN')

INSERT INTO hr.TBL_USER U  (u.ID_USER,u.NAMA_USER,u.NOHP,u.USERNAME,u.PASWORD)
VALUES ('U002','MIKHAYLA','088279001599','MIKHAYLA06','MIKHAYLA06')

INSERT INTO hr.TBL_USER U  (u.ID_USER,u.NAMA_USER,u.NOHP,u.USERNAME,u.PASWORD)
VALUES ('U003','BUNGA','081265778288','BUNGAN11','BUNGA11')

INSERT INTO hr.KATEGORI  K (k.ID_KATEGORI,k.NAMA_KATEGORI)
VALUES ('K001','CELANA PANJANG')

INSERT INTO hr.KATEGORI  K (k.ID_KATEGORI,k.NAMA_KATEGORI)
VALUES ('K002','CELANA PENDEK')

INSERT INTO hr.KATEGORI  K (k.ID_KATEGORI,k.NAMA_KATEGORI)
VALUES ('K003','BAJU KEMEJA')


INSERT INTO hr.TUJUAN   
VALUES ('T001','SUMATERA BARAT','50000')

INSERT INTO hr.TUJUAN T  (T.ID_TUJUAN,T.NAMA_TUJUAN,T.ONGKIR)
VALUES ('T002','BANDUNG','20000')

INSERT INTO hr.TUJUAN T  (T.ID_TUJUAN,T.NAMA_TUJUAN,T.ONGKIR)
VALUES ('T003','BALI','40000');

INSERT INTO hr.TUJUAN T  (T.ID_TUJUAN,T.NAMA_TUJUAN,T.ONGKIR)
VALUES ('T004','ACEH','60000');
-------------------------------------

INSERT INTO HR.PRODUK P  (ID_PRODUK,P.NAMA_PRODUK,P.ID_KATEGORI,P.HARGA,P.STOCK,P.GAMBAR)
VALUES ('P001','LEVIS SOFT JEANS','K001','100000','12',NULL);

INSERT INTO HR.PRODUK P (P.ID_PRODUK,P.NAMA_PRODUK,P.ID_KATEGORI,P.HARGA,P.STOCK,P.GAMBAR)
VALUES ('P002','CHINOS SHORT PANTS','K002','50000','12',NULL)

INSERT INTO HR.PRODUK P (P.ID_PRODUK,P.NAMA_PRODUK,P.ID_KATEGORI,P.HARGA,P.STOCK,P.GAMBAR)
VALUES ('P006','CHINOS SHORT ','K002','50000','12',NULL)

INSERT INTO HR.PRODUK P (P.ID_PRODUK,P.NAMA_PRODUK,P.ID_KATEGORI,P.HARGA,P.STOCK,P.GAMBAR)
VALUES ('P003','KEMEJA POLOS HITAM ','K003','150000','12',NULL)

INSERT INTO HR.PEMESANAN PM (PM.ID_PEMESANAN,PM.ID_USER,PM.ID_PRODUK,PM.ID_TUJUAN,PM.ALAMAT,PM.JUMLAH_BELI,PM.TOTAL_BELANJA,PM.ONGKIR,PM.TOTAL_BAYAR)
VALUES ('PM001','U002','P001','T001','MANINJAU','2','200000','50000','250000');

INSERT INTO HR.PEMESANAN PM (PM.ID_PEMESANAN,PM.ID_USER,PM.ID_PRODUK,PM.ID_TUJUAN,PM.ALAMAT,PM.JUMLAH_BELI,PM.TOTAL_BELANJA,PM.ONGKIR,PM.TOTAL_BAYAR)
VALUES ('PM002','U003','P002','T002','MEDAN','3','150000','20000','170000');

INSERT INTO HR.PEMESANAN PM (PM.ID_PEMESANAN,PM.ID_USER,PM.ID_PRODUK,PM.ID_TUJUAN,PM.ALAMAT,PM.JUMLAH_BELI,PM.TOTAL_BELANJA,PM.ONGKIR,PM.TOTAL_BAYAR)
VALUES ('PM003','U001','P003','T003','MEDAN','4','600000','40000','640000');

INSERT INTO HR.PEMBAYARAN PY (PY.ID_PEMBAYARAN,PY.ID_PEMESANAN,PY.TOTAL_BAYAR,PY.TGL_PEMBAYARAN,PY.BUKTI_BAYAR)
VALUES ('PY001','PM001',250000,to_date('DEC-05-2022','MON-DD-YYYY'),NULL)

INSERT INTO HR.PEMBAYARAN PY (PY.ID_PEMBAYARAN,PY.ID_PEMESANAN,PY.TOTAL_BAYAR,PY.TGL_PEMBAYARAN,PY.BUKTI_BAYAR)
VALUES ('PY002','PM002',170000,to_date('DEC-04-2022','MON-DD-YYYY'),NULL)

INSERT INTO HR.PEMBAYARAN PY (PY.ID_PEMBAYARAN,PY.ID_PEMESANAN,PY.TOTAL_BAYAR,PY.TGL_PEMBAYARAN,PY.BUKTI_BAYAR)
VALUES ('PY003','PM003',640000,to_date('DEC-02-2022','MON-DD-YYYY'),NULL)


DROP TABLE PEMBAYARAN ;
DROP TABLE PEMESANAN ;
DROP TABLE PRODUK;
DROP TABLE TUJUAN ;
DROP TABLE KATEGORI ;
DROP TABLE TBL_USER ;


INSERT INTO HR.KERANJANG K (K.ID_KERANJANG,K.ID_USER,K.ID_PRODUK,K.HARGA,K.JUMLAH_BELI,K.SUB_TOTAL)
VALUES ('K001','U001','P003','150000','4','600000');



