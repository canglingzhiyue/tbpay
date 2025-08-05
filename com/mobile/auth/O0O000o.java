package com.mobile.auth;

import android.util.Log;

/* loaded from: classes4.dex */
public class O0O000o {
    private static final O0O000o O000000o = new O0O000o();
    private static boolean O00000Oo = false;

    public static void O000000o(String str, String str2) {
        if (O00000Oo) {
            Log.e("CMCC-SDK:" + str, "" + str2);
        }
    }

    public static void O000000o(boolean z) {
        O00000Oo = z;
    }

    public static void O00000Oo(String str, String str2) {
        if (O00000Oo) {
            String str3 = "CMCC-SDK:" + str;
            String str4 = "" + str2;
        }
    }
}
