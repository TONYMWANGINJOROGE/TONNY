//package com.example.typhoon
//
//import android.util.Base64
//import java.text.SimpleDateFormat
//import java.util.Date
//import java.util.Locale
//
//object Utils {
//    fun getTimestamp(): String {
//        return SimpleDateFormat("yyyyMMddHHmmss", Locale.getDefault()).format(Date())
//    }
//    fun sanitizePhoneNumber(phone: String): String {
//        if (phone == "") {
//            return ""
//        }
//
//        if ((phone.length < 11) and phone.startsWith("0")) {
//            val p = phone.replaceFirst("^0".toRegex(), "254")
//            return p
//        }
//        if (phone.length == 13 && phone.startsWith("+")) {
//            val p = phone.replaceFirst("^+".toRegex(), "")
//            return p
//        }
//        return phone
//    }
//
//    fun getPassword(businessShortCode: String, passkey: String, timestamp: String): String {
//        val str = businessShortCode + passkey + timestamp
//        //encode the password to Base64
//        return Base64.encodeToString(str.toByteArray(), Base64.NO_WRAP)
//    }
//}