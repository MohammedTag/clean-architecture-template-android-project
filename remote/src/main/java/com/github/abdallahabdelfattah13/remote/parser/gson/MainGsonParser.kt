package com.github.abdallahabdelfattah13.remote.parser.gson

import com.google.gson.Gson
import com.google.gson.GsonBuilder


/**
 * Created by AbdAllah AbdElfattah on 27/05/2019,
 * The D. GmbH,
 * Cairo, Egypt.
 */
class MainGsonParser {
    private val DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"

    fun providesGson(): Gson =
        GsonBuilder()
            .setDateFormat(DATE_FORMAT)
            .create()
}