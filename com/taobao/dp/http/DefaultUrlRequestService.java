package com.taobao.dp.http;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

@Deprecated
/* loaded from: classes7.dex */
public class DefaultUrlRequestService implements IUrlRequestService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-296258581);
        kge.a(1177269251);
    }

    @Override // com.taobao.dp.http.IUrlRequestService
    public void sendRequest(String str, String str2, IResponseReceiver iResponseReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9edcc5af", new Object[]{this, str, str2, iResponseReceiver});
        }
    }
}
