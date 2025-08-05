package com.taobao.android.live.plugin.atype.flexalocal.good.view.search;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.Objects;
import tb.kge;

/* loaded from: classes6.dex */
public class SearchHistory implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String key;

    static {
        kge.a(-1813363831);
        kge.a(-540945145);
    }

    public SearchHistory() {
    }

    public SearchHistory(String str) {
        this.key = str;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof SearchHistory) {
            return TextUtils.equals(this.key, ((SearchHistory) obj).key);
        }
        return false;
    }

    public String getKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("16c52370", new Object[]{this}) : this.key;
    }

    public void setKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b06c2d6e", new Object[]{this, str});
        } else {
            this.key = str;
        }
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : Objects.hash(this.key);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "SearchHistory{key='" + this.key + "'}";
    }
}
