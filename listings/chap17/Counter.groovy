class Counter1 {
    int biggerThan(items, threshold) {
        items.grep{ it > threshold }.size()
    }
}
