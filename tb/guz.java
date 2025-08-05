package tb;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.job.core.b;
import com.taobao.android.job.core.e;
import com.taobao.android.job.core.j;
import com.taobao.android.job.core.task.d;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.launcher.common.f;
import tb.mto;

/* loaded from: classes5.dex */
public class guz extends gtk implements f {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final int b = gsm.a(mto.a.GEO_NOT_SUPPORT);

    @Override // com.taobao.android.launcher.common.f
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    @Override // com.taobao.android.launcher.common.f
    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
        }
    }

    @Override // com.taobao.android.launcher.common.f
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    @Override // com.taobao.android.launcher.common.f
    public void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdb367b", new Object[]{this, activity});
        }
    }

    @Override // com.taobao.android.launcher.common.f
    public void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
        }
    }

    @Override // com.taobao.android.launcher.common.f
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    @Override // com.taobao.android.launcher.common.f
    public void c(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("792c473c", new Object[]{this, activity});
        }
    }

    @Override // com.taobao.android.launcher.common.f
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        }
    }

    @Override // com.taobao.android.launcher.common.f
    public void d(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b27d57fd", new Object[]{this, activity});
        }
    }

    @Override // tb.gtk
    public f f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("7778cb9a", new Object[]{this}) : this;
    }

    @Override // tb.gtk
    public b<String, Void> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("cb08b96a", new Object[]{this});
        }
        return null;
    }

    @Override // tb.gtk
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        e<String, Void> b_ = b_("wdg-a");
        this.f28443a.z(j.a((e) b_));
        b(b_, new gtl<String, Void>() { // from class: tb.guz.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.gtl
            public void a(e<String, Void> eVar, d dVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d5228c09", new Object[]{this, eVar, dVar});
                } else {
                    gur.a(LauncherRuntime.g, eVar, dVar);
                }
            }
        });
    }

    @Override // com.taobao.android.launcher.common.f
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        e<String, Void> b_ = b_("wdg-create");
        this.f28443a.F(j.a((e) b_));
        b(b_, new gtl<String, Void>() { // from class: tb.guz.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.gtl
            public void a(e<String, Void> eVar, d dVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d5228c09", new Object[]{this, eVar, dVar});
                } else {
                    gur.a(LauncherRuntime.g, eVar, dVar);
                }
            }
        });
    }

    public guz(gua guaVar) {
        super(guaVar);
    }

    @Override // tb.gtk
    public b<String, Void> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("642ff9a9", new Object[]{this});
        }
        int i = b;
        return new b<>(gtg.a("launcher", i, i, 5), this.l);
    }
}
