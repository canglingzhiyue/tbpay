package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class rzh implements rzk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private rzm f33433a;

    @Override // tb.rxo
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "ssr.SsrProtocolParamBuilderBeforeFilter";
    }

    public rzh(rzm rzmVar) {
        this.f33433a = rzmVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
        if (r4.get("sign") == null) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    @Override // tb.rzk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String a(mtopsdk.ssrcore.c r10) {
        /*
            r9 = this;
            java.lang.String r0 = "签名失败"
            java.lang.String r1 = "SSRE_SIGN_FAILED"
            com.android.alibaba.ip.runtime.IpChange r2 = tb.rzh.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L1d
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r9
            r1 = 1
            r0[r1] = r10
            java.lang.String r10 = "352515cf"
            java.lang.Object r10 = r2.ipc$dispatch(r10, r0)
            java.lang.String r10 = (java.lang.String) r10
            return r10
        L1d:
            r2 = 417(0x1a1, float:5.84E-43)
            r3 = 0
            tb.rzm r4 = r9.f33433a     // Catch: java.lang.Throwable -> L49
            java.util.Map r4 = r4.a(r10)     // Catch: java.lang.Throwable -> L49
            if (r4 == 0) goto L31
            java.lang.String r5 = "sign"
            java.lang.Object r5 = r4.get(r5)     // Catch: java.lang.Throwable -> L47
            if (r5 != 0) goto L6c
        L31:
            tb.mtk$a r3 = new tb.mtk$a     // Catch: java.lang.Throwable -> L47
            r3.<init>()     // Catch: java.lang.Throwable -> L47
            tb.mtk$a r3 = r3.a(r2)     // Catch: java.lang.Throwable -> L47
            tb.mtk$a r3 = r3.a(r1)     // Catch: java.lang.Throwable -> L47
            tb.mtk$a r3 = r3.b(r0)     // Catch: java.lang.Throwable -> L47
            tb.mtk r3 = r3.a()     // Catch: java.lang.Throwable -> L47
            goto L6c
        L47:
            r3 = move-exception
            goto L4d
        L49:
            r4 = move-exception
            r8 = r4
            r4 = r3
            r3 = r8
        L4d:
            java.lang.String r5 = r10.b
            java.lang.String r6 = "ssr.SsrProtocolParamBuilderBeforeFilter"
            java.lang.String r7 = "[deBefore]execute ProtocolParamBuilder buildParams error."
            mtopsdk.common.util.TBSdkLog.e(r6, r5, r7, r3)
            tb.mtk$a r3 = new tb.mtk$a
            r3.<init>()
            tb.mtk$a r2 = r3.a(r2)
            tb.mtk$a r1 = r2.a(r1)
            tb.mtk$a r0 = r1.b(r0)
            tb.mtk r3 = r0.a()
        L6c:
            if (r3 == 0) goto L76
            r10.f = r3
            mtopsdk.ssrcore.util.b.a(r10)
            java.lang.String r10 = "STOP"
            return r10
        L76:
            r10.c = r4
            java.lang.String r10 = "CONTINUE"
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.rzh.a(mtopsdk.ssrcore.c):java.lang.String");
    }
}
