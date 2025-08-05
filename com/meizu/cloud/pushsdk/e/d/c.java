package com.meizu.cloud.pushsdk.e.d;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import mtopsdk.network.impl.ResponseProtocolType;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final String[] f7911a;

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final List<String> f7912a = new ArrayList(20);

        private void c(String str, String str2) {
            if (str != null) {
                if (str.isEmpty()) {
                    throw new IllegalArgumentException("name is empty");
                }
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if (charAt <= 31 || charAt >= 127) {
                        throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
                    }
                }
                if (str2 == null) {
                    throw new IllegalArgumentException("value == null");
                }
                int length2 = str2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    char charAt2 = str2.charAt(i2);
                    if (charAt2 <= 31 || charAt2 >= 127) {
                        throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt2), Integer.valueOf(i2), str, str2));
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name == null");
        }

        public b a(String str, String str2) {
            c(str, str2);
            return b(str, str2);
        }

        public c a() {
            return new c(this);
        }

        b b(String str, String str2) {
            this.f7912a.add(str);
            this.f7912a.add(str2.trim());
            return this;
        }
    }

    private c(b bVar) {
        this.f7911a = (String[]) bVar.f7912a.toArray(new String[bVar.f7912a.size()]);
    }

    private c(String[] strArr) {
        this.f7911a = strArr;
    }

    public static c a(String... strArr) {
        if (strArr == null || strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) strArr.clone();
        for (int i = 0; i < strArr2.length; i++) {
            if (strArr2[i] == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i] = strArr2[i].trim();
        }
        for (int i2 = 0; i2 < strArr2.length; i2 += 2) {
            String str = strArr2[i2];
            String str2 = strArr2[i2 + 1];
            if (str.length() == 0 || str.indexOf(0) != -1 || str2.indexOf(0) != -1) {
                throw new IllegalArgumentException("Unexpected header: " + str + ResponseProtocolType.COMMENT + str2);
            }
        }
        return new c(strArr2);
    }

    private static String a(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public String a(int i) {
        return this.f7911a[i << 1];
    }

    public String a(String str) {
        return a(this.f7911a, str);
    }

    public Set<String> a() {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int c = c();
        for (int i = 0; i < c; i++) {
            treeSet.add(a(i));
        }
        return Collections.unmodifiableSet(treeSet);
    }

    public b b() {
        b bVar = new b();
        Collections.addAll(bVar.f7912a, this.f7911a);
        return bVar;
    }

    public String b(int i) {
        return this.f7911a[(i << 1) + 1];
    }

    public int c() {
        return this.f7911a.length / 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int c = c();
        for (int i = 0; i < c; i++) {
            sb.append(a(i));
            sb.append(ResponseProtocolType.COMMENT);
            sb.append(b(i));
            sb.append("\n");
        }
        return sb.toString();
    }
}
