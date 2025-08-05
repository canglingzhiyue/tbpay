package com.taobao.android.fluid.launcher.task;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.kge;

/* loaded from: classes5.dex */
public class FluidTaskConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String THREAD_MODE_BACKGROUND = "background";
    public static final String THREAD_MODE_MAIN = "main";

    /* renamed from: a  reason: collision with root package name */
    public String f12651a;
    public long b;
    public String c;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface ThreadMode {
    }

    static {
        kge.a(-1106197570);
    }

    public FluidTaskConfig() {
        this.b = 0L;
    }

    public FluidTaskConfig(String str, long j, String str2) {
        this.b = 0L;
        this.f12651a = str;
        this.b = j;
        this.c = str2;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.f12651a + "_" + this.b + "_" + this.c;
    }
}
