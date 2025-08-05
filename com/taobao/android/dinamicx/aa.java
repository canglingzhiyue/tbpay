package com.taobao.android.dinamicx;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class aa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public float f11791a = 0.0f;
    public float b = 0.0f;
    public float c = 0.0f;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f = 0.0f;
    public float g = 0.0f;
    public String h = "";
    public String i = "";
    public boolean j = false;
    public int k = 0;
    public int l = 0;

    static {
        kge.a(-1624937080);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "\n load=" + this.f11791a + "\n parser=" + this.b + "\n measure=" + this.c + "\n layout=" + this.d + "\n flatten=" + this.e + "\n render=" + this.f + "\n countTime=" + this.g + "\n createViewInfo(createCount " + this.k + " reuseCount " + this.l + ") " + this.h + "\n renderViewInfo" + this.i + "\n isHitCache=" + this.j;
    }
}
