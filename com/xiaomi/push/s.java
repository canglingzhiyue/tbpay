package com.xiaomi.push;

import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import java.util.Collection;

/* loaded from: classes9.dex */
public class s {

    /* loaded from: classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f24603a;

        /* renamed from: a  reason: collision with other field name */
        private final StringBuilder f858a;
        private final String b;

        public a() {
            this(":", ",");
        }

        public a(String str, String str2) {
            this.f858a = new StringBuilder();
            this.f24603a = str;
            this.b = str2;
        }

        public a a(String str, Object obj) {
            if (!StringUtils.isEmpty(str)) {
                if (this.f858a.length() > 0) {
                    this.f858a.append(this.b);
                }
                StringBuilder sb = this.f858a;
                sb.append(str);
                sb.append(this.f24603a);
                sb.append(obj);
            }
            return this;
        }

        public String toString() {
            return this.f858a.toString();
        }
    }

    public static int a(String str, int i) {
        if (!StringUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (Exception unused) {
                return i;
            }
        }
        return i;
    }

    public static long a(String str, long j) {
        if (!StringUtils.isEmpty(str)) {
            try {
                return Long.parseLong(str);
            } catch (Exception unused) {
                return j;
            }
        }
        return j;
    }

    public static boolean a() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    public static boolean a(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static int b(String str, int i) {
        return !StringUtils.isEmpty(str) ? ((str.hashCode() / 10) * 10) + i : i;
    }
}
