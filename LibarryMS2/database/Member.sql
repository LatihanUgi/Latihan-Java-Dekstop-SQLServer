USE [Libarry]
GO
/****** Object:  Table [dbo].[Member]    Script Date: 07/21/2015 01:05:34 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Member](
	[ID_Member] [varchar](5) COLLATE Latin1_General_BIN NOT NULL,
	[No_Pengaman] [varchar](20) COLLATE Latin1_General_BIN NULL,
	[Nama] [varchar](100) COLLATE Latin1_General_BIN NULL,
	[Alamat] [text] COLLATE Latin1_General_BIN NULL,
	[Telp] [varchar](13) COLLATE Latin1_General_BIN NULL,
	[Jk] [char](1) COLLATE Latin1_General_BIN NULL,
 CONSTRAINT [PK_Member] PRIMARY KEY CLUSTERED 
(
	[ID_Member] ASC
)WITH (IGNORE_DUP_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF