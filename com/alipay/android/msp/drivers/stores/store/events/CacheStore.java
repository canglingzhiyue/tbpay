package com.alipay.android.msp.drivers.stores.store.events;

import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.cache.MspCacheManager;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class CacheStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NOTIFY_TPL_NAME = "LOC_CACHE";
    private MspCacheManager g;

    public CacheStore(int i) {
        super(i);
        this.g = MspCacheManager.getInstance();
        this.g.setTwoLevelCache(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e0  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String onMspAction(com.alipay.android.msp.drivers.actions.EventAction r19, com.alipay.android.msp.drivers.actions.EventAction.MspEvent r20) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.drivers.stores.store.events.CacheStore.onMspAction(com.alipay.android.msp.drivers.actions.EventAction, com.alipay.android.msp.drivers.actions.EventAction$MspEvent):java.lang.String");
    }
}
