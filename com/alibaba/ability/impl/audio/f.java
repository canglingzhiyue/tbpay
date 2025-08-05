package com.alibaba.ability.impl.audio;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.RateNode;
import com.taobao.avplayer.n;
import java.util.Map;
import kotlin.collections.ai;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes2.dex */
public final class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public float f1852a = 1.0f;

    static {
        kge.a(-1730397753);
    }

    public final void a(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        Float a2 = com.alibaba.ability.e.a(map, RateNode.TAG, (Float) null);
        if (a2 == null) {
            return;
        }
        float floatValue = a2.floatValue();
        if (floatValue >= 0.5f && floatValue <= 2.0f) {
            this.f1852a = floatValue;
            return;
        }
        throw new RuntimeException("rate value invalid:" + floatValue);
    }

    public final void a(n instance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a932e31", new Object[]{this, instance});
            return;
        }
        q.d(instance, "instance");
        instance.a(this.f1852a);
    }

    public final JSONObject a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this}) : new JSONObject(ai.b(kotlin.j.a(RateNode.TAG, Float.valueOf(this.f1852a))));
    }
}
