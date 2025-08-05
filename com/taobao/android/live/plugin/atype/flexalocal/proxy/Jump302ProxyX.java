package com.taobao.android.live.plugin.atype.flexalocal.proxy;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.jump302.IJump302Proxy;
import com.taobao.taolive.sdk.core.g;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import tb.hjv;
import tb.kge;

/* loaded from: classes6.dex */
public class Jump302ProxyX implements IJump302Proxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-890380572);
        kge.a(1031144859);
    }

    @Override // com.taobao.android.live.plugin.proxy.jump302.IJump302Proxy
    public void jump302(Context context, g gVar, TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26f1ff00", new Object[]{this, context, gVar, tBLiveDataModel});
        } else {
            hjv.a(context, gVar, tBLiveDataModel);
        }
    }
}
