package com.example.myzhbo.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable


@Entity(tableName = "zbo_list")
data class ZboList(
    @PrimaryKey(autoGenerate = true)
    val id: Int?,

    @ColumnInfo (name = "dateShop")
    val dateShop: String, //Дата предоплаты

    @ColumnInfo (name = "dateShopCarZbo") //Дата вывоза одной машины
    val dateShopCarZbo: String,

    @ColumnInfo (name = "totalSum") //Сумма предоплаты
    val totalSum: Int,

    @ColumnInfo (name = "price") //Цена одной поездки
    val price: Int,

    @ColumnInfo (name = "balance") //остаток суммы
    val balance: Double,

    @ColumnInfo (name = "amountDrive") //Количество поездок в остатке
    val amountDrive: Double,


    @ColumnInfo (name = "itemsIds") //это будет ID нашего листа чтобы по нему работать
    val itemsIds: String,


): Serializable //serializable мы отправим нам список в наши классы
