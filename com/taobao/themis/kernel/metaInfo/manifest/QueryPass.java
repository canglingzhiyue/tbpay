package com.taobao.themis.kernel.metaInfo.manifest;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes9.dex */
public final class QueryPass implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<String> allow;
    private List<String> ignore;

    static {
        kge.a(647968505);
        kge.a(1028243835);
    }

    public final List<String> getAllow() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("7aabfe6d", new Object[]{this}) : this.allow;
    }

    public final void setAllow(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff5a3dff", new Object[]{this, list});
        } else {
            this.allow = list;
        }
    }

    public final List<String> getIgnore() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("405c2918", new Object[]{this}) : this.ignore;
    }

    public final void setIgnore(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95a1c64c", new Object[]{this, list});
        } else {
            this.ignore = list;
        }
    }
}
