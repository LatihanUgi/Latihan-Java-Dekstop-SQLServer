USE [Perpus]
GO
/****** Object:  Table [dbo].[Temp_Trans]    Script Date: 07/24/2015 15:17:56 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Temp_Trans](
	[ID_Detail_Trans] [int] IDENTITY(1,1) NOT NULL,
	[ID_Transaksi] [varchar](5) COLLATE Latin1_General_BIN NOT NULL,
	[Kode_Buku] [varchar](50) COLLATE Latin1_General_BIN NULL,
	[Tanggal_Pinjam] [varchar](50) COLLATE Latin1_General_BIN NULL,
	[Tanggal_Pengembalian] [varchar](50) COLLATE Latin1_General_BIN NULL,
	[Stock] [varchar](5) COLLATE Latin1_General_BIN NULL,
 CONSTRAINT [PK_Temp_Trans_1] PRIMARY KEY CLUSTERED 
(
	[ID_Detail_Trans] ASC
)WITH (IGNORE_DUP_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF