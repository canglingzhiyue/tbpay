package com.alibaba.ability.impl.audio;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public final class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f1868a;
    public long b;
    public long c;
    public long d;

    static {
        kge.a(605938466);
    }

    public l(boolean z) {
        this.f1868a = z;
    }

    public static /* synthetic */ JSONObject a(l lVar, boolean z, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9d3ba798", new Object[]{lVar, new Boolean(z), new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            z = false;
        }
        return lVar.a(z);
    }

    public final JSONObject a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c357ce8c", new Object[]{this, new Boolean(z)});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("currentPosition", (Object) Long.valueOf(this.b));
        jSONObject.put("duration", (Object) Long.valueOf(this.d));
        jSONObject.put("cachePosition", (Object) Long.valueOf(this.c));
        if (!z) {
            jSONObject.put("isPlaying", (Object) Boolean.valueOf(this.f1868a));
        }
        return jSONObject;
    }
}
