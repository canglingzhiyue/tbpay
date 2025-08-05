package com.taobao.android.dinamicx.widget;

import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.fqi;
import tb.kge;

/* loaded from: classes5.dex */
public class au {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f12066a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public String h;
    public String k;
    public String l;
    public Drawable m;
    public double g = 0.5d;
    public int i = 0;
    public int j = 2;
    public boolean n = true;
    public boolean o = true;
    public boolean p = true;
    public boolean q = false;
    public boolean r = false;

    static {
        kge.a(-1648588154);
    }

    public au() {
        this.c = -1;
        if (fqi.ab()) {
            this.c = 1;
        }
    }

    public au a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (au) ipChange.ipc$dispatch("68323e2d", new Object[]{this});
        }
        au auVar = new au();
        auVar.f12066a = this.f12066a;
        auVar.b = this.b;
        auVar.c = this.c;
        auVar.d = this.d;
        auVar.e = this.e;
        auVar.f = this.f;
        auVar.g = this.g;
        auVar.h = this.h;
        auVar.i = this.i;
        auVar.j = this.j;
        auVar.k = this.k;
        auVar.l = this.l;
        auVar.m = this.m;
        auVar.n = this.n;
        auVar.o = this.o;
        auVar.p = this.p;
        auVar.q = this.q;
        auVar.r = this.r;
        return auVar;
    }
}
