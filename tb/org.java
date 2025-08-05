package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.recommend3.tracelog.TraceModel;

/* loaded from: classes.dex */
public abstract class org {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int INTERCEPTOR_THREAD_ASYNC = 1;
    public static final int INTERCEPTOR_THREAD_CURRENT = 2;
    public static final int INTERCEPTOR_THREAD_MAIN = 3;

    /* renamed from: a  reason: collision with root package name */
    public String f32319a;

    static {
        kge.a(-1582810993);
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        return 1;
    }

    public abstract boolean a(TraceModel traceModel, boolean z);

    public abstract boolean b(TraceModel traceModel, boolean z);

    public org(String str) {
        this.f32319a = str;
    }

    public final boolean c(TraceModel traceModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc38b3fd", new Object[]{this, traceModel, new Boolean(z)})).booleanValue();
        }
        if (traceModel != null) {
            try {
                if (a(traceModel, z)) {
                    return b(traceModel, z);
                }
            } catch (Throwable th) {
                TLog.loge("home", "GlobalTrace", "do intercept error", th);
            }
        }
        return false;
    }
}
