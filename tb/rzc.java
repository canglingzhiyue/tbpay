package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class rzc implements rzj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.rxo
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "ssr.SsrErrorMappingAfterFilter";
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
        if (android.text.TextUtils.equals(r6, "SSRE_NETWORK_ERROR") != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ba  */
    @Override // tb.rzj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String b(mtopsdk.ssrcore.c r11) {
        /*
            r10 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.rzc.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L18
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r10
            r1[r3] = r11
            java.lang.String r11 = "c1c540d0"
            java.lang.Object r11 = r0.ipc$dispatch(r11, r1)
            java.lang.String r11 = (java.lang.String) r11
            return r11
        L18:
            java.lang.String r0 = "CONTINUE"
            tb.mtk r1 = r11.f
            int r4 = r1.f31246a
            java.lang.String r5 = r1.c
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r6 = r1.d
            java.lang.String r7 = "x-retcode"
            java.lang.String r6 = mtopsdk.common.util.HeaderHandlerUtil.getSingleHeaderFieldByKey(r6, r7)
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            java.lang.String r8 = "SSRE_NETWORK_ERROR"
            r9 = 200(0xc8, float:2.8E-43)
            if (r7 == 0) goto L37
            if (r4 != r9) goto L36
            return r0
        L36:
            r6 = r8
        L37:
            java.lang.String r7 = "SUCCESS"
            boolean r7 = android.text.TextUtils.equals(r6, r7)
            if (r7 == 0) goto L40
            return r0
        L40:
            r7 = -200(0xffffffffffffff38, float:NaN)
            if (r4 != r7) goto L4b
            java.lang.String r6 = "SSRE_NO_NETWORK"
            java.lang.String r5 = "无网络"
        L49:
            r2 = 1
            goto L7a
        L4b:
            r7 = -202(0xffffffffffffff36, float:NaN)
            if (r4 != r7) goto L55
            java.lang.String r6 = "SSRE_NETWORK_TIMEOUT"
            java.lang.String r5 = "网络超时"
            goto L49
        L55:
            r7 = 500(0x1f4, float:7.0E-43)
            if (r4 != r7) goto L5e
            java.lang.String r6 = "SSRE_MTOP_INTERNAL_ERROR"
            java.lang.String r5 = "MTOP 内部错误(500)"
            goto L7a
        L5e:
            r7 = 502(0x1f6, float:7.03E-43)
            if (r4 != r7) goto L68
            java.lang.String r6 = "SSRE_SERVICE_FAILED"
            java.lang.String r5 = "业务错误"
            goto L7a
        L68:
            java.lang.String r7 = "SSRE_URL_BLOCKED"
            boolean r7 = android.text.TextUtils.equals(r6, r7)
            if (r7 == 0) goto L73
            java.lang.String r5 = "URL被管控"
            goto L7a
        L73:
            boolean r7 = android.text.TextUtils.equals(r6, r8)
            if (r7 == 0) goto L7a
            goto L49
        L7a:
            boolean r7 = android.text.TextUtils.isEmpty(r5)
            if (r7 == 0) goto L83
            java.lang.String r5 = "其他网络失败"
        L83:
            if (r4 == r9) goto Lb0
            java.lang.String r4 = r11.b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "[doAfter].code="
            r7.append(r8)
            int r8 = r1.f31246a
            r7.append(r8)
            java.lang.String r8 = ", retCode = "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r8 = ", msg = "
            r7.append(r8)
            r7.append(r5)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "ssr.SsrErrorMappingAfterFilter"
            mtopsdk.common.util.TBSdkLog.e(r8, r4, r7)
        Lb0:
            tb.mtk$a r4 = new tb.mtk$a
            r4.<init>()
            if (r2 == 0) goto Lba
            r2 = 417(0x1a1, float:5.84E-43)
            goto Lbc
        Lba:
            int r2 = r1.f31246a
        Lbc:
            tb.mtk$a r2 = r4.a(r2)
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r1 = r1.d
            tb.mtk$a r1 = r2.a(r1)
            tb.mtk$a r1 = r1.a(r6)
            tb.mtk$a r1 = r1.b(r5)
            tb.mtk r1 = r1.a()
            r11.f = r1
            mtopsdk.ssrcore.MtopSsrStatistics r11 = r11.d
            r11.t = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.rzc.b(mtopsdk.ssrcore.c):java.lang.String");
    }
}
