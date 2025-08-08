package com.taobao.tao.messagekit.core.model;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.njv;
import tb.njw;

/* loaded from: classes8.dex */
public class Monitor extends BaseMessage {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public njw.h body;

    static {
        kge.a(-359728892);
    }

    public Monitor() {
    }

    public Monitor(BaseMessage baseMessage) {
        super(baseMessage);
        this.msgType = 3;
        this.type = 7;
        this.sysCode = 2;
        this.body = new njw.h();
        this.body.f31516a = "0.3.0";
    }

    public static Monitor create() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Monitor) ipChange.ipc$dispatch("dfcf30de", new Object[0]);
        }
        Monitor monitor = new Monitor();
        monitor.assemble();
        monitor.msgType = 3;
        monitor.type = 7;
        monitor.sysCode = 2;
        monitor.body = new njw.h();
        monitor.body.f31516a = "0.3.0";
        return monitor;
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public int bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("aa54921a", new Object[]{this})).intValue() : this.bizCode;
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
        njw.h hVar = this.body;
        return hVar != null ? njw.c.toByteArray(hVar) : new byte[0];
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public long createTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bb18f1e4", new Object[]{this})).longValue() : this.createTime;
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public void fromProtocol(njv njvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b928df", new Object[]{this, njvVar});
            return;
        }
        this.msgType = 3;
        this.type = 7;
        this.body = new njw.h();
        this.body.f31516a = "0.3.0";
    }

    public njw.h getBody() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (njw.h) ipChange.ipc$dispatch("b6fb93a8", new Object[]{this}) : this.body;
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public String getID() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b12904a8", new Object[]{this}) : this.header.f;
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public int msgType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a55ee155", new Object[]{this})).intValue() : this.msgType;
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public boolean needACK() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5333e71e", new Object[]{this})).booleanValue() : this.needACK;
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public byte qosLevel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c6392f62", new Object[]{this})).byteValue() : this.qosLevel;
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public String routerId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a4290f35", new Object[]{this}) : this.routerId;
    }

    public void setData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("427970bd", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            this.body.b = str;
        }
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage
    public void setID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c884e3ce", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            this.header.f = str;
        }
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public int subType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("25f7c914", new Object[]{this})).intValue() : this.header.g;
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public int sysCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c43c79d4", new Object[]{this})).intValue() : this.sysCode;
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public Map<String, Object> toMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("data", this.body.b);
        hashMap.put("sdkversion", this.body.f31516a);
        return hashMap;
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public byte[] toProtocol() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("fd8f9ee3", new Object[]{this}) : bodyToProtocol();
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public String topic() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9373c52a", new Object[]{this}) : this.header.f31524a;
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public int type() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d79de6b4", new Object[]{this})).intValue() : this.type;
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public String userId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d219c873", new Object[]{this}) : this.header.h;
    }
}
