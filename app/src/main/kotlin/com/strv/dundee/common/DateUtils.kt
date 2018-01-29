package com.strv.dundee.common

import java.text.DateFormat
import java.util.Calendar
import java.util.Date

object DateUtils {
	fun dateToString(date: Date?): String {
		return date?.let { DateFormat.getDateTimeInstance().format(date) } ?: ""
	}
}

fun Date.isOlderThan(calendarUnit: Int, value: Int) = this.before(Calendar.getInstance().apply { add(calendarUnit, -value) }.time)