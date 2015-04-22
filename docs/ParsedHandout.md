**Assignment 10** (_Getting People to Sleep_)

(Due at the final exam)

(Haos Parse)

In this assignment:

 1. **Design**  
  a. **Program does not need to be fully implemented.**  

2."Super alarm clock" for University students.  
3.Manage their own sleep patterns  
 a.Data to support a research project.  
  i.Extent of the problem in this community.  
 b.Stored in a database  
 a.Collectable and retrievable from the database.  
 b.Be able to be used as a mobile application.  
  i.Connected to an interface that allows connection to the functionality developed in this assignment.  

The system will need to:

- Allow a student to set an alarm to wake themselves up.
- Allow a student to set an alarm to remind themselves to sleep.
- Record when a student tells the system they are laying down to go to sleep.
- Record when a student tells the system they have woken up
- ooWhether it is due to an alarm. (Track each time?)

- Make recommendations for sleep-time.
- "Yellow alerts" = sleep soon.
- "Red alerts" = sleep now.

- Store the collected data
- Server/Database (A server is not a database, a database is not a server)
- Used for analysis by researchers.
- Design the behavior expected from the back-end system.

- ·Report "High Alert" to student's emergency contact.
- Three "red alerts" in a row have been given.

- Provide reports to students showing their sleep patterns. over time
- Show ignored alarms
- Show clusters of dangerous sleep behavior.
- Show clusters of beneficial sleep behavior.

**Assignment Requirements:**

You are to

+ 1 Produce an initial design of a solution that someone could work from.
+ 2 Produce use cases in textual form(huh?) 
+ 2.a Provide an overview of software uses.

+ 3 Diagram #1
+ 3.a Captures all the events that would happen during a time period of 24 hours.  
+ 3.b Type = you deem appropriate  

+ 4 Class diagram;  
+ 4.a Each software element   
+ 4.a.i Data fields.   
+ 4.a.ii Methods.   
+ 4.a.iii Relations with other elements.    

+ 5 Possible other artifacts of other kinds.  
+ 5.a Name  
+ 5.b Short Description (what it is, what it does )  
+ 5.c Why it is needed.  
+ 5.c.i If needed:  
+ 5.c.i.1 Indicate order of part.  
+ 5.c.i.2 Relation to other parts.  
+ 5.d Two part min.  
+ 5.e Ten part max.  

+ 6 Verify design.
+ 6.a skeleton program  
+ 6.a.i classes  
+ 6.a.ii data fields  
+ 6.a.iii method headers  

(HINT?)

Q. How can you can track in real time, elapsed time?

A. Simulate.

The following loop simulates passage of one day, one hour at a time (you can also do one minute or even one second at a time).

_DateFormat df =  DateFormat. __getDateInstance__ (DateFormat. __SHORT__ );_

_                GregorianCalendar now = _ **new** _ GregorianCalendar();_

_                System. __out__.println(df.format(now.getTime()));_

_                GregorianCalendar oneDayLater =  _ **new** _ GregorianCalendar();_

_                oneDayLater.add(GregorianCalendar. __DATE__ , 1);_

_                System. __out__.println(df.format(oneDayLater.getTime()));_

_                _ **while** _( now.before(oneDayLater) ){_

_                        now.add(GregorianCalendar. __MINUTE__ , 60);_

_                        System. __out__.println(now.getTime());_

_                }_

(Resource Provided)

Java Date() class &  GregorianCalendar() class info:

[http://www.javaworld.com/article/2076270/core-java/calculating-java-dates.html?](http://www.javaworld.com/article/2076270/core-java/calculating-java-dates.html?page=1), [http://www.javaworld.com/article/2075174/core-java/working-in-java-time.html](http://www.javaworld.com/article/2075174/core-java/working-in-java-time.html)

_Some background information in case you are interested:_

In some circles sleep deprivation has become a status symbol.  Statements like "I pulled another all-nighter" and "I've slept only three hours in the last two days" are shared with pride, as listeners nod in admiration.  Although celebrating self-deprivation has historical roots and is not likely to go away soon, it's troubling when an educated culture rewards people for hurting themselves, and that includes missing sleep.  As Stanford sleep experts have stated, sleep deprivation is one of the leading health problems in the modern world.  People with high levels of sleep debt get sick more often, have more difficulties in personal relationships, and are less productive and creative. The negative effects of sleep debt go on and on.  In short, when you have too much sleep debt, you simply can't enjoy life fully.

**Due 5/23/15 Guidelines:**

+ 1. a 10 minute or less presentation
+ 2.Readable diagrams. (Good power-point slides)
+ 1. a.Design artifacts 2, 3, and 4.
+ i.Arrange to show design thought(s) and/or thought process(es).
+ 3.Any un-resolved design issues encountered.
+ 4.Any resolved design issues encountered.