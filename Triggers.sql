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

CREATE TRIGGER Trigger_Author_Audit ON Author
FOR INSERT, UPDATE
AS
INSERT INTO Author_Audit(AuthorID, Old_Bio_Text, Bio_text, ChangeDate)
VALUES((SELECT AuthorID FROM Inserted),
		(SELECT Bio_Text FROM Deleted),
		(SELECT Bio_Text FROM Inserted),
		GETUTCDATE());


CREATE TRIGGER Trigger_Illustrator_Audit ON Illustrator
FOR INSERT, UPDATE
AS
INSERT INTO Illustrator_Audit(IllustratorID, Old_Bio_Text, Bio_text, ChangeDate)
VALUES((SELECT IllustratorID FROM Inserted),
		(SELECT Bio_Text FROM Deleted),
		(SELECT Bio_Text FROM Inserted),
		GETUTCDATE());




