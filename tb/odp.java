package tb;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public class odp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Dialog f31955a;
    private Context b;
    private WeakReference<Activity> c;
    private String d;
    private String e;
    private String f;
    private boolean g;

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static odp f31956a;

        static {
            kge.a(-114576632);
            f31956a = new odp();
        }

        public static /* synthetic */ odp a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (odp) ipChange.ipc$dispatch("f089f43", new Object[0]) : f31956a;
        }
    }

    static {
        kge.a(-2012146635);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.g;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public Dialog b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Dialog) ipChange.ipc$dispatch("24560806", new Object[]{this}) : this.f31955a;
    }

    public void a(Dialog dialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5396921", new Object[]{this, dialog});
        } else {
            this.f31955a = dialog;
        }
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.d;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.e;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.f;
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public static odp f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (odp) ipChange.ipc$dispatch("3580da1e", new Object[0]) : a.a();
    }

    private odp() {
        this.f31955a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = true;
        this.b = com.taobao.share.copy.a.a().f19604a;
    }

    public void a(WeakReference<Activity> weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb9cf36", new Object[]{this, weakReference});
        } else {
            this.c = weakReference;
        }
    }

    public WeakReference<Activity> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("8bad153c", new Object[]{this});
        }
        WeakReference<Activity> weakReference = this.c;
        if (weakReference == null || weakReference.get() == null) {
            TLog.loge("AddFromShareControl", "getCurrentActivity is empty, use onlineMonitor data.");
            return i();
        }
        return this.c;
    }

    private WeakReference<Activity> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("875c8d3e", new Object[]{this});
        }
        this.c = com.taobao.share.copy.a.a().e();
        return this.c;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.app.Dialog, java.lang.String] */
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        try {
            if (this.f31955a != null && this.f31955a.isShowing()) {
                this.f31955a.dismiss();
            }
        } catch (Exception unused) {
            nyp.a("AddFromShareControl", "dismiss error");
        } finally {
            this.f31955a = null;
            this.d = null;
            this.e = null;
            this.f = null;
        }
    }
}
