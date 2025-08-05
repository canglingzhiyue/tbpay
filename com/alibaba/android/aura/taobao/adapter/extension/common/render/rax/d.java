package com.alibaba.android.aura.taobao.adapter.extension.common.render.rax;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import tb.bse;
import tb.bsu;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class d implements bse.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f2193a = "RaxFloatCloseListener";
    private AURARenderComponent b;
    private final com.alibaba.android.umf.taobao.adapter.widget.floatview.a c;

    static {
        kge.a(493549208);
        kge.a(-1501521857);
    }

    public abstract boolean a(List<Event> list, AURARenderComponent aURARenderComponent);

    public d(com.alibaba.android.umf.taobao.adapter.widget.floatview.a aVar) {
        this.c = aVar;
    }

    public void a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca7f23d3", new Object[]{this, aURARenderComponent});
        } else {
            this.b = aURARenderComponent;
        }
    }

    @Override // tb.bse.a
    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        AURARenderComponent aURARenderComponent = this.b;
        if (aURARenderComponent == null) {
            a("mRenderComponent is null");
            return false;
        } else if (this.c == null) {
            a("mFloatView is null");
            return false;
        } else {
            AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
            if (aURARenderComponentData == null) {
                a("componentData is null");
                return false;
            }
            Map<String, List<Event>> map = aURARenderComponentData.events;
            if (map == null || map.isEmpty()) {
                a("events is empty");
                return false;
            }
            List<Event> list = map.get("cancel");
            if (list == null || list.isEmpty()) {
                a("events is empty");
                return false;
            }
            return a(list, this.b);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            bsu.a("UMFFramework", "RaxFloatCloseListener", "umf-rax-close", str);
        }
    }
}
