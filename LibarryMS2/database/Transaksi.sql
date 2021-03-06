USE [Libarry]
GO
/****** Object:  Table [dbo].[Transaksi]    Script Date: 07/22/2015 20:01:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Transaksi](
	[ID_Transaksi] [varchar](5) COLLATE Latin1_General_BIN NOT NULL,
	[Kode_Buku] [varchar](50) COLLATE Latin1_General_BIN NULL,
	[Judul_Buku] [varchar](100) COLLATE Latin1_General_BIN NULL,
	[No_Pengaman_Member] [varchar](20) COLLATE Latin1_General_BIN NULL,
	[Tanggal_Pinjam] [varchar](50) COLLATE Latin1_General_BIN NULL,
	[Tanggal_Pengembalian] [varchar](50) COLLATE Latin1_General_BIN NULL,
	[Stock] [varchar](5) COLLATE Latin1_General_BIN NULL,
 CONSTRAINT [PK_Transaksi] PRIMARY KEY CLUSTERED 
(
	[ID_Transaksi] ASC
)WITH (IGNORE_DUP_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF