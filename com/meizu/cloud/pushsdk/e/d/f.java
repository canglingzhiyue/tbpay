package com.meizu.cloud.pushsdk.e.d;

import anet.channel.util.HttpConstant;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import tb.fxb;
import tb.riy;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f7914a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', com.taobao.tao.image.d.LEVEL_D, com.taobao.tao.image.d.LEVEL_E, 'F'};
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final int f;
    private final List<String> g;
    private final List<String> h;
    private final String i;
    private final String j;

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        String f7915a;
        String d;
        final List<String> f;
        List<String> g;
        String h;
        String b = "";
        String c = "";
        int e = -1;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public enum a {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public b() {
            ArrayList arrayList = new ArrayList();
            this.f = arrayList;
            arrayList.add("");
        }

        private static String a(String str, int i, int i2) {
            String b = f.b(str, i, i2, false);
            if (b.contains(":")) {
                InetAddress b2 = (!b.startsWith(riy.ARRAY_START_STR) || !b.endsWith(riy.ARRAY_END_STR)) ? b(b, 0, b.length()) : b(b, 1, b.length() - 1);
                if (b2 == null) {
                    return null;
                }
                byte[] address = b2.getAddress();
                if (address.length != 16) {
                    throw new AssertionError();
                }
                return a(address);
            }
            return m.b(b);
        }

        private static String a(byte[] bArr) {
            int i = 0;
            int i2 = 0;
            int i3 = -1;
            int i4 = 0;
            while (i2 < bArr.length) {
                int i5 = i2;
                while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                    i5 += 2;
                }
                int i6 = i5 - i2;
                if (i6 > i4) {
                    i3 = i2;
                    i4 = i6;
                }
                i2 = i5 + 2;
            }
            com.meizu.cloud.pushsdk.e.h.b bVar = new com.meizu.cloud.pushsdk.e.h.b();
            while (i < bArr.length) {
                if (i == i3) {
                    bVar.b(58);
                    i += i4;
                    if (i == 16) {
                        bVar.b(58);
                    }
                } else {
                    if (i > 0) {
                        bVar.b(58);
                    }
                    bVar.e(((bArr[i] & 255) << 8) | (bArr[i + 1] & 255));
                    i += 2;
                }
            }
            return bVar.a();
        }

        private void a(String str, int i, int i2, boolean z, boolean z2) {
            String b = f.b(str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, true);
            if (b(b)) {
                return;
            }
            if (c(b)) {
                c();
                return;
            }
            List<String> list = this.f;
            if (list.get(list.size() - 1).isEmpty()) {
                List<String> list2 = this.f;
                list2.set(list2.size() - 1, b);
            } else {
                this.f.add(b);
            }
            if (!z) {
                return;
            }
            this.f.add("");
        }

        private static boolean a(String str, int i, int i2, byte[] bArr, int i3) {
            int i4 = i3;
            while (i < i2) {
                if (i4 == bArr.length) {
                    return false;
                }
                if (i4 != i3) {
                    if (str.charAt(i) != '.') {
                        return false;
                    }
                    i++;
                }
                int i5 = i;
                int i6 = 0;
                while (i5 < i2) {
                    char charAt = str.charAt(i5);
                    if (charAt < '0' || charAt > '9') {
                        break;
                    } else if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + charAt) - 48) > 255) {
                        return false;
                    } else {
                        i5++;
                    }
                }
                if (i5 - i == 0) {
                    return false;
                }
                bArr[i4] = (byte) i6;
                i4++;
                i = i5;
            }
            return i4 == i3 + 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x0074, code lost:
            return null;
         */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0050  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.net.InetAddress b(java.lang.String r11, int r12, int r13) {
            /*
                r0 = 16
                byte[] r1 = new byte[r0]
                r2 = -1
                r3 = 0
                r4 = 0
                r5 = -1
                r6 = -1
            L9:
                r7 = 0
                if (r12 >= r13) goto L75
                if (r4 != r0) goto Lf
                return r7
            Lf:
                int r8 = r12 + 2
                if (r8 > r13) goto L28
                r9 = 2
                java.lang.String r10 = "::"
                boolean r9 = r11.regionMatches(r12, r10, r3, r9)
                if (r9 == 0) goto L28
                if (r5 == r2) goto L1f
                return r7
            L1f:
                int r4 = r4 + 2
                if (r8 != r13) goto L25
                r5 = r4
                goto L75
            L25:
                r5 = r4
                r6 = r8
                goto L4c
            L28:
                if (r4 == 0) goto L4b
                r8 = 1
                java.lang.String r9 = ":"
                boolean r9 = r11.regionMatches(r12, r9, r3, r8)
                if (r9 == 0) goto L36
                int r12 = r12 + 1
                goto L4b
            L36:
                java.lang.String r9 = "."
                boolean r12 = r11.regionMatches(r12, r9, r3, r8)
                if (r12 == 0) goto L4a
                int r12 = r4 + (-2)
                boolean r11 = a(r11, r6, r13, r1, r12)
                if (r11 != 0) goto L47
                return r7
            L47:
                int r4 = r4 + 2
                goto L75
            L4a:
                return r7
            L4b:
                r6 = r12
            L4c:
                r12 = r6
                r8 = 0
            L4e:
                if (r12 >= r13) goto L60
                char r9 = r11.charAt(r12)
                int r9 = com.meizu.cloud.pushsdk.e.d.f.a(r9)
                if (r9 == r2) goto L60
                int r8 = r8 << 4
                int r8 = r8 + r9
                int r12 = r12 + 1
                goto L4e
            L60:
                int r9 = r12 - r6
                if (r9 == 0) goto L74
                r10 = 4
                if (r9 > r10) goto L74
                int r7 = r4 + 1
                int r9 = r8 >>> 8
                byte r9 = (byte) r9
                r1[r4] = r9
                int r4 = r7 + 1
                byte r8 = (byte) r8
                r1[r7] = r8
                goto L9
            L74:
                return r7
            L75:
                if (r4 == r0) goto L86
                if (r5 != r2) goto L7a
                return r7
            L7a:
                int r11 = r4 - r5
                int r12 = 16 - r11
                java.lang.System.arraycopy(r1, r5, r1, r12, r11)
                int r0 = r0 - r4
                int r0 = r0 + r5
                java.util.Arrays.fill(r1, r5, r0, r3)
            L86:
                java.net.InetAddress r11 = java.net.InetAddress.getByAddress(r1)     // Catch: java.net.UnknownHostException -> L8b
                return r11
            L8b:
                java.lang.AssertionError r11 = new java.lang.AssertionError
                r11.<init>()
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.e.d.f.b.b(java.lang.String, int, int):java.net.InetAddress");
        }

        private boolean b(String str) {
            return ".".equals(str) || "%2e".equalsIgnoreCase(str);
        }

        private static int c(String str, int i, int i2) {
            int parseInt;
            try {
                parseInt = Integer.parseInt(f.b(str, i, i2, "", false, false, false, true));
            } catch (NumberFormatException unused) {
            }
            if (parseInt <= 0 || parseInt > 65535) {
                return -1;
            }
            return parseInt;
        }

        private void c() {
            List<String> list = this.f;
            if (!list.remove(list.size() - 1).isEmpty() || this.f.isEmpty()) {
                this.f.add("");
                return;
            }
            List<String> list2 = this.f;
            list2.set(list2.size() - 1, "");
        }

        private boolean c(String str) {
            return "..".equals(str) || "%2e.".equalsIgnoreCase(str) || ".%2e".equalsIgnoreCase(str) || "%2e%2e".equalsIgnoreCase(str);
        }

        private static int d(String str, int i, int i2) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt == ':') {
                    return i;
                }
                if (charAt == '[') {
                    do {
                        i++;
                        if (i < i2) {
                        }
                    } while (str.charAt(i) != ']');
                }
                i++;
            }
            return i2;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0042 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void e(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L3
                return
            L3:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L1d
                r1 = 92
                if (r0 == r1) goto L1d
                java.util.List<java.lang.String> r0 = r10.f
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L29
            L1d:
                java.util.List<java.lang.String> r0 = r10.f
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.f
                r0.add(r2)
            L27:
                int r12 = r12 + 1
            L29:
                r6 = r12
                if (r6 >= r13) goto L42
                java.lang.String r12 = "/\\"
                int r12 = com.meizu.cloud.pushsdk.e.d.m.a(r11, r6, r13, r12)
                if (r12 >= r13) goto L36
                r0 = 1
                goto L37
            L36:
                r0 = 0
            L37:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.a(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L29
                goto L27
            L42:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.e.d.f.b.e(java.lang.String, int, int):void");
        }

        private static int f(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char charAt = str.charAt(i);
            boolean z = false;
            boolean z2 = charAt < 'a' || charAt > 'z';
            if (charAt < 'A' || charAt > 'Z') {
                z = true;
            }
            if (z2 && z) {
                return -1;
            }
            while (true) {
                i++;
                if (i >= i2) {
                    break;
                }
                char charAt2 = str.charAt(i);
                if (charAt2 < 'a' || charAt2 > 'z') {
                    if (charAt2 < 'A' || charAt2 > 'Z') {
                        if (charAt2 < '0' || charAt2 > '9') {
                            if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                if (charAt2 == ':') {
                                    return i;
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        private static int g(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        a a(f fVar, String str) {
            int a2;
            int i;
            int a3 = m.a(str, 0, str.length());
            int b = m.b(str, a3, str.length());
            if (f(str, a3, b) != -1) {
                if (str.regionMatches(true, a3, com.taobao.vessel.utils.b.HTTPS_SCHEMA, 0, 6)) {
                    this.f7915a = "https";
                    a3 += 6;
                } else if (!str.regionMatches(true, a3, "http:", 0, 5)) {
                    return a.UNSUPPORTED_SCHEME;
                } else {
                    this.f7915a = "http";
                    a3 += 5;
                }
            } else if (fVar == null) {
                return a.MISSING_SCHEME;
            } else {
                this.f7915a = fVar.b;
            }
            int g = g(str, a3, b);
            char c = riy.CONDITION_IF;
            char c2 = '#';
            if (g >= 2 || fVar == null || !fVar.b.equals(this.f7915a)) {
                int i2 = a3 + g;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    a2 = m.a(str, i2, b, "@/\\?#");
                    char charAt = a2 != b ? str.charAt(a2) : (char) 65535;
                    if (charAt == 65535 || charAt == c2 || charAt == '/' || charAt == '\\' || charAt == c) {
                        break;
                    } else if (charAt == '@') {
                        if (!z) {
                            int a4 = m.a(str, i2, a2, (char) riy.CONDITION_IF_MIDDLE);
                            i = a2;
                            String b2 = f.b(str, i2, a4, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                            if (z2) {
                                b2 = this.b + "%40" + b2;
                            }
                            this.b = b2;
                            if (a4 != i) {
                                this.c = f.b(str, a4 + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                                z = true;
                            }
                            z2 = true;
                        } else {
                            i = a2;
                            this.c += "%40" + f.b(str, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                        }
                        i2 = i + 1;
                        c = riy.CONDITION_IF;
                        c2 = '#';
                    }
                }
                int d = d(str, i2, a2);
                int i3 = d + 1;
                if (i3 < a2) {
                    this.d = a(str, i2, d);
                    int c3 = c(str, i3, a2);
                    this.e = c3;
                    if (c3 == -1) {
                        return a.INVALID_PORT;
                    }
                } else {
                    this.d = a(str, i2, d);
                    this.e = f.a(this.f7915a);
                }
                if (this.d == null) {
                    return a.INVALID_HOST;
                }
                a3 = a2;
            } else {
                this.b = fVar.e();
                this.c = fVar.b();
                this.d = fVar.e;
                this.e = fVar.f;
                this.f.clear();
                this.f.addAll(fVar.c());
                if (a3 == b || str.charAt(a3) == '#') {
                    a(fVar.d());
                }
            }
            int a5 = m.a(str, a3, b, "?#");
            e(str, a3, a5);
            if (a5 < b && str.charAt(a5) == '?') {
                int a6 = m.a(str, a5, b, '#');
                this.g = f.c(f.b(str, a5 + 1, a6, " \"'<>#", true, false, true, true));
                a5 = a6;
            }
            if (a5 < b && str.charAt(a5) == '#') {
                this.h = f.b(str, 1 + a5, b, "", true, false, false, false);
            }
            return a.SUCCESS;
        }

        public b a(String str) {
            this.g = str != null ? f.c(f.a(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        public b a(String str, String str2) {
            if (str != null) {
                if (this.g == null) {
                    this.g = new ArrayList();
                }
                this.g.add(f.a(str, " \"'<>#&=", false, false, true, true));
                this.g.add(str2 != null ? f.a(str2, " \"'<>#&=", false, false, true, true) : null);
                return this;
            }
            throw new IllegalArgumentException("name == null");
        }

        public f a() {
            if (this.f7915a != null) {
                if (this.d == null) {
                    throw new IllegalStateException("host == null");
                }
                return new f(this);
            }
            throw new IllegalStateException("scheme == null");
        }

        int b() {
            int i = this.e;
            return i == -1 ? f.a(this.f7915a) : i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f7915a);
            sb.append(HttpConstant.SCHEME_SPLIT);
            if (!this.b.isEmpty() || !this.c.isEmpty()) {
                sb.append(this.b);
                if (!this.c.isEmpty()) {
                    sb.append(riy.CONDITION_IF_MIDDLE);
                    sb.append(this.c);
                }
                sb.append('@');
            }
            if (this.d.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.d);
                sb.append(']');
            } else {
                sb.append(this.d);
            }
            int b = b();
            if (b != f.a(this.f7915a)) {
                sb.append(riy.CONDITION_IF_MIDDLE);
                sb.append(b);
            }
            f.b(sb, this.f);
            if (this.g != null) {
                sb.append(riy.CONDITION_IF);
                f.a(sb, this.g);
            }
            if (this.h != null) {
                sb.append('#');
                sb.append(this.h);
            }
            return sb.toString();
        }
    }

    private f(b bVar) {
        this.b = bVar.f7915a;
        this.c = a(bVar.b, false);
        this.d = a(bVar.c, false);
        this.e = bVar.d;
        this.f = bVar.b();
        this.g = a(bVar.f, false);
        List<String> list = bVar.g;
        String str = null;
        this.h = list != null ? a(list, true) : null;
        String str2 = bVar.h;
        this.i = str2 != null ? a(str2, false) : str;
        this.j = bVar.toString();
    }

    public static int a(String str) {
        if ("http".equals(str)) {
            return 80;
        }
        return "https".equals(str) ? 443 : -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return b(str, 0, str.length(), str2, z, z2, z3, z4);
    }

    static String a(String str, boolean z) {
        return b(str, 0, str.length(), z);
    }

    private List<String> a(List<String> list, boolean z) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            arrayList.add(next != null ? a(next, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static void a(com.meizu.cloud.pushsdk.e.h.b bVar, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        int i3 = i;
        com.meizu.cloud.pushsdk.e.h.b bVar2 = null;
        while (i3 < i2) {
            int codePointAt = str.codePointAt(i3);
            if (codePointAt == 43 && z3) {
                bVar.a(z ? riy.PLUS : "%2B");
            } else if (a(codePointAt, i3, str, i2, str2, z, z2, z3, z4)) {
                if (bVar2 == null) {
                    bVar2 = new com.meizu.cloud.pushsdk.e.h.b();
                }
                bVar2.c(codePointAt);
                while (!bVar2.h()) {
                    int i4 = bVar2.i() & 255;
                    bVar.b(37);
                    char[] cArr = f7914a;
                    bVar.b((int) cArr[(i4 >> 4) & 15]);
                    bVar.b((int) cArr[i4 & 15]);
                }
            } else {
                bVar.c(codePointAt);
            }
            i3 += Character.charCount(codePointAt);
        }
    }

    private static void a(com.meizu.cloud.pushsdk.e.h.b bVar, String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt != 37 || (i3 = i + 2) >= i2) {
                if (codePointAt == 43 && z) {
                    bVar.b(32);
                }
                bVar.c(codePointAt);
            } else {
                int b2 = b(str.charAt(i + 1));
                int b3 = b(str.charAt(i3));
                if (b2 != -1 && b3 != -1) {
                    bVar.b((b2 << 4) + b3);
                    i = i3;
                }
                bVar.c(codePointAt);
            }
            i += Character.charCount(codePointAt);
        }
    }

    static void a(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = list.get(i);
            String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    private static boolean a(int i, int i2, String str, int i3, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        if (i < 32 || i == 127) {
            return true;
        }
        if ((i >= 128 && z4) || str2.indexOf(i) != -1) {
            return true;
        }
        boolean z5 = !z || (z2 && !a(str, i2, i3));
        if (i == 37 && z5) {
            return true;
        }
        return i == 43 && z3;
    }

    private static boolean a(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && b(str.charAt(i + 1)) != -1 && b(str.charAt(i3)) != -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(char c) {
        if (c < '0' || c > '9') {
            char c2 = 'a';
            if (c < 'a' || c > 'f') {
                c2 = 'A';
                if (c < 'A' || c > 'F') {
                    return -1;
                }
            }
            return (c - c2) + 10;
        }
        return c - '0';
    }

    public static f b(String str) {
        b bVar = new b();
        if (bVar.a((f) null, str) == b.a.SUCCESS) {
            return bVar.a();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        int i3 = i;
        while (i3 < i2) {
            int codePointAt = str.codePointAt(i3);
            if (a(codePointAt, i3, str, i2, str2, z, z2, z3, z4)) {
                com.meizu.cloud.pushsdk.e.h.b bVar = new com.meizu.cloud.pushsdk.e.h.b();
                bVar.a(str, i, i3);
                a(bVar, str, i3, i2, str2, z, z2, z3, z4);
                return bVar.a();
            }
            i3 += Character.charCount(codePointAt);
        }
        return str.substring(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            boolean z2 = false;
            boolean z3 = charAt == '%';
            if (charAt == '+' && z) {
                z2 = true;
            }
            if (z3 || z2) {
                com.meizu.cloud.pushsdk.e.h.b bVar = new com.meizu.cloud.pushsdk.e.h.b();
                bVar.a(str, i, i3);
                a(bVar, str, i3, i2, z);
                return bVar.a();
            }
        }
        return str.substring(i, i2);
    }

    static void b(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append(fxb.DIR);
            sb.append(list.get(i));
        }
    }

    static List<String> c(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i, indexOf));
                str2 = null;
            } else {
                arrayList.add(str.substring(i, indexOf2));
                str2 = str.substring(indexOf2 + 1, indexOf);
            }
            arrayList.add(str2);
            i = indexOf + 1;
        }
        return arrayList;
    }

    public String a() {
        if (this.i == null) {
            return null;
        }
        return this.j.substring(this.j.indexOf(35) + 1);
    }

    public String b() {
        if (this.d.isEmpty()) {
            return "";
        }
        int indexOf = this.j.indexOf(64);
        return this.j.substring(this.j.indexOf(58, this.b.length() + 3) + 1, indexOf);
    }

    public List<String> c() {
        int indexOf = this.j.indexOf(47, this.b.length() + 3);
        String str = this.j;
        int a2 = m.a(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < a2) {
            int i = indexOf + 1;
            int a3 = m.a(this.j, i, a2, (char) fxb.DIR);
            arrayList.add(this.j.substring(i, a3));
            indexOf = a3;
        }
        return arrayList;
    }

    public String d() {
        if (this.h == null) {
            return null;
        }
        int indexOf = this.j.indexOf(63) + 1;
        String str = this.j;
        return this.j.substring(indexOf, m.a(str, indexOf + 1, str.length(), '#'));
    }

    public String e() {
        if (this.c.isEmpty()) {
            return "";
        }
        int length = this.b.length() + 3;
        String str = this.j;
        return this.j.substring(length, m.a(str, length, str.length(), ":@"));
    }

    public boolean equals(Object obj) {
        return (obj instanceof f) && ((f) obj).j.equals(this.j);
    }

    public b f() {
        b bVar = new b();
        bVar.f7915a = this.b;
        bVar.b = e();
        bVar.c = b();
        bVar.d = this.e;
        bVar.e = this.f != a(this.b) ? this.f : -1;
        bVar.f.clear();
        bVar.f.addAll(c());
        bVar.a(d());
        bVar.h = a();
        return bVar;
    }

    public int hashCode() {
        return this.j.hashCode();
    }

    public String toString() {
        return this.j;
    }
}
