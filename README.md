KnowDay – Find the Day You Were Born

This is a simple Java console program that calculates the day of the week for a given date of birth using the Gregorian calendar method.
It was originally written during my engineering days as a fun way to understand how calendars and date calculations work internally.

📌 Features

Input your Date of Birth in the format DD MM YYYY.

Validates input date (including leap years).

Uses century codes, month codes, and leap year adjustments from the Gregorian calendar.

Outputs:

Your full date of birth.

The day of the week you were born.

If your year was a leap year or not.

🖥️ Example Run
Enter your date of birth in this format
DD  MM  YYYY
07  10  1997

ur DOB is 7 October 1997
the day u r born is Tue

⚙️ How It Works

Splits the date into day, month, year.

Applies century code, year code, month code, and leap year rules.

Uses modular arithmetic to map the result to the correct weekday:

0 → Saturday  
1 → Sunday  
2 → Monday  
3 → Tuesday  
4 → Wednesday  
5 → Thursday  
6 → Friday  

🚀 How to Run

Clone the repo:

git clone https://github.com/<your-username>/KnowDay.git
cd KnowDay


Compile the program:

javac KnowDay.java


Run the program:

java KnowDay

📚 Notes

This is a manual implementation (no use of built-in date/time APIs).

Built for learning purposes during engineering to understand the Gregorian calendar and date arithmetic.

Works for dates >= 1700.

🔮 Future Improvements

Refactor repetitive switch code.

Add support for any year range.

Option to calculate today’s day automatically.

Add unit tests.
