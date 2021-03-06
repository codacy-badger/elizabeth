package com.silverhetch.elizabeth.bus.government

import com.silverhetch.elizabeth.arch.Pipeline
import java.text.SimpleDateFormat
import java.util.*


class Timestamp : Pipeline<String> {
    override fun compute(): String {
        val calendar = Calendar.getInstance()
        val dateFormat = SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z")
        dateFormat.timeZone = TimeZone.getTimeZone("GMT")
        return dateFormat.format(calendar.time)
    }
}