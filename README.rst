
###########################
Spark Scala Giter8 Template
###########################

*A `Giter8 <http://www.foundweekends.org/giter8/>`__ template to quickly
create a basic Apache Spark application in Scala*.

Use this template to have a working hello world Spark application in three
commands.


*****
Usage
*****

::

   scala new sarkutz/spark-scala
   make build
   make

Create New Project
==================

::

   $ scala new sarkutz/spark-scala
   # Enter details when prompted.

Example usage::

   $ scala new sarkutz/spark-scala
   name [Analysis Name]: Basic App
   classname [BasicApp]:

Execute Application
===================

Build the application::

   $ make build

Execute the application::

   $ make
   $ tail -f out.log


**********
Motivation
**********

Does staring a new Apache Spark application in Scala take too much grunt work
and time?

Use this template to have a working hello world Spark application in three
commands.


****************
Additional Notes
****************

By default, creates scaffolding for Scala 2.11 and Spark 2.4.

