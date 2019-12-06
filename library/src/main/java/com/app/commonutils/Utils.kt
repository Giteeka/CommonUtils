package com.app.commonutils

import android.util.Patterns
import java.util.regex.Pattern

object Utils {


    fun isValidEmail(target: String?): Boolean {
        return !target.isNullOrBlank() && Patterns.EMAIL_ADDRESS.matcher(target).matches()
    }

    fun isValidPhoneNumber(target: String?): Boolean {
        return !target.isNullOrBlank() && Patterns.PHONE.matcher(target).matches()
    }

    fun isValidPassword(target: String?): Boolean {
        val mediumRegex =
            "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#\$%^&*]).{6,20})"

        val patterns = Pattern.compile(mediumRegex)
        return !target.isNullOrBlank() && patterns.matcher(target).matches();
    }


}