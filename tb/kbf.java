package tb;

import anet.channel.status.NetworkStatusHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.CodeUsageCounter;

/* loaded from: classes6.dex */
public class kbf implements ddf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-331094015);
        kge.a(905589270);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0077, code lost:
        if (r2 == 1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0079, code lost:
        if (r2 == 2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007b, code lost:
        if (r2 == 3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007d, code lost:
        if (r2 == 4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007f, code lost:
        return "2G";
     */
    @Override // tb.ddf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getNetworkStutas() {
        /*
            r10 = this;
            java.lang.String r0 = "2G"
            com.android.alibaba.ip.runtime.IpChange r1 = tb.kbf.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L17
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r3] = r10
            java.lang.String r2 = "b40e8c2f"
            java.lang.Object r0 = r1.ipc$dispatch(r2, r0)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L17:
            com.taobao.taobaoavsdk.CodeUsageCounter r1 = com.taobao.taobaoavsdk.CodeUsageCounter.a()
            com.taobao.taobaoavsdk.CodeUsageCounter$componentName r2 = com.taobao.taobaoavsdk.CodeUsageCounter.componentName.dw_adapter_DWNetworkUtilsAdapter
            r1.a(r2)
            anet.channel.status.NetworkStatusHelper$NetworkStatus r1 = anet.channel.status.NetworkStatusHelper.getStatus()     // Catch: java.lang.Exception -> L81
            java.lang.String r1 = r1.getType()     // Catch: java.lang.Exception -> L81
            r2 = -1
            int r5 = r1.hashCode()     // Catch: java.lang.Exception -> L81
            r6 = 1621(0x655, float:2.272E-42)
            r7 = 4
            r8 = 3
            r9 = 2
            if (r5 == r6) goto L6e
            r6 = 1652(0x674, float:2.315E-42)
            if (r5 == r6) goto L64
            r6 = 1683(0x693, float:2.358E-42)
            if (r5 == r6) goto L5a
            r6 = 1714(0x6b2, float:2.402E-42)
            if (r5 == r6) goto L50
            r6 = 2664213(0x28a715, float:3.733358E-39)
            if (r5 == r6) goto L46
            goto L75
        L46:
            java.lang.String r5 = "WIFI"
            boolean r5 = r1.equals(r5)     // Catch: java.lang.Exception -> L81
            if (r5 == 0) goto L75
            r2 = 0
            goto L75
        L50:
            java.lang.String r3 = "5G"
            boolean r3 = r1.equals(r3)     // Catch: java.lang.Exception -> L81
            if (r3 == 0) goto L75
            r2 = 1
            goto L75
        L5a:
            java.lang.String r3 = "4G"
            boolean r3 = r1.equals(r3)     // Catch: java.lang.Exception -> L81
            if (r3 == 0) goto L75
            r2 = 2
            goto L75
        L64:
            java.lang.String r3 = "3G"
            boolean r3 = r1.equals(r3)     // Catch: java.lang.Exception -> L81
            if (r3 == 0) goto L75
            r2 = 3
            goto L75
        L6e:
            boolean r3 = r1.equals(r0)     // Catch: java.lang.Exception -> L81
            if (r3 == 0) goto L75
            r2 = 4
        L75:
            if (r2 == 0) goto L80
            if (r2 == r4) goto L80
            if (r2 == r9) goto L80
            if (r2 == r8) goto L80
            if (r2 == r7) goto L80
            return r0
        L80:
            return r1
        L81:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.kbf.getNetworkStutas():java.lang.String");
    }

    @Override // tb.ddf
    public boolean isConnected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b1c220a", new Object[]{this})).booleanValue();
        }
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_adapter_DWNetworkUtilsAdapter);
        return NetworkStatusHelper.isConnected();
    }
}
