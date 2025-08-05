package com.taobao.infoflow.taobao.subservice.biz.aiservice.impl;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IAiService;
import tb.kge;
import tb.ljs;

/* loaded from: classes.dex */
public class AiServiceImpl implements IAiService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private IAiService.a mAiConfig;
    private a mAiProviderAdapter;

    static {
        kge.a(2033937813);
        kge.a(-2142580285);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        this.mAiProviderAdapter = new a(ljsVar);
        IAiService.a aVar = this.mAiConfig;
        if (aVar == null) {
            return;
        }
        this.mAiProviderAdapter.a(aVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else {
            this.mAiProviderAdapter.a();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IAiService
    public void setConfig(IAiService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f7c173a", new Object[]{this, aVar});
            return;
        }
        a aVar2 = this.mAiProviderAdapter;
        if (aVar2 == null) {
            this.mAiConfig = aVar;
        } else {
            aVar2.a(aVar);
        }
    }
}
