package com.taobao.monitor;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.l;
import com.taobao.monitor.procedure.q;
import java.util.HashMap;
import java.util.Map;
import tb.mpi;

/* loaded from: classes.dex */
public class ProcedureGlobal {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context b;
    private final Handler c;
    private String f;

    /* renamed from: a  reason: collision with root package name */
    private static final ProcedureGlobal f18123a = new ProcedureGlobal();
    public static final l PROCEDURE_MANAGER = new l();
    public static final q PROCEDURE_FACTORY = new q();
    private final Map<String, Float> e = new HashMap();
    private final HandlerThread d = new HandlerThread("APM-Procedure");

    private ProcedureGlobal() {
        this.d.start();
        this.c = new Handler(this.d.getLooper());
    }

    public static ProcedureGlobal a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProcedureGlobal) ipChange.ipc$dispatch("555a9aef", new Object[0]) : f18123a;
    }

    public Context b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("9ee3f7e1", new Object[]{this}) : this.b;
    }

    public ProcedureGlobal a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ProcedureGlobal) ipChange.ipc$dispatch("1b4cdff7", new Object[]{this, context});
        }
        this.b = context;
        return this;
    }

    public Handler c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("a819f71c", new Object[]{this}) : this.c;
    }

    public HandlerThread d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HandlerThread) ipChange.ipc$dispatch("40c98111", new Object[]{this}) : this.d;
    }

    public float a(String str) {
        Float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c22", new Object[]{this, str})).floatValue();
        }
        if (StringUtils.isEmpty(str) || (f = this.e.get(str)) == null || f.floatValue() < 0.0f || f.floatValue() > 1.0f) {
            return 1.0f;
        }
        return f.floatValue();
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        try {
            this.e.clear();
            if (StringUtils.isEmpty(str)) {
                return;
            }
            String[] split = str.split(",");
            if (split.length <= 0) {
                return;
            }
            for (String str2 : split) {
                String[] split2 = str2.split(":");
                if (split2.length == 2 && !StringUtils.isEmpty(split2[0]) && !StringUtils.isEmpty(split2[1])) {
                    this.e.put(split2[0], Float.valueOf(a(split2[1], 1.0f)));
                    mpi.c("ProcedureGlobal", split2[0], split2[1]);
                }
            }
        } catch (Exception e) {
            mpi.c("ProcedureGlobal", "setSubTaskSample error", e.getMessage());
        }
    }

    private static float a(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123a1be", new Object[]{str, new Float(f)})).floatValue();
        }
        try {
            if (!StringUtils.isEmpty(str)) {
                return Float.parseFloat(str);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return f;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.f;
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }
}
