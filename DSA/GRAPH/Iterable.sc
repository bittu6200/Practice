  // Creating an Iterable collection of integers
    val numbers: Iterable[Int] = List(1, 2, 3, 4, 5)

    // Iterating over the collection and printing each element
    println("Numbers:")
    numbers.foreach(number => println(number))

    // Using methods like map to transform elements
    val doubledNumbers: Iterable[Int] = numbers.map(number => number * 2)
    println("\nDoubled Numbers:")
    doubledNumbers.foreach(number => println(number))

    // Filtering elements
    val evenNumbers: Iterable[Int] = numbers.filter(number => number % 2 == 0)
    println("\nEven Numbers:")
    evenNumbers.foreach(number => println(number))

