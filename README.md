# Documentation
- [Jenkins Shared Libraries](https://jenkins.io/doc/book/pipeline/shared-libraries/)

# Parser settings
You can change txt parser settings in Manage Jenkins > Configure Global Security > Markup Formatter

# Jenkinsfile
```
library 'mySharedLibrary'

log.info 'Starting'
log.warning 'Nothing to do!'
log 'Oh crap!'

hello()
hello 'all'

myStage('Closure example', {echo 'Hello from the other side!'})

patient(name: 'John', surname: 'Doe')
```