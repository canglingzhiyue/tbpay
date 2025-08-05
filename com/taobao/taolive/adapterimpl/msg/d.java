package com.taobao.taolive.adapterimpl.msg;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.powermsg.common.PowerMessage;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import tb.kge;
import tb.pnr;

/* loaded from: classes8.dex */
public class d implements com.taobao.tao.powermsg.common.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private pnr f21393a;

    static {
        kge.a(226489206);
        kge.a(-1561594341);
    }

    public void a(pnr pnrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9f6a024", new Object[]{this, pnrVar});
        } else {
            this.f21393a = pnrVar;
        }
    }

    @Override // com.taobao.tao.powermsg.common.c
    public void a(PowerMessage powerMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f4631a6", new Object[]{this, powerMessage});
            return;
        }
        pnr pnrVar = this.f21393a;
        if (pnrVar == null) {
            return;
        }
        pnrVar.a(b(powerMessage));
    }

    @Override // com.taobao.tao.powermsg.common.c
    public void a(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36ff2b7", new Object[]{this, new Integer(i), obj});
            return;
        }
        pnr pnrVar = this.f21393a;
        if (pnrVar == null) {
            return;
        }
        pnrVar.a(i, obj);
    }

    private TLiveMsg b(PowerMessage powerMessage) {
        TLiveMsg tLiveMsg;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TLiveMsg) ipChange.ipc$dispatch("c92f7a7e", new Object[]{this, powerMessage});
        }
        try {
            tLiveMsg = new TLiveMsg();
            try {
                tLiveMsg.data = powerMessage.data;
                tLiveMsg.type = powerMessage.type;
                tLiveMsg.bizCode = powerMessage.bizCode;
                tLiveMsg.from = powerMessage.from;
                tLiveMsg.messageId = powerMessage.messageId;
                tLiveMsg.needAck = powerMessage.needAck;
                tLiveMsg.priority = powerMessage.priority;
                tLiveMsg.qosLevel = powerMessage.qosLevel;
                tLiveMsg.sendFullTags = powerMessage.sendFullTags;
                tLiveMsg.tags = powerMessage.tags;
                tLiveMsg.timestamp = powerMessage.timestamp;
                tLiveMsg.to = powerMessage.to;
                tLiveMsg.topic = powerMessage.topic;
                tLiveMsg.userId = powerMessage.userId;
            } catch (Exception e) {
                e = e;
                e.printStackTrace();
                return tLiveMsg;
            }
        } catch (Exception e2) {
            e = e2;
            tLiveMsg = null;
        }
        return tLiveMsg;
    }
}
