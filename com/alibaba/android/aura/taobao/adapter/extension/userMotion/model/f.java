package com.alibaba.android.aura.taobao.adapter.extension.userMotion.model;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class f extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String b = "scroll";
    private int c = 0;
    private int d = 0;

    static {
        kge.a(-1851878528);
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.c;
    }

    public static f a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("f1447f05", new Object[]{new Integer(i), new Integer(i2)});
        }
        f fVar = new f();
        fVar.c = i;
        fVar.d = i2;
        return fVar;
    }
}
