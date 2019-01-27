def call(String name, Closure body) {
    stage(name) {
        body()
    }
}