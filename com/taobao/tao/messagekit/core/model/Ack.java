package com.taobao.tao.messagekit.core.model;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.utils.e;
import tb.kge;
import tb.njv;

/* loaded from: classes8.dex */
public class Ack extends BaseMessage {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Object body;
    public Object data;
    public byte[] reContent;
    public byte[] retBody;

    static {
        kge.a(30677299);
    }

    public Ack() {
    }

    public Ack(BaseMessage baseMessage) {
        super(baseMessage);
        this.msgType = 4;
    }

    public Ack(IProtocol iProtocol) {
        assemble();
        this.msgType = iProtocol.msgType();
        this.needACK = iProtocol.needACK();
        this.qosLevel = iProtocol.qosLevel();
        this.sysCode = iProtocol.sysCode();
        this.type = iProtocol.type();
        this.bizCode = iProtocol.bizCode();
        this.routerId = iProtocol.routerId();
        this.msgType = 4;
        this.header.f31524a = iProtocol.topic();
        this.header.c = iProtocol.statusCode();
        this.header.f = iProtocol.getID();
        this.header.g = iProtocol.subType();
        this.header.h = iProtocol.userId();
        this.header.j = iProtocol.monitorTag();
    }

    public static Ack create() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Ack) ipChange.ipc$dispatch("3af6c20f", new Object[0]);
        }
        Ack ack = new Ack();
        ack.msgType = 4;
        ack.assemble();
        return ack;
    }

    public static /* synthetic */ Object ipc$super(Ack ack, String str, Object... objArr) {
        if (str.hashCode() == -1749473057) {
            super.fromProtocol((njv) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public int bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("aa54921a", new Object[]{this})).intValue() : this.bizCode;
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage
    public byte[] bizToProtocol() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("972ab150", new Object[]{this});
        }
        byte[] bArr = this.reContent;
        return bArr != null ? bArr : new byte[0];
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage
    public byte[] bodyToProtocol() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("d8e964e1", new Object[]{this});
        }
        byte[] bArr = this.retBody;
        return bArr != null ? bArr : new byte[0];
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
        super.fromProtocol(njvVar);
        this.retBody = e.b(njvVar);
        this.reContent = e.c(njvVar);
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public String getID() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b12904a8", new Object[]{this}) : this.header.f;
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public int monitorTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3a6ce85a", new Object[]{this})).intValue() : this.header.j;
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

    public void setStatus(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("384790e8", new Object[]{this, new Integer(i)});
        } else {
            this.header.c = i;
        }
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public int statusCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fc4b95f9", new Object[]{this})).intValue() : this.header.c;
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
