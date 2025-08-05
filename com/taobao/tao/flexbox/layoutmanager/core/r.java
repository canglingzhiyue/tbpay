package com.taobao.tao.flexbox.layoutmanager.core;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.oeb;
import tb.riy;

/* loaded from: classes8.dex */
public class r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f20361a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    private int f;
    private int g;
    private int h;
    private int i;
    private a j = null;

    /* loaded from: classes8.dex */
    public interface a {
    }

    static {
        kge.a(509604244);
    }

    public void a(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d162128", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        if (this.f != i || this.g != i2 || this.h != i3 || this.i != i4) {
            this.f20361a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }
        if (oeb.f()) {
            this.f20361a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = i4;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "[width = " + this.f20361a + ",height=" + this.b + ",x=" + this.c + ",y=" + this.d + riy.ARRAY_END_STR;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.f20361a == rVar.f20361a && this.b == rVar.b && this.c == rVar.c && this.d == rVar.d && this.e == rVar.e) {
                return true;
            }
        }
        return false;
    }
}
