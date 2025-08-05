package com.taobao.tao.messagekit.core.model;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.utils.e;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.njv;
import tb.njx;
import tb.omg;

/* loaded from: classes8.dex */
public abstract class BaseMessage implements IProtocol {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int bizCode;
    public long createTime;
    public String ext;
    public njx.a header;
    public String internalExt;
    public int msgType;
    public boolean needACK;
    public byte qosLevel;
    public byte retain;
    public String routerId;
    public byte serializeType;
    public int sysCode;
    public int type;
    public byte typeVersion;
    public int version;

    static {
        kge.a(213699232);
        kge.a(2067034955);
    }

    public BaseMessage() {
        this.routerId = "";
        this.ext = "";
        this.internalExt = "";
    }

    public BaseMessage(BaseMessage baseMessage) {
        this.routerId = "";
        this.ext = "";
        this.internalExt = "";
        this.msgType = baseMessage.msgType;
        this.needACK = baseMessage.needACK;
        this.qosLevel = baseMessage.qosLevel;
        this.retain = baseMessage.retain;
        this.version = baseMessage.version;
        this.serializeType = baseMessage.serializeType;
        this.sysCode = baseMessage.sysCode;
        this.type = baseMessage.type;
        this.typeVersion = baseMessage.typeVersion;
        this.bizCode = baseMessage.bizCode;
        this.header = baseMessage.header;
        this.routerId = baseMessage.routerId;
    }

    @Override // com.taobao.tao.messagekit.core.model.IProtocol
    public void assemble() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41fc8959", new Object[]{this});
            return;
        }
        this.createTime = System.currentTimeMillis();
        this.version = 1;
        this.serializeType = (byte) 1;
        this.typeVersion = (byte) 1;
        this.header = new njx.a();
        this.header.f = omg.e();
        this.header.e = omg.d();
        njx.a aVar = this.header;
        aVar.d = "0.3.0";
        aVar.h = omg.f();
        this.header.i = omg.g();
        this.header.l = 1;
    }

    @Override // com.taobao.tao.messagekit.core.model.IProtocol
    public int bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("aa54921a", new Object[]{this})).intValue() : this.bizCode;
    }

    public abstract byte[] bizToProtocol();

    public abstract byte[] bodyToProtocol();

    @Override // com.taobao.tao.messagekit.core.model.IProtocol
    public long createTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bb18f1e4", new Object[]{this})).longValue() : this.createTime;
    }

    @Override // com.taobao.tao.messagekit.core.model.IProtocol
    public void fromProtocol(njv njvVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b928df", new Object[]{this, njvVar});
            return;
        }
        this.msgType = njvVar.f31508a;
        if (njvVar.b == 0) {
            z = false;
        }
        this.needACK = z;
        this.qosLevel = njvVar.c;
        this.retain = njvVar.d;
        this.version = njvVar.e;
        this.serializeType = njvVar.f;
        this.sysCode = njvVar.g;
        this.type = njvVar.h;
        this.typeVersion = njvVar.i;
        this.bizCode = njvVar.j;
        this.header = njx.a.a(e.a(njvVar));
    }

    @Override // com.taobao.tao.messagekit.core.model.IProtocol
    public String getID() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b12904a8", new Object[]{this}) : this.header.f;
    }

    @Override // com.taobao.tao.messagekit.core.model.IProtocol
    public int monitorTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3a6ce85a", new Object[]{this})).intValue() : this.header.j;
    }

    @Override // com.taobao.tao.messagekit.core.model.IProtocol
    public int msgType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a55ee155", new Object[]{this})).intValue() : this.msgType;
    }

    @Override // com.taobao.tao.messagekit.core.model.IProtocol
    public boolean needACK() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5333e71e", new Object[]{this})).booleanValue() : this.needACK;
    }

    @Override // com.taobao.tao.messagekit.core.model.IProtocol
    public byte qosLevel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c6392f62", new Object[]{this})).byteValue() : this.qosLevel;
    }

    @Override // com.taobao.tao.messagekit.core.model.IProtocol
    public String routerId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a4290f35", new Object[]{this}) : this.routerId;
    }

    public void setID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c884e3ce", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.header.f = str;
        }
    }

    @Override // com.taobao.tao.messagekit.core.model.IProtocol
    public int statusCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc4b95f9", new Object[]{this})).intValue();
        }
        njx.a aVar = this.header;
        if (aVar != null) {
            return aVar.c;
        }
        return -1;
    }

    @Override // com.taobao.tao.messagekit.core.model.IProtocol
    public int subType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("25f7c914", new Object[]{this})).intValue() : this.header.g;
    }

    @Override // com.taobao.tao.messagekit.core.model.IProtocol
    public int sysCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c43c79d4", new Object[]{this})).intValue() : this.sysCode;
    }

    @Override // com.taobao.tao.messagekit.core.model.IProtocol
    public Map<String, Object> toMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this}) : new HashMap();
    }

    @Override // com.taobao.tao.messagekit.core.model.IProtocol
    public byte[] toProtocol() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("fd8f9ee3", new Object[]{this});
        }
        return new njv(this.msgType, this.needACK ? 1 : 0, this.qosLevel, this.retain, this.version, this.serializeType, this.sysCode, this.type, this.typeVersion, this.bizCode).a(njx.a.toByteArray(this.header), bodyToProtocol(), bizToProtocol());
    }

    @Override // com.taobao.tao.messagekit.core.model.IProtocol
    public String topic() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9373c52a", new Object[]{this}) : this.header.f31524a;
    }

    @Override // com.taobao.tao.messagekit.core.model.IProtocol
    public int type() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d79de6b4", new Object[]{this})).intValue() : this.type;
    }

    @Override // com.taobao.tao.messagekit.core.model.IProtocol
    public String userId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d219c873", new Object[]{this}) : this.header.h;
    }
}
