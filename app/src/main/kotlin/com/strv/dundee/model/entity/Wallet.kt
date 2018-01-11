package com.strv.dundee.model.entity

import com.google.firebase.firestore.ServerTimestamp
import java.util.*

/*
User object

Notes:
- data class needs to have default value so that it has empty constructor ready for Firestore
- properties also need to be vars because Firestore needs setters
 */
data class Wallet(
		var uid: String? = null,
		var coin: String? = null,
		var amount: Double? = null,
		@ServerTimestamp var created: Date? = null
) : Document() {
	companion object {
		const val COLLECTION = "wallets"
	}
}
