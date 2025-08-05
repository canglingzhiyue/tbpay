package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.media.MessageID;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes6.dex */
public class jer implements Application.ActivityLifecycleCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final a f29507a;
    private int b;
    private final jdy c;
    private final boolean d;

    /* loaded from: classes6.dex */
    public interface a {
        void keyValue(String str, String str2);
    }

    public jer(jdy jdyVar, a aVar) {
        this.c = jdyVar;
        this.f29507a = aVar;
        this.d = this.c.d().a("shortDump", true);
    }

    private String a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b1abe71b", new Object[]{this, intent});
        }
        String str = null;
        if (intent != null) {
            str = intent.getDataString();
        }
        return str != null ? str : "null";
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            return;
        }
        jfj.a("onActivityCreated：" + activity.getClass().getName(), new Object[0]);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            return;
        }
        jfj.a("onActivityStarted：" + activity.getClass().getName(), new Object[0]);
        this.b = this.b + 1;
        String a2 = a(activity.getIntent());
        if (this.b == 1) {
            jfj.a("nativeSetForeground foreground", new Object[0]);
            this.f29507a.keyValue("_foreground", String.valueOf(true));
            a(activity, "onForeground", a2);
        } else {
            a(activity, "onStart", a2);
        }
        this.f29507a.keyValue("_controller", activity.getClass().getName());
        this.f29507a.keyValue("last_page_url", a2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            return;
        }
        jfj.a("onActivityResumed：" + activity.getClass().getName(), new Object[0]);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            return;
        }
        jfj.a("onActivityPaused：" + activity.getClass().getName(), new Object[0]);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            return;
        }
        jfj.a("onActivityStopped：" + activity.getClass().getName(), new Object[0]);
        this.b = this.b - 1;
        Intent intent = activity.getIntent();
        String str = null;
        if (intent != null) {
            str = intent.getDataString();
        }
        if (str == null) {
            str = "null";
        }
        if (this.b == 0) {
            jfj.a("nativeSetForeground background", new Object[0]);
            this.f29507a.keyValue("_foreground", String.valueOf(false));
            a(activity, "onBackground", str);
            return;
        }
        a(activity, MessageID.onStop, str);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            return;
        }
        jfj.a("onActivitySaveInstanceState：" + activity.getClass().getName(), new Object[0]);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            return;
        }
        jfj.a("onActivityDestroyed：" + activity.getClass().getName(), new Object[0]);
    }

    private void a(Activity activity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e36e85ce", new Object[]{this, activity, str, str2});
            return;
        }
        b bVar = new b(String.format("%s_%s, data:%s, %s", activity.getClass().getSimpleName(), str, str2, new SimpleDateFormat("hh:mm:ss").format(new Date())), this.f29507a, this.d);
        if (this.d) {
            bVar.run();
        } else {
            jgb.a(bVar).a(jgb.sScheduler).a();
        }
    }

    /* loaded from: classes6.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static int f29508a;
        private static int b;
        private int c;
        private int d;
        private final boolean e;
        private final String f;
        private final a g;

        public b(String str, a aVar, boolean z) {
            this.c = 0;
            this.d = 0;
            this.f = str;
            this.g = aVar;
            this.e = z;
            int i = f29508a;
            f29508a = i + 1;
            this.c = i & 63;
            int i2 = b;
            b = i2 + 1;
            this.d = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (this.e) {
                    this.g.keyValue("track_" + this.c, this.d + ":" + this.f);
                    return;
                }
                String str = this.f + " " + jgo.a();
                this.g.keyValue("track_" + this.c, this.d + ":" + str);
                jgj.a("AppLife", str);
            } catch (Throwable th) {
                jfj.b(th);
            }
        }
    }
}
