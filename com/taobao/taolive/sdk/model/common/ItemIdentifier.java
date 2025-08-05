package com.taobao.taolive.sdk.model.common;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.Objects;
import tb.kge;

/* loaded from: classes8.dex */
public final class ItemIdentifier implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int goodsIndex;
    public String itemId;
    public int priority;
    public String trackInfo;
    public int type;

    static {
        kge.a(35609105);
        kge.a(-540945145);
    }

    public ItemIdentifier() {
    }

    public ItemIdentifier(int i, String str) {
        this.goodsIndex = i;
        this.itemId = str;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ItemIdentifier itemIdentifier = (ItemIdentifier) obj;
            if (this.goodsIndex == itemIdentifier.goodsIndex && this.itemId.equals(itemIdentifier.itemId)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : Objects.hash(Integer.valueOf(this.goodsIndex), this.itemId);
    }

    public boolean equals(int i, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1b9c438b", new Object[]{this, new Integer(i), str})).booleanValue() : this.goodsIndex == i && TextUtils.equals(this.itemId, str);
    }
}
