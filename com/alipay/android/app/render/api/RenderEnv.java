package com.alipay.android.app.render.api;

import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public class RenderEnv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f4357a = false;

    public static boolean isWallet() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("146e30ce", new Object[0])).booleanValue() : f4357a;
    }

    public static void setIsWallet(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c98ebe08", new Object[]{new Boolean(z)});
        } else {
            f4357a = z;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
        if (r0 != 4) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getLocal() {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.android.app.render.api.RenderEnv.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L12
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "80e9bc64"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L12:
            com.alipay.android.msp.plugin.engine.IBaseEngine r0 = com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine.getMspBase()
            com.alipay.android.msp.plugin.engine.IWalletEngine r1 = com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine.getMspWallet()
            java.lang.String r1 = r1.getAlipayLocaleDes()
            int r0 = r0.getMspLocale(r1)
            r1 = 0
            r2 = -1
            if (r0 == r2) goto L42
            if (r0 == 0) goto L42
            r2 = 1
            if (r0 == r2) goto L3e
            r2 = 2
            if (r0 == r2) goto L3a
            r2 = 3
            if (r0 == r2) goto L36
            r2 = 4
            if (r0 == r2) goto L42
        L34:
            r0 = r1
            goto L44
        L36:
            java.lang.String r0 = "zh_HK"
            goto L44
        L3a:
            java.lang.String r0 = "zh_TW"
            goto L44
        L3e:
            java.lang.String r1 = "zh_CN"
            goto L34
        L42:
            java.lang.String r0 = "en_US"
        L44:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.app.render.api.RenderEnv.getLocal():java.lang.String");
    }
}
