package com.android.taobao.safeclean;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import tb.kge;

/* loaded from: classes.dex */
public class n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Boolean f6410a;

    static {
        kge.a(-1729892690);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (this.f6410a == null) {
            try {
                Class.forName(OrangeConfig.class.getName());
                this.f6410a = true;
            } catch (Throwable unused) {
                this.f6410a = false;
            }
        }
        return this.f6410a.booleanValue();
    }
}
