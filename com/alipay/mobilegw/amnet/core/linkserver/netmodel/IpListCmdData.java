package com.alipay.mobilegw.amnet.core.linkserver.netmodel;

import com.android.alibaba.ip.runtime.IpChange;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class IpListCmdData extends Message {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Integer DEFAULT_CODE = 0;
    public static final List<DNSResponse> DEFAULT_DNS = Collections.emptyList();
    public static final int TAG_CODE = 1;
    public static final int TAG_DNS = 2;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public Integer code;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public List<DNSResponse> dns;

    public IpListCmdData(IpListCmdData ipListCmdData) {
        super(ipListCmdData);
        if (ipListCmdData == null) {
            return;
        }
        this.code = ipListCmdData.code;
        this.dns = copyOf(ipListCmdData.dns);
    }

    public IpListCmdData() {
    }

    public IpListCmdData fillTagValue(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IpListCmdData) ipChange.ipc$dispatch("f8682065", new Object[]{this, new Integer(i), obj});
        }
        if (i == 1) {
            this.code = (Integer) obj;
        } else if (i == 2) {
            this.dns = immutableCopyOf((List) obj);
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
        if (!(obj instanceof IpListCmdData)) {
            return false;
        }
        IpListCmdData ipListCmdData = (IpListCmdData) obj;
        return equals(this.code, ipListCmdData.code) && equals((List<?>) this.dns, (List<?>) ipListCmdData.dns);
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        int i = 0;
        int i2 = 1;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        Integer num = this.code;
        if (num != null) {
            i = num.hashCode();
        }
        int i4 = i * 37;
        List<DNSResponse> list = this.dns;
        if (list != null) {
            i2 = list.hashCode();
        }
        int i5 = i4 + i2;
        this.hashCode = i5;
        return i5;
    }
}
