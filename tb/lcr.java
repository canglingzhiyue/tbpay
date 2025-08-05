package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class lcr implements lpa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private View f30478a;

    static {
        kge.a(-194406987);
        kge.a(-671507480);
    }

    @Override // tb.lpa
    public void a(lcm lcmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f285f542", new Object[]{this, lcmVar});
        }
    }

    @Override // tb.lpa
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    public lcr(View view) {
        this.f30478a = view;
        emu.a("com.taobao.android.detail.core.pagemanager.view.CompatibleComponent");
    }

    @Override // tb.lpa
    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.f30478a;
    }
}
