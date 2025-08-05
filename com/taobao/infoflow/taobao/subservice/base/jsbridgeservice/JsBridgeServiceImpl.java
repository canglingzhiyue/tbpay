package com.taobao.infoflow.taobao.subservice.base.jsbridgeservice;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.base.IJsBridgeService;
import com.taobao.infoflow.taobao.subservice.base.jsbridgeservice.impl.bridge.c;
import tb.kge;
import tb.ljs;

/* loaded from: classes.dex */
public class JsBridgeServiceImpl implements IJsBridgeService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final c mJsNativeFeatureDispatcher = new c();

    static {
        kge.a(2118288082);
        kge.a(2008626837);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
        } else {
            this.mJsNativeFeatureDispatcher.a(ljsVar.a().a());
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else {
            this.mJsNativeFeatureDispatcher.a();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IJsBridgeService
    public void registerJsNativeFeature(IJsBridgeService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae5d39b5", new Object[]{this, aVar});
        } else {
            this.mJsNativeFeatureDispatcher.a(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IJsBridgeService
    public void unRegisterJsNativeFeature(IJsBridgeService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c04a4ee", new Object[]{this, aVar});
        } else {
            this.mJsNativeFeatureDispatcher.b(aVar);
        }
    }
}
