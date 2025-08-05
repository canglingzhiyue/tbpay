package com.alibaba.ariver.engine.api.bridge.model;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class LoadParams {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean forceLoad;
    public boolean isFirstLoad;
    public boolean isReload;
    public String url;

    static {
        kge.a(-132222567);
    }

    public LoadParams() {
    }

    public LoadParams(LoadParams loadParams) {
        this.url = loadParams.url;
        this.isFirstLoad = loadParams.isFirstLoad;
        this.isReload = loadParams.isReload;
        this.forceLoad = loadParams.forceLoad;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "LoadParams{url=" + this.url + '}';
    }
}
