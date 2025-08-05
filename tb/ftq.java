package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class ftq extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TOSTR = 19624365692481L;

    static {
        kge.a(939377817);
    }

    @Override // tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "toStr";
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0093, code lost:
        return "";
     */
    @Override // tb.fuf, tb.fut
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object evalWithArgs(java.lang.Object[] r8, com.taobao.android.dinamicx.DXRuntimeContext r9) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.ftq.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L19
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r7
            r1[r4] = r8
            r1[r2] = r9
            java.lang.String r8 = "ccd8bd96"
            java.lang.Object r8 = r0.ipc$dispatch(r8, r1)
            return r8
        L19:
            java.lang.String r9 = ""
            if (r8 == 0) goto L99
            int r0 = r8.length     // Catch: java.lang.Throwable -> L99
            if (r0 == 0) goto L99
            int r0 = r8.length     // Catch: java.lang.Throwable -> L99
            if (r0 <= r2) goto L25
            goto L99
        L25:
            r0 = r8[r3]     // Catch: java.lang.Throwable -> L99
            boolean r1 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L99
            if (r1 == 0) goto L2c
            return r0
        L2c:
            int r1 = r8.length     // Catch: java.lang.Throwable -> L99
            if (r1 == r4) goto L91
            boolean r1 = r0 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L99
            if (r1 != 0) goto L91
            boolean r1 = r0 instanceof java.lang.Long     // Catch: java.lang.Throwable -> L99
            if (r1 == 0) goto L38
            goto L91
        L38:
            boolean r1 = r0 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L99
            if (r1 == 0) goto L90
            r8 = r8[r4]     // Catch: java.lang.Throwable -> L99
            boolean r1 = r8 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L99
            r5 = 0
            if (r1 == 0) goto L4b
            java.lang.Number r8 = (java.lang.Number) r8     // Catch: java.lang.Throwable -> L99
            long r1 = r8.longValue()     // Catch: java.lang.Throwable -> L99
            goto L5d
        L4b:
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L58
            java.lang.Double r8 = java.lang.Double.valueOf(r8)     // Catch: java.lang.Throwable -> L58
            long r1 = r8.longValue()     // Catch: java.lang.Throwable -> L58
            goto L5d
        L58:
            r8 = move-exception
            com.taobao.android.dinamicx.exception.a.b(r8)     // Catch: java.lang.Throwable -> L99
            r1 = r5
        L5d:
            int r8 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r8 < 0) goto L8b
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L99
            double r5 = r0.doubleValue()     // Catch: java.lang.Throwable -> L99
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L99
            r8.<init>()     // Catch: java.lang.Throwable -> L99
            java.lang.String r0 = "%."
            r8.append(r0)     // Catch: java.lang.Throwable -> L99
            r8.append(r1)     // Catch: java.lang.Throwable -> L99
            java.lang.String r0 = "f"
            r8.append(r0)     // Catch: java.lang.Throwable -> L99
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L99
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L99
            java.lang.Double r1 = java.lang.Double.valueOf(r5)     // Catch: java.lang.Throwable -> L99
            r0[r3] = r1     // Catch: java.lang.Throwable -> L99
            java.lang.String r8 = java.lang.String.format(r8, r0)     // Catch: java.lang.Throwable -> L99
            return r8
        L8b:
            java.lang.String r8 = r0.toString()     // Catch: java.lang.Throwable -> L99
            return r8
        L90:
            return r9
        L91:
            if (r0 != 0) goto L94
            return r9
        L94:
            java.lang.String r8 = r0.toString()     // Catch: java.lang.Throwable -> L99
            return r8
        L99:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ftq.evalWithArgs(java.lang.Object[], com.taobao.android.dinamicx.DXRuntimeContext):java.lang.Object");
    }
}
