package com.taobao.tao.powermsg.model;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.model.BaseMessage;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.messagekit.core.utils.e;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.njv;
import tb.njw;
import tb.omg;

/* loaded from: classes8.dex */
public class SubscribeMessage extends BaseMessage {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public njw.n body;
    public String routeGroup;

    static {
        kge.a(1624409910);
    }

    public SubscribeMessage() {
    }

    public SubscribeMessage(BaseMessage baseMessage) {
        super(baseMessage);
        this.msgType = 8;
        this.sysCode = 1;
        this.needACK = true;
        this.body = new njw.n();
    }

    public static SubscribeMessage create() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SubscribeMessage) ipChange.ipc$dispatch("e5fbb2c", new Object[0]);
        }
        SubscribeMessage subscribeMessage = new SubscribeMessage();
        subscribeMessage.assemble();
        subscribeMessage.msgType = 8;
        subscribeMessage.sysCode = 1;
        subscribeMessage.body = new njw.n();
        subscribeMessage.needACK = true;
        return subscribeMessage;
    }

    public static /* synthetic */ Object ipc$super(SubscribeMessage subscribeMessage, String str, Object... objArr) {
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
        njw.n nVar = this.body;
        if (nVar == null) {
            return new byte[0];
        }
        nVar.f = this.createTime;
        this.body.e = this.ext;
        return njw.n.toByteArray(this.body);
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public void fromProtocol(njv njvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b928df", new Object[]{this, njvVar});
            return;
        }
        super.fromProtocol(njvVar);
        this.body = njw.n.a(e.b(njvVar));
    }

    public void setBizTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67dae25a", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            this.body.c = str;
        }
    }

    public void setFrom(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bac98bd", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            this.body.f31522a = str;
        }
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
            hashMap.put("role", Integer.valueOf(this.body.b));
            hashMap.put("tag", this.body.c);
            hashMap.put("from", this.body.f31522a);
            hashMap.put("id", this.header.h);
            hashMap.put("sdkVersion", "0.3.0");
            hashMap.put("timestamp", Long.valueOf(this.createTime));
            hashMap.put("utdId", omg.f32175a);
            hashMap.put("appKey", omg.c);
            hashMap.put("ext", this.ext);
            hashMap.put("internalExt", this.internalExt);
        } catch (Exception e) {
            MsgLog.c("SubMessage", e, new Object[0]);
        }
        return hashMap;
    }
}
