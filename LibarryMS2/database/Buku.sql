USE [Libarry]
GO
/****** Object:  Table [dbo].[Buku]    Script Date: 07/21/2015 04:04:31 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Buku](
	[ID_Buku] [varchar](5) COLLATE Latin1_General_BIN NOT NULL,
	[Kode] [varchar](50) COLLATE Latin1_General_BIN NULL,
	[Kat_Buku] [varchar](100) COLLATE Latin1_General_BIN NULL,
	[Buku] [varchar](100) COLLATE Latin1_General_BIN NULL,
	[Deskripsi] [text] COLLATE Latin1_General_BIN NULL,
	[Stock] [varchar](5) COLLATE Latin1_General_BIN NULL,
 CONSTRAINT [PK_Buku] PRIMARY KEY CLUSTERED 
(
	[ID_Buku] ASC
)WITH (IGNORE_DUP_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF