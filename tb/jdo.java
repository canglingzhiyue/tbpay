package tb;

import android.app.ActivityManager;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes6.dex */
public class jdo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final jdy b;
    private final jdv d;
    private final jgh e;

    /* renamed from: a  reason: collision with root package name */
    private String f29478a = null;
    private final jdr c = new jdr();

    /* loaded from: classes6.dex */
    public interface a {
        void onAnrHappened(boolean z);
    }

    /* loaded from: classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f29479a;
        public final a b;
        public final jga c;

        public b(int i, a aVar, jga jgaVar) {
            this.f29479a = i;
            this.b = aVar;
            this.c = jgaVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.f29479a--;
            if (jdo.a(jdo.this) == 1) {
                this.b.onAnrHappened(true);
            } else if (this.f29479a > 0) {
                jgb.a(this).a(500L).a(this.c).a();
            } else {
                this.b.onAnrHappened(false);
            }
        }
    }

    public static /* synthetic */ int a(jdo jdoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ef2b4436", new Object[]{jdoVar})).intValue() : jdoVar.b();
    }

    public static jdo a(jdy jdyVar, jgh jghVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jdo) ipChange.ipc$dispatch("76f5fa33", new Object[]{jdyVar, jghVar}) : new jdo(jdyVar, jghVar);
    }

    private jdo(jdy jdyVar, jgh jghVar) {
        this.b = jdyVar;
        this.d = jdyVar.d();
        this.e = jghVar;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04037a6", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            try {
                if (a()) {
                    aVar.onAnrHappened(true);
                    return;
                }
                jdp.a(this.b).b();
                b(aVar);
            } catch (Exception unused) {
            }
        }
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        Message a2 = this.c.a();
        if (a2 == null) {
            return false;
        }
        long when = a2.getWhen();
        if (when < 100) {
            return false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = 5000;
        if (this.d.a("LongMainThreadDuration", this.e.a()) && !num.b()) {
            j = 20000;
        }
        return uptimeMillis - when >= j;
    }

    private int b() {
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        ActivityManager activityManager = (ActivityManager) this.b.a().getSystemService("activity");
        if (activityManager == null) {
            return -1;
        }
        try {
            processesInErrorState = activityManager.getProcessesInErrorState();
        } catch (Throwable th) {
            jfj.b(th);
        }
        if (processesInErrorState == null) {
            return 2;
        }
        for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
            if (processErrorStateInfo.pid == Process.myPid() && processErrorStateInfo.condition == 2 && !StringUtils.equals(this.f29478a, processErrorStateInfo.longMsg)) {
                this.f29478a = processErrorStateInfo.longMsg;
                return 1;
            }
        }
        return 2;
    }

    private void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a1ba1e7", new Object[]{this, aVar});
            return;
        }
        jga jfzVar = Looper.myLooper() != null ? new jfz() : jgb.sScheduler;
        jgb.a(new b(20, aVar, jfzVar)).a(jfzVar).a();
    }
}
