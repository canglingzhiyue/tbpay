package com.alipay.zoloz.toyger.algorithm;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class CacheObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f6267a;
    private Object b;

    public Object getCacheObject() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("1b28ce40", new Object[]{this}) : this.b;
    }

    public void setCacheObject(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79bfbf02", new Object[]{this, obj});
        } else {
            this.b = obj;
        }
    }

    public boolean isUsing() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("278f8105", new Object[]{this})).booleanValue() : this.f6267a;
    }

    public void setUsing(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("655b5b2b", new Object[]{this, new Boolean(z)});
        } else {
            this.f6267a = z;
        }
    }
}
