package com.huawei.secure.android.common.util;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import java.util.regex.Pattern;
import mtopsdk.network.impl.ResponseProtocolType;

/* loaded from: classes4.dex */
public class LogsUtil {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f7612a = Pattern.compile("[0-9]*[a-z|A-Z]*[一-龥]*");

    /* loaded from: classes4.dex */
    private static class a extends Throwable {
        private static final long d = 7129050843360571879L;

        /* renamed from: a  reason: collision with root package name */
        private String f7613a;
        private Throwable b;
        private Throwable c;

        public a(Throwable th) {
            this.c = th;
        }

        public void a(String str) {
            this.f7613a = str;
        }

        public void a(Throwable th) {
            this.b = th;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            Throwable th = this.b;
            if (th == this) {
                return null;
            }
            return th;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.f7613a;
        }

        @Override // java.lang.Throwable
        public String toString() {
            Throwable th = this.c;
            if (th == null) {
                return "";
            }
            String name = th.getClass().getName();
            if (this.f7613a == null) {
                return name;
            }
            String str = name + ResponseProtocolType.COMMENT;
            if (this.f7613a.startsWith(str)) {
                return this.f7613a;
            }
            return str + this.f7613a;
        }
    }

    private static String a(String str) {
        if (StringUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i = 1;
        if (1 == length) {
            return String.valueOf('*');
        }
        StringBuilder sb = new StringBuilder(length);
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (f7612a.matcher(String.valueOf(charAt)).matches()) {
                if (i % 2 == 0) {
                    charAt = '*';
                }
                i++;
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    private static String a(String str, boolean z) {
        StringBuilder sb = new StringBuilder(512);
        if (!StringUtils.isEmpty(str)) {
            if (z) {
                str = a(str);
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static void a(String str, String str2) {
        if (StringUtils.isEmpty(str2)) {
            return;
        }
        a(str2, false);
    }

    public static void a(String str, String str2, String str3) {
        if (!StringUtils.isEmpty(str2) || !StringUtils.isEmpty(str3)) {
            Log.e(str, c(str2, str3));
        }
    }

    public static void b(String str, String str2) {
        if (StringUtils.isEmpty(str2)) {
            return;
        }
        Log.e(str, a(str2, false));
    }

    private static String c(String str, String str2) {
        StringBuilder sb = new StringBuilder(512);
        if (!StringUtils.isEmpty(str)) {
            sb.append(str);
        }
        if (!StringUtils.isEmpty(str2)) {
            sb.append(a(str2));
        }
        return sb.toString();
    }
}
