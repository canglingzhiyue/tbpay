package com.taobao.infoflow.taobao.subservice.biz.sharedataservice;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.ISharedDataService;
import tb.kge;
import tb.ljs;
import tb.lrg;
import tb.lrj;

/* loaded from: classes.dex */
public class SharedDataServiceImpl implements ISharedDataService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private lrj mShareDataJsNativeFeatureRegister;
    private lrg mShareDataSource;

    static {
        kge.a(-841946600);
        kge.a(1656249436);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        this.mShareDataJsNativeFeatureRegister = new lrj(ljsVar);
        this.mShareDataSource = new lrg(ljsVar);
        this.mShareDataJsNativeFeatureRegister.a(this.mShareDataSource);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        this.mShareDataJsNativeFeatureRegister.a();
        this.mShareDataSource.a();
    }
}
