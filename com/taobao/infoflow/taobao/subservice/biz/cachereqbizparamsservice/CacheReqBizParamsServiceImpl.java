package com.taobao.infoflow.taobao.subservice.biz.cachereqbizparamsservice;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.ICacheReqBizParamsService;
import tb.kge;
import tb.ljs;
import tb.lmz;

/* loaded from: classes.dex */
public class CacheReqBizParamsServiceImpl implements ICacheReqBizParamsService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private lmz mBizParamCacheCenter;

    static {
        kge.a(1052434426);
        kge.a(77213378);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
        } else {
            this.mBizParamCacheCenter = new lmz(ljsVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else {
            this.mBizParamCacheCenter.a();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ICacheReqBizParamsService
    public void saveReqBizParam(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64b6efa0", new Object[]{this, str, str2, str3});
            return;
        }
        lmz lmzVar = this.mBizParamCacheCenter;
        if (lmzVar == null) {
            return;
        }
        lmzVar.a(str, str2, str3);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ICacheReqBizParamsService
    public String readReqBizParam(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("20ba8059", new Object[]{this, str, str2, str3});
        }
        lmz lmzVar = this.mBizParamCacheCenter;
        return lmzVar != null ? lmzVar.b(str, str2, str3) : str2;
    }
}
