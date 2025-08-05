package com.taobao.tao.powermsg.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.model.BaseMessage;
import com.taobao.tao.messagekit.core.utils.e;
import tb.kge;
import tb.njv;
import tb.njw;

/* loaded from: classes8.dex */
public class P2P extends BaseMessage {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public njw.j body;
    public byte[] content;

    static {
        kge.a(1405807189);
    }

    public P2P() {
    }

    public P2P(BaseMessage baseMessage) {
        super(baseMessage);
        this.msgType = 3;
        this.sysCode = 1;
        this.type = 5;
        this.body = new njw.j();
        this.body.f31518a = this.routerId;
    }

    public static P2P create() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (P2P) ipChange.ipc$dispatch("4e3d89bf", new Object[0]);
        }
        P2P p2p = new P2P();
        p2p.assemble();
        p2p.msgType = 3;
        p2p.sysCode = 1;
        p2p.type = 5;
        p2p.body = new njw.j();
        return p2p;
    }

    public static /* synthetic */ Object ipc$super(P2P p2p, String str, Object... objArr) {
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
        njw.j jVar = this.body;
        return jVar != null ? njw.j.toByteArray(jVar) : new byte[0];
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public void fromProtocol(njv njvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b928df", new Object[]{this, njvVar});
            return;
        }
        super.fromProtocol(njvVar);
        this.body = njw.j.a(e.b(njvVar));
        this.content = e.c(njvVar);
        this.routerId = this.body.f31518a;
    }
}
