package com.xiaomi.push;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private static volatile n f24598a;

    /* renamed from: a  reason: collision with other field name */
    private Context f849a;

    /* renamed from: a  reason: collision with other field name */
    private Handler f850a = new Handler(Looper.getMainLooper());

    /* renamed from: a  reason: collision with other field name */
    private Map<String, Map<String, String>> f851a = new HashMap();

    private n(Context context) {
        this.f849a = context;
    }

    public static n a(Context context) {
        if (f24598a == null) {
            synchronized (n.class) {
                if (f24598a == null) {
                    f24598a = new n(context);
                }
            }
        }
        return f24598a;
    }

    private synchronized String a(String str, String str2) {
        if (this.f851a != null && !TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(str2)) {
                try {
                    Map<String, String> map = this.f851a.get(str);
                    if (map == null) {
                        return "";
                    }
                    return map.get(str2);
                } catch (Throwable unused) {
                    return "";
                }
            }
        }
        return "";
    }

    private synchronized void b(String str, String str2, String str3) {
        if (this.f851a == null) {
            this.f851a = new HashMap();
        }
        Map<String, String> map = this.f851a.get(str);
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(str2, str3);
        this.f851a.put(str, map);
    }

    public synchronized String a(String str, String str2, String str3) {
        String a2 = a(str, str2);
        if (!TextUtils.isEmpty(a2)) {
            return a2;
        }
        return this.f849a.getSharedPreferences(str, 4).getString(str2, str3);
    }

    /* renamed from: a  reason: collision with other method in class */
    public synchronized void m2211a(String str, String str2, String str3) {
        b(str, str2, str3);
        this.f850a.post(new o(this, str, str2, str3));
    }
}
