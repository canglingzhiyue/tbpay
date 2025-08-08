package com.taobao.android.dinamicx;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes.dex */
public class q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private bm f11917a;
    final Map<Float, Float> b = new ConcurrentHashMap(512);

    static {
        kge.a(688485174);
    }

    public q(bm bmVar) {
        this.f11917a = bmVar;
    }

    public Float a(DXRuntimeContext dXRuntimeContext, Float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("230fef69", new Object[]{this, dXRuntimeContext, f});
        }
        if (dXRuntimeContext != null) {
            bm bmVar = this.f11917a;
            if (bmVar instanceof ca) {
                return Float.valueOf(((ca) bmVar).a(dXRuntimeContext, f.floatValue()));
            }
        }
        return a(f);
    }

    public Float a(Float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("c1a9a6ba", new Object[]{this, f});
        }
        if (this.b.containsKey(f)) {
            return this.b.get(f);
        }
        bm bmVar = this.f11917a;
        if (bmVar == null) {
            return f;
        }
        float a2 = bmVar.a(f.floatValue());
        this.b.put(f, Float.valueOf(a2));
        return Float.valueOf(a2);
    }
}
