package com.taobao.tao.flexbox.layoutmanager.filter;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.oec;

/* loaded from: classes8.dex */
public class ABUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1276573442);
    }

    @FilterHandler(name = "get")
    public static Object get(String str, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("bb95e40f", new Object[]{str, obj}) : com.taobao.tao.flexbox.layoutmanager.adapter.a.a().v().a(str, obj);
    }

    @FilterHandler(name = "bool")
    public static boolean bool(String str, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d159911b", new Object[]{str, obj})).booleanValue() : oec.a(com.taobao.tao.flexbox.layoutmanager.adapter.a.a().v().a(str, obj), oec.a(obj, false));
    }

    @FilterHandler(name = "int")
    public static int Int(String str, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("88beecef", new Object[]{str, obj})).intValue() : oec.a(com.taobao.tao.flexbox.layoutmanager.adapter.a.a().v().a(str, obj), oec.a(obj, 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
        if (r0 == 1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
        if (r0 == 2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
        return java.lang.Integer.valueOf(Int((java.lang.String) r7.get(0), r7.get(1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
        return java.lang.Boolean.valueOf(bool((java.lang.String) r7.get(0), r7.get(1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
        return "";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(java.lang.String r6, java.util.List r7) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.flexbox.layoutmanager.filter.ABUtils.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L16
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r6
            r1[r4] = r7
            java.lang.String r6 = "f1cf6c6f"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            return r6
        L16:
            r0 = -1
            int r1 = r6.hashCode()     // Catch: java.lang.Throwable -> L85
            r5 = 102230(0x18f56, float:1.43255E-40)
            if (r1 == r5) goto L40
            r5 = 104431(0x197ef, float:1.46339E-40)
            if (r1 == r5) goto L35
            r5 = 3029738(0x2e3aea, float:4.245567E-39)
            if (r1 == r5) goto L2b
            goto L49
        L2b:
            java.lang.String r1 = "bool"
            boolean r1 = r6.equals(r1)     // Catch: java.lang.Throwable -> L85
            if (r1 == 0) goto L49
            r0 = 1
            goto L49
        L35:
            java.lang.String r1 = "int"
            boolean r1 = r6.equals(r1)     // Catch: java.lang.Throwable -> L85
            if (r1 == 0) goto L49
            r0 = 2
            goto L49
        L40:
            java.lang.String r1 = "get"
            boolean r1 = r6.equals(r1)     // Catch: java.lang.Throwable -> L85
            if (r1 == 0) goto L49
            r0 = 0
        L49:
            if (r0 == 0) goto L76
            if (r0 == r4) goto L63
            if (r0 == r2) goto L50
            goto La3
        L50:
            java.lang.Object r0 = r7.get(r3)     // Catch: java.lang.Throwable -> L85
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L85
            java.lang.Object r7 = r7.get(r4)     // Catch: java.lang.Throwable -> L85
            int r7 = Int(r0, r7)     // Catch: java.lang.Throwable -> L85
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L85
            return r6
        L63:
            java.lang.Object r0 = r7.get(r3)     // Catch: java.lang.Throwable -> L85
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L85
            java.lang.Object r7 = r7.get(r4)     // Catch: java.lang.Throwable -> L85
            boolean r7 = bool(r0, r7)     // Catch: java.lang.Throwable -> L85
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> L85
            return r6
        L76:
            java.lang.Object r0 = r7.get(r3)     // Catch: java.lang.Throwable -> L85
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L85
            java.lang.Object r7 = r7.get(r4)     // Catch: java.lang.Throwable -> L85
            java.lang.Object r6 = get(r0, r7)     // Catch: java.lang.Throwable -> L85
            return r6
        L85:
            r7 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "error:"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r7.getMessage()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r7 = "ab.filter"
            tb.ogg.a(r7, r6)
        La3:
            java.lang.String r6 = ""
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.filter.ABUtils.a(java.lang.String, java.util.List):java.lang.Object");
    }
}
