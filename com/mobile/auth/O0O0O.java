package com.mobile.auth;

import android.content.Context;

/* loaded from: classes4.dex */
public class O0O0O {
    public static boolean O000000o(Context context, String str) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }
}
