package com.strv.dundee.model.entity

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/*
Ticker object

Notes:
- data class needs to have default value so that it has empty constructor ready for Room
- properties also need to be vars because Room needs setters
 */
@Entity(tableName = "ticker")
data class Ticker(
        var source: String = BitcoinSource.BITSTAMP,
        var currency: String = Currency.USD,
        var coin: String = Coin.BTC,
        var lastPrice: Double = 0.toDouble(),
        var highPrice: Double = 0.toDouble(),
        var lowPrice: Double = 0.toDouble(),
        var timestamp: Long = 0
) {
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0
}