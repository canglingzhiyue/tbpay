package com.taobao.alimama.net.core.request;

import anetwork.channel.NetworkCallBack;
import anetwork.channel.NetworkEvent;
import anetwork.channel.Request;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.utils.Global;
import java.util.Map;
import tb.dhk;
import tb.dhl;
import tb.dhp;
import tb.kge;

/* loaded from: classes4.dex */
public class b extends a<dhp> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(892831787);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.alimama.net.core.request.a
    public void a(dhp dhpVar, final dhl dhlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f73303f4", new Object[]{this, dhpVar, dhlVar});
        } else {
            new DegradableNetwork(Global.getApplication()).asyncSend(a(dhpVar), null, null, new NetworkCallBack.FinishListener() { // from class: com.taobao.alimama.net.core.request.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // anetwork.channel.NetworkCallBack.FinishListener
                public void onFinished(NetworkEvent.FinishEvent finishEvent, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a00910e8", new Object[]{this, finishEvent, obj});
                        return;
                    }
                    dhk dhkVar = new dhk();
                    if (finishEvent != null) {
                        dhkVar.f26759a = String.valueOf(finishEvent.getHttpCode());
                        dhkVar.b = finishEvent.getDesc();
                        dhkVar.c = obj;
                    }
                    dhl dhlVar2 = dhlVar;
                    if (dhlVar2 == null) {
                        return;
                    }
                    dhlVar2.a(dhkVar);
                }
            });
        }
    }

    private Request a(dhp dhpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Request) ipChange.ipc$dispatch("3913b1b8", new Object[]{this, dhpVar});
        }
        RequestImpl requestImpl = new RequestImpl(dhpVar.c());
        requestImpl.setCharset("UTF-8");
        requestImpl.setFollowRedirects(dhpVar.g());
        requestImpl.setRetryTime(dhpVar.h());
        requestImpl.setConnectTimeout(dhpVar.j());
        requestImpl.setReadTimeout(dhpVar.i());
        if (dhpVar.k() != null) {
            for (Map.Entry<String, String> entry : dhpVar.k().entrySet()) {
                requestImpl.addHeader(entry.getKey(), entry.getValue());
            }
        }
        return requestImpl;
    }
}
