# Use Cases

ID                | 1
----------------- | -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Title             | Setting an Alarm
Description       | User sets an Alarm to go off @ `time`.
Actors            | User
Precondition      | User has a clock.
Postcondition     | User has set a new alarm.
Main Success Flow | <ol><li>User selects `add alarm`.</li><li>User selects time for the alarm and if it reoccurs.</li><li>User selects `done`.</li><li>Clock adds the alarm to it's timeline.</li></ol>
Extensions        | N/A

ID                | 2
----------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Title             | Setting a Reminder
Description       | User sets Reminder to go off @ `time`
Actors            | User
Precondition      | User has a clock.
Postcondition     | User has set a new reminder.
Main Success Flow | <ol><li>User selects `add reminder`.</li><li>User selects time for the reminder.</li><li>User selects `done`.</li><li>Clock adds the reminder to it's timeline.</li></ol>
Extensions        | N/A

ID                | 3
----------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Title             | Turning off Alarm, Alert, Reminder
Description       | User turns off an Alarm, Alert, or Reminder
Actors            | User
Precondition      | Alarm, Alert, or Reminder is already going off
Postcondition     | The Alarm, Alert, or Reminder is turned off
Main Success Flow | <ol><li>User selects `off`.</li><li>Clock then stops `ring`.</li><li>Clock removes Alarm, Alert, Reminder if it does not reoccur.</li></ol>
Extensions        | <ol><li>a. User doesn't turn Alarm, Alert, or Reminder off.<ul><li>Clock rings until User turns off Alarm, Alert, Reminder.</li></ul></li><li>a. User Wakes up before Alarm goes off.<ul><li>User turns Alarm off before it triggers `Ring`.</li></ul></li><li>a. User goes to sleep before Alert goes off.<ul><li>Alert is removed from `clock.Timeline`.</li></ul></li></ol>

ID                | 4
----------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Title             | Researchers set an Alert for User
Description       | Researchers use Server to set an Alert for User.
Actors            | User
Precondition      | Clock has connection to the Server.
Postcondition     | Alert is set on the Clock.
Main Success Flow | <ol><li>Researcher requests Clock to set an Alert(`Type[YELLOW/RED]`).</li><li>Server sends request to Clock.</li><li>Clock adds Alert to `clock.Timeline`.</li><li>Clock responds with Success after adding the Alert.</li></ol>
Extensions        | <ol><li>a. Clock has no connection to the server.<ul><li>Clock doesn't receive Alert.</li></ul></li></ol>

ID                | 5
----------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Title             | User Requests Report
Description       | The user requests a report to be generated from their data.
Actors            | User
Precondition      | User has enough data for report.
Postcondition     | User receives generated report.
Main Success Flow | <ol><li>User selects `Reports`.</li><li>User selects the report they'd like generated.</li><li>User selects delivery method.</li><li>Clock queries server for all sleep data pertinent to requested report.</li><li>Clock generates report based on received data.</li><li>Clock delivers report using specified delivery method.</li></ol>
Extensions        | N/A
