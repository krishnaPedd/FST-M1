-- Added Column using ALTER command
ALTER TABLE salesman ADD grade int;
-- set values to grade column using Update command
UPDATE salesman SET grade=100;
-- Displayed results below
SELECT * FROM salesman;
