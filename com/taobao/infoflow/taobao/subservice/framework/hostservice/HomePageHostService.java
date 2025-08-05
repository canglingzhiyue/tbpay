package com.taobao.infoflow.taobao.subservice.framework.hostservice;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;
import tb.kge;
import tb.ljs;
import tb.lju;
import tb.lub;
import tb.lud;

/* loaded from: classes.dex */
public class HomePageHostService implements IHostService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final lub mCallBack;

    static {
        kge.a(340295411);
        kge.a(-1650113160);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    public HomePageHostService(lud ludVar) {
        this.mCallBack = new lub(ludVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IHostService
    public lju getInvokeCallback() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lju) ipChange.ipc$dispatch("935e4095", new Object[]{this}) : this.mCallBack;
    }
}
