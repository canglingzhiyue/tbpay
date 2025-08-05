package com.alibaba.appmonitor.event;

import com.alibaba.appmonitor.pool.ReuseJSONObject;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.adapter.IWXUserTrackAdapter;
import tb.kge;

/* loaded from: classes.dex */
public abstract class d implements com.alibaba.appmonitor.pool.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String e;
    public String f;
    public String g;
    public int h;
    public long i = Long.MAX_VALUE;
    public long j = 0;

    static {
        kge.a(-1334241232);
        kge.a(1105107017);
    }

    public JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this});
        }
        JSONObject jSONObject = (JSONObject) com.alibaba.appmonitor.pool.a.a().a(ReuseJSONObject.class, new Object[0]);
        jSONObject.put("page", (Object) this.e);
        jSONObject.put("monitorPoint", (Object) this.f);
        jSONObject.put("begin", (Object) Long.valueOf(this.i));
        jSONObject.put("end", (Object) Long.valueOf(this.j));
        String str = this.g;
        if (str != null) {
            jSONObject.put(IWXUserTrackAdapter.MONITOR_ARG, (Object) str);
        }
        return jSONObject;
    }

    @Override // com.alibaba.appmonitor.pool.b
    public void clean() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f4ee50", new Object[]{this});
            return;
        }
        this.h = 0;
        this.e = null;
        this.f = null;
        this.g = null;
        this.i = Long.MAX_VALUE;
        this.j = 0L;
    }

    @Override // com.alibaba.appmonitor.pool.b
    public void fill(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7129a67", new Object[]{this, objArr});
            return;
        }
        this.h = ((Integer) objArr[0]).intValue();
        this.e = (String) objArr[1];
        this.f = (String) objArr[2];
        if (objArr.length <= 3 || objArr[3] == null) {
            return;
        }
        this.g = (String) objArr[3];
    }

    public void c(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7808bfa9", new Object[]{this, l});
            return;
        }
        if (l == null) {
            l = Long.valueOf(System.currentTimeMillis() / 1000);
        }
        if (this.i > l.longValue()) {
            this.i = l.longValue();
        }
        if (this.j >= l.longValue()) {
            return;
        }
        this.j = l.longValue();
    }
}
