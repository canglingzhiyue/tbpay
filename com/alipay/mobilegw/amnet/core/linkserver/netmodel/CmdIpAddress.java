package com.alipay.mobilegw.amnet.core.linkserver.netmodel;

import com.android.alibaba.ip.runtime.IpChange;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes3.dex */
public final class CmdIpAddress extends Message {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_IP = "";
    public static final Integer DEFAULT_PORT = 0;
    public static final int TAG_IP = 1;
    public static final int TAG_PORT = 2;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public String ip;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public Integer port;

    public CmdIpAddress(CmdIpAddress cmdIpAddress) {
        super(cmdIpAddress);
        if (cmdIpAddress == null) {
            return;
        }
        this.ip = cmdIpAddress.ip;
        this.port = cmdIpAddress.port;
    }

    public CmdIpAddress() {
    }

    public CmdIpAddress fillTagValue(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CmdIpAddress) ipChange.ipc$dispatch("85f70e9f", new Object[]{this, new Integer(i), obj});
        }
        if (i == 1) {
            this.ip = (String) obj;
        } else if (i == 2) {
            this.port = (Integer) obj;
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
        if (!(obj instanceof CmdIpAddress)) {
            return false;
        }
        CmdIpAddress cmdIpAddress = (CmdIpAddress) obj;
        return equals(this.ip, cmdIpAddress.ip) && equals(this.port, cmdIpAddress.port);
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
        String str = this.ip;
        int hashCode = (str != null ? str.hashCode() : 0) * 37;
        Integer num = this.port;
        if (num != null) {
            i = num.hashCode();
        }
        int i3 = hashCode + i;
        this.hashCode = i3;
        return i3;
    }
}
