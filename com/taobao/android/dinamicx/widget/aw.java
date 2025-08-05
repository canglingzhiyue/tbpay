package com.taobao.android.dinamicx.widget;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class aw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public float f12068a = 0.0f;
    public float b = 0.0f;
    public float c = 1.0f;
    public float d = 1.0f;
    public float e = 0.0f;
    public float f = 0.0f;
    public float g = 0.0f;

    static {
        kge.a(267454774);
    }

    public aw a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aw) ipChange.ipc$dispatch("68323e6b", new Object[]{this});
        }
        aw awVar = new aw();
        awVar.f12068a = this.f12068a;
        awVar.b = this.b;
        awVar.c = this.c;
        awVar.d = this.d;
        awVar.e = this.e;
        awVar.f = this.f;
        awVar.g = this.g;
        return awVar;
    }
}
