package com.taobao.tao.powermsg.common;

import com.android.alibaba.ip.runtime.IpChange;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.Map;
import tb.kge;
import tb.oms;

/* loaded from: classes8.dex */
public class CountPowerMessage extends PowerMessage {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public byte[] data;
    public int type;
    public Map<String, Long> value;

    static {
        kge.a(-1648199808);
    }

    public CountPowerMessage() {
        super.type = 102;
    }

    @Override // com.taobao.tao.powermsg.common.PowerMessage
    public void fromData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da05c0fb", new Object[]{this});
            return;
        }
        try {
            this.value = oms.a.a(super.data).f32181a;
        } catch (InvalidProtocolBufferNanoException e) {
            e.printStackTrace();
        }
    }

    @Override // com.taobao.tao.powermsg.common.PowerMessage
    public void toData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("695e56cc", new Object[]{this});
            return;
        }
        super.type = 102;
        oms.a aVar = new oms.a();
        aVar.f32181a = this.value;
        super.data = oms.a.toByteArray(aVar);
    }
}
