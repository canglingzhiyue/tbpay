package com.taobao.themis.kernel.metaInfo.manifest;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes9.dex */
public final class Solution implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String type;

    static {
        kge.a(-1753996423);
        kge.a(1028243835);
    }

    public final String getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this}) : this.type;
    }

    public final void setType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd56044d", new Object[]{this, str});
        } else {
            this.type = str;
        }
    }
}
