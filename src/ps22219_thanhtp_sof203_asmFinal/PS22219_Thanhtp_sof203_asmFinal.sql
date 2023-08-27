use master
go
--xóa csdl
drop database PS22219_Thanhtp_sof203_asmFinal
go
--1. tạo csdl
create database PS22219_Thanhtp_sof203_asmFinal
go
--2. chọn csdl
use PS22219_Thanhtp_sof203_asmFinal
go
--3. tạo bảng Users
create table Users
(
	Username varchar(50) primary key,
	Password varchar(50) not null,
	role varchar(50)
)
go
-- thêm dữ liệu vào Users
insert into Users values('ThanhPS0001','100923q','admin')
insert into Users values('DinhPS0002','100923q','admin')
insert into Users values('MaPS0003','123','user')
go
select * from Users
go
--4. tạo bảng Students
create table Students
(
	MaSV char(7) primary key,
	HoTen nVarchar(50) not null,
	Email Varchar(50), 
	SoDT Varchar(15),
	GioiTinh bit,
	DiaChi nVarchar(50),
	Hinh Varchar(50)
)
go
--5. tạo bảng Grade
create table Grade
(
	id int identity(1,1) primary key,
	MaSV char(7) references Students(MaSV),
	TiengAnh int,
	TinHoc int,
	GDTC int
)
go
-- Nhập bảng Students
insert into Students values('PS00001',N'Trần Phú Thành','teo@gmail.com','0394087873',1,N'109 Quốc Lộ 1A','thanh.jpg')
go
insert into Students values('PS00002',N'Nguyễn Thị Định','nth3r3@gmail.com','0373732677',0,N'34 Lý Thái Tổ','ntd.jpg')
go
insert into Students values('PS00003',N'Phan Tuấn Mã','trandfas3@gmail.com','0933463477',0,N'26 Sơn La','psonla2.jpg')
go
select * from Students

-- Nhập bảng Grade
insert into Grade(masv,tienganh,tinhoc,GDTC) values('PS00001',7,8,9)
insert into Grade(masv,tienganh,tinhoc,GDTC) values('PS00002',10,9,9)
insert into Grade(masv,tienganh,tinhoc,GDTC) values('PS00003',10,10,10)
go

select * from Grade
--select HoTen, Students.MaSV,TiengAnh,TinHoc,GDTC from Students inner join Grade on Students.MaSV = Grade.MaSV