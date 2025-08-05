package com.alibaba.security.realidentity.service.camera.utils;

import android.content.SharedPreferences;
import com.alibaba.security.realidentity.g3;

/* loaded from: classes3.dex */
public enum FrontLightMode {
    ON,
    AUTO,
    OFF;

    public static FrontLightMode parse(String str) {
        return str == null ? OFF : valueOf(str);
    }

    public static FrontLightMode readPref(SharedPreferences sharedPreferences) {
        return parse(sharedPreferences.getString(g3.b, "OFF"));
    }
}
