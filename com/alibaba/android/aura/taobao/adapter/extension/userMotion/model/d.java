package com.alibaba.android.aura.taobao.adapter.extension.userMotion.model;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class d extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private AURARenderComponent c;
    public final String b = UserMotionEventType.COMPONENT_DISAPPEAR;
    private int d = 0;

    static {
        kge.a(1314504135);
    }

    public static d a(AURARenderComponent aURARenderComponent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("f84544ff", new Object[]{aURARenderComponent, new Integer(i)});
        }
        d dVar = new d();
        dVar.c = aURARenderComponent;
        dVar.d = i;
        return dVar;
    }
}
