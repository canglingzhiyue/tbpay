package com.alipay.mobile.common.transportext.biz.appevent;

import com.alipay.mobile.common.transportext.biz.appevent.AppEventManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public class EventInterfaceAdapter implements AppEventManager.EventInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.common.transportext.biz.appevent.AppEventManager.EventInterface
    public void onAppLeaveEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abfccd8c", new Object[]{this});
        }
    }

    @Override // com.alipay.mobile.common.transportext.biz.appevent.AppEventManager.EventInterface
    public void onAppResumeEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7efc9c52", new Object[]{this});
        }
    }

    @Override // com.alipay.mobile.common.transportext.biz.appevent.AppEventManager.EventInterface
    public void onSeceenOffEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ed782e", new Object[]{this});
        }
    }

    @Override // com.alipay.mobile.common.transportext.biz.appevent.AppEventManager.EventInterface
    public void onSeceenOnEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70f150c6", new Object[]{this});
        }
    }

    @Override // com.alipay.mobile.common.transportext.biz.appevent.AppEventManager.EventInterface
    public void onSyncInitChanged(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e64f75d4", new Object[]{this, map});
        }
    }
}
