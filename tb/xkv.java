package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.j;
import com.taobao.tao.log.TLog;
import com.taobao.tao.recommend3.tracelog.TraceModel;
import com.taobao.tao.recommend3.tracelog.f;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes8.dex */
public class xkv extends org {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile xkv b;
    private Map<String, Long> c;

    static {
        kge.a(-805567817);
    }

    private xkv(String str) {
        super(str);
        this.c = new ConcurrentHashMap();
    }

    public static xkv b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (xkv) ipChange.ipc$dispatch("16be76fa", new Object[0]) : b;
    }

    public static void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d483649", new Object[]{fVar});
        } else if (!d()) {
        } else {
            b = new xkv(fVar.a());
            fVar.a("HomePageApmInterceptor", b);
            TLog.loge("home", "GlobalTrace", "register interceptor success, name=HomePageApmInterceptor");
        }
    }

    private static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : j.a("enableHomePageDataRecorder", true);
    }

    @Override // tb.org
    public boolean a(TraceModel traceModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1c350fb", new Object[]{this, traceModel, new Boolean(z)})).booleanValue();
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
        if (name.startsWith("homeLoading")) {
            return false;
        }
        if (z) {
            Map<String, Long> map = this.c;
            map.put(name + "_start", Long.valueOf(traceModel.getStartTime()));
        } else {
            Map<String, Long> map2 = this.c;
            map2.put(name + "_end", Long.valueOf(traceModel.getEndTime()));
        }
        return false;
    }

    public Map<String, Long> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this}) : this.c;
    }
}
