This project contains backend for DM project

This project consists of 4 modules:

* commons – should contain only classes that should be used on all application layers. e.g. shared enum constants
* repository – contains layer responsible for connection to database. It's expected that hibernate will be used to perform this operations
* services – this layer contains business logic of application. It **must** know nothing about hibernate used on underlying level.
* security is responsible for providing authorization and authentication to this application
