# builder-pattern
- this pattern allows to construct objects easily.
- objects in this pattern usually have lots of states that needs to be initialised.
- the pattern involves a builder that builds the concrete object and returns it.
- concrete object can have some states initialised already by the class. or it can be custom made where each state must be initialised through setter methods provided by the builder. 
- best way to build is by chaining.

# example
- In this example, we look at BMW car company as they make their cars. 
- They have 1 factory, aka 1 abstract builder which makes various types of car, aka child concrete builders.
- Types of car like SUV, sedan, sports car.
- So we have a concrete car which is contained by all car builders. Each builder has their own specific blueprints.
- Few people can get BMW to make them a custom car. Thats where instead of using concrete car builder blueprints/classes, customer can initialise all the states themselves using custom builder.

- in essence, making constructing all cars easier but also allowing very specific cars to be made as well.
