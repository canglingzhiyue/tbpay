package com.taobao.android.behavir.solution;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfig;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.android.behavir.event.BHREvent;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.dqi;
import tb.kge;

/* loaded from: classes4.dex */
public class f implements dqi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f9144a;
    private final JSONObject b;
    private final Map<String, Object> c = new ConcurrentHashMap();
    private final BHREvent d;
    private final BHRTaskConfigBase e;

    static {
        kge.a(-815554184);
        kge.a(411261986);
    }

    public f(BHREvent bHREvent, BHRTaskConfigBase bHRTaskConfigBase) {
        this.d = bHREvent;
        this.e = bHRTaskConfigBase;
        this.b = bHRTaskConfigBase.getOriginal();
    }

    @Override // tb.dqi
    public JSONObject a() {
        BHREvent bHREvent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this});
        }
        if (this.f9144a == null && (bHREvent = this.d) != null) {
            this.f9144a = bHREvent.toJsonObject();
        }
        return this.f9144a;
    }

    @Override // tb.dqi
    public JSONObject b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this}) : this.b;
    }

    @Override // tb.dqi
    public Map<String, Object> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this}) : this.c;
    }

    public BHREvent d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BHREvent) ipChange.ipc$dispatch("e92bf11a", new Object[]{this}) : this.d;
    }

    public BHRTaskConfigBase e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BHRTaskConfigBase) ipChange.ipc$dispatch("4a02ec27", new Object[]{this});
        }
        BHRTaskConfigBase bHRTaskConfigBase = this.e;
        return bHRTaskConfigBase != null ? bHRTaskConfigBase : BHRTaskConfig.EMPTY_CONFIG;
    }
}
