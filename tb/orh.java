package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.utils.n;
import com.taobao.monitor.procedure.g;
import com.taobao.monitor.procedure.p;
import com.taobao.monitor.procedure.r;
import com.taobao.tao.log.TLog;
import com.taobao.tao.log.statistics.d;
import com.taobao.tao.recommend3.tracelog.TraceModel;
import com.taobao.tao.recommend3.tracelog.c;
import com.taobao.tao.recommend3.tracelog.f;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class orh extends org {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static AtomicBoolean b;
    private Map<String, Object> c;
    private Map<String, Object> d;
    private g e;

    public static /* synthetic */ Object ipc$super(orh orhVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(-745269209);
        b = new AtomicBoolean(false);
    }

    private orh(String str) {
        super(str);
        this.c = new HashMap();
        this.d = new HashMap();
    }

    public static void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d483649", new Object[]{fVar});
        } else if (!b()) {
        } else {
            fVar.a("ApmVirtualPageInterceptor", new orh(fVar.a()));
            TLog.loge("home", "GlobalTrace", "register interceptor success, name=ApmVirtualPageInterceptor");
        }
    }

    private static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : !n.k();
    }

    @Override // tb.org
    public boolean a(TraceModel traceModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1c350fb", new Object[]{this, traceModel, new Boolean(z)})).booleanValue();
        }
        if (z) {
            return false;
        }
        return traceModel.getPriority() != 4 && !StringUtils.isEmpty(traceModel.getName());
    }

    @Override // tb.org
    public boolean b(TraceModel traceModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4efe027c", new Object[]{this, traceModel, new Boolean(z)})).booleanValue();
        }
        String name = traceModel.getName();
        long costTime = traceModel.getCostTime();
        Map<String, Object> subProperties = traceModel.getSubProperties();
        if (name.startsWith("homeLoading")) {
            Object obj = this.d.get(name);
            this.d.put(name, Long.valueOf(obj != null ? (Long.parseLong(obj.toString()) + costTime) / 2 : costTime));
            if (subProperties != null && subProperties.size() > 0) {
                for (String str : subProperties.keySet()) {
                    if (str.startsWith("homeLoading")) {
                        this.d.put(str, Long.valueOf(costTime));
                        TLog.loge("home", "GlobalTrace", str + ", cost=" + costTime);
                    } else {
                        Object obj2 = subProperties.get(str);
                        if (obj2 != null) {
                            this.d.put(str, obj2);
                            TLog.loge("home", "GlobalTrace", str + ", value=" + obj2);
                        }
                    }
                }
            }
            String str2 = name + "Count";
            Object obj3 = this.d.get(str2);
            this.d.put(str2, Integer.valueOf(obj3 == null ? 1 : Integer.parseInt(obj3.toString()) + 1));
        } else if (!b.get() && !this.c.containsKey(name)) {
            this.c.put(name, Long.valueOf(costTime));
            if (subProperties != null && !subProperties.isEmpty()) {
                this.c.putAll(subProperties);
            }
        } else if (b.get() && !this.d.containsKey(name) && !this.c.containsKey(name)) {
            this.d.put(name, Long.valueOf(costTime));
            if (subProperties != null && !subProperties.isEmpty()) {
                this.d.putAll(subProperties);
            }
        }
        a(name);
        return true;
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (StringUtils.equals("homeFragmentOnStart", str)) {
            this.e = c();
            this.e.a("HomePageLauncherAllStages");
            this.e.a("HomePageScrollAllStages");
        } else if (!StringUtils.equals("homeFragmentOnStop", str) || this.e == null) {
        } else {
            if (b.compareAndSet(false, true)) {
                this.e.e("HomePageLauncherAllStages", this.c);
                z = true;
            }
            if (!this.d.isEmpty()) {
                this.e.e("HomePageScrollAllStages", new HashMap(this.d));
                this.d.clear();
                z = true;
            }
            if (!z) {
                return;
            }
            this.e.d();
        }
    }

    private g c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("3cf10f58", new Object[]{this});
        }
        p a2 = new p.a().b(false).a(true).c(true).a((g) null).a();
        r rVar = r.f18232a;
        g a3 = rVar.a("ALI_APM/" + kst.c() + "/monitor/procedure/pageLoad", a2);
        a3.b();
        a3.a("pageName", "VirtualHomeGlobalTrace");
        a3.a("launchTime", Long.valueOf(c.b()));
        a3.a(d.PARAM_IS_DEBUG, Boolean.valueOf(jqm.a()));
        a3.a("isFirstLaunch", Boolean.valueOf(c.a("isFirstLaunch", false)));
        a3.a("isFullNewInstall", Boolean.valueOf(c.a("isFullNewInstall", false)));
        a3.a("launchType", c.a("launchType", ""));
        return a3;
    }
}
