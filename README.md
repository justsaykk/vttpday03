# What is the relationship between classes and objects?

### What are classes?

Simply put, a class is just a template from which all objects of that class, follows.

### What are objects?

Objects are stuff that was derived based on a template (class).

### So... Back to the question:

Classes are templates from which objects are created.

> What if I want something different for objects that I create?

Thats where we get to "Constructors"

## Constructors

## Getters and Setters

To generate all the getters and setters on VS Code:

1. Press cmd + shift + P
2. Type "Source Action" --> "Generate Getters and Setters"
3. Select all the stuff that needs to be getted and setted

## The signature of a method:

Consists of these 3 parts:

1. Return type
2. Name of the method
3. Parameters of the method

That being said these 3 are different methods:

```java
public void stop() {  // <-- Notice, no params
    // Some code here //
}
```

```java
public void stop(Integer time) { // <-- Notice, params
    // Some code here //
    }
```

```java
public String stop() { // <-- Notice, different return type
    // Some code here //
    }
```

## Working with Classes

There are some seemingly random words when you're declaring a class.
Here are some of the words and what they mean:

| keyword | Meaning                                                                                                             |
| ------- | ------------------------------------------------------------------------------------------------------------------- |
| public  | Everyone can access this class/method                                                                               |
| private | Not everyone can access this class/method. This will generate a need for "getters" and "setters".                   |
| static  | This member is a class member and is shared across all objects/instance                                             |
| final   | The variable value cannot be changed. If the "final" keyword is used, when constructing, the value must be provided |
| void    | Return type. This states the expected output of the method.                                                         |
