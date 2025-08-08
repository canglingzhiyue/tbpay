package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.adapter.c;
import com.taobao.monitor.procedure.s;
import com.taobao.tao.log.TLog;
import com.taobao.tao.recommend3.tracelog.TraceModel;
import com.taobao.tao.recommend3.tracelog.f;
import com.taobao.themis.kernel.i;
import java.util.Map;

/* loaded from: classes.dex */
public class orf extends org {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1278469815);
    }

    private static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ Object ipc$super(orf orfVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.org
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        return 2;
    }

    private orf(String str) {
        super(str);
    }

    public static void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d483649", new Object[]{fVar});
        } else if (!b()) {
        } else {
            fVar.a("APMLauncherInterceptor", new orf(fVar.a()));
            TLog.loge("home", "GlobalTrace", "register interceptor success, name=APMLauncherInterceptor");
        }
    }

    @Override // tb.org
    public boolean a(TraceModel traceModel, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c1c350fb", new Object[]{this, traceModel, new Boolean(z)})).booleanValue() : (!z && StringUtils.equals(traceModel.getName(), "homeSmoothInteractive")) || traceModel.getPriority() == 2;
    }

    @Override // tb.org
    public boolean b(TraceModel traceModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4efe027c", new Object[]{this, traceModel, new Boolean(z)})).booleanValue();
        }
        String name = traceModel.getName();
        if (StringUtils.equals(name, "homeSmoothInteractive")) {
            s.f18233a.d().a("smoothInteractiveTime", traceModel.getEndTime());
            return true;
        }
        String a2 = a(traceModel, i.CDN_REQUEST_TYPE);
        if (!StringUtils.isEmpty(a2) && !StringUtils.equals("coldStart", a2) && !StringUtils.equals("loadCache", a2) && !StringUtils.equals("locationChange", a2)) {
            return false;
        }
        String str = "Home_" + name;
        if (z) {
            c.a(str);
        } else {
            String a3 = a(traceModel, com.taobao.tao.recommend3.tracelog.c.c(traceModel.getName()));
            if (StringUtils.isEmpty(a3) || Boolean.valueOf(a3).booleanValue()) {
                c.a(str, traceModel.getSubProperties());
            } else {
                c.a(str, this.f32319a, traceModel.getSubProperties());
            }
        }
        return true;
    }

    private String a(TraceModel traceModel, String str) {
        Map<String, Object> subProperties;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28a5ad79", new Object[]{this, traceModel, str});
        }
        if (traceModel != null && !StringUtils.isEmpty(str) && (subProperties = traceModel.getSubProperties()) != null && (obj = subProperties.get(str)) != null) {
            return obj.toString();
        }
        return null;
    }
}
