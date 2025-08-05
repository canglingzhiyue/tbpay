package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.l;
import com.taobao.android.home.component.utils.j;
import com.taobao.tao.Globals;

/* loaded from: classes.dex */
public class oqy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Boolean f32315a;

    static {
        kge.a(-553709802);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ksp.a("IntlNotifyLifecycle", "homePageOnCreate");
        if (!d()) {
            return;
        }
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            jin.a();
            ksp.c("IntlNotifyLifecycle", "launchTmgBundleBeforeRender use time : " + (SystemClock.uptimeMillis() - uptimeMillis));
        } catch (Throwable th) {
            ksp.c("IntlNotifyLifecycle", "launchTmgBundleBeforeRender error : " + th.getMessage());
            ksr.b("IntlNotify", "2.0", "launchTmgBundleBeforeRender exception", th.getMessage(), null, null);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ksp.a("IntlNotifyLifecycle", "renderFirstFrame");
        if (!d()) {
            return;
        }
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            jin.b();
            ksp.c("IntlNotifyLifecycle", "launchTmgBundleRendered use time : " + (SystemClock.uptimeMillis() - uptimeMillis));
        } catch (Throwable th) {
            ksp.c("IntlNotifyLifecycle", "launchTmgBundleRendered error : " + th.getMessage());
            ksr.b("IntlNotify", "2.0", "launchTmgBundleRendered exception", th.getMessage(), null, null);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        ksp.a("IntlNotifyLifecycle", "editionChanged");
        if (!d()) {
            return;
        }
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            jin.c();
            ksp.c("IntlNotifyLifecycle", "editionChanged use time : " + (SystemClock.uptimeMillis() - uptimeMillis));
        } catch (Throwable th) {
            ksp.c("IntlNotifyLifecycle", "editionChanged error : " + th.getMessage());
            ksr.b("IntlNotify", "2.0", "editionChanged exception", th.getMessage(), null, null);
        }
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : e() && f();
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : l.d(Globals.getApplication());
    }

    private boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        if (this.f32315a == null) {
            this.f32315a = Boolean.valueOf(j.a("enablePassLifecycleToIntl", true));
        }
        return this.f32315a.booleanValue();
    }
}
