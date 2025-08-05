package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.j;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.tao.log.TLog;
import com.taobao.tao.recommend3.tracelog.TraceModel;
import com.taobao.tao.recommend3.tracelog.c;
import com.taobao.tao.recommend3.tracelog.f;
import java.util.HashMap;

/* loaded from: classes.dex */
public class ori extends org {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1933519116);
    }

    public static /* synthetic */ Object ipc$super(ori oriVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ori(String str) {
        super(str);
    }

    public static void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d483649", new Object[]{fVar});
            return;
        }
        fVar.a("ClientToServiceStageInterceptor", new ori(fVar.a()));
        TLog.loge("home", "GlobalTrace", "register interceptor success, name=ClientToServiceStageInterceptor");
    }

    @Override // tb.org
    public boolean a(TraceModel traceModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1c350fb", new Object[]{this, traceModel, new Boolean(z)})).booleanValue();
        }
        if (!j.a("enableOpenStabilityMonitor", true)) {
            ldf.d("ClientToServiceStageInterceptor", "orange开关关闭");
            return false;
        }
        return "homeVisible".equals(traceModel.getName());
    }

    @Override // tb.org
    public boolean b(TraceModel traceModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4efe027c", new Object[]{this, traceModel, new Boolean(z)})).booleanValue();
        }
        a(traceModel.getCostTime(), traceModel.getEndTime() - c.a());
        return false;
    }

    private void a(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c11cae8", new Object[]{this, new Long(j), new Long(j2)});
            return;
        }
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("coldStartFromProcessStartTime", String.valueOf(j));
            hashMap.put("coldstartTime", String.valueOf(j2));
        } catch (Exception e) {
            TLog.loge("home", "GlobalTrace", "commitMonitorData occur Exception" + e);
        }
        HashMap hashMap2 = new HashMap(8);
        hashMap2.put(PopConst.POP_CLIENT_PARAMS_KEY, hashMap);
        kyh.a().b("nativeColdStart", ksk.NEW_FACE_PARENT.c, hashMap2);
        ldf.d("ClientToServiceStageInterceptor", "上传冷启时间");
    }
}
