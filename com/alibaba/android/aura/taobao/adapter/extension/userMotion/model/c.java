package com.alibaba.android.aura.taobao.adapter.extension.userMotion.model;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class c extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String b = UserMotionEventType.COMPONENT_CLICK;
    private AURARenderComponent c;
    private String d;

    static {
        kge.a(755654786);
    }

    public static c a(AURARenderComponent aURARenderComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("d12d1fb3", new Object[]{aURARenderComponent, str});
        }
        c cVar = new c();
        cVar.c = aURARenderComponent;
        cVar.d = str;
        return cVar;
    }
}
