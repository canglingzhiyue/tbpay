package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class lco {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public loz f30475a;
    public lcm b;

    static {
        kge.a(1856620108);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    public lco() {
        emu.a("com.taobao.android.detail.core.pagemanager.layout.BasePageManagerLifecycle");
    }

    public final void a(loz lozVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f334f821", new Object[]{this, lozVar});
        } else {
            this.f30475a = lozVar;
        }
    }

    public final void a(lcm lcmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f285f542", new Object[]{this, lcmVar});
        } else {
            this.b = lcmVar;
        }
    }
}
