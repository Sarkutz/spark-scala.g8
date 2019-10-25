
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

   sbt new sarkutz/spark-scala.g8
   make build
   make
   tail -f out.log

Create New Project
==================

::

   $ sbt new sarkutz/spark-scala.g8
   # Enter details when prompted.

Example usage::

   $ sbt new sarkutz/spark-scala.g8
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

