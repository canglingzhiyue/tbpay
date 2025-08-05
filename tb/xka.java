package tb;

import android.os.Handler;
import android.view.WindowManager;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.JvmUncaughtCrashListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class xka implements JvmUncaughtCrashListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final jdy f34345a;

    public xka(jdy jdyVar) {
        this.f34345a = jdyVar;
    }

    @Override // com.taobao.android.tcrash.JvmUncaughtCrashListener
    public Map<String, Object> onJvmUncaughtCrash(Thread thread, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d9b5b942", new Object[]{this, thread, th});
        }
        if (!this.f34345a.d().a("OpenBadTokenInfo", true) || !(th instanceof WindowManager.BadTokenException)) {
            return null;
        }
        try {
            Handler.Callback callback = (Handler.Callback) jgp.a(Class.forName(ProcessUtils.ACTIVITY_THREAD)).c(ProcessUtils.CURRENT_ACTIVITY_THREAD).a("mH").a("mCallback").a();
            if (callback == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("mH.mCallback", callback.getClass().getName());
            return hashMap;
        } catch (Throwable th2) {
            jfj.b(th2);
            return null;
        }
    }
}
