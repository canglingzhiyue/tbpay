package com.taobao.android.behavix.task;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f9208a;
    public BehaviXTaskType b;
    public b c;
    public Map<String, Object> d;
    public long e = 0;

    static {
        kge.a(-81015171);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    public a(BehaviXTaskType behaviXTaskType, Map<String, Object> map, b bVar) {
        this.b = behaviXTaskType;
        this.c = bVar;
        this.d = map;
        if (map != null) {
            this.f9208a = (JSONObject) map.get("taskConfig");
        }
    }
}
