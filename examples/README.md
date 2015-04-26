# Examples
Both GUI and Console implementations are similar. The only differences is that a console waits for input and the GUI reacts to buttons and text areas. **Note:** the examples that are left in this folder are rough scaffolding meant for the umls that are generated in the `docs` folder.

## Responding to actions
Both interfaces will have to react to the `ActionEvents` that are triggered in an `event.Event`. For instance if the `RING` ActionEvent is triggered your interface will have to handle this by ringing. If an `Alert-Yellow` or `Alert-Red` is triggered you will have to notify the user and possibly contact their mom. In any case you must listen for these basic `ActionEvent`s:
- `RING`
- `Alert-Yellow`
- `Alert-Red`

Interface independent you will have to handle incoming requests from the researchers (ie creating alerts). You will need to record the incoming request and add this to your timeline.

## Recording events and actions
Also interface independent you will need to record all actions and events according to [record](../docs/README.md#record). These should be formatted like so:

```
Time  - Entity, Action
13:00 - User,   Add Alarm for 8:00
13:03 - User,   Add Reminder for 18:00
16:00 - API,    Add Alert for 19:00
18:00 - Clock,  Reminder Executes
18:10 - User,   Enters Sleep
...
7:30  - User,    Exits Sleep
8:00  - Clock,   Alarm Executes
8:01  - User,    Stops Alarm
...
```

## Sending records to the server
Depending on how the researchers have setup their API, you will have to format the records to fit their requests. Also I have provided `Records.Iterator()` so you may send all the records. The best practice after sending each record is to remove them so you don't send duplicate records over to your researchers.
