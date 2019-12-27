package com.lisi.carwebbigdata.main

import com.lisi.carwebbigdata.dataSourceCreate.DataSourceCreate

/**
  *
  * 生成原始数据
  */
//数据格式（中间用,隔开）： id,下单月份,性别,购买地点,车型,价格,颜色
object MainDataSource {


  def main(args: Array[String]): Unit = {
    //(下标范围，保存路径)  hdfs://hadoop102:/out/carsSources
    DataSourceCreate.dataCreate(1 to 500000,"out/carsSources")

  }





}
