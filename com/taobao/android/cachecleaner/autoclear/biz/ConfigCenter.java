package com.taobao.android.cachecleaner.autoclear.biz;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.evo.EVO;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes4.dex */
public class ConfigCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String BIZ_CLEAR_AB_KEY = "biz_clear_ab_key";

    static {
        kge.a(-1950343284);
    }

    @Deprecated
    public static boolean isBizClearEnable(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99ba879e", new Object[]{context})).booleanValue();
        }
        if (context != null) {
            return EVO.isSwitchOpened(context, BIZ_CLEAR_AB_KEY);
        }
        return false;
    }

    public static boolean isBizClearEnable(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("740abee8", new Object[]{context, str})).booleanValue();
        }
        if (context != null && !TextUtils.isEmpty(str)) {
            return EVO.isSwitchOpened(context, str);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long getQuotaSize(android.content.Context r5, java.lang.String r6) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.cachecleaner.autoclear.biz.ConfigCenter.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L1c
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r5
            r5 = 1
            r1[r5] = r6
            java.lang.String r5 = "6439825c"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
            java.lang.Number r5 = (java.lang.Number) r5
            long r5 = r5.longValue()
            return r5
        L1c:
            com.taobao.android.cachecleaner.monitor.config.a r0 = com.taobao.android.cachecleaner.monitor.config.a.a()
            r0.g()
            com.taobao.android.cachecleaner.monitor.config.a r0 = com.taobao.android.cachecleaner.monitor.config.a.a()
            com.taobao.android.cachecleaner.monitor.config.RuleConfig r0 = r0.b()
            java.util.Map r0 = r0.getQuotaSizeMap()
            r1 = 0
            if (r0 == 0) goto L61
            java.lang.Object r3 = r0.get(r6)
            if (r3 != 0) goto L3a
            goto L61
        L3a:
            java.lang.Object r0 = r0.get(r6)
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
        L44:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L61
            java.lang.Object r3 = r0.next()
            com.taobao.android.cachecleaner.autoclear.biz.data.BizQuotaData r3 = (com.taobao.android.cachecleaner.autoclear.biz.data.BizQuotaData) r3
            java.lang.String r4 = r3.abKey
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L5e
            boolean r4 = com.alibaba.evo.EVO.isSwitchOpened(r5, r6)
            if (r4 == 0) goto L44
        L5e:
            long r5 = r3.size
            return r5
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.cachecleaner.autoclear.biz.ConfigCenter.getQuotaSize(android.content.Context, java.lang.String):long");
    }
}
