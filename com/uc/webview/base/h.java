package com.uc.webview.base;

import android.content.Context;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final String f23782a = "h";
    private static volatile SharedPreferences b;

    /* loaded from: classes9.dex */
    public interface a {
        a a(String str, long j);

        a a(String str, String str2);

        a a(String str, boolean z);

        void a();
    }

    public static long a(String str, long j) {
        SharedPreferences d = d();
        return d != null ? d.getLong(str, j) : j;
    }

    public static a a() {
        if (d() == null) {
            return null;
        }
        return new a() { // from class: com.uc.webview.base.h.1

            /* renamed from: a  reason: collision with root package name */
            private final Map<String, Object> f23783a = new HashMap();

            @Override // com.uc.webview.base.h.a
            public final a a(String str, long j) {
                if (!StringUtils.isEmpty(str)) {
                    this.f23783a.put(str, Long.valueOf(j));
                }
                return this;
            }

            @Override // com.uc.webview.base.h.a
            public final a a(String str, String str2) {
                if (!StringUtils.isEmpty(str) && str2 != null) {
                    this.f23783a.put(str, str2);
                }
                return this;
            }

            @Override // com.uc.webview.base.h.a
            public final a a(String str, boolean z) {
                if (!StringUtils.isEmpty(str)) {
                    this.f23783a.put(str, Boolean.valueOf(z));
                }
                return this;
            }

            @Override // com.uc.webview.base.h.a
            public final void a() {
                try {
                    SharedPreferences.Editor edit = h.d().edit();
                    for (Map.Entry<String, Object> entry : this.f23783a.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value instanceof Boolean) {
                            edit.putBoolean(key, ((Boolean) value).booleanValue());
                        } else if (value instanceof Long) {
                            edit.putLong(key, ((Long) value).longValue());
                        } else {
                            edit.putString(key, (String) value);
                        }
                    }
                    edit.commit();
                    this.f23783a.clear();
                } catch (Throwable th) {
                    Log.w(h.f23782a, "commitSp failed", th);
                }
            }
        };
    }

    public static String a(String str, String str2) {
        SharedPreferences d = d();
        return d != null ? d.getString(str, str2) : str2;
    }

    public static boolean a(String str) {
        SharedPreferences d = d();
        if (d != null) {
            return d.getBoolean(str, false);
        }
        return false;
    }

    public static long b(String str) {
        return a(str, -1L);
    }

    public static String c(String str) {
        return a(str, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SharedPreferences d() {
        Context context;
        if (b == null) {
            synchronized (h.class) {
                if (b == null && (context = EnvInfo.getContext()) != null) {
                    b = context.getSharedPreferences("u4sdk_sp", 4);
                }
            }
        }
        return b;
    }
}
