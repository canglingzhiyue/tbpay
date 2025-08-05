package com.taobao.android.detail2.core.framework.base.media.videodecide;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f11475a;
    public boolean b;
    public float c;
    public float d;
    public int e = 0;
    public float f = -1.0f;
    public float g = -1.0f;

    static {
        kge.a(941014281);
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
            this.g = b.a();
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
