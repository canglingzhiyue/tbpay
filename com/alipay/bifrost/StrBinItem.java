package com.alipay.bifrost;

import com.android.alibaba.ip.runtime.IpChange;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import okio.ByteString;

/* loaded from: classes3.dex */
public final class StrBinItem extends Message {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_KEY = "";
    public static final ByteString DEFAULT_VAL = ByteString.EMPTY;
    public static final int TAG_KEY = 1;
    public static final int TAG_VAL = 2;
    @ProtoField(label = Message.Label.REQUIRED, tag = 1, type = Message.Datatype.STRING)
    public String key;
    @ProtoField(tag = 2, type = Message.Datatype.BYTES)
    public ByteString val;

    public StrBinItem(StrBinItem strBinItem) {
        super(strBinItem);
        if (strBinItem == null) {
            return;
        }
        this.key = strBinItem.key;
        this.val = strBinItem.val;
    }

    public StrBinItem() {
    }

    public StrBinItem fillTagValue(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StrBinItem) ipChange.ipc$dispatch("5062951d", new Object[]{this, new Integer(i), obj});
        }
        if (i == 1) {
            this.key = (String) obj;
        } else if (i == 2) {
            this.val = (ByteString) obj;
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
        if (!(obj instanceof StrBinItem)) {
            return false;
        }
        StrBinItem strBinItem = (StrBinItem) obj;
        return equals(this.key, strBinItem.key) && equals(this.val, strBinItem.val);
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
        String str = this.key;
        int hashCode = (str != null ? str.hashCode() : 0) * 37;
        ByteString byteString = this.val;
        if (byteString != null) {
            i = byteString.hashCode();
        }
        int i3 = hashCode + i;
        this.hashCode = i3;
        return i3;
    }
}
