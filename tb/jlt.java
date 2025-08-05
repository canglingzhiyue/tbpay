package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class jlt extends jls {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f29618a;
    public static int b;

    static {
        kge.a(-791543240);
        f29618a = "@or(";
        b = 4;
    }

    @Override // tb.jls
    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : b;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0052 A[SYNTHETIC] */
    @Override // tb.jls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(com.taobao.android.tschedule.parser.a r7) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.jlt.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L16
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r6
            r1[r2] = r7
            java.lang.String r7 = "c58f0dc1"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            return r7
        L16:
            java.util.List<java.lang.Object> r0 = r6.c
            if (r0 == 0) goto L5c
            java.util.List<java.lang.Object> r0 = r6.c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L23
            goto L5c
        L23:
            java.util.List<java.lang.Object> r0 = r6.c
            java.util.Iterator r0 = r0.iterator()
        L29:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L57
            java.lang.Object r1 = r0.next()
            java.lang.Object r1 = r7.a(r1)
            if (r1 != 0) goto L3a
            goto L4f
        L3a:
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L47
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L47
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L47
            goto L50
        L47:
            r1 = move-exception
            java.lang.String r4 = "TS.Operator"
            java.lang.String r5 = "parse value error in OR operator"
            tb.jkq.a(r4, r5, r1)
        L4f:
            r1 = 0
        L50:
            if (r1 == 0) goto L29
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
            return r7
        L57:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        L5c:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.jlt.a(com.taobao.android.tschedule.parser.a):java.lang.Object");
    }
}
