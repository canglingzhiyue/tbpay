package com.alibaba.triver.triver_shop.extension;

import com.alibaba.triver.kit.api.cache.d;
import com.alibaba.triver.triver_worker.v8worker.GetShopPluginResourcePoint;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes3.dex */
public class ShopPluginResourcePoint implements GetShopPluginResourcePoint, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(226209537);
        kge.a(-1621810670);
        kge.a(1028243835);
    }

    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
        }
    }

    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        }
    }

    public String getPluginIndexJs(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("635f9a9d", new Object[]{this, str}) : d.a(str, "index.js");
    }

    public String getPluginWorkerIndexJs(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("97502fb", new Object[]{this, str}) : d.a(str, "index.worker.js");
    }
}
