package com.taobao.themis.kernel.metaInfo.manifest;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes9.dex */
public final class ResourceManifest implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<String> assets;

    static {
        kge.a(710557277);
        kge.a(1028243835);
    }

    public final List<String> getAssets() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("e4b6cbc7", new Object[]{this}) : this.assets;
    }

    public final void setAssets(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c9b797d", new Object[]{this, list});
        } else {
            this.assets = list;
        }
    }
}
