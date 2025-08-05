package com.taobao.infoflow.taobao.subservice.biz.jump2banner;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IJumpToBannerService;
import tb.bxq;
import tb.kge;
import tb.ljs;

/* loaded from: classes7.dex */
public class JumpToBannerServiceImpl implements IJumpToBannerService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private bxq mJumpToBanner;

    static {
        kge.a(-818489332);
        kge.a(1417781750);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
        } else {
            this.mJumpToBanner = new bxq(ljsVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        bxq bxqVar = this.mJumpToBanner;
        if (bxqVar == null) {
            return;
        }
        bxqVar.a();
    }
}
