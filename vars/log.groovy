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
