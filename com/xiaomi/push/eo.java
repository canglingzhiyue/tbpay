package com.xiaomi.push;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import java.util.HashMap;

/* loaded from: classes9.dex */
public class eo {
    public static void a(Context context, String str, int i, String str2) {
        ah.a(context).a(new ep(context, str, i, str2));
    }

    private static void a(Context context, HashMap<String, String> hashMap) {
        ew m1916a = es.a(context).m1916a();
        if (m1916a != null) {
            m1916a.a(context, hashMap);
        }
    }

    private static void b(Context context, HashMap<String, String> hashMap) {
        ew m1916a = es.a(context).m1916a();
        if (m1916a != null) {
            m1916a.c(context, hashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, String str, int i, String str2) {
        if (context == null || StringUtils.isEmpty(str)) {
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("awake_info", str);
            hashMap.put("event_type", String.valueOf(i));
            hashMap.put("description", str2);
            int a2 = es.a(context).a();
            if (a2 != 1) {
                if (a2 != 2) {
                    if (a2 == 3) {
                        a(context, hashMap);
                    }
                }
                c(context, hashMap);
            } else {
                a(context, hashMap);
            }
            b(context, hashMap);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
        }
    }

    private static void c(Context context, HashMap<String, String> hashMap) {
        ew m1916a = es.a(context).m1916a();
        if (m1916a != null) {
            m1916a.b(context, hashMap);
        }
    }
}
