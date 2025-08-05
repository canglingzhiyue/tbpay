package com.alibaba.android.ultron.engine.protocol;

import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class UltronProtocol extends BaseProtocol {
    public Container container;
    public Map<String, Component> data;
    public EndPoint endpoint;
    public Global global;
    public Hierarchy hierarchy;
    public Linkage linkage;
    public Boolean reload = true;

    static {
        kge.a(621736112);
    }
}
