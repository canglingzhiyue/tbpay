package tb;

import android.app.Activity;
import android.os.Bundle;
import com.alibaba.evo.internal.downloader.a;
import com.alibaba.ut.abtest.internal.util.b;
import com.alibaba.ut.abtest.internal.util.h;
import com.alibaba.ut.abtest.internal.util.p;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.xsearchplugin.jarvis.utils.JarvisConstant;

/* loaded from: classes.dex */
public class cep implements rqi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1849281939);
        kge.a(-90889597);
    }

    @Override // tb.rqi
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        }
    }

    @Override // tb.rqi
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
        }
    }

    @Override // tb.rqi
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
        }
    }

    @Override // tb.rqi
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
        }
    }

    @Override // tb.rqi
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
        }
    }

    @Override // tb.rqi
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
        }
    }

    @Override // tb.rqi
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        try {
            rql.registerAppStatusCallbacks(new cep());
        } catch (Throwable th) {
            b.a("DataUpdateService.register", th);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!cex.a().j().i()) {
        } else {
            p.a(new Runnable() { // from class: tb.cep.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!cex.a().j().c()) {
                    } else {
                        try {
                            if (System.currentTimeMillis() - cex.a().i().h() < (cex.a().d() ? 10000L : cex.a().j().g())) {
                                h.e("DataUpdateService", "不满足数据更新检查条件，取消本次检查。");
                            } else {
                                cex.a().i().a(false, JarvisConstant.KEY_JARVIS_TRIGGER);
                            }
                        } catch (Exception e) {
                            b.a("DataUpdateService.updateData", e);
                        }
                    }
                }
            });
            p.a(new Runnable() { // from class: tb.cep.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    h.f("DataUpdateService", "checkIndex start on switchForeground.");
                    a.a(cex.a().c());
                }
            });
        }
    }

    @Override // tb.rqi
    public void onSwitchBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74060788", new Object[]{this});
            return;
        }
        h.a("DataUpdateService", "onSwitchBackground");
        try {
            cex.a().m().c();
            if (!cex.a().j().I()) {
                return;
            }
            cex.a().i().b();
        } catch (Throwable th) {
            b.a("DataUpdateService.updateData", th);
        }
    }

    @Override // tb.rqi
    public void onSwitchForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcb4091d", new Object[]{this});
            return;
        }
        h.a("DataUpdateService", "onSwitchForeground");
        b();
    }
}
