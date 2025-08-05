package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class emw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f27448a;
    private epj b = new epj();

    static {
        kge.a(985668643);
        f27448a = emw.class.getSimpleName();
    }

    public emw() {
        emu.a("com.taobao.android.detail.datasdk.context.EngineContext");
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        epp.b(f27448a, "destroy");
        this.b = null;
    }

    public epj b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (epj) ipChange.ipc$dispatch("16b5e53e", new Object[]{this}) : this.b;
    }
}
