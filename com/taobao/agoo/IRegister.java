package com.taobao.agoo;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class IRegister extends ICallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-571689802);
    }

    @Override // com.taobao.agoo.ICallback
    public abstract void onFailure(String str, String str2);

    @Override // com.taobao.agoo.ICallback
    public void onSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
        }
    }

    public abstract void onSuccess(String str);
}
