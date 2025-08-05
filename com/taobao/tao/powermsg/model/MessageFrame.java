package com.taobao.tao.powermsg.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.model.BaseMessage;
import com.taobao.tao.messagekit.core.utils.e;
import java.util.Map;
import tb.kge;
import tb.njv;
import tb.njw;

/* loaded from: classes8.dex */
public class MessageFrame extends BaseMessage {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public njw.f frame;

    static {
        kge.a(1977544191);
    }

    public MessageFrame() {
    }

    public MessageFrame(BaseMessage baseMessage) {
        super(baseMessage);
        this.msgType = 3;
        this.sysCode = 1;
        this.type = 2;
        this.frame = new njw.f();
    }

    public static MessageFrame create() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MessageFrame) ipChange.ipc$dispatch("d52bf903", new Object[0]);
        }
        MessageFrame messageFrame = new MessageFrame();
        messageFrame.assemble();
        messageFrame.msgType = 3;
        messageFrame.sysCode = 1;
        messageFrame.type = 2;
        messageFrame.frame = new njw.f();
        return messageFrame;
    }

    public static /* synthetic */ Object ipc$super(MessageFrame messageFrame, String str, Object... objArr) {
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
        njw.f fVar = this.frame;
        return fVar != null ? njw.f.toByteArray(fVar) : new byte[0];
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public void fromProtocol(njv njvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b928df", new Object[]{this, njvVar});
            return;
        }
        super.fromProtocol(njvVar);
        this.frame = njw.f.a(e.b(njvVar));
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public Map<String, Object> toMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this});
        }
        return null;
    }
}
