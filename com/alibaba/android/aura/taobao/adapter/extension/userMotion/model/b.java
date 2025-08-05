package com.alibaba.android.aura.taobao.adapter.extension.userMotion.model;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class b extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private AURARenderComponent c;
    public final String b = UserMotionEventType.COMPONENT_APPEAR;
    private int d = 0;

    static {
        kge.a(-1652385287);
    }

    public static b a(AURARenderComponent aURARenderComponent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("f84544c1", new Object[]{aURARenderComponent, new Integer(i)});
        }
        b bVar = new b();
        bVar.c = aURARenderComponent;
        bVar.d = i;
        return bVar;
    }
}
