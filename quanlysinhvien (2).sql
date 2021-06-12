-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jan 08, 2021 at 08:59 PM
-- Server version: 5.7.31
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `quanlysinhvien`
--
CREATE DATABASE IF NOT EXISTS `quanlysinhvien` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE `quanlysinhvien`;

-- --------------------------------------------------------

--
-- Table structure for table `hocky`
--

DROP TABLE IF EXISTS `hocky`;
CREATE TABLE IF NOT EXISTS `hocky` (
  `MaHocKy` int(2) NOT NULL AUTO_INCREMENT,
  `TenHocKy` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`MaHocKy`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `hocky`
--

INSERT INTO `hocky` (`MaHocKy`, `TenHocKy`) VALUES
(1, 'Hoc Ky 1'),
(2, 'Hoc Ky 2');

-- --------------------------------------------------------

--
-- Table structure for table `ketqua`
--

DROP TABLE IF EXISTS `ketqua`;
CREATE TABLE IF NOT EXISTS `ketqua` (
  `MaSV` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MaMonHoc` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MaHocKy` int(2) NOT NULL,
  `Diem` float DEFAULT '0',
  `TinhTrang` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  KEY `FK_KQ_SV` (`MaSV`),
  KEY `FK_KQ_MH` (`MaMonHoc`),
  KEY `FK_KQ_Hocky` (`MaHocKy`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `ketqua`
--

INSERT INTO `ketqua` (`MaSV`, `MaMonHoc`, `MaHocKy`, `Diem`, `TinhTrang`) VALUES
('19211', 'MH0001', 1, 4, 'Can Cai Thien !!'),
('19211', 'MH0002', 2, 3, 'Rot'),
('19211', 'MH0003', 1, 5, 'Trung Binh');

-- --------------------------------------------------------

--
-- Table structure for table `khoa`
--

DROP TABLE IF EXISTS `khoa`;
CREATE TABLE IF NOT EXISTS `khoa` (
  `MaKhoa` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `TenKhoa` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`MaKhoa`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `khoa`
--

INSERT INTO `khoa` (`MaKhoa`, `TenKhoa`) VALUES
('MK0001', 'Cong Nghe Thong Tin');

-- --------------------------------------------------------

--
-- Table structure for table `monhoc`
--

DROP TABLE IF EXISTS `monhoc`;
CREATE TABLE IF NOT EXISTS `monhoc` (
  `MaMonHoc` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `TenMonHoc` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `SoTiet` int(20) DEFAULT '0',
  PRIMARY KEY (`MaMonHoc`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `monhoc`
--

INSERT INTO `monhoc` (`MaMonHoc`, `TenMonHoc`, `SoTiet`) VALUES
('MH0001', 'Lap Trinh Ung Dung', 75),
('MH0002', 'BackEnd', 75),
('MH0003', 'Lap Trinh Huong Doi Tuong', 45);

-- --------------------------------------------------------

--
-- Table structure for table `sinhvien`
--

DROP TABLE IF EXISTS `sinhvien`;
CREATE TABLE IF NOT EXISTS `sinhvien` (
  `MaSV` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `TenSV` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `NgaySinh` date NOT NULL,
  `GioiTinh` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `NoiSinh` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT 'Trống',
  `DiaChi` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT 'Trống',
  `Quan` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT 'Trống',
  `MaKhoa` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `HocBong` int(20) NOT NULL DEFAULT '0',
  PRIMARY KEY (`MaSV`) USING BTREE,
  KEY `FK_SV_Khoa` (`MaKhoa`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `sinhvien`
--

INSERT INTO `sinhvien` (`MaSV`, `TenSV`, `NgaySinh`, `GioiTinh`, `NoiSinh`, `DiaChi`, `Quan`, `MaKhoa`, `HocBong`) VALUES
('19211', 'vdv', '2021-01-07', 'Nam', 'bt', 'cu chi', '12', 'MK0001', 0),
('19211TT0778', 'Nguyen Thanh Duy', '2020-10-09', 'Nam', 'Ninh Thuan', 'Tuy Phong', 'Khong co', 'MK0001', 4000000);

-- --------------------------------------------------------

--
-- Table structure for table `taikhoan`
--

DROP TABLE IF EXISTS `taikhoan`;
CREATE TABLE IF NOT EXISTS `taikhoan` (
  `TenDangNhap` varchar(60) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MatKhau` varchar(256) COLLATE utf8mb4_unicode_ci NOT NULL,
  `TenHienThi` varchar(256) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `quyen` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT 'SinhVien',
  PRIMARY KEY (`TenDangNhap`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `taikhoan`
--

INSERT INTO `taikhoan` (`TenDangNhap`, `MatKhau`, `TenHienThi`, `quyen`) VALUES
('19211', '19211', 'vdv', 'SinhVien'),
('19211TT0778', '19211TT0778', 'Nguyen Thanh Duy', 'SinhVien'),
('admin', 'admin', 'Trùm trường', 'admin');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `ketqua`
--
ALTER TABLE `ketqua`
  ADD CONSTRAINT `FK_KQ_Hocky` FOREIGN KEY (`MaHocKy`) REFERENCES `hocky` (`MaHocKy`),
  ADD CONSTRAINT `FK_KQ_MH` FOREIGN KEY (`MaMonHoc`) REFERENCES `monhoc` (`MaMonHoc`),
  ADD CONSTRAINT `FK_KQ_SV` FOREIGN KEY (`MaSV`) REFERENCES `sinhvien` (`MaSV`);

--
-- Constraints for table `sinhvien`
--
ALTER TABLE `sinhvien`
  ADD CONSTRAINT `FK_SV_Khoa` FOREIGN KEY (`MaKhoa`) REFERENCES `khoa` (`MaKhoa`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
