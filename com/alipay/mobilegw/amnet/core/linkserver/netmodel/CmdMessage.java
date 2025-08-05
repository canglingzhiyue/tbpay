package com.alipay.mobilegw.amnet.core.linkserver.netmodel;

import com.android.alibaba.ip.runtime.IpChange;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import okio.ByteString;

/* loaded from: classes3.dex */
public final class CmdMessage extends Message {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TAG_CMDDATA = 2;
    public static final int TAG_CMDTYPE = 1;
    @ProtoField(tag = 2, type = Message.Datatype.BYTES)
    public ByteString cmdData;
    @ProtoField(tag = 1, type = Message.Datatype.ENUM)
    public CmdType cmdType;
    public static final CmdType DEFAULT_CMDTYPE = CmdType.IpListUpdate;
    public static final ByteString DEFAULT_CMDDATA = ByteString.EMPTY;

    public CmdMessage(CmdMessage cmdMessage) {
        super(cmdMessage);
        if (cmdMessage == null) {
            return;
        }
        this.cmdType = cmdMessage.cmdType;
        this.cmdData = cmdMessage.cmdData;
    }

    public CmdMessage() {
    }

    public CmdMessage fillTagValue(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CmdMessage) ipChange.ipc$dispatch("419f02e5", new Object[]{this, new Integer(i), obj});
        }
        if (i == 1) {
            this.cmdType = (CmdType) obj;
        } else if (i == 2) {
            this.cmdData = (ByteString) obj;
        }
        return this;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CmdMessage)) {
            return false;
        }
        CmdMessage cmdMessage = (CmdMessage) obj;
        return equals(this.cmdType, cmdMessage.cmdType) && equals(this.cmdData, cmdMessage.cmdData);
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        CmdType cmdType = this.cmdType;
        int hashCode = (cmdType != null ? cmdType.hashCode() : 0) * 37;
        ByteString byteString = this.cmdData;
        if (byteString != null) {
            i = byteString.hashCode();
        }
        int i3 = hashCode + i;
        this.hashCode = i3;
        return i3;
    }
}
