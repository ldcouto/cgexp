# cgexp

Mini projects to experiment with CG integration for a software-in-the-loop
modelling process in Overture.

The projects are:

* vdm - the VDM model to be used for both software-in-the-loop and code
  generation
* logic - the Java project that holds the actual logic we are using in the
  model and the CG version
* bridge - Java glue code for accessing the logic via the VDM model
* delegate - Java glue code for accessing the logic via the CG version
* cgversion - Maven project that integrates the model, logic and delegate to
  produce the software version of the system
