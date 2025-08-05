package com.taobao.message.lab.comfrm.inner2;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class CI<CONFIG, INSTANCE> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final CONFIG config;
    private final INSTANCE instance;

    static {
        kge.a(-1552888729);
    }

    public CI(CONFIG config, INSTANCE instance) {
        this.config = config;
        this.instance = instance;
    }

    public CONFIG getConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CONFIG) ipChange.ipc$dispatch("6363e53", new Object[]{this}) : this.config;
    }

    public INSTANCE getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (INSTANCE) ipChange.ipc$dispatch("186dc460", new Object[]{this}) : this.instance;
    }
}
