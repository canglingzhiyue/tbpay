package tb;

import android.app.Activity;
import android.content.res.Configuration;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.h;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.performance.q;
import com.taobao.android.detail.core.utils.i;

/* loaded from: classes4.dex */
public class lcq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private lcp f30476a;
    private loz b;
    private lcm c;
    private lcn d;
    private OnScreenChangedListener e = new OnScreenChangedListener() { // from class: tb.lcq.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        @Keep
        public /* synthetic */ void onActivityChanged(Activity activity, int i, @NonNull Configuration configuration) {
            OnScreenChangedListener.CC.$default$onActivityChanged(this, activity, i, configuration);
        }

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public void onScreenChanged(int i, Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
                return;
            }
            i.a("PageManagerFactory", "onScreenChanged: changeType = " + i + ", configuration = " + configuration);
        }
    };

    static {
        kge.a(1957756731);
    }

    public lcq(DetailCoreActivity detailCoreActivity) {
        this.c = new lcm(detailCoreActivity);
        this.b = new loz(this.c);
        h.a().c(this.e);
        e();
        emu.a("com.taobao.android.detail.core.pagemanager.layout.PageManagerFactory");
    }

    public boolean a(Class cls, lco lcoVar) {
        lcp lcpVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd2cfc71", new Object[]{this, cls, lcoVar})).booleanValue();
        }
        if (cls == null || lcoVar == null || cls != lcp.class || (lcpVar = this.f30476a) == null) {
            return false;
        }
        lcpVar.a(lcoVar);
        return true;
    }

    public void a(lpb lpbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f33826ba", new Object[]{this, lpbVar});
            return;
        }
        loz lozVar = this.b;
        if (lozVar == null) {
            return;
        }
        lozVar.a(lpbVar);
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.f30476a = new lcp(this.c, this.b);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            lcn f = f();
            String a2 = q.a("PageManagerFactory");
            i.a(a2, "buildLayout: " + f);
            if (f == null) {
                return;
            }
            if (this.d != null) {
                this.d.a();
            }
            f.c();
            this.d = f;
        } catch (Throwable th) {
            th.printStackTrace();
            String a3 = q.a("PageManagerFactory");
            i.a(a3, "buildLayout error: " + th.getMessage());
        }
    }

    private lcn f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lcn) ipChange.ipc$dispatch("357f7902", new Object[]{this});
        }
        if (!lcp.g()) {
            return null;
        }
        return this.f30476a;
    }

    public void b() {
        loz lozVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.d == null || (lozVar = this.b) == null || lozVar.a() == null) {
        } else {
            this.b.a();
            this.b.a();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.d == null || this.b.a() == null) {
        } else {
            this.b.a();
            this.b.a();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        h.a().d(this.e);
        this.f30476a.e();
    }
}
