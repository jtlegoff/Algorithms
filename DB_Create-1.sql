/*
Joshua LeGoff
SE398
*/

--DROP TABLE Publisher;
--DROP TABLE Illustrator;
--DROP TABLE Genre;
--DROP TABLE Content_Rating;
--DROP TABLE Book_AuthorClusteredIndex;
--DROP TABLE Book;
--DROP TABLE Author;

CREATE TABLE Publisher(
	[PublisherID] int PRIMARY KEY IDENTITY(1, 1),
	[Name] nvarchar(255),
	[Address] nvarchar(255),
	[City] nvarchar(50),
	[State] nvarchar(2),
	[ZipCode] nvarchar(255)
);

CREATE TABLE Book(
	[BookID] int PRIMARY KEY IDENTITY(1, 1),
	[Title] nvarchar(255),
	[GenreID] int,
	[AuthorID] int,
	[IllustratorID] int,
	[PublisherID] int,
	[Content_RatingID] int,
	[Description] nvarchar(1500),
	[Suggested_Retail_Price] decimal
);

CREATE TABLE Genre(
	[GenreID] int PRIMARY KEY IDENTITY(1, 1),
	[Genre] nvarchar(50),
	[Description] nvarchar(1500)
);

CREATE TABLE Author(
	AuthorID int PRIMARY KEY IDENTITY(1, 1),
	[First_Name] nvarchar(50),
	[Last_Name] nvarchar(50),
	[Bio_Text] nvarchar(1500)
);

CREATE TABLE Illustrator(
	[IllustratorID] int PRIMARY KEY IDENTITY(1, 1),
	[First_Name] nvarchar(50),
	[Last_Name] nvarchar(50),
	[Bio_Text] nvarchar(1500)
);

CREATE TABLE Author_Audit(
	AuthorAuditID int PRIMARY KEY IDENTITY(1, 1),
	AuthorID int,
	[Old_Bio_Text] nvarchar(1500),
	[Bio_Text] nvarchar(1500),
	[ChangeDate] datetime
);

CREATE TABLE Illustrator_Audit(
	IllustratorAuditID int PRIMARY KEY IDENTITY(1, 1),
	IllustratorID int,
	[Old_Bio_Text] nvarchar(1500),
	[Bio_Text] nvarchar(1500),
	[ChangeDate] datetime
);

CREATE TABLE Content_Rating(
	[Content_RatingID] int PRIMARY KEY IDENTITY(1, 1),
	[Rating] nvarchar(5),
	[Description] nvarchar(1500),
);


--Alter tables to add FK constraints


ALTER TABLE [Book]
	ADD CONSTRAINT FK_Book_Genre FOREIGN KEY ([GenreID])
	REFERENCES [Genre] ([GenreID]);
	 
ALTER TABLE [Book]
	ADD CONSTRAINT FK_Book_Author FOREIGN KEY ([AuthorID])
	REFERENCES [Author] ([AuthorID]);

ALTER TABLE [Book]
	ADD CONSTRAINT FK_Book_Illustrator FOREIGN KEY ([IllustratorID])
	REFERENCES [Illustrator] ([IllustratorID]);

ALTER TABLE [Book]
	ADD CONSTRAINT FK_Book_Publisher FOREIGN KEY ([PublisherID])
	REFERENCES [Publisher] ([PublisherID]);

ALTER TABLE [Book]
	ADD CONSTRAINT FK_Book_Content_Rating FOREIGN KEY ([Content_RatingID])
	REFERENCES [Content_Rating] ([Content_RatingID]);


	
/*----------Most Likely Queries--------------

SELECT * FROM [SE398JL].[Book] WHERE [SE398JL].[Book].[AuthorID] = @authorID;

SELECT * FROM [SE398JL].[Book] WHERE [SE398JL].[Book].[IllustratorID] = @illustratorID;

SELECT * FROM [SE398JL].[Book] WHERE [SE398JL].[Book].[Content_RatingID] = @contentRatingID;

SELECT * FROM [SE398JL].[Book] WHERE [SE398JL].[Book].[PublisherID] = @publisherID;

SELECT * FROM [SE398JL].[Book] WHERE [SE398JL].[Book].[GenreID] = @genreID;

SELECT * FROM [SE398JL].[Author] WHERE [SE398JL].[Author].[AuthorID] = @authorID;

SELECT * FROM [SE398JL].[Author] WHERE [SE398JL].[Author].[AuthorID] = @authorID;

SELECT * FROM [SE398JL].[Illustrator] WHERE [SE398JL].[Illustrator].[IllustratorID] = @illustratorID;

----------------------------------------------*/


-- Index Creation


CREATE NONCLUSTERED INDEX IX_Author
ON [Author] (AuthorID, Last_Name);

CREATE NONCLUSTERED INDEX IX_Illustrator
ON [Illustrator] (IllustratorID, Last_Name);

CREATE NONCLUSTERED INDEX IX_Publisher
ON [Publisher] (PublisherID, Name);

CREATE NONCLUSTERED INDEX IX_Content_Rating
ON [Content_Rating] (Content_RatingID, Rating);

CREATE NONCLUSTERED INDEX IX_Book
ON [Book] (BookID, AuthorID, Content_RatingID, IllustratorID);

CREATE CLUSTERED INDEX IX_Books_By_Author
ON [Book] (AuthorID);



--Trigger Ceation

CREATE TRIGGER Trigger_Author_Audit ON Author
FOR INSERT, UPDATE
AS
INSERT INTO Author_Audit(AuthorID, Old_Bio_Text, Bio_text, ChangeDate)
VALUES((SELECT AuthorID FROM Inserted),
		(SELECT Bio_Text FROM Deleted),
		(SELECT Bio_Text FROM Inserted),
		GETUTCDATE());


		INSERT INTO Author
		VALUES('Josh',
		'LeGoff',
		'Test Bio');

		UPDATE Author
		SET Author.First_Name = 'Joshua',
			Author.Last_Name = 'LEGOFF',
			Author.Bio_Text = 'NEW Test Bio'
			WHERE Author.AuthorID = @AuthorID;


CREATE TRIGGER Trigger_Illustrator_Audit ON Illustrator
FOR INSERT, UPDATE
AS
INSERT INTO Illustrator_Audit(IllustratorID, Old_Bio_Text, Bio_text, ChangeDate)
VALUES((SELECT IllustratorID FROM Inserted),
		(SELECT Bio_Text FROM Deleted),
		(SELECT Bio_Text FROM Inserted),
		GETUTCDATE());


		INSERT INTO Illustrator
		VALUES('Josh',
		'LeGoff',
		'Test Bio');

		UPDATE Illustrator
		SET Illustrator.First_Name = 'Joshua',
			Illustrator.Last_Name = 'LEGOFF',
			Illustrator.Bio_Text = 'NEW Test Bio'
			WHERE Illustrator.IllustratorID = IllustratorID;


