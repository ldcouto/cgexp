# Delegate Tutorial

Mini project used to demonstrate usage of the delegate feature, which
enables combined execution of model components (written in VDM) and
real system components.

The `projects` folder contains the following folders:

* `vdm` - the VDM model that integrates an external component.
* `bridge` - maven project containing the Java glue code used to access
  the external component via the VDM model.
* `delegate` - maven project containing the Java glue code used to
  access the external component via the code generated version of the
  VDM Model.
* `external` - maven project containing the external component used by
  the VDM model and the code generated version of the VDM model.
* `cgversion` - maven project that integrates the VDM model, external
  component and delegate to produce the code generated version of the
  system.


### Requirements:
* Java 1.8 or newer.
* Maven 3.0 or newer.

### Usage:

Go to the `projects` directory.

To code generate the VDM tests and produce the code generated version
of the system execute:
  
```
mvn install
```

To test the code generated version of the system using the code
generated VDM tests execute:

```
mvn test
```
  
To clean all projects and delete generated code execute:

```
mvn clean
```
