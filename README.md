# Protobuf 3 + Mapstruct Mapping issue

Revert to `9779df9d94a9c9489f4ffa696fe89cbbcdedbadd` commit and run the tester application to reproduce the issue. 
```
SetObjectMapperImpl.java:44: error: ProtocolStringList is abstract; cannot be instantiated
ProtocolStringList protocolStringList = new ProtocolStringList();
```

The issue has been fixed using [mapstruct-spi-protobuf](https://github.com/entur/mapstruct-spi-protobuf), take a look at the build.gradle file to see 
how it has been fixed.