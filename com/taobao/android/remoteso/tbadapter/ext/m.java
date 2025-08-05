package com.taobao.android.remoteso.tbadapter.ext;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import tb.iiv;
import tb.ijg;

/* loaded from: classes6.dex */
public class m implements ijg.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.ijg.b
    public void a(iiv<ijg.a, Void> iivVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edc00fc2", new Object[]{this, iivVar});
        } else {
            RSoLog.c("TaobaoPreSettleDataProvider,register, no-op");
        }
    }
}
