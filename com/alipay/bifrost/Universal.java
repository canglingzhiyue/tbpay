package com.alipay.bifrost;

import com.android.alibaba.ip.runtime.IpChange;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class Universal extends Message {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final List<StrStrItem> DEFAULT_ALICE = Collections.emptyList();
    public static final List<StrBinItem> DEFAULT_BOB = Collections.emptyList();
    public static final List<Universal> DEFAULT_SUBUNIVERSAL = Collections.emptyList();
    public static final int TAG_ALICE = 1;
    public static final int TAG_BOB = 2;
    public static final int TAG_SUBUNIVERSAL = 3;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public List<StrStrItem> alice;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public List<StrBinItem> bob;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public List<Universal> subUniversal;

    public Universal(Universal universal) {
        super(universal);
        if (universal == null) {
            return;
        }
        this.alice = copyOf(universal.alice);
        this.bob = copyOf(universal.bob);
        this.subUniversal = copyOf(universal.subUniversal);
    }

    public Universal() {
    }

    public Universal fillTagValue(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Universal) ipChange.ipc$dispatch("bcafd0e5", new Object[]{this, new Integer(i), obj});
        }
        if (i == 1) {
            this.alice = immutableCopyOf((List) obj);
        } else if (i == 2) {
            this.bob = immutableCopyOf((List) obj);
        } else if (i == 3) {
            this.subUniversal = immutableCopyOf((List) obj);
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
        if (!(obj instanceof Universal)) {
            return false;
        }
        Universal universal = (Universal) obj;
        return equals((List<?>) this.alice, (List<?>) universal.alice) && equals((List<?>) this.bob, (List<?>) universal.bob) && equals((List<?>) this.subUniversal, (List<?>) universal.subUniversal);
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
        List<StrStrItem> list = this.alice;
        int hashCode = (list != null ? list.hashCode() : 1) * 37;
        List<StrBinItem> list2 = this.bob;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 1)) * 37;
        List<Universal> list3 = this.subUniversal;
        if (list3 != null) {
            i = list3.hashCode();
        }
        int i3 = hashCode2 + i;
        this.hashCode = i3;
        return i3;
    }
}
