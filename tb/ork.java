package tb;

import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Choreographer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.gateway.dispatch.a;
import com.taobao.homepage.utils.n;
import com.taobao.tao.log.TLog;
import com.taobao.tao.recommend3.tracelog.TraceModel;
import com.taobao.tao.recommend3.tracelog.b;
import com.taobao.tao.recommend3.tracelog.c;
import com.taobao.tao.recommend3.tracelog.f;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.orq;

/* loaded from: classes.dex */
public class ork extends org {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean d;
    private static boolean e;
    private orq b;
    private AtomicBoolean c;

    private static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        return true;
    }

    static {
        kge.a(1406377580);
        d = false;
        e = n.m();
    }

    private ork(String str) {
        super(str);
        this.c = new AtomicBoolean(false);
    }

    public static void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d483649", new Object[]{fVar});
        } else if (!d()) {
        } else {
            fVar.a("HomeSmoothCheckInterceptor", new ork(fVar.a()));
            TLog.loge("home", "GlobalTrace", "register interceptor success, name=HomeSmoothCheckInterceptor");
        }
    }

    @Override // tb.org
    public boolean a(TraceModel traceModel, boolean z) {
        orq orqVar;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c1c350fb", new Object[]{this, traceModel, new Boolean(z)})).booleanValue() : Build.VERSION.SDK_INT >= 16 && ((orqVar = this.b) == null || !orqVar.c());
    }

    @Override // tb.org
    public boolean b(TraceModel traceModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4efe027c", new Object[]{this, traceModel, new Boolean(z)})).booleanValue();
        }
        String name = traceModel.getName();
        if (!z) {
            if (TextUtils.equals(name, "homeVisible")) {
                e = true;
            } else if (TextUtils.equals(name, "homeNetDataRefresh")) {
                d = true;
            }
        } else if (TextUtils.equals(name, "homeFragmentOnPause")) {
            orq orqVar = this.b;
            if (orqVar != null) {
                orqVar.a();
            }
            c();
            return true;
        }
        if (!d || !e || !this.c.compareAndSet(false, true)) {
            return false;
        }
        a.b().c(new Runnable() { // from class: tb.ork.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    ork.this.b();
                }
            }
        });
        return true;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        TLog.loge("home", "GlobalTrace", "开始检查可流畅交互");
        b.a().a("home_smoothCheck", 3);
        this.b = new orq();
        this.b.a(new orq.a() { // from class: tb.ork.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.orq.a
            public void a(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                } else if (!z) {
                } else {
                    ork.this.c();
                }
            }
        });
        Choreographer.getInstance().postFrameCallback(this.b);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        orq orqVar = this.b;
        if (orqVar == null) {
            b.a().a("homeTotal", (Map<String, Object>) null, SystemClock.uptimeMillis());
            return;
        }
        long b = orqVar.b();
        b.a().b("home_smoothCheck");
        b.a().a("homeTotal", (Map<String, Object>) null, b);
        b.a().a("homeSmoothInteractive", 1, c.b(), b);
    }
}
