package tb;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.launcher.task.FluidTaskConfig;
import com.taobao.android.fluid.launcher.task.ScheduleTask;
import com.taobao.android.fluid.launcher.task.a;
import com.taobao.taolive.sdk.utils.p;
import com.taobao.taolive.sdk.utils.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class rhb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final rhc f33152a;
    private final rhh b = new rhh();
    private final Map<String, FluidTaskConfig> d = new HashMap();
    private final List<ScheduleTask> c = new ArrayList();

    static {
        kge.a(-1420684941);
    }

    public static rhb a(Context context, rhc rhcVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rhb) ipChange.ipc$dispatch("19b436f7", new Object[]{context, rhcVar}) : new rhb(context, rhcVar);
    }

    private rhb(Context context, rhc rhcVar) {
        this.f33152a = rhcVar;
        a(rhcVar);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.b.a(this.c);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.b.b(this.c);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.b.a();
        q.b("FluidLauncher", "FluidLauncher 关闭任务调度器");
    }

    private void a(rhc rhcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd04f2cb", new Object[]{this, rhcVar});
            return;
        }
        c(rhcVar);
        b(rhcVar);
    }

    private void b(rhc rhcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb87f94c", new Object[]{this, rhcVar});
        } else if (rhcVar.b() != null) {
            for (a aVar : rhcVar.b().a()) {
                a(new ScheduleTask(rhcVar.a(), aVar, this.d.get(aVar.f())));
            }
        }
    }

    private void a(ScheduleTask scheduleTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ec118ca", new Object[]{this, scheduleTask});
        } else {
            this.c.add(scheduleTask);
        }
    }

    private Map<String, FluidTaskConfig> c(rhc rhcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("79c6e742", new Object[]{this, rhcVar});
        }
        List<FluidTaskConfig> a2 = a(rhcVar.a());
        if (a2 == null) {
            a2 = rhcVar.c().a();
            q.b("FluidLauncher", "FluidLauncher 从本地获取任务配置: " + a2);
        }
        for (FluidTaskConfig fluidTaskConfig : a2) {
            this.d.put(fluidTaskConfig.f12651a, fluidTaskConfig);
        }
        return this.d;
    }

    private List<FluidTaskConfig> a(String str) {
        Exception e;
        List<FluidTaskConfig> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{this, str});
        }
        String a2 = p.a("fluid_task_config", (String) null);
        if (a2 == null) {
            return null;
        }
        try {
            list = (List) JSON.parseObject(a2).get(str);
            try {
                q.b("FluidLauncher", "FluidLauncher 从远程获取任务配置: " + a2);
            } catch (Exception e2) {
                e = e2;
                q.a("FluidLauncher", "FluidLauncher 从远程获取任务配置失败", e);
                return list;
            }
        } catch (Exception e3) {
            e = e3;
            list = null;
        }
        return list;
    }
}
