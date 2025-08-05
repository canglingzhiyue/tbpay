package com.alipay.mobilegw.amnet.core.linkserver.netmodel;

import com.android.alibaba.ip.runtime.IpChange;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class CmdMap extends Message {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final List<CmdKeyValue> DEFAULT_MAP = Collections.emptyList();
    public static final int TAG_MAP = 1;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public List<CmdKeyValue> map;

    public CmdMap(CmdMap cmdMap) {
        super(cmdMap);
        if (cmdMap == null) {
            return;
        }
        this.map = copyOf(cmdMap.map);
    }

    public CmdMap() {
    }

    public CmdMap fillTagValue(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CmdMap) ipChange.ipc$dispatch("fe0098b0", new Object[]{this, new Integer(i), obj});
        }
        if (i == 1) {
            this.map = immutableCopyOf((List) obj);
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
        if (obj instanceof CmdMap) {
            return equals((List<?>) this.map, (List<?>) ((CmdMap) obj).map);
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        List<CmdKeyValue> list = this.map;
        if (list != null) {
            i = list.hashCode();
        }
        this.hashCode = i;
        return i;
    }
}
