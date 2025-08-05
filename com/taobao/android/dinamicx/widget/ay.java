package com.taobao.android.dinamicx.widget;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import tb.kge;

/* loaded from: classes5.dex */
public class ay {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f12070a = 0;
    public int b = 0;
    public int c = 0;
    public float d = 1.0f;
    public int e = 0;
    public DXWidgetNode.b f;

    static {
        kge.a(-1440913031);
    }

    public ay a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ay) ipChange.ipc$dispatch("68323ea9", new Object[]{this});
        }
        ay ayVar = new ay();
        ayVar.f12070a = this.f12070a;
        ayVar.b = this.b;
        ayVar.c = this.c;
        ayVar.d = this.d;
        ayVar.e = this.e;
        ayVar.f = this.f;
        return ayVar;
    }
}
