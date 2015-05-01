# CSC341 Final Project
Henry Snopek</br>csc341</br>4/30/2015

## Overview
Which this assignment I ended up using the MVC pattern which is Event-Based. It is similar to to the Observer pattern but rather we can easily just interact in-between actions using ActionEvents. This project started out as a two person project which later split due to difference ways to accomplish the final design. Please see the documentation below for more information regarding usage.

## Details
In this assignment, you are to design (but not fully implement) a "super alarm clock" for University students to help them to manage their own sleep patterns, and also to provide data to support a research project into the extent of the problem in this community.  You may assume that the data you collect is to be stored in a database and is retrievable from the database as well.  There might be a mobile application to be developed at a later time to establish an interface with the functionality you develop in this assignment.

The system will need to:
- Allow a student to set an alarm to wake himself / herself up.
- Allow a student to set an alarm to remind himself / herself to go to sleep.
- Record when a student tells the system that they are about to go to sleep.
- Record when a student tells the system that they have woken up, and whether it is due to an alarm.
- Make recommendations as to when a student needs to go to sleep. This should include "yellow alerts" when the student will need sleep soon, and "red alerts" when they need to sleep now.
- Store the collected data in a server or database for later analysis by researchers.  The server/database system will be designed and implemented by another team. You should, however, indicate in your design the behavior you expect from the back-end system.
- Report students who are becoming dangerously sleep-deprived to someone who cares about them (their mother?).  This is indicated by a student being given three "red alerts" in a row.
- Provide reports to students showing their sleep patterns over time, allowing them to see how often they have ignored alarms, and to identify clusters of dangerous, or beneficial, sleep behavior.

## Assignment Requirements:
1. Produce an initial design of a solution that someone (not necessarily you) could work from.
2. Produce use cases (textual form) to provide an overview of uses of the software.
3. Produce a diagram (you deem appropriate) that captures all the events that would happen during a time period of 24 hours.  
4. Produce a class diagram; for each software element you diagram, make sure you include data fields, methods, and relations with other elements.
5. In addition to the design artifacts described in (2), (3), and (4), you may need/have artifacts of other kinds.  But in general, your entire design should be divided into not less than two and not more than ten parts, giving each a name and adding a short description of what it is and what it does – in short, why it is a part.  If important to your design, you may indicate an order to the parts, or add some additional detail as to how the parts fit together.
6. Verify your design with a skeleton program that only has classes with data fields and method headers.

You might be wondering how you can track, in real time, elapsed time?  Well, you can simulate.  The following loop simulates passage of one day, one hour at a time (you can also do one minute or even one second at a time).

```java
DateFormat df =  DateFormat.getDateInstance(DateFormat.SHORT);
GregorianCalendar now = new GregorianCalendar();
System.out.println(df.format(now.getTime()));

GregorianCalendar oneDayLater =  new GregorianCalendar();
oneDayLater.add(GregorianCalendar.DATE, 1);
System.out.println(df.format(oneDayLater.getTime()));

while( now.before(oneDayLater) ){
  now.add(GregorianCalendar.MINUTE, 60);
  System.out.println(now.getTime());
}
```

If you want to learn more about the [Date() class](http://www.tutorialspoint.com/java/util/java_util_date.htm) and [GregorianCalendar() class](http://www.tutorialspoint.com/java/util/java_util_gregoriancalendar.htm).

## Background Information
In some circles sleep deprivation has become a status symbol.  Statements like "I pulled another all-nighter" and "I've slept only three hours in the last two days" are shared with pride, as listeners nod in admiration.  Although celebrating self-deprivation has historical roots and is not likely to go away soon, it's troubling when an educated culture rewards people for hurting themselves, and that includes missing sleep.  As Stanford sleep experts have stated, sleep deprivation is one of the leading health problems in the modern world.  People with high levels of sleep debt get sick more often, have more difficulties in personal relationships, and are less productive and creative. The negative effects of sleep debt go on and on.  In short, when you have too much sleep debt, you simply can't enjoy life fully.

## Presentation Guidelines:
1. You have (up to) 10 minutes to present. - [Powerpoint](https://docs.google.com/presentation/d/11bERRui8qS1NnJZFrYYtM7mERI8ZxbAg1YJXiW9apxU/edit?usp=sharing)
2. Present design artifacts (see requirements (2), (3), and (4)) in an order that can best describe your design thoughts / thought process
3. Any design issues you ran into, and whether you've resolved the issues?
4. Make sure that the diagrams are readable

## Contributors
- Henry Snopek
- Ben Haos

## How to Contribute
To contribute to the repo you must first have [git](http://git-scm.com/). Download [here](http://eclipse.github.io/) or search within the eclipse market store for [JGit](http://www.eclipse.org/jgit/download/).

If you'd rather learn to use git from command line checkout this [tutorial](https://try.github.io/levels/1/challenges/1).

### What is git?
> "Git is a free and open source distributed version control system designed to handle everything from small to very large projects with speed and efficiency." - [git-scm.com](http://git-scm.com)

### Why use git?
Git allows us as programmers to keep track of all our changes, review changes, and maintain standards. Git is one of many version control tools like svn. A majority of jobs today use some sort of version control, and almost all today use git.

## To inspire us!
![fluffy puppy](http://cl.ly/XvJZ/puppy-fluffy.jpg)
