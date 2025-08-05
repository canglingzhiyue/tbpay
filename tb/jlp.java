package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class jlp extends jls {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PREFIX = "@and(";
    public static final int SUB_INDEX = 5;

    static {
        kge.a(1241093930);
    }

    @Override // tb.jls
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        return 5;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004a A[SYNTHETIC] */
    @Override // tb.jls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(com.taobao.android.tschedule.parser.a r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.jlp.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L16
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r4
            r1[r2] = r5
            java.lang.String r5 = "c58f0dc1"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
            return r5
        L16:
            java.util.List<java.lang.Object> r0 = r4.c
            if (r0 == 0) goto L54
            java.util.List<java.lang.Object> r0 = r4.c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L23
            goto L54
        L23:
            java.util.List<java.lang.Object> r0 = r4.c
            java.util.Iterator r0 = r0.iterator()
        L29:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4f
            java.lang.Object r1 = r0.next()
            java.lang.Object r1 = r5.a(r1)
            if (r1 != 0) goto L3a
            goto L47
        L3a:
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L47
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L47
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L47
            goto L48
        L47:
            r1 = 0
        L48:
            if (r1 != 0) goto L29
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L4f:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            return r5
        L54:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.jlp.a(com.taobao.android.tschedule.parser.a):java.lang.Object");
    }
}
