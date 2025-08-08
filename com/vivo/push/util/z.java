package com.vivo.push.util;

import android.content.Context;
import mtopsdk.common.util.StringUtils;

/* loaded from: classes9.dex */
public final class z extends c {
    private Context b;

    public z(Context context) {
        if (context != null) {
            this.b = context;
            a(this.b);
        }
    }

    private synchronized void a(Context context) {
        a(context, "com.vivo.push_preferences.appconfig_v1");
    }

    public final String b() {
        String obj;
        Context context = this.b;
        String packageName = context.getPackageName();
        Object a2 = ag.a(context, packageName, "com.vivo.push.app_id");
        if (a2 != null) {
            obj = a2.toString();
        } else {
            Object a3 = ag.a(context, packageName, "app_id");
            obj = a3 != null ? a3.toString() : "";
        }
        return StringUtils.isEmpty(obj) ? b("APP_APPID", "") : obj;
    }

    public final String c() {
        String obj;
        Context context = this.b;
        String packageName = context.getPackageName();
        Object a2 = ag.a(context, packageName, "com.vivo.push.api_key");
        if (a2 != null) {
            obj = a2.toString();
        } else {
            Object a3 = ag.a(context, packageName, "api_key");
            obj = a3 != null ? a3.toString() : "";
        }
        return StringUtils.isEmpty(obj) ? b("APP_APIKEY", "") : obj;
    }
}
