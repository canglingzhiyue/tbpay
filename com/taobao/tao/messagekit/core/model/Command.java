package com.taobao.tao.messagekit.core.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.utils.e;
import tb.kge;
import tb.njv;
import tb.njw;

/* loaded from: classes8.dex */
public class Command extends BaseMessage {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public njw.b body;

    static {
        kge.a(-645653771);
    }

    public Command() {
    }

    public Command(BaseMessage baseMessage) {
        super(baseMessage);
        this.msgType = 3;
        this.sysCode = baseMessage.sysCode;
        this.type = 3;
        this.body = new njw.b();
    }

    public static Command create(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Command) ipChange.ipc$dispatch("27806bd0", new Object[]{new Integer(i)});
        }
        Command command = new Command();
        command.assemble();
        command.msgType = 3;
        command.sysCode = i;
        command.type = 3;
        command.body = new njw.b();
        return command;
    }

    public static /* synthetic */ Object ipc$super(Command command, String str, Object... objArr) {
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
        njw.b bVar = this.body;
        return bVar != null ? njw.b.toByteArray(bVar) : new byte[0];
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public void fromProtocol(njv njvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b928df", new Object[]{this, njvVar});
            return;
        }
        super.fromProtocol(njvVar);
        this.body = njw.b.a(e.b(njvVar));
    }
}
