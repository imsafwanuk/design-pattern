# builder-pattern
- this pattern allows to contruct objects easily.
- objects in this pattern usually have lots of states that needs to be initialised.
- the pattern involves a builder that builds the concrete object and returns it.
- concrete object can have some states initialised already by the class. or it can be custom made where each state must be initialised through setter methods provided by the builder. 
- best way to build is by chaining.

# example
- In this example, we look at BMW car company as they make their cars. 
- They have 1 factory, aka 1 builder.
- They also have many types of car like SUV, sedan, sports car.
- So we have a car abstract variable, from which we extend these other concrete car classes.
- Few people can get BMW to make them a custom car. Thats where instead of using concrete car blueprints/classes, customer can initialise all the states themselves.

- in essence, making contructing all car easier but also allowing very specific cars to be made as well.
