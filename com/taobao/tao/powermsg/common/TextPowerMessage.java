package com.taobao.tao.powermsg.common;

import com.android.alibaba.ip.runtime.IpChange;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.Map;
import tb.kge;
import tb.oms;

/* loaded from: classes8.dex */
public class TextPowerMessage extends PowerMessage {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public byte[] data;
    public String text;
    public int type;
    public Map<String, String> value;

    static {
        kge.a(-1531839072);
    }

    public TextPowerMessage() {
        super.type = 101;
    }

    @Override // com.taobao.tao.powermsg.common.PowerMessage
    public void fromData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da05c0fb", new Object[]{this});
            return;
        }
        try {
            oms.d a2 = oms.d.a(super.data);
            this.text = a2.f32185a;
            this.value = a2.b;
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
        super.type = 101;
        oms.d dVar = new oms.d();
        dVar.f32185a = this.text;
        Map<String, String> map = this.value;
        if (map != null) {
            dVar.b = map;
        }
        super.data = oms.d.toByteArray(dVar);
    }
}
