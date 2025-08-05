package com.taobao.android.tbabilitykit;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import tb.dlm;
import tb.kge;

/* loaded from: classes.dex */
public class o implements dlm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1250588635);
        kge.a(1345047954);
    }

    @Override // tb.dlm
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            TLog.loge("AbilityKit", str, str2);
        }
    }
}
