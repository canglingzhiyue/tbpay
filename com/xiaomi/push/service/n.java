package com.xiaomi.push.service;

import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Long> f24714a = new HashMap();

    private static void a() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ArrayList<String> arrayList = new ArrayList(f24714a.size());
        for (Map.Entry<String, Long> entry : f24714a.entrySet()) {
            if (elapsedRealtime - entry.getValue().longValue() > 60000) {
                arrayList.add(entry.getKey());
            }
        }
        for (String str : arrayList) {
            f24714a.remove(str);
        }
    }

    public static boolean a(byte[] bArr, String str) {
        boolean z = false;
        if (bArr != null && bArr.length > 0 && !StringUtils.isEmpty(str)) {
            String a2 = com.xiaomi.push.bm.a(bArr);
            if (!StringUtils.isEmpty(a2)) {
                synchronized (f24714a) {
                    Map<String, Long> map = f24714a;
                    if (map.get(a2 + str) != null) {
                        z = true;
                    } else {
                        Map<String, Long> map2 = f24714a;
                        map2.put(a2 + str, Long.valueOf(SystemClock.elapsedRealtime()));
                    }
                    a();
                }
            }
        }
        return z;
    }
}
