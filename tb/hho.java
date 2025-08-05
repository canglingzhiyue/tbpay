package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import com.taobao.tao.log.TLog;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public class hho {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "RaceChecker";
    public static final String TLOG_MODULE = "Race";

    /* renamed from: a  reason: collision with root package name */
    public static Throwable f28663a;
    private static boolean b;
    private static final List<String> c;
    private static final List<String> d;
    private static final List<String> e;

    public static /* synthetic */ boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        b = z;
        return z;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (!b) {
            return b();
        }
        return true;
    }

    private static synchronized boolean b() {
        synchronized (hho.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
            }
            TLog.loge(TLOG_MODULE, TAG, "RaceChecker_start");
            iht a2 = ihq.b().a(c);
            if (!a2.b()) {
                TLog.loge(TLOG_MODULE, TAG, a2.a() + " fetch failed!");
                b = false;
                return false;
            }
            b = true;
            return b;
        }
    }

    public static void a(final Runnable runnable, final Runnable runnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea2f8e64", new Object[]{runnable, runnable2});
        } else if (b) {
            runnable.run();
        } else {
            try {
                ihq.b().a(c, new ihs() { // from class: tb.hho.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.ihs
                    public void a(iht ihtVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("edb10f83", new Object[]{this, ihtVar});
                        } else if (!ihtVar.b()) {
                            TLog.loge(hho.TLOG_MODULE, hho.TAG, ihtVar.a() + " fetch failed!");
                            hho.a(false);
                            runnable2.run();
                        } else {
                            TLog.loge(hho.TLOG_MODULE, hho.TAG, ihtVar.a() + " fetch success!");
                            hho.a(true);
                            runnable.run();
                        }
                    }
                });
            } catch (Throwable th) {
                f28663a = th;
                b = false;
                TLog.loge(TAG, "prepareRace error", th);
            }
        }
    }

    static {
        kge.a(1524449642);
        b = false;
        c = Arrays.asList("MNN", "MNN_CL", "MNN_Express", "mnnkitcore");
        d = Arrays.asList("freetype", "tbffmpegmarvel", a.ATOM_EXT_race);
        e = Arrays.asList("freetype", a.ATOM_EXT_race);
    }
}
