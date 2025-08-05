package com.taobao.tao.powermsg.common;

import com.android.alibaba.ip.runtime.IpChange;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.Map;
import tb.kge;
import tb.oms;

/* loaded from: classes8.dex */
public class e extends PowerMessage {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f20836a;
    public int b;
    public Map<String, String> c;
    public long d;

    static {
        kge.a(-2071952867);
    }

    public e() {
        this.type = 103;
    }

    @Override // com.taobao.tao.powermsg.common.PowerMessage
    public void fromData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da05c0fb", new Object[]{this});
            return;
        }
        try {
            oms.b a2 = oms.b.a(this.data);
            this.f20836a = a2.f32182a;
            this.b = a2.b;
            this.c = a2.c;
            this.d = a2.d;
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
        this.type = 103;
        oms.b bVar = new oms.b();
        bVar.f32182a = this.f20836a;
        bVar.b = this.b;
        bVar.c = this.c;
        bVar.d = this.d;
        this.data = oms.b.toByteArray(bVar);
    }
}
