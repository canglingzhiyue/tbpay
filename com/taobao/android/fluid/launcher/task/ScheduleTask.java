package com.taobao.android.fluid.launcher.task;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.utils.ac;
import com.taobao.taolive.sdk.utils.q;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.kge;
import tb.rhi;

/* loaded from: classes5.dex */
public final class ScheduleTask implements b, Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TASK_STATE_CANCEL = "cancel";
    public static final String TASK_STATE_COMPLETE = "complete";
    public static final String TASK_STATE_ERROR = "error";
    public static final String TASK_STATE_INIT = "init";
    public static final String TASK_STATE_START = "start";
    public static final String TASK_STATE_SUBMIT = "submit";

    /* renamed from: a  reason: collision with root package name */
    private final String f12652a;
    private final a b;
    private final FluidTaskConfig c;
    private final String e;
    private String d = "init";
    private long f = -1;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface TaskState {
    }

    static {
        kge.a(148028079);
        kge.a(-195320069);
        kge.a(-1390502639);
    }

    public ScheduleTask(String str, a aVar, FluidTaskConfig fluidTaskConfig) {
        this.f12652a = str;
        this.b = aVar;
        this.c = fluidTaskConfig;
        this.e = aVar.f() + "@" + hashCode();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.b.a();
        this.d = "submit";
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.b.b();
        this.d = "start";
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.b.c();
        this.d = "complete";
        rhi.a(this);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.b.d();
        this.d = "cancel";
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.b.e();
        this.d = "error";
        rhi.a(this);
    }

    @Override // com.taobao.android.fluid.launcher.task.b
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            this.b.g();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        ac.a("FluidScheduleTask", f());
        q.b("ScheduleTask", "任务执行开始：" + this.e);
        b();
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            g();
            this.f = SystemClock.uptimeMillis() - uptimeMillis;
            c();
            q.b("ScheduleTask", "任务执行结束：" + this.e);
        } catch (Exception e) {
            e();
            q.a("ScheduleTask", " 任务执行异常：" + this.e, e);
        }
        ac.a();
    }

    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.f12652a;
    }

    @Override // com.taobao.android.fluid.launcher.task.b
    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.b.f();
    }

    public String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : this.e;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this}) : this.d;
    }

    public long k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95766", new Object[]{this})).longValue() : this.f;
    }

    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77b5ea0d", new Object[]{this});
        }
        FluidTaskConfig fluidTaskConfig = this.c;
        return fluidTaskConfig == null ? "main" : fluidTaskConfig.c;
    }

    public long m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6158668", new Object[]{this})).longValue();
        }
        FluidTaskConfig fluidTaskConfig = this.c;
        if (fluidTaskConfig != null) {
            return fluidTaskConfig.b;
        }
        return 0L;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "[ " + this.e + " | " + l() + " | " + m() + " | " + this.d + " | " + this.f + " ]";
    }
}
