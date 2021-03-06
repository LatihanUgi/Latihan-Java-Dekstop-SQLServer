USE [Perpus]
GO
/****** Object:  Table [dbo].[Transaksi]    Script Date: 07/24/2015 15:18:21 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Transaksi](
	[ID_Transaksi] [varchar](5) COLLATE Latin1_General_BIN NOT NULL,
	[No_Pengaman_Member] [varchar](20) COLLATE Latin1_General_BIN NULL,
	[Status_Peminjaman] [nvarchar](50) COLLATE Latin1_General_CI_AS NULL,
 CONSTRAINT [PK_Transaksi] PRIMARY KEY CLUSTERED 
(
	[ID_Transaksi] ASC
)WITH (IGNORE_DUP_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF