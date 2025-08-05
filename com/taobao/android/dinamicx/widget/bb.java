package com.taobao.android.dinamicx.widget;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class bb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f12075a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g = Integer.MIN_VALUE;
    public int h = Integer.MIN_VALUE;

    static {
        kge.a(-2121842657);
    }

    public bb a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bb) ipChange.ipc$dispatch("68323fa1", new Object[]{this});
        }
        bb bbVar = new bb();
        bbVar.d = this.d;
        bbVar.f12075a = this.f12075a;
        bbVar.c = this.c;
        bbVar.b = this.b;
        bbVar.f = this.f;
        bbVar.e = this.e;
        bbVar.h = this.h;
        bbVar.g = this.g;
        return bbVar;
    }
}
