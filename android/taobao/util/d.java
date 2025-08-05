package android.taobao.util;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f1538a;
        public int b;
        public int c;
        public String d;
        public String e = "";

        static {
            kge.a(-1438416904);
        }
    }

    static {
        kge.a(1746592238);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.taobao.util.d.a a(java.lang.String r11) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = android.taobao.util.d.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L15
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r11
            java.lang.String r11 = "ddda6a4e"
            java.lang.Object r11 = r0.ipc$dispatch(r11, r1)
            android.taobao.util.d$a r11 = (android.taobao.util.d.a) r11
            return r11
        L15:
            android.taobao.util.d$a r0 = new android.taobao.util.d$a
            r0.<init>()
            r1 = 46
            int r1 = r11.lastIndexOf(r1)
            r4 = 0
            if (r1 >= 0) goto L24
            return r4
        L24:
            java.lang.String r5 = r11.substring(r1)
            r0.f1538a = r5
            r5 = 120(0x78, float:1.68E-43)
            int r6 = r1 + (-1)
            int r5 = r11.lastIndexOf(r5, r6)
            if (r5 >= 0) goto L35
            return r4
        L35:
            int r6 = r5 + 1
            r7 = 0
        L38:
            r8 = 57
            r9 = 48
            if (r6 >= r1) goto L4d
            char r10 = r11.charAt(r6)
            if (r10 < r9) goto L4d
            if (r10 > r8) goto L4d
            int r7 = r7 * 10
            int r7 = r7 + r10
            int r7 = r7 - r9
            int r6 = r6 + 1
            goto L38
        L4d:
            if (r7 > 0) goto L50
            return r4
        L50:
            r1 = 95
            int r6 = r5 + (-1)
            int r1 = r11.lastIndexOf(r1, r6)
            if (r1 >= 0) goto L5b
            return r4
        L5b:
            java.lang.String r6 = r11.substring(r2, r1)
            r0.d = r6
            int r1 = r1 + r3
        L62:
            if (r1 >= r5) goto L73
            char r3 = r11.charAt(r1)
            if (r3 < r9) goto L73
            if (r3 > r8) goto L73
            int r2 = r2 * 10
            int r2 = r2 + r3
            int r2 = r2 - r9
            int r1 = r1 + 1
            goto L62
        L73:
            if (r2 > 0) goto L76
            return r4
        L76:
            r0.b = r2
            r0.c = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.util.d.a(java.lang.String):android.taobao.util.d$a");
    }
}
