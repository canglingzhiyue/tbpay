package com.taobao.android.detail.wrapper.ext.provider.core;

import anetwork.channel.Response;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class g implements com.taobao.android.detail.datasdk.protocol.adapter.core.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-518587538);
        kge.a(2123905028);
    }

    public g() {
        emu.a("com.taobao.android.detail.wrapper.ext.provider.core.TBHttpProvider");
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.core.a
    public byte[] a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("81233aeb", new Object[]{this, str});
        }
        Response syncSend = new DegradableNetwork(null).syncSend(new RequestImpl(str), null);
        if (syncSend == null) {
            return null;
        }
        return syncSend.getBytedata();
    }
}
