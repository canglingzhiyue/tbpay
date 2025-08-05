package com.taobao.weaver.prefetch;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes9.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, Object> d;
    public String e;
    private long f = -1;

    /* renamed from: a  reason: collision with root package name */
    public int f23472a = 10;
    public volatile int b = 1;
    public PerformanceData c = null;

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f23472a == 0) {
        } else {
            this.f = System.currentTimeMillis() + (this.f23472a * 1000);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.b == -1 || this.b <= 0) {
        } else {
            this.b--;
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.f != -1 && System.currentTimeMillis() > this.f;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.b == 0;
    }
}
