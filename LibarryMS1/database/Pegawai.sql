USE [Perpus]
GO
/****** Object:  Table [dbo].[Pegawai]    Script Date: 07/24/2015 15:17:28 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Pegawai](
	[ID_Pegawai] [varchar](5) COLLATE Latin1_General_BIN NOT NULL,
	[Nama] [varchar](100) COLLATE Latin1_General_BIN NOT NULL,
	[Alamat] [text] COLLATE Latin1_General_BIN NOT NULL,
	[Telp] [varchar](13) COLLATE Latin1_General_BIN NOT NULL,
	[Jk] [char](1) COLLATE Latin1_General_BIN NOT NULL,
	[Username] [varchar](100) COLLATE Latin1_General_BIN NOT NULL,
	[Password] [varchar](100) COLLATE Latin1_General_BIN NOT NULL,
 CONSTRAINT [PK_tb_Pegawai] PRIMARY KEY CLUSTERED 
(
	[ID_Pegawai] ASC
)WITH (IGNORE_DUP_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF