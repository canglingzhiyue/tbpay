package com.taobao.update.dynamicfeature.processor;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.dynamicfeature.utils.Constants;
import tb.kge;
import tb.rge;
import tb.rgf;
import tb.rgg;
import tb.rgq;

/* loaded from: classes9.dex */
public class a implements com.taobao.update.framework.b<com.taobao.update.dynamicfeature.b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private rge f23404a = rgf.getLog(a.class, (rge) null);

    static {
        kge.a(-797410987);
        kge.a(-386319410);
    }

    @Override // com.taobao.update.framework.b
    public void execute(com.taobao.update.dynamicfeature.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("431fae6e", new Object[]{this, bVar});
            return;
        }
        bVar.stage = rgg.ARG_NETWORK_CHECK;
        if (rgq.getNetworkType() == 0) {
            this.f23404a.w("no network");
            bVar.success = false;
            bVar.errorCode = -1;
            bVar.errorMsg = Constants.getMsg(-1);
            return;
        }
        this.f23404a.w("network avilable");
    }
}
