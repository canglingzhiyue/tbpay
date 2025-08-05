package com.taobao.android.detail.sdk.request.main;

import anetwork.channel.Response;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.android.alibaba.ip.runtime.IpChange;
import tb.jkk;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class a implements jkk.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1673980495);
        kge.a(-901696784);
    }

    public a() {
        tpc.a("com.taobao.android.detail.sdk.request.main.HttpProvider");
    }

    @Override // tb.jkk.b
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
