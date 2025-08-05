package com.alibaba.appmonitor.pool;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class ReuseJSONObject extends JSONObject implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 1465414806753619992L;

    static {
        kge.a(-1989194083);
        kge.a(1105107017);
    }

    public static /* synthetic */ Object ipc$super(ReuseJSONObject reuseJSONObject, String str, Object... objArr) {
        if (str.hashCode() == -1272099756) {
            super.clear();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.appmonitor.pool.b
    public void fill(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7129a67", new Object[]{this, objArr});
        }
    }

    @Override // com.alibaba.appmonitor.pool.b
    public void clean() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f4ee50", new Object[]{this});
            return;
        }
        for (Object obj : values()) {
            if (obj instanceof b) {
                a.a().a((a) ((b) obj));
            }
        }
        super.clear();
    }
}
