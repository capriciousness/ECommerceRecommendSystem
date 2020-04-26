package pers.xxl.online



import kafka.serializer.StringDecoder
import org.apache.spark.SparkConf
import org.apache.spark.streaming.{Seconds, StreamingContext}
import org.apache.spark.streaming.kafka010.{ConsumerStrategies, KafkaUtils, LocationStrategies}
object NetworkWordCount {
  def main(args: Array[String]): Unit = {
    val sparkConf = new SparkConf()
    sparkConf.setMaster("local[2]").setAppName("NetworkWordCount")
    val ssc = new StreamingContext(sparkConf, Seconds(4))
    val lines = ssc.socketTextStream("localhost", 9999)
    val results = lines.flatMap(_.split(" ")).map((_, 1)).reduceByKey(_+_)
    results.print()
    ssc.start()
    ssc.awaitTermination()

   /* def main(args: Array[String]): Unit = {
      val conf = new SparkConf().setAppName("NetworkWordCount").setMaster("local[3]")
      val ssc = new StreamingContext(conf,Seconds(5))

      val topicLines = KafkaUtils.createDirectStream(ssc,"10.64.24.78:2181"
        ,"StreamKafkaGroupId",Map("spark" -> 1))
      topicLines.map(_._2).flatMap(str => str.split(" ")).print()

      ssc.start()
      ssc.awaitTermination()
    }*/
  }
}
