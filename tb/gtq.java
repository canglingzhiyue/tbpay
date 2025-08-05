package tb;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.compat.ApplicationCompat;
import com.taobao.android.launcher.common.h;
import com.taobao.android.lifecycle.PanguApplication;
import java.io.File;

/* loaded from: classes.dex */
public final class gtq extends ApplicationCompat.AbstractActivityLifecycleCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int b;
    private final String c;
    private int d = 0;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f28449a = a();

    public static /* synthetic */ Object ipc$super(gtq gtqVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1536849291) {
            super.onActivityPaused((Activity) objArr[0]);
            return null;
        } else if (hashCode == -857321247) {
            super.onActivityCreated((Activity) objArr[0], (Bundle) objArr[1]);
            return null;
        } else if (hashCode != 1577148780) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onActivityStarted((Activity) objArr[0]);
            return null;
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : h.a(".com_taobao_taobao_trace_switcher");
    }

    private static int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[0])).intValue();
        }
        if (h.a(".taobao_trace_interval_50")) {
            return 50000;
        }
        if (h.a(".taobao_trace_interval_100")) {
            return 100000;
        }
        if (h.a(".taobao_trace_interval_5")) {
            return 5000;
        }
        if (h.a(".taobao_trace_interval_10")) {
        }
        return 10000;
    }

    private static void a(boolean z, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec163f8d", new Object[]{new Boolean(z), str, new Integer(i)});
            return;
        }
        if (z) {
            Debug.stopMethodTracing();
        }
        if (Build.VERSION.SDK_INT >= 21) {
            Debug.startMethodTracingSampling(str, 0, i);
        } else {
            Debug.startMethodTracing(str);
        }
    }

    public gtq(Application application) {
        if (this.f28449a) {
            this.c = application.getExternalCacheDir().getAbsolutePath();
            this.b = c();
            ((PanguApplication) application).registerActivityLifecycleCallbacks(this);
            return;
        }
        this.c = null;
        this.b = 10000;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.f28449a) {
        } else {
            a(false, a("launcher"), this.b);
        }
    }

    @Override // com.taobao.android.compat.ApplicationCompat.AbstractActivityLifecycleCallbacks, com.taobao.android.compat.ApplicationCompat.ActivityLifecycleCallbacksCompat
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            return;
        }
        super.onActivityCreated(activity, bundle);
        int i = this.d;
        if (i == 0) {
            a(true, a("welcome"), this.b);
            this.d = 1;
        } else if (i != 1) {
        } else {
            a(true, a("mainpage"), this.b);
            this.d = 2;
        }
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        String str2 = this.c;
        return new File(str2, str + ".trace").getAbsolutePath();
    }

    @Override // com.taobao.android.compat.ApplicationCompat.AbstractActivityLifecycleCallbacks, com.taobao.android.compat.ApplicationCompat.ActivityLifecycleCallbacksCompat
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
        } else {
            super.onActivityStarted(activity);
        }
    }

    @Override // com.taobao.android.compat.ApplicationCompat.AbstractActivityLifecycleCallbacks, com.taobao.android.compat.ApplicationCompat.ActivityLifecycleCallbacksCompat
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            return;
        }
        super.onActivityPaused(activity);
        if (this.d != 2) {
            return;
        }
        Debug.stopMethodTracing();
    }
}
