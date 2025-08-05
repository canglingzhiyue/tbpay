package com.taobao.taolive.sdk.mergeInfo;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.adapter.network.d;
import tb.kge;

/* loaded from: classes8.dex */
public class a extends com.taobao.taolive.sdk.business.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1275767409);
    }

    public a(d dVar) {
        super(dVar);
    }

    public void a(INetDataObject iNetDataObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("528f3f32", new Object[]{this, iNetDataObject});
        } else {
            a(0, iNetDataObject, UnImportantLiveInfoResponse.class);
        }
    }
}
