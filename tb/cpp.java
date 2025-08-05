package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.msg.c;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public final class cpp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final cpp INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f26410a;
    private static long b;
    private static long c;

    /* loaded from: classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CaptureManager f26411a;

        public a(CaptureManager captureManager) {
            this.f26411a = captureManager;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                cpp.a(cpp.INSTANCE, this.f26411a, true, false);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CaptureManager f26412a;

        public b(CaptureManager captureManager) {
            this.f26412a = captureManager;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                cpp.a(cpp.INSTANCE, this.f26412a, false, false);
            }
        }
    }

    static {
        kge.a(-1934362730);
        INSTANCE = new cpp();
        b = System.currentTimeMillis();
        c = System.currentTimeMillis();
    }

    private cpp() {
    }

    public static final /* synthetic */ void a(cpp cppVar, CaptureManager captureManager, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66645f11", new Object[]{cppVar, captureManager, new Boolean(z), new Boolean(z2)});
        } else {
            cppVar.a(captureManager, z, z2);
        }
    }

    public final void a(Activity activity, CaptureManager captureManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("738b9f48", new Object[]{this, activity, captureManager, new Boolean(z)});
            return;
        }
        q.c(activity, "activity");
        q.c(captureManager, "captureManager");
        if (captureManager.P() || !f26410a || !a(false)) {
            return;
        }
        b = System.currentTimeMillis();
        activity.runOnUiThread(new b(captureManager));
    }

    public final void b(Activity activity, CaptureManager captureManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b780cc9", new Object[]{this, activity, captureManager, new Boolean(z)});
            return;
        }
        q.c(activity, "activity");
        q.c(captureManager, "captureManager");
        if (captureManager.v() || f26410a || !a(true)) {
            return;
        }
        c = System.currentTimeMillis();
        activity.runOnUiThread(new a(captureManager));
    }

    private final boolean a(boolean z) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (z) {
            j = c;
        } else {
            j = b;
        }
        return System.currentTimeMillis() - j > ((long) 1000);
    }

    private final void a(CaptureManager captureManager, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9f7311e", new Object[]{this, captureManager, new Boolean(z), new Boolean(z2)});
        } else if (!captureManager.y().i()) {
        } else {
            f26410a = z;
            captureManager.y().a(new c(z ? "show" : "hide", z2 ? "open" : "close"));
        }
    }
}
