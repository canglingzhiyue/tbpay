package com.alipay.android.msp.drivers.stores.store.events;

import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.helper.VibrateHelper;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MetaVibrateStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(MetaVibrateStore metaVibrateStore, String str, Object... objArr) {
        if (str.hashCode() == -610354464) {
            super.initWithContext();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public MetaVibrateStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public void initWithContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db9ebae0", new Object[]{this});
            return;
        }
        super.initWithContext();
        try {
            VibrateHelper.getInstance().init(this.d);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:?, code lost:
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0100, code lost:
        com.alipay.android.msp.framework.helper.VibrateHelper.getInstance().cancel();
     */
    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String onMspAction(com.alipay.android.msp.drivers.actions.EventAction r12, com.alipay.android.msp.drivers.actions.EventAction.MspEvent r13) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.drivers.stores.store.events.MetaVibrateStore.onMspAction(com.alipay.android.msp.drivers.actions.EventAction, com.alipay.android.msp.drivers.actions.EventAction$MspEvent):java.lang.String");
    }
}
