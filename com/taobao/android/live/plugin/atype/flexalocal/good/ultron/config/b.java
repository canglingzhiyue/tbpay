package com.taobao.android.live.plugin.atype.flexalocal.good.ultron.config;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.adapter.network.d;
import tb.kge;

/* loaded from: classes3.dex */
public class b extends com.taobao.taolive.sdk.business.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1800491672);
    }

    public b(d dVar) {
        super(dVar);
    }

    public void a(INetDataObject iNetDataObject, Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42b2224b", new Object[]{this, iNetDataObject, cls});
        } else if (iNetDataObject == null) {
        } else {
            a(1, iNetDataObject, cls);
        }
    }
}
