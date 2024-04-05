val input = List(1, 4, 9, 1, 5, 1, 8, 9, 0)

val output = input.map(x => x + 1) // [2, 5, 10, ...]
    .groupBy(x => x) // {2: [], 5: []}
    .map((number, repetitions) => repetitions.length) // [2, 4, 5]
    .reduce((prev, current) => prev + current) // 9

println(output)