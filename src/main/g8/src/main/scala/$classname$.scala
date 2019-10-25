import org.apache.spark.sql.{SparkSession,DataFrame}

object $classname$ {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder.appName("$classname$").getOrCreate()

    // TODO
    println("SparkSession started...")

    spark.stop()
  }
}
