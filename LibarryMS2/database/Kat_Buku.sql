USE [Libarry]
GO
/****** Object:  Table [dbo].[Kat_Buku]    Script Date: 07/21/2015 01:06:38 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Kat_Buku](
	[ID_Kat_Buku] [varchar](3) COLLATE Latin1_General_BIN NOT NULL,
	[Kat_Buku] [varchar](100) COLLATE Latin1_General_BIN NULL,
 CONSTRAINT [PK_Kat_Buku] PRIMARY KEY CLUSTERED 
(
	[ID_Kat_Buku] ASC
)WITH (IGNORE_DUP_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF