package com.taobao.tao.powermsg.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.model.BaseMessage;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.messagekit.core.utils.e;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import tb.kge;
import tb.njv;
import tb.njw;

/* loaded from: classes8.dex */
public class Count extends BaseMessage {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public njw.c body;

    static {
        kge.a(-1944139050);
    }

    public Count() {
    }

    public Count(BaseMessage baseMessage) {
        super(baseMessage);
        this.msgType = 3;
        this.sysCode = 1;
        this.type = 2;
        this.body = new njw.c();
    }

    public static Count create() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Count) ipChange.ipc$dispatch("a2404f1e", new Object[0]);
        }
        Count count = new Count();
        count.assemble();
        count.msgType = 3;
        count.sysCode = 1;
        count.type = 2;
        count.body = new njw.c();
        return count;
    }

    public static /* synthetic */ Object ipc$super(Count count, String str, Object... objArr) {
        if (str.hashCode() == -1749473057) {
            super.fromProtocol((njv) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage
    public byte[] bizToProtocol() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("972ab150", new Object[]{this}) : new byte[0];
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage
    public byte[] bodyToProtocol() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("d8e964e1", new Object[]{this});
        }
        njw.c cVar = this.body;
        return cVar != null ? njw.c.toByteArray(cVar) : new byte[0];
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public void fromProtocol(njv njvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b928df", new Object[]{this, njvVar});
            return;
        }
        super.fromProtocol(njvVar);
        this.body = njw.c.a(e.b(njvVar));
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public Map<String, Object> toMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("namespace", Integer.valueOf(this.bizCode));
            hashMap.put("topic", this.header.f31524a);
            hashMap.put("countMap", new JSONObject(this.body.f31511a).toString());
            hashMap.put("sdkVersion", "0.3.0");
        } catch (Exception e) {
            MsgLog.c("Count", e, new Object[0]);
        }
        return hashMap;
    }
}
