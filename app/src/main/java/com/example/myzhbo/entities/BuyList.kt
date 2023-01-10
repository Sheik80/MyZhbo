package com.example.myzhbo.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "buy_list")

data class BuyList(
    @PrimaryKey(autoGenerate = true)
    val id: Int?,

    @ColumnInfo(name = "dateBuy")
    val dateShop: String, //Дата предоплаты

    @ColumnInfo(name = "priceZbo") //Цена одной машины
    val priceZbo: Int,

    @ColumnInfo(name = "buySum") //Сумма предоплаты
    val buySum: Int,

    @ColumnInfo(name = "amountZbo") //Количество оплачиваемых ездок
    val amountZboWhenBuy: Double,

): Serializable

