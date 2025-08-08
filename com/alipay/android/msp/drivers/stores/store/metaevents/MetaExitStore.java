package com.alipay.android.msp.drivers.stores.store.metaevents;

import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MetaExitStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public MetaExitStore(int i) {
        super(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00cc, code lost:
        if (r8.f4584a != null) goto L44;
     */
    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String onMspAction(com.alipay.android.msp.drivers.actions.EventAction r9, com.alipay.android.msp.drivers.actions.EventAction.MspEvent r10) {
        /*
            r8 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.android.msp.drivers.stores.store.metaevents.MetaExitStore.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 1
            r4 = 3
            r5 = 0
            if (r1 == 0) goto L1b
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r5] = r8
            r1[r3] = r9
            r1[r2] = r10
            java.lang.String r9 = "719dcfee"
            java.lang.Object r9 = r0.ipc$dispatch(r9, r1)
            java.lang.String r9 = (java.lang.String) r9
            return r9
        L1b:
            android.content.Context r0 = r8.d
            r1 = 0
            if (r0 == 0) goto Ld3
            com.alipay.android.msp.core.context.MspContext r0 = r8.f4584a
            if (r0 != 0) goto L26
            goto Ld3
        L26:
            com.alibaba.fastjson.JSONObject r10 = r10.getActionParamsJson()
            java.lang.String r0 = "mode"
            java.lang.String r10 = r10.getString(r0)
            boolean r0 = android.text.StringUtils.isEmpty(r10)
            java.lang.String r6 = "exit"
            if (r0 == 0) goto L3a
            r10 = r6
        L3a:
            int r9 = r9.getLogFieldEndCode()
            r0 = -1
            int r7 = r10.hashCode()
            switch(r7) {
                case -2121918006: goto L63;
                case -1838715472: goto L59;
                case -1315388477: goto L4f;
                case 3127582: goto L47;
                default: goto L46;
            }
        L46:
            goto L6c
        L47:
            boolean r10 = r10.equals(r6)
            if (r10 == 0) goto L6c
            r0 = 0
            goto L6c
        L4f:
            java.lang.String r6 = "exitall"
            boolean r10 = r10.equals(r6)
            if (r10 == 0) goto L6c
            r0 = 1
            goto L6c
        L59:
            java.lang.String r6 = "exitallresume"
            boolean r10 = r10.equals(r6)
            if (r10 == 0) goto L6c
            r0 = 3
            goto L6c
        L63:
            java.lang.String r6 = "exitonly"
            boolean r10 = r10.equals(r6)
            if (r10 == 0) goto L6c
            r0 = 2
        L6c:
            java.lang.String r10 = "clientEndCode"
            if (r0 == 0) goto Lb5
            if (r0 == r3) goto Lb5
            if (r0 == r2) goto L8d
            if (r0 == r4) goto L77
            goto Ld3
        L77:
            com.alipay.android.msp.core.context.MspContext r9 = r8.f4584a
            if (r9 == 0) goto Ld3
            com.alipay.android.msp.core.context.MspContext r9 = r8.f4584a
            com.alipay.android.msp.core.clients.MspUIClient r9 = r9.getMspUIClient()
            if (r9 == 0) goto Ld3
            com.alipay.android.msp.core.context.MspContext r9 = r8.f4584a
            com.alipay.android.msp.core.clients.MspUIClient r9 = r9.getMspUIClient()
            r9.disposeUI()
            goto Ld3
        L8d:
            if (r9 == 0) goto La2
            com.alipay.android.msp.core.context.MspContext r0 = r8.f4584a
            if (r0 == 0) goto La2
            com.alipay.android.msp.core.context.MspContext r0 = r8.f4584a
            com.alipay.android.msp.framework.statisticsv2.StatisticInfo r0 = r0.getStatisticInfo()
            com.alipay.android.msp.framework.statisticsv2.Vector r2 = com.alipay.android.msp.framework.statisticsv2.Vector.Result
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r0.updateAttr(r2, r10, r9)
        La2:
            com.alipay.android.msp.core.context.MspTradeContext r9 = r8.b
            if (r9 == 0) goto Ld3
            com.alipay.android.msp.core.context.MspTradeContext r9 = r8.b
            com.alipay.android.msp.pay.results.MspPayResult r9 = r9.getMspPayResult()
            java.lang.String r10 = "exitMode"
            java.lang.String r0 = "noCallback"
            r9.addExtendInfoByKeyAndValue(r10, r0)
            goto Lce
        Lb5:
            if (r9 == 0) goto Lca
            com.alipay.android.msp.core.context.MspContext r0 = r8.f4584a
            if (r0 == 0) goto Lca
            com.alipay.android.msp.core.context.MspContext r0 = r8.f4584a
            com.alipay.android.msp.framework.statisticsv2.StatisticInfo r0 = r0.getStatisticInfo()
            com.alipay.android.msp.framework.statisticsv2.Vector r2 = com.alipay.android.msp.framework.statisticsv2.Vector.Result
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r0.updateAttr(r2, r10, r9)
        Lca:
            com.alipay.android.msp.core.context.MspContext r9 = r8.f4584a
            if (r9 == 0) goto Ld3
        Lce:
            com.alipay.android.msp.core.context.MspContext r9 = r8.f4584a
            r9.exit(r5)
        Ld3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.drivers.stores.store.metaevents.MetaExitStore.onMspAction(com.alipay.android.msp.drivers.actions.EventAction, com.alipay.android.msp.drivers.actions.EventAction$MspEvent):java.lang.String");
    }
}
