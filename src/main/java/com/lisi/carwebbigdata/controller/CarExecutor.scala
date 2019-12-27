package com.lisi.carwebbigdata.controller

import com.lisi.carwebbigdata.bigDataExecutor.{AdressAmount, CarSales, ColorAmount, SexAmount}

object CarExecutor {
  //position "in/carData/source"
  def executor(position:String):Int={
    CarSales. carsDataToMysql("local[*]",position,
      "root","jiang","overwrite",
      "jdbc:mysql://localhost:3306/bigdatacar","carsSale")


    /**
      * 2.生成性别表 参数含义和上面的相同
      *   表名：sexYearAmount
      */
    SexAmount.perSexAmount("local[*]",position,
      "root","jiang","overwrite",
      "jdbc:mysql://localhost:3306/bigdatacar","sexYearAmount")

    /**
      * 3.生成地区表
      */
    AdressAmount.perAdressAmount("local[*]",position,
      "root","jiang","overwrite",
      "jdbc:mysql://localhost:3306/bigdatacar","adressYearAmount")

    /**
      * 4.生成汽车color表
      *
      */
    ColorAmount.perColorAmount("local[*]",position,
      "root","jiang","overwrite",
      "jdbc:mysql://localhost:3306/bigdatacar","colorYearAmount")

    return 1;
  }

}
