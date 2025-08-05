package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launch.turbo.profile.a;

/* loaded from: classes.dex */
public class gtc implements gsx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1338588858);
        kge.a(-2112197540);
    }

    @Override // tb.gsx
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "PhaseCheck";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // tb.gsx
    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ce40c78", new Object[]{this, aVar});
            return;
        }
        switch (aVar.d().c()) {
            case 103:
                aVar.a(new gtb()).f();
                return;
            case 104:
                aVar.a(new gsz(this, "finished before")).f();
                return;
            case 105:
                if (aVar.c().e) {
                    aVar.a(new gsz(this, "invoked before")).f();
                    return;
                }
                break;
        }
        aVar.a(new gtb()).f();
    }
}
