package com.alibaba.android.aura.datamodel.rule;

import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "fields")

    /* renamed from: a  reason: collision with root package name */
    public Map<String, Object> f2137a;
    @JSONField(name = "events")
    public Map<String, List<Event>> b;
    public Map<String, Object> c;

    static {
        kge.a(676144659);
    }

    public b(Map<String, Object> map, Map<String, List<Event>> map2, Map<String, Object> map3) {
        this.f2137a = map;
        this.b = map2;
        this.c = map3;
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("5e4ee9ef", new Object[0]) : new b(null, null, null);
    }
}
