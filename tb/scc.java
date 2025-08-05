package tb;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.protocol.builder.ProtocolParamBuilder;

/* loaded from: classes9.dex */
public class scc implements rxn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ProtocolParamBuilder f33467a;

    static {
        kge.a(1453588405);
        kge.a(178679831);
    }

    @Override // tb.rxo
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "qmtopsdk.ProtocolParamBuilderBeforeFilter";
    }

    public scc(ProtocolParamBuilder protocolParamBuilder) {
        this.f33467a = protocolParamBuilder;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    @Override // tb.rxn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String b(mtopsdk.framework.domain.a r10) {
        /*
            r9 = this;
            java.lang.String r0 = "组装MTOP协议参数错误"
            java.lang.String r1 = "ANDROID_SYS_BUILD_PROTOCOL_PARAMS_ERROR"
            com.android.alibaba.ip.runtime.IpChange r2 = tb.scc.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L1d
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r9
            r1 = 1
            r0[r1] = r10
            java.lang.String r10 = "1d3d918c"
            java.lang.Object r10 = r2.ipc$dispatch(r10, r0)
            java.lang.String r10 = (java.lang.String) r10
            return r10
        L1d:
            mtopsdk.mtop.domain.MtopRequest r2 = r10.b
            r3 = 0
            mtopsdk.mtop.protocol.builder.ProtocolParamBuilder r4 = r9.f33467a     // Catch: java.lang.Throwable -> L38
            java.util.Map r4 = r4.buildParams(r10)     // Catch: java.lang.Throwable -> L38
            if (r4 != 0) goto L52
            mtopsdk.mtop.domain.MtopResponse r3 = new mtopsdk.mtop.domain.MtopResponse     // Catch: java.lang.Throwable -> L36
            java.lang.String r5 = r2.getApiName()     // Catch: java.lang.Throwable -> L36
            java.lang.String r6 = r2.getVersion()     // Catch: java.lang.Throwable -> L36
            r3.<init>(r5, r6, r1, r0)     // Catch: java.lang.Throwable -> L36
            goto L52
        L36:
            r3 = move-exception
            goto L3c
        L38:
            r4 = move-exception
            r8 = r4
            r4 = r3
            r3 = r8
        L3c:
            java.lang.String r5 = r10.h
            java.lang.String r6 = "qmtopsdk.ProtocolParamBuilderBeforeFilter"
            java.lang.String r7 = "[deBefore]execute ProtocolParamBuilder buildParams error."
            mtopsdk.common.util.TBSdkLog.e(r6, r5, r7, r3)
            mtopsdk.mtop.domain.MtopResponse r3 = new mtopsdk.mtop.domain.MtopResponse
            java.lang.String r5 = r2.getApiName()
            java.lang.String r2 = r2.getVersion()
            r3.<init>(r5, r2, r1, r0)
        L52:
            if (r3 == 0) goto L5c
            r10.c = r3
            tb.ryl.a(r10)
            java.lang.String r10 = "STOP"
            return r10
        L5c:
            r10.i = r4
            java.lang.String r10 = "CONTINUE"
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.scc.b(mtopsdk.framework.domain.a):java.lang.String");
    }
}
