package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.android.behavir.event.BHREvent;
import com.taobao.android.behavir.solution.BHRSolution;
import com.taobao.android.behavir.solution.f;
import com.taobao.android.behavir.util.d;
import com.taobao.android.testutils.log.LogUtils;
import com.taobao.android.upp.e;
import com.taobao.android.xsearchplugin.jarvis.utils.JarvisConstant;
import com.taobao.tao.powermsg.model.a;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.global.SDKUtils;

/* loaded from: classes4.dex */
public class dqx extends dqy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE = "python_solution";
    private BHRSolution e;

    static {
        kge.a(-481945243);
    }

    public static /* synthetic */ Object ipc$super(dqx dqxVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -989055802) {
            super.c((JSONObject) objArr[0]);
            return null;
        } else if (hashCode == 92838762) {
            super.c();
            return null;
        } else if (hashCode != 643748197) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.d((JSONObject) objArr[0]);
            return null;
        }
    }

    public dqx(BHRSolution bHRSolution, BHRTaskConfigBase bHRTaskConfigBase, BHREvent bHREvent) {
        super(bHRTaskConfigBase, bHREvent);
        this.e = null;
        this.e = bHRSolution;
    }

    @Override // tb.dqy, tb.dqu
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            b((Map<String, Object>) jSONObject);
        }
    }

    @Override // tb.dqu, tb.dqz
    public final void c() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        BHRSolution bHRSolution = this.e;
        if (bHRSolution != null && bHRSolution.c()) {
            z = true;
        }
        if (z) {
            this.e.a((dqi) g(), new Runnable() { // from class: tb.dqx.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        dqx.this.d();
                    } catch (Throwable th) {
                        d.a(dqx.TYPE, "0", th.getMessage());
                        d.a(dqx.TYPE, th);
                    }
                }
            });
        } else {
            d();
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        BHRSolution bHRSolution = this.e;
        return bHRSolution != null && bHRSolution.f(g());
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!b()) {
            LogUtils.b("task", TYPE, e.KEY_SOLUTION_RUNNABLE_STEP, "10006 solution执行runnable结束，返回false");
        } else {
            LogUtils.c("task", TYPE, e.KEY_SOLUTION_RUNNABLE_STEP, "10006 solution执行runnable结束，返回true");
            super.c();
        }
    }

    @Override // tb.dqy, tb.dqu
    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else {
            b((Map<String, Object>) jSONObject);
        }
    }

    @Override // tb.dqy, tb.dqw
    public Map<String, Object> C_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a41afff8", new Object[]{this});
        }
        HashMap<String, Object> i = e().i(g());
        if (this.b != null) {
            i.put("triggerEvent", this.b.toJsonObject().toJSONString());
        }
        i.put(JarvisConstant.KEY_JARVIS_TRIGGER, "BehaviR");
        i.put("userId", dsj.f26943a);
        i.put(a.COL_S_TIME, Long.valueOf(SDKUtils.getCorrectionTimeMillis()));
        if (this.c != null) {
            i.put("triggerName", this.c.getConfigName());
        }
        LogUtils.c("task", TYPE, LogUtils.BEHAVIR_TASK_EXECUTE, LogUtils.BEHAVIR_TASK_GET_INPUT, "10008 solution 执行getInput结束");
        return i;
    }

    public void b(final Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
            return;
        }
        BHRSolution<HashMap<String, Object>, Map<String, Object>> e = e();
        if (e == null) {
            return;
        }
        if (e.c()) {
            e.a(g(), new Runnable() { // from class: tb.dqx.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        dqx.this.e().a((dqi) dqx.this.g(), (f) map);
                    } catch (Throwable th) {
                        d.a(dqx.TYPE, "0", th.getMessage());
                        d.a(dqx.TYPE, th);
                    }
                }
            });
        } else {
            e().a((dqi) g(), (f) map);
        }
    }

    public BHRSolution<HashMap<String, Object>, Map<String, Object>> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BHRSolution) ipChange.ipc$dispatch("3d94accf", new Object[]{this}) : this.e;
    }

    @Override // tb.dqu
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            LogUtils.c("task", TYPE, LogUtils.BEHAVIR_TASK_EXECUTE, LogUtils.BEHAVIR_TASK_EXECUTE, "10004 找到Solution，开始执行Solution");
        }
    }

    private JSONObject a(JSONObject jSONObject, BHRSolution bHRSolution) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("d97340b", new Object[]{this, jSONObject, bHRSolution}) : (bHRSolution == null || bHRSolution.h(g()) == null) ? jSONObject : new JSONObject(bHRSolution.h(g()));
    }

    @Override // tb.dqu
    public void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
        } else {
            super.c(a(jSONObject, this.e));
        }
    }

    @Override // tb.dqu
    public void d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265ed165", new Object[]{this, jSONObject});
        } else {
            super.d(a(jSONObject, this.e));
        }
    }
}
