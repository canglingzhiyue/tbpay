package android.taobao.safemode;

import android.app.Application;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.TCrashSDK;
import tb.ovw;

/* loaded from: classes.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static h f1529a = new h();
    private static d b = new d();
    private Application c;
    private String d;
    private k e;
    private boolean f = false;

    public static h a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("d73d9faf", new Object[0]) : f1529a;
    }

    public d b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("ec266774", new Object[]{this}) : b;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public void b(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76721b16", new Object[]{this, application});
        } else {
            this.c = application;
        }
    }

    public k c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("10f308e", new Object[]{this}) : this.e;
    }

    public void a(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edfc554c", new Object[]{this, kVar});
            return;
        }
        this.e = kVar;
        a((Context) this.c);
    }

    public void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{this, application});
            return;
        }
        this.c = application;
        this.e = l.b();
        a((Context) application);
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        k kVar = this.e;
        if (kVar == null) {
            return;
        }
        if (StringUtils.isEmpty(this.d)) {
            try {
                this.d = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (Exception unused) {
            }
        }
        if (kVar.f1531a) {
            ovw.a(context);
            TCrashSDK.instance().addJvmUncaughtCrashListener(new g(this.c, this.d));
        }
        TCrashSDK.instance().getCrashCaughtHeader().addHeaderInfo("startup_context", this.e.toString());
    }
}
