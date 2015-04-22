Design Issue:

There is a need for researchers and user both, to have access to data records.

A memento pattern, implemented correctly, allows for such client/server type sharing of data while eliminating risk of data corruption by the client.

Initially I felt a design such as this was reasonable:

 ![](data:image/*;base64,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)

After studying the pattern closely I am beginning to believe a pattern such as this is better:

 ![](data:image/*;base64,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)

I need to decide if the client maintains a complete, partial, or only current collection of day-record objects.