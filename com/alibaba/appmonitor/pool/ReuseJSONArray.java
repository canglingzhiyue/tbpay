package com.alibaba.appmonitor.pool;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import tb.kge;

/* loaded from: classes2.dex */
public class ReuseJSONArray extends JSONArray implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = -4243576223670082606L;

    static {
        kge.a(1863050043);
        kge.a(1105107017);
    }

    public static /* synthetic */ Object ipc$super(ReuseJSONArray reuseJSONArray, String str, Object... objArr) {
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
        Iterator<Object> it = iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof b) {
                a.a().a((a) ((b) next));
            }
        }
        super.clear();
    }
}
