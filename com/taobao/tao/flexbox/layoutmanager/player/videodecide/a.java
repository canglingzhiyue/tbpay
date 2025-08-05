package com.taobao.tao.flexbox.layoutmanager.player.videodecide;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f20477a;
    public boolean b;
    public float c;
    public float d;
    public int e;
    public float f;
    public float g;

    static {
        kge.a(-1209135515);
    }

    public a() {
        this.e = 0;
        this.f = -1.0f;
        this.g = -1.0f;
    }

    public a(boolean z, float f, int i, float f2, float f3, float f4) {
        this.e = 0;
        this.f = -1.0f;
        this.g = -1.0f;
        this.b = z;
        this.c = f2;
        this.d = f;
        this.e = i;
        this.f = f3;
        this.g = f4;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (!this.b) {
            return false;
        }
        if (this.f <= 0.0f) {
            return true;
        }
        if (this.g < 0.0f) {
            this.g = c.b();
        }
        return this.g >= this.f;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ABNetAbr{enable=" + this.b + ", preLoadTime=" + this.c + ", ratio=" + this.d + ", netSpeedType=" + this.e + ", limitDeviceScore=" + this.f + '}';
    }
}
