package com.alipay.security.mobile.util.log.model;

import com.android.alibaba.ip.runtime.IpChange;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class MapStringString extends Message {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final List<EntryStringString> DEFAULT_ENTRIES = Collections.emptyList();
    public static final int TAG_ENTRIES = 1;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public List<EntryStringString> entries;

    public MapStringString(MapStringString mapStringString) {
        super(mapStringString);
        if (mapStringString == null) {
            return;
        }
        this.entries = copyOf(mapStringString.entries);
    }

    public MapStringString() {
    }

    public MapStringString fillTagValue(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MapStringString) ipChange.ipc$dispatch("6e718cba", new Object[]{this, new Integer(i), obj});
        }
        if (i == 1) {
            this.entries = immutableCopyOf((List) obj);
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
        if (obj instanceof MapStringString) {
            return equals((List<?>) this.entries, (List<?>) ((MapStringString) obj).entries);
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
        List<EntryStringString> list = this.entries;
        if (list != null) {
            i = list.hashCode();
        }
        this.hashCode = i;
        return i;
    }
}
