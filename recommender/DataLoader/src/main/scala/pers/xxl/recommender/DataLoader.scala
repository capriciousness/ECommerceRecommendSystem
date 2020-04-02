package pers.xxl.recommender

/**
  * Product数据集
  * 3982                                 商品id
  * Fuhlen 富勒 M8眩光舞者时尚节能无     商品名称
  * 1057,439,736
  * B009EJN4T2
  * https://images-cn-4.ssl-img          商品图片url
  * 外设产品|鼠标|电脑/办公              商品分类
  * 富勒|鼠标|电子产品|好用|外观漂亮     商品UGC标签
  */
case class Product(productId: Int, name: String, imageUrl: String, categories: String, tags: String)

/**
  * Rating数据集
  * 4867          用户id
  * 457976        商品id
  * 5.0           评分
  * 1395676800    时间戳
  */
case class Rating(userId: Int, productId: Int, score: Double, timestamp: Int)


object DataLoader {
  def main(args: Array[String]): Unit = {
    val sparkConf = null;
    val spark = null;

    //加载数据
    val productRDD = null;
    val ratingRDD = null;

    storeDataInMongoDB()

    //spark.stop()

  }
def storeDataInMongoDB(): Unit ={


}


}
