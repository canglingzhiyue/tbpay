package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.recommend3.tracelog.TraceModel;
import com.taobao.tao.recommend3.tracelog.c;
import com.taobao.tao.recommend3.tracelog.f;

/* loaded from: classes.dex */
public class orp extends org {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-76925389);
    }

    private static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        return true;
    }

    @Override // tb.org
    public boolean a(TraceModel traceModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1c350fb", new Object[]{this, traceModel, new Boolean(z)})).booleanValue();
        }
        return true;
    }

    private orp(String str) {
        super(str);
    }

    public static void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d483649", new Object[]{fVar});
        } else if (!b()) {
        } else {
            fVar.a("TLogInterceptor", new orp(fVar.a()));
            TLog.loge("home", "GlobalTrace", "register interceptor success, name=TLogInterceptor");
        }
    }

    @Override // tb.org
    public boolean b(TraceModel traceModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4efe027c", new Object[]{this, traceModel, new Boolean(z)})).booleanValue();
        }
        if (StringUtils.equals(traceModel.getName(), "homeFirstTouch")) {
            return false;
        }
        String str = traceModel.isLaunchStage() ? "launchStage[" : z ? "start[" : "end[";
        c.d(str + traceModel.getPriority() + "], " + traceModel);
        return true;
    }
}
