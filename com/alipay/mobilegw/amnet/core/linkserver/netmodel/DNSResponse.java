package com.alipay.mobilegw.amnet.core.linkserver.netmodel;

import com.android.alibaba.ip.runtime.IpChange;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class DNSResponse extends Message {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_DOMAIN = "";
    public static final List<CmdIpAddress> DEFAULT_IPS = Collections.emptyList();
    public static final Integer DEFAULT_TTL = 0;
    public static final int TAG_DOMAIN = 1;
    public static final int TAG_IPS = 2;
    public static final int TAG_TTL = 3;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public String domain;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public List<CmdIpAddress> ips;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public Integer ttl;

    public DNSResponse(DNSResponse dNSResponse) {
        super(dNSResponse);
        if (dNSResponse == null) {
            return;
        }
        this.domain = dNSResponse.domain;
        this.ips = copyOf(dNSResponse.ips);
        this.ttl = dNSResponse.ttl;
    }

    public DNSResponse() {
    }

    public DNSResponse fillTagValue(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DNSResponse) ipChange.ipc$dispatch("9a61295a", new Object[]{this, new Integer(i), obj});
        }
        if (i == 1) {
            this.domain = (String) obj;
        } else if (i == 2) {
            this.ips = immutableCopyOf((List) obj);
        } else if (i == 3) {
            this.ttl = (Integer) obj;
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
        if (!(obj instanceof DNSResponse)) {
            return false;
        }
        DNSResponse dNSResponse = (DNSResponse) obj;
        return equals(this.domain, dNSResponse.domain) && equals((List<?>) this.ips, (List<?>) dNSResponse.ips) && equals(this.ttl, dNSResponse.ttl);
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        int i = 1;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        String str = this.domain;
        int hashCode = (str != null ? str.hashCode() : 0) * 37;
        List<CmdIpAddress> list = this.ips;
        if (list != null) {
            i = list.hashCode();
        }
        int i4 = (hashCode + i) * 37;
        Integer num = this.ttl;
        if (num != null) {
            i2 = num.hashCode();
        }
        int i5 = i4 + i2;
        this.hashCode = i5;
        return i5;
    }
}
