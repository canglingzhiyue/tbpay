package com.alibaba.android.ultron.engine.protocol;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class Data extends BaseProtocol {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, Component> components;

    static {
        kge.a(-1143425362);
    }

    private Data(Map<String, Component> map) {
        this.components = map;
    }

    public static Data of(Map<String, Component> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Data) ipChange.ipc$dispatch("220dc62a", new Object[]{map}) : new Data(map);
    }
}
