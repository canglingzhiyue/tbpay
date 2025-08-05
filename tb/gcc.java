package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class gcc extends ggw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(476575262);
    }

    @Override // tb.ghe
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : eau.PARSER_TAG;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007d, code lost:
        if (r6.w() == r5.w()) goto L14;
     */
    @Override // tb.ghe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.gfx execute(com.taobao.android.dinamicx.DXRuntimeContext r5, tb.gfx r6, int r7, tb.gfx[] r8, java.util.Map r9) throws com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.gcc.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L29
            r1 = 6
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r4
            r1[r2] = r5
            r5 = 2
            r1[r5] = r6
            r5 = 3
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r7)
            r1[r5] = r6
            r5 = 4
            r1[r5] = r8
            r5 = 5
            r1[r5] = r9
            java.lang.String r5 = "e2ae9bd5"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
            tb.gfx r5 = (tb.gfx) r5
            return r5
        L29:
            if (r8 == 0) goto L92
            int r5 = r8.length
            if (r5 != r2) goto L92
            if (r6 != 0) goto L31
            goto L92
        L31:
            r5 = r8[r3]     // Catch: java.lang.Exception -> L8b
            int r7 = r6.d()     // Catch: java.lang.Exception -> L8b
            int r8 = r5.d()     // Catch: java.lang.Exception -> L8b
            if (r7 == r8) goto L3f
        L3d:
            r2 = 0
            goto L7f
        L3f:
            int r7 = r6.d()     // Catch: java.lang.Exception -> L8b
            switch(r7) {
                case 1: goto L7f;
                case 2: goto L75;
                case 3: goto L66;
                case 4: goto L5b;
                case 5: goto L4e;
                case 6: goto L49;
                case 7: goto L49;
                case 8: goto L49;
                case 9: goto L49;
                default: goto L46;
            }     // Catch: java.lang.Exception -> L8b
        L46:
            com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError r5 = new com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError     // Catch: java.lang.Exception -> L8b
            goto L84
        L49:
            boolean r2 = r6.b(r5)     // Catch: java.lang.Exception -> L8b
            goto L7f
        L4e:
            java.lang.String r6 = r6.i()     // Catch: java.lang.Exception -> L8b
            java.lang.String r5 = r5.i()     // Catch: java.lang.Exception -> L8b
            boolean r2 = r6.equals(r5)     // Catch: java.lang.Exception -> L8b
            goto L7f
        L5b:
            boolean r6 = r6.E()     // Catch: java.lang.Exception -> L8b
            boolean r5 = r5.E()     // Catch: java.lang.Exception -> L8b
            if (r6 != r5) goto L3d
            goto L7f
        L66:
            double r6 = r6.A()     // Catch: java.lang.Exception -> L8b
            double r8 = r5.B()     // Catch: java.lang.Exception -> L8b
            int r5 = tb.gef.a(r6, r8)     // Catch: java.lang.Exception -> L8b
            if (r5 != 0) goto L3d
            goto L7f
        L75:
            int r6 = r6.w()     // Catch: java.lang.Exception -> L8b
            int r5 = r5.w()     // Catch: java.lang.Exception -> L8b
            if (r6 != r5) goto L3d
        L7f:
            tb.gfx r5 = tb.gfx.a(r2)     // Catch: java.lang.Exception -> L8b
            return r5
        L84:
            java.lang.String r6 = "equals invalid type"
            r5.<init>(r6)     // Catch: java.lang.Exception -> L8b
            throw r5     // Catch: java.lang.Exception -> L8b
        L8b:
            r5 = move-exception
            com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError r6 = new com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError
            r6.<init>(r5)
            throw r6
        L92:
            tb.gfx r5 = tb.gfx.a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.gcc.execute(com.taobao.android.dinamicx.DXRuntimeContext, tb.gfx, int, tb.gfx[], java.util.Map):tb.gfx");
    }
}
