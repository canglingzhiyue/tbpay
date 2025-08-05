package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.framework.domain.a;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.intf.MtopBuilder;
import mtopsdk.mtop.intf.MtopPrefetch;
import mtopsdk.mtop.protocol.builder.ProtocolParamBuilder;

/* loaded from: classes.dex */
public class rxz implements rxn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ProtocolParamBuilder f33412a;

    static {
        kge.a(85985092);
        kge.a(178679831);
    }

    @Override // tb.rxo
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "mtopsdk.ProtocolParamBuilderBeforeFilter";
    }

    public rxz(ProtocolParamBuilder protocolParamBuilder) {
        this.f33412a = protocolParamBuilder;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    @Override // tb.rxn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String b(mtopsdk.framework.domain.a r11) {
        /*
            r10 = this;
            java.lang.String r0 = "mtopsdk.ProtocolParamBuilderBeforeFilter"
            com.android.alibaba.ip.runtime.IpChange r1 = tb.rxz.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L1b
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r0[r2] = r10
            r2 = 1
            r0[r2] = r11
            java.lang.String r11 = "1d3d918c"
            java.lang.Object r11 = r1.ipc$dispatch(r11, r0)
            java.lang.String r11 = (java.lang.String) r11
            return r11
        L1b:
            mtopsdk.mtop.domain.MtopRequest r1 = r11.b
            boolean r2 = r10.a(r11)
            java.lang.String r3 = "CONTINUE"
            if (r2 == 0) goto L26
            return r3
        L26:
            r2 = 0
            mtopsdk.mtop.protocol.builder.ProtocolParamBuilder r4 = r10.f33412a     // Catch: java.lang.Throwable -> L85
            java.util.Map r4 = r4.buildParams(r11)     // Catch: java.lang.Throwable -> L85
            if (r4 != 0) goto L42
            mtopsdk.mtop.domain.MtopResponse r2 = new mtopsdk.mtop.domain.MtopResponse     // Catch: java.lang.Throwable -> L83
            java.lang.String r5 = r1.getApiName()     // Catch: java.lang.Throwable -> L83
            java.lang.String r6 = r1.getVersion()     // Catch: java.lang.Throwable -> L83
            java.lang.String r7 = "ANDROID_SYS_INIT_MTOP_ISIGN_ERROR"
            java.lang.String r8 = "初始化Mtop签名类ISign失败"
            r2.<init>(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L83
            goto La2
        L42:
            java.lang.String r5 = "sign"
            java.lang.Object r5 = r4.get(r5)     // Catch: java.lang.Throwable -> L83
            if (r5 != 0) goto La2
            java.lang.String r2 = "SG_ERROR_CODE"
            java.lang.Object r2 = r4.get(r2)     // Catch: java.lang.Throwable -> L83
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L83
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L83
            r6 = 48
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L83
            java.lang.String r6 = "ANDROID_SYS_GENERATE_MTOP_SIGN_ERROR"
            r5.append(r6)     // Catch: java.lang.Throwable -> L83
            if (r2 == 0) goto L6e
            java.lang.String r6 = "("
            r5.append(r6)     // Catch: java.lang.Throwable -> L83
            r5.append(r2)     // Catch: java.lang.Throwable -> L83
            java.lang.String r2 = ")"
            r5.append(r2)     // Catch: java.lang.Throwable -> L83
        L6e:
            mtopsdk.mtop.domain.MtopResponse r2 = new mtopsdk.mtop.domain.MtopResponse     // Catch: java.lang.Throwable -> L83
            java.lang.String r6 = r1.getApiName()     // Catch: java.lang.Throwable -> L83
            java.lang.String r7 = r1.getVersion()     // Catch: java.lang.Throwable -> L83
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L83
            java.lang.String r8 = "生成Mtop签名sign失败"
            r2.<init>(r6, r7, r5, r8)     // Catch: java.lang.Throwable -> L83
            goto La2
        L83:
            r2 = move-exception
            goto L89
        L85:
            r4 = move-exception
            r9 = r4
            r4 = r2
            r2 = r9
        L89:
            java.lang.String r5 = r11.h
            java.lang.String r6 = "[deBefore]execute ProtocolParamBuilder buildParams error."
            mtopsdk.common.util.TBSdkLog.e(r0, r5, r6, r2)
            mtopsdk.mtop.domain.MtopResponse r2 = new mtopsdk.mtop.domain.MtopResponse
            java.lang.String r5 = r1.getApiName()
            java.lang.String r1 = r1.getVersion()
            java.lang.String r6 = "ANDROID_SYS_BUILD_PROTOCOL_PARAMS_ERROR"
            java.lang.String r7 = "组装MTOP协议参数错误"
            r2.<init>(r5, r1, r6, r7)
        La2:
            java.lang.String r1 = "STOP"
            if (r2 == 0) goto Lac
            r11.c = r2
            tb.ryl.a(r11)
            return r1
        Lac:
            r11.i = r4
            mtopsdk.mtop.global.SwitchConfig r2 = mtopsdk.mtop.global.SwitchConfig.getInstance()
            boolean r2 = r2.isPrefetchLocalModeEnable()
            if (r2 == 0) goto Le0
            mtopsdk.mtop.intf.MtopBuilder r2 = r11.o
            mtopsdk.mtop.intf.MtopPrefetch r2 = r2.getMtopPrefetch()
            if (r2 == 0) goto Le0
            mtopsdk.mtop.intf.MtopBuilder r2 = r11.o
            mtopsdk.mtop.intf.MtopPrefetch r2 = r2.getMtopPrefetch()
            boolean r2 = r2.isLocalMode()
            if (r2 == 0) goto Le0
            mtopsdk.mtop.intf.MtopBuilder r2 = r11.o
            mtopsdk.mtop.intf.MtopPrefetch r2 = r2.getMtopPrefetch()
            long r3 = java.lang.System.currentTimeMillis()
            r2.prefetchResponseTime = r3
            java.lang.String r11 = r11.h
            java.lang.String r2 = "[prefetch]prefetch protocolParams finish, stop."
            mtopsdk.common.util.TBSdkLog.e(r0, r11, r2)
            return r1
        Le0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.rxz.b(mtopsdk.framework.domain.a):java.lang.String");
    }

    private boolean a(a aVar) {
        MtopBuilder mtopBuilder;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6ed0197", new Object[]{this, aVar})).booleanValue();
        }
        if (SwitchConfig.getInstance().isPrefetchLocalModeEnable() && aVar.o.getMtopPrefetch() == null && (mtopBuilder = aVar.f25000a.getPrefetchBuilderMap().get(aVar.b.getKey())) != null && mtopBuilder.getMtopPrefetch().isLocalMode()) {
            long currentTimeMillis = System.currentTimeMillis();
            MtopPrefetch.CompareResult compare = mtopBuilder.getMtopPrefetch().getComparator().compare(aVar.o, mtopBuilder);
            HashMap<String, String> hashMap = null;
            if (compare == null || !compare.isSame()) {
                MtopPrefetch mtopPrefetch = mtopBuilder.getMtopPrefetch();
                if (compare != null) {
                    hashMap = compare.getData();
                }
                MtopPrefetch.onPrefetchAndCommit("TYPE_MISS", mtopPrefetch, aVar, hashMap);
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                    TBSdkLog.d("mtopsdk.ProtocolParamBuilderBeforeFilter", aVar.h + "not hit, miss not the same request");
                }
            } else if (currentTimeMillis - mtopBuilder.getMtopPrefetch().prefetchResponseTime > mtopBuilder.getMtopPrefetch().getPrefetchExpireTime()) {
                MtopPrefetch.onPrefetchAndCommit("TYPE_EXPIRE", mtopBuilder.getMtopPrefetch(), aVar, null);
                aVar.f25000a.getPrefetchBuilderMap().remove(aVar.b.getKey());
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                    TBSdkLog.d("mtopsdk.ProtocolParamBuilderBeforeFilter", aVar.h + "not hit, time expired");
                }
                return false;
            } else if (mtopBuilder.getMtopContext().i != null) {
                aVar.i = mtopBuilder.getMtopContext().i;
                aVar.g.isPrefetch = true;
                aVar.g.prefetchLocalMode = true;
                TBSdkLog.e("mtopsdk.ProtocolParamBuilderBeforeFilter", aVar.h, "hit prefetch.");
                aVar.f25000a.getPrefetchBuilderMap().remove(aVar.b.getKey());
                return true;
            }
        }
        return false;
    }
}
