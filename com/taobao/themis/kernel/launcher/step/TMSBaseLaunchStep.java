package com.taobao.themis.kernel.launcher.step;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.e;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.utils.d;
import com.taobao.themis.kernel.utils.n;
import kotlin.Pair;
import tb.kge;
import tb.qpp;
import tb.qpr;

/* loaded from: classes9.dex */
public abstract class TMSBaseLaunchStep {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public f f22538a;
    public qpp b;
    public String c;
    private TMSBaseLaunchStep d;
    private qpr e;
    public String f;
    public e h;
    public final Long o = Long.valueOf(d.a());
    public String g = "Themis/Launch/" + a();
    public Status i = Status.BEFORE_EXECUTE;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public enum Status {
        BEFORE_EXECUTE,
        EXECUTING,
        SUCCESS,
        ERROR
    }

    static {
        kge.a(1030100474);
    }

    public abstract String a();

    public abstract void d();

    public abstract void j();

    public abstract void k();

    public TMSBaseLaunchStep(f fVar, qpr qprVar, qpp qppVar) {
        this.f22538a = fVar;
        this.b = qppVar;
        this.e = qprVar;
        this.f = com.taobao.themis.kernel.logger.b.a(this.f22538a);
        this.c = com.taobao.themis.kernel.logger.a.a(this.f);
    }

    public TMSBaseLaunchStep a(TMSBaseLaunchStep tMSBaseLaunchStep) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSBaseLaunchStep) ipChange.ipc$dispatch("3e1eaece", new Object[]{this, tMSBaseLaunchStep});
        }
        this.d = tMSBaseLaunchStep;
        return this.d;
    }

    public qpr i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qpr) ipChange.ipc$dispatch("4c96e043", new Object[]{this}) : this.e;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.i = Status.EXECUTING;
        com.taobao.themis.kernel.logger.a.a(this.g, com.taobao.themis.kernel.logger.a.EVENT_ON_EXECUTE, this.f, this.c, new JSONObject());
        d.a(a() + "#onBeforeExecute", (Pair<String, String>) null, (Pair<String, String>) null);
        j();
        d.a(a() + "#onBeforeExecute");
        TMSLogger.d("TMSLaunchStep", a());
        d.a(a() + "#onExecuting", this.o.longValue(), (Pair<String, String>) null);
        d.a(a() + "#onExecuting", this.o.longValue());
        d();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        d.b(a() + "#onExecuting", this.o.longValue(), null);
        if (this.i != Status.EXECUTING) {
            return;
        }
        this.i = Status.SUCCESS;
        com.taobao.themis.kernel.logger.a.a(this.g, com.taobao.themis.kernel.logger.a.EVENT_ON_SUCCESS, this.f, this.c, new JSONObject());
        d.a(a() + "#onAfterExecute", (Pair<String, String>) null, (Pair<String, String>) null);
        k();
        d.a(a() + "#onAfterExecute");
        e();
    }

    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0cb15ce", new Object[]{this, eVar});
            return;
        }
        d.b(a() + "#onExecuting", this.o.longValue(), null);
        if (n.bG()) {
            if (this.i == Status.ERROR) {
                return;
            }
        } else if (this.i != Status.EXECUTING) {
            return;
        }
        this.i = Status.ERROR;
        qpp qppVar = this.b;
        if (qppVar != null) {
            qppVar.a(eVar);
        }
        this.h = eVar;
        d.a(a() + "#onAfterExecute", (Pair<String, String>) null, (Pair<String, String>) null);
        k();
        d.a(a() + "#onAfterExecute");
        com.taobao.themis.kernel.logger.a.c(this.g, com.taobao.themis.kernel.logger.a.EVENT_ON_ERROR, this.f, this.c, com.taobao.themis.kernel.utils.f.a(new Pair("errorCode", eVar.d), new Pair("errorMsg", eVar.e)));
    }

    public void e() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        boolean z2 = this.d == null;
        if (this.b != null) {
            z = true;
        }
        if (z2 & z) {
            this.b.b();
        }
        TMSBaseLaunchStep tMSBaseLaunchStep = this.d;
        if (tMSBaseLaunchStep == null) {
            return;
        }
        tMSBaseLaunchStep.b();
    }
}
