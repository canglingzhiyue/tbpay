package com.vivo.push.util;

import android.text.TextUtils;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class f {
    public static boolean a(long j, long j2) {
        u.d("ClientReportUtil", "report message: " + j + ", reportType: " + j2);
        com.vivo.push.b.x xVar = new com.vivo.push.b.x(j2);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("messageID", String.valueOf(j));
        String a2 = com.vivo.push.restructure.a.a().e().a();
        if (!TextUtils.isEmpty(a2)) {
            hashMap.put("remoteAppId", a2);
        }
        xVar.a(hashMap);
        com.vivo.push.m.a().a(xVar);
        return true;
    }

    public static boolean a(long j, HashMap<String, String> hashMap) {
        com.vivo.push.b.x xVar = new com.vivo.push.b.x(j);
        xVar.a(hashMap);
        xVar.d();
        com.vivo.push.m.a().a(xVar);
        return true;
    }
}
