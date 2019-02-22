def call(message) {
    echo "ERROR: ${message}"
}

def info(message) {
    echo "INFO: ${message}"
}

def warning(message) {
    echo "WARNING: ${message}"
}

def test(message) {
    info(message)
}

def test2(message) {
    call(message)
}

def test3(message) {
    log.warning(message)
}
